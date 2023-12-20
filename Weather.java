/*
Queastion 3.4:
Your task is to write a program that calculates the average daily temperature and humidity for the 10 days. 
You can use the input redirection to read the file and store the data in a three-dimensional array named data. 
The first index of data ranges from 0 to 9 and represents 10 days, the second index ranges from 0 to 23 and 
represents 24 hours, and the third index ranges from 0 to 1 and represents temperature and humidity,
 */


import java.util.Scanner;
public class Weather {
    final int NUMBER_OF_DAYS;
    final int NUMBER_OF_HOURS;
    final int LENGTH_OF_ARRAY;

    Weather(int d, int h, int l) {
        NUMBER_OF_DAYS = d;
        NUMBER_OF_HOURS = h;
        LENGTH_OF_ARRAY = l;
    }

    public double[][][] arrayValues(Scanner input) {
        double[][][] data = new double[NUMBER_OF_DAYS][NUMBER_OF_HOURS][LENGTH_OF_ARRAY];

        for (int i = 0; i < NUMBER_OF_DAYS; i++) {
            System.out.println("Enter details for Day " + (i + 1) + ":");

            for (int j = 0; j < NUMBER_OF_HOURS; j++) {
                System.out.print("Hour " + (j + 1) + ": ");
                double temperature = input.nextDouble();
                double humidity = input.nextDouble();

                data[i][j][0] = temperature;
                data[i][j][1] = humidity;
            }
        }
        return data;
    }

    public void calcAverageTempAndHum(double[][][] data) {
        for (int i = 0; i < data.length; i++) {
            double dailyTemperatureTotal = 0;
            double dailyHumidityTotal = 0;

            for (int j = 0; j < data[i].length; j++) {
                dailyTemperatureTotal += data[i][j][0];
                dailyHumidityTotal += data[i][j][1];
            }

            System.out.println("Day " + (i + 1) + "'s average temperature is " + dailyTemperatureTotal / NUMBER_OF_HOURS);
            System.out.println("Day " + (i + 1) + "'s average humidity is " + dailyHumidityTotal / NUMBER_OF_HOURS);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Weather obj = new Weather(2, 24, 2);
        double[][][] data = obj.arrayValues(input);
        obj.calcAverageTempAndHum(data);
    }
}


