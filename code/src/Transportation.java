import java.util.*;

public class Transportation {

    private static double air_passenger_mean = Parameter.air_passenger_mean;
    private static double train_passenger_mean = Parameter.train_passenger_mean;
    private static double ship_passenger_mean = Parameter.ship_passenger_mean;
    private static double air_speed_mean = Parameter.air_speed_mean;
    private static double train_speed_mean = Parameter.train_speed_mean;
    private static double ship_speed_mean = Parameter.ship_speed_mean;

    // Number of three types passengers
    private static double num_infected;
    private static double num_antibody;
    private static double num_withoutantibody;

    // public Transportation(int air_passenger_mean, int ship_passenger_mean, int train_passenger_mean, 
    //     double air_speed_mean, double train_speed_mean, double ship_speed_mean) {
    //     this.air_passenger_mean = air_passenger_mean;
    //     this.train_passenger_mean = train_passenger_mean;
    //     this.ship_passenger_mean = ship_passenger_mean;
    //     this.air_speed_mean = air_speed_mean;
    //     this.train_speed_mean = ship_speed_mean;
    //     this.ship_speed_mean = train_speed_mean;
    // }

    public static TransportEvent depart(int current_time, City departure, int trip_type) {
        // Get the information of the population at departure city
        Population population = departure.getPopulation();

        // Set the destination of this trip
        City destination = getDestination(departure, trip_type);

        // Compute the distance between departure and destination
        double distance = City.distance(departure, destination);

//        System.out.println("distance: " + distance);

        // Declare a transportation event
        TransportEvent event;
        double num_passenger;
        double trip_time;

        // Compute the number of passengers and trip times according to different trip type
        switch (trip_type) {
            case TransportEvent.AIR:
                num_passenger = getNumPassengers(air_passenger_mean);
                trip_time = Math.round(distance / getSpeed(air_speed_mean));
//                System.out.println("air: " + air_speed_mean);
                break;

            case TransportEvent.TRAIN:
                num_passenger = getNumPassengers(train_passenger_mean);
                trip_time = Math.round(distance / getSpeed(train_speed_mean));
//                System.out.println("train: " + train_speed_mean);
                break;

            default:
                num_passenger = getNumPassengers(ship_passenger_mean);
                trip_time = Math.round(distance / getSpeed(ship_speed_mean));
//                System.out.println("ship: " + ship_speed_mean);
                break;
        }

        // Set the number of three type passengers
        setTripInfo(population, num_passenger);
        event = new TransportEvent((int)(current_time + trip_time), departure, destination, num_infected, num_antibody, num_withoutantibody, trip_type);
        updatePopulation(population, event);
        return event;
    }

    public static double getNumPassengers(double passenger_mean) {
        double std = 0.05;
        double passenger = (VirusSim.rand.nextGaussian() * std + 1) * passenger_mean;
        return passenger;
    }

    public static double getSpeed(double speed_mean) {
        double std = 0.05;
        double speed = (int) ((VirusSim.rand.nextGaussian() * std + 1) * speed_mean);
        return speed;
    }

    public static City getDestination(City departure, int trip_type) {
        // Randomly choose the destination city
        double prob = VirusSim.rand.nextDouble();
        int index;
        double[] prob_array;
        if (trip_type != TransportEvent.SHIP){
            prob_array = departure.getPopProb();
        } else{
            prob_array = departure.getDistProb();
        }
        index = Parameter.naiveSearch(prob, prob_array);

        return VirusSim.cities[index];
    }

    public static void setTripInfo(Population population, double num_passenger) {
        double total_pop = population.getTotalPop();
        double pop_infected = population.getPopInfected();
        double pop_antibody = population.getPopAntibody();
        double pop_withoutantibody = population.getPopWithoutAntibody();

        num_passenger = (num_passenger < total_pop)? num_passenger : total_pop;
        
        num_infected = num_passenger / total_pop * pop_infected;
        num_antibody = num_passenger / total_pop * pop_antibody;
        double tmp = num_passenger - num_infected - num_antibody;
        num_withoutantibody = (tmp < pop_withoutantibody)? tmp : pop_withoutantibody;
    }
    
    public static void updatePopulation(Population population, TransportEvent event) {
        population.setTotalPop( population.getTotalPop() - event.getNumPassenger() );
        population.setPopInfected( population.getPopInfected() - event.getNumInfected() );
        population.setPopAntibody( population.getPopAntibody() - event.getNumAntibody() );
        population.setPopWithoutAntibody( population.getPopWithoutAntibody() - event.getNumWithoutAntibody());
    }

    // public double getAirSpeed() { return air_speed; }
    // public double getTrainSpeed() { return train_speed; }
    // public double getShipSpeed() { return ship_speed; }
    // public int getAirPassenger() { return air_passenger; }
    // public int getTrainPassenger() { return train_passenger; }
    // public int getShipPassenger() { return ship_passenger; }

}
