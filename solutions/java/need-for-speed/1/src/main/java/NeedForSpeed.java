class NeedForSpeed {
    private int speed,battery = 100,batteryDrain, distance;
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        if((battery <= 0) || (battery-batteryDrain<0)){
            return true;
        }

        return false;
    }

    public int distanceDriven() {
        return distance;
    }

    public void drive() {
        if(battery-batteryDrain>=0){
            distance+=speed;
            battery-= batteryDrain;
        }
        
    }

    public static NeedForSpeed nitro() {
        NeedForSpeed car = new NeedForSpeed(50,4);
        return car;
    }
    public int battery(){
        return battery;
    }

    public int batteryDrain(){
        return batteryDrain;
    }

    public int speed(){
        return speed;
    }
}
    

class RaceTrack {
    private int distance;

    public RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        int maxDrives = car.battery() / car.batteryDrain();
        int maxDistance = maxDrives * car.speed();

        return maxDistance >= distance;
    }
}
