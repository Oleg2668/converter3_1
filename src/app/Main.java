package app;

public class Main {


    public static void main(String[] args) {

            double c = 1;
            double f = 100;

            System.out.println("App for measures converting ");
            System.out.println("Converter App.");
            System.out.println("Version 3.0.");
            double fahrenheit= convCelsiusToFr(c);
            double celsius = convFrToCesius(f);

            System.out.println("Result is " + fahrenheit + " F and " + celsius + " C .");

        }
        private static double convCelsiusToFr(double c) {
            return (c*9/5)+32;
        }

        private static double convFrToCesius(double f){
            return (f - 32) * 5 / 9;
        }


}


