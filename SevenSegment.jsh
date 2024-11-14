

        Scanner myObj = new Scanner(System.in);
        int input = 0;
        System.out.println("Enter a number");
        input = myObj.nextInt();
        myObj.close();
        Display(input);

    

    public static void Display(int n){
        //flipping the inputted int around.
        String num = "";
        for(int i = String.valueOf(n).length() - 1; i >= 0; i--){
            num+= String.valueOf(n).toString().substring(i,i + 1);
        }

        int temp;
        int digit;
        String line = "";
        for(int i = 1; i < 6; i++){
            temp = Integer.parseInt(num);
            for(int z = 0; z < String.valueOf(n).length(); z++){
                digit = temp % 10;
                temp/= 10;
                line+= ssd(digit, i); 

            }
            System.out.println(line);
            line = "";
        }
    }

    public static String ssd(int d, int n){
        switch ((d*10)+n) {
            case 1: case 5: case 21: case 23: case 25: case 31: case 33: case 35:
            case 43: case 51: case 53: case 55: case 61: case 63: case 65: case 71:
            case 81: case 83: case 85: case 91: case 93: case 95:
            return " -- ";
            case 24: case 52: case 62:
            return "|   ";
            case 12: case 14: case 22: case 32: case 34: case 44: case 54: case 72:
            case 74: case 94:
            return "   |";
            case 2: case 4: case 42: case 64: case 82: case 84: case 92:
            return "|  |";
            default: 
            return "    ";


        }
    }
