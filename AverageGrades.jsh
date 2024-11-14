
        int[] temp = average_grades(new int[][]{{51, 83, 28}, {0, 38, 95}}, new int[]{30, 40, 30});

        for(int i = 0; i < temp.length; i++){
            System.out.println(temp[i]);
        }


    public static int[] average_grades(int grades[][], int weights[]){
        int weightedGrades[] = new int[grades.length];
        
        double sum;
        for(int i = 0; i < grades.length; i++){
            sum = 0.0;
            for(int n = 0; n < grades[i].length; n++){
                sum += grades[i][n] * weights[n];
            }
            sum/= 100;
            weightedGrades[i] = (int)sum;
        }


        return weightedGrades;
    }
