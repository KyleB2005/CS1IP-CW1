        String studentnumber = "33027054";
        int prefferedFlavour = 0;
        int totalPrice = 0;

        int vanillaPrice = Integer.parseInt(studentnumber.substring(6,8));
        int chocolatePrice = Integer.parseInt(studentnumber.substring(3,5));
        int strawberryPrice = Integer.parseInt(studentnumber.substring(0,2));

        Scanner myObj = new Scanner(System.in);

        Boolean ok = false;
        // getting preffered ice cream input
        do 
        {
            System.out.println("Would you like (v)anilla, (C)hocolate or (s)trawberry?");
            Character ans = myObj.nextLine().toUpperCase().charAt(0);

            if(ans == 'V'){
                ok = true;
                prefferedFlavour = vanillaPrice;
            }
            else if(ans == 'C'){
                ok = true;
                prefferedFlavour = chocolatePrice;
            }
            else if(ans == 'S'){
                ok = true;
                prefferedFlavour = strawberryPrice;
            }
            else{
                System.out.println("Invalid input! Please try again");
            }
        } while(!ok);
        ok = false;
        // getting the amount of scoops for preferred ice cream
        do{
            try{
                System.out.println("How many scoops would you like?");
                Integer scoops = myObj.nextInt();

                if(scoops == 0){
                    System.out.println("We don't just sell a cone.");
                }
                else if(scoops < 0){
                    System.out.println("You can not have negative scoops.");
                }
                else if(scoops > 3){
                    System.out.println("That's too many scoops to fit in a cone.");
                }
                else{
                    totalPrice = prefferedFlavour * scoops;
                    ok = true;
                }
            }catch(Exception e){
                System.out.println("Invalid input! Try again.");
            }
        } while (!ok);

        // adding the price of the cone.
        totalPrice+= 100;
        // converting the totalPrice into correct currency format.
        String temp = Integer.toString(totalPrice);
        String totalCost = temp.substring(0, temp.length() - 2) + "." + temp.substring(temp.length() - 2);

        //printing the total price.
        System.out.printf("That will be %s, please.", totalCost);
        myObj.close();
