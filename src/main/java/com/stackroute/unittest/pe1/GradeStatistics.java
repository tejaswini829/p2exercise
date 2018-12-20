public class GradeStatistics {
    public double average(int number,int array[]){

        int i,sum=0;
        double avg=0;
        for(i=0;i<number;i++) {
            if (array[i] < 0 && array[i] > 100) {
                return 0;
            }
            else {
                sum = sum + array[i];
                avg = sum / number;
            }

        }
        return avg;
        }

        public int minimum(int number1,int array[]) {
            int minValue = array[0];


            for (int i = 1; i < number1; i++) {
                if (array[i] < 0 && array[i] > 100) {
                    return 0;
                } else {
                    if (array[i] < minValue) {
                        minValue = array[i];
                    }
                }

            }
            return minValue;
        }

            public int maximum(int number2, int array[]){
                int maxValue = array[0];
                for (int i = 1; i < number2; i++) {
                    if (array[i] < 0 && array[i] > 100) {
                        return 0;
                    }
                    else {
                        if (array[i] > maxValue) {
                            maxValue = array[i];
                        }
                    }

                }
                return maxValue;
            }
        }
