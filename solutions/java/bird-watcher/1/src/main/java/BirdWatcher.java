
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        return getLastWeek()[getLastWeek().length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[getLastWeek().length - 1] += 1;
    }

    public boolean hasDayWithoutBirds() {
        for (int count:birdsPerDay){
            if(count == 0){
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int n = birdsPerDay.length;
        if (numberOfDays > n){
            numberOfDays = n;
        }
        int sum = 0;
        for (int i=0; i < numberOfDays; i++){
            sum += birdsPerDay[i];
        }
        return sum;
    }

    public int getBusyDays() {
        int busyCount = 0;
        for (int count:birdsPerDay){
            if(count >= 5){
                busyCount+=1;
            }
        }
        return busyCount;
    }
}
