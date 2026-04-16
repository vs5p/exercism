class Yacht {
    int[] freq = new int[7];
    YachtCategory category;

    Yacht(int[] dice, YachtCategory yachtCategory) {
        this.category = yachtCategory;
        for (int i = 0; i < dice.length; i++) {
            freq[dice[i]] += 1;
        }
    }

    int score() {
        switch (category) {
            case ONES:
                return freq[1];
            case TWOS:
                return freq[2] * 2;
            case THREES:
                return freq[3] * 3;
            case FOURS:
                return freq[4] * 4;
            case FIVES:
                return freq[5] * 5;
            case SIXES:
                return freq[6] * 6;
            case FULL_HOUSE:
                {
                    boolean twoFound = false;
                    boolean threeFound = false;
                    int sum=0;
                    for(int i=1;i<freq.length;i++){
                        if(freq[i] == 2){
                            twoFound = true;
                        }
                        if(freq[i] == 3){
                            threeFound = true;
                        }
                        sum+=freq[i]*(i);
                    }
                    if (twoFound && threeFound){
                        return sum;
                    }
                    return 0;
                }
            case YACHT:{
                for(int i: freq){
                    if(i == 5){
                        return 50;
                    }
                }
                return 0;
            }
            case CHOICE:
                {
                    int sum=0;
                    for(int i=1;i<freq.length;i++){
                        sum+=i*freq[i];
                    }
                    return sum;
                }
            case FOUR_OF_A_KIND:
                {
                    for(int i=1;i<freq.length;i++){
                        if(freq[i] >= 4){
                            return 4*i;
                        }
                    }
                    return 0;
                }
            case LITTLE_STRAIGHT:{
                for(int i=1;i<=5;i++){
                    if(freq[i] != 1){
                        return 0;
                    }
                }
                return 30;
            }
            case BIG_STRAIGHT:{
                for(int i=2;i<=6;i++){
                    if(freq[i] != 1){
                        return 0;
                    }
                }
                return 30;
            }
            default:
                return 0;
        }
    }
}