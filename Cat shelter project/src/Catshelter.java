import java.util.ArrayList;
import java.util.Scanner;

public class Catshelter {

    static class Cat {

        String name;
        String type;
        int age;
        String vaccine;
        String foodTime;
        String foodAmount;

        public Cat(String name,String type,int age,
                String vaccine,
                String foodTime,
                String foodAmount){

            this.name=name;
            this.type=type;
            this.age=age;
            this.vaccine=vaccine;
            this.foodTime=foodTime;
            this.foodAmount=foodAmount;

        }

        public void display(){

            System.out.println("Name: "+name);
            System.out.println("Type: "+type);
            System.out.println("Age: "+age);
            System.out.println("Vaccine: "+vaccine);
            System.out.println("Food Time: "+foodTime);
            System.out.println("Food Amount: "+foodAmount);

            System.out.println("----------------");

        }

    }


    static ArrayList<Cat> cats=new ArrayList<>();


    static int volunteers=0;

    static int meals=0;



    static void addCat(Scanner input){

        System.out.println("Name:");
        String name=input.next();

        System.out.println("Type:");
        String type=input.next();

        System.out.println("Age:");
        int age=input.nextInt();

        System.out.println("Vaccine:");
        String vaccine=input.next();

        System.out.println("Food Time:");
        String time=input.next();

        System.out.println("Food Amount:");
        String amount=input.next();

        Cat c=new Cat(name,type,age,vaccine,time,amount);

        cats.add(c);

        meals++;

        System.out.println("Cat Added");

    }



    static void showCats(){

        for(Cat c:cats){

            c.display();

        }

    }




    static void countCats(){

        System.out.println("Cats = "+cats.size());

    }




    static void deleteCat(Scanner input){

        System.out.println("Enter Name:");

        String n=input.next();

        for(int i=0;i<cats.size();i++){

            if(cats.get(i).name.equals(n)){

                cats.remove(i);

                System.out.println("Deleted");

                return;

            }

        }

        System.out.println("Not Found");

    }




    static void searchCat(Scanner input){

        System.out.println("Enter Name");

        String n=input.next();

        for(Cat c:cats){

            if(c.name.equals(n)){

                c.display();

                return;

            }

        }

        System.out.println("Not Found");

    }




    static void volunteers(Scanner input){

        System.out.println("Enter Volunteers Number");

        volunteers=input.nextInt();

    }




    static void shelterInfo(){

        System.out.println("Cats Number = "+cats.size());

        System.out.println("Volunteers = "+volunteers);

        System.out.println("Meals = "+meals);

    }



    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int choice;

        do{

            System.out.println("1 Add Cat");

            System.out.println("2 Show Cats");

            System.out.println("3 Count Cats");

            System.out.println("4 Delete Cat");

            System.out.println("5 Search Cat");

            System.out.println("6 Volunteers");

            System.out.println("7 Shelter Info");

            System.out.println("8 Exit");


            choice=input.nextInt();



            switch(choice){

                case 1:

                    addCat(input);

                    break;

                case 2:

                    showCats();

                    break;

                case 3:

                    countCats();

                    break;

                case 4:

                    deleteCat(input);

                    break;

                case 5:

                    searchCat(input);

                    break;

                case 6:

                    volunteers(input);

                    break;

                case 7:

                    shelterInfo();

                    break;

            }


        }while(choice!=8);

    }

}