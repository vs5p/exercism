class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        int real = numberToCheck;
        int l = String.valueOf(numberToCheck).length();
        int sum = 0;
        while(real>0){
            int dig = real % 10;
            real = real / 10;
            sum += (int) Math.pow(dig, l);
        }
        return sum == numberToCheck;
    }

}
