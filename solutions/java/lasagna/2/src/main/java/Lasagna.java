public class Lasagna {
    private static int prepTime = 40;
    private static int layerPrepTime=2;

    public int expectedMinutesInOven(){
        return prepTime;
    }

    public int remainingMinutesInOven(int t){
        return prepTime - t;
    }

    public int preparationTimeInMinutes(int n){
        return layerPrepTime * n;
    }

    public int totalTimeInMinutes(int n, int t){
        return layerPrepTime * n + t;
    }
}
