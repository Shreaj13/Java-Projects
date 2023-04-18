public class FahrenheitToCelsius {
    public static void main(String[] args) {
        System.out.println("Temp in Fahrenheit \t Temp in Celcius");
        for (int i = 0; i<= 20; i++)
        {
            System.out.printf("%6d\t\t\t%15.1f", i,celcius(i));
            System.out.println();
        }

    }
    public static double celcius(double fahrenheit){
        double c = 0.0;
        c = (5.0/9.0)*(fahrenheit-32);
        return c;


    }
}
