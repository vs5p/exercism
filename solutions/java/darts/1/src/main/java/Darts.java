class Darts {
    int score(double xOfDart, double yOfDart) {
        double d = Math.sqrt(Math.pow(xOfDart,2)+Math.pow(yOfDart,2));
        if (d<=1){
            return 10;
        }
        if (d<=5){
            return 5;
        }
        if (d<=10){
            return 1;
        }
        return 0;
    }
}
