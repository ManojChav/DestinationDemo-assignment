package hm;

import java.util.Arrays;
import java.util.Scanner;

public class DestinationsDemo {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.println("Please enter no of destinations");

		int x = scn.nextInt();
		Destinations[] d = new Destinations[x];

		for (int i = 0; i < x; i++) {
			System.out.println("please enter the city name");
			String s = scn.next();
			System.out.println("please enter the location");
			String l = scn.next();
			System.out.println("Please enter number of hotels");
			int h = scn.nextInt();
			String[] d1 = new String[h];

			double[] p1 = new double[h];

			int[] n1 = new int[h];
			for (int j = 0; j < h; j++) {
				System.out.println("Please enter the hotel name.");
				d1[j] = scn.next();
				System.out.println("Please enter the package value");
				p1[j] = scn.nextDouble();
				System.out.println("Please enter the number of days");
				n1[j] = scn.nextInt();

			}
			d[i] = new Destinations(s, l, d1, p1, n1);

		}

		//
		// System.out.println(1);

		// Hyd in TG and Pakage Details:
		// 1. Hyat - 200 - 3 days package
		// 2. Prestigate - 350.50 5 days package

		// Destinations[] holidaySpots = new Destinations[3];
		// holidaySpots[0] = hydDest;
		// holidaySpots[1] = AmarDest;
		// holidaySpots[2] = goaDest;

		// Let the customer enter his destination, so that we display the
		// package avaliable.

		System.out
				.println("Welcome to our website, Please enter your destination ?");
		Scanner scan = new Scanner(System.in);
		String customerDest = scan.next();
		boolean found = false;
		for (int i = 0; i < d.length; i++) {
			Destinations ds = d[i];
			if (customerDest.equals(ds.getName())) {
				found = true;
				System.out
						.println("Good News...we found your destination with awesome package. Here are the details");
				System.out.println(ds.toString());
				break;
			}
		}

		if (!found) {
			System.out
					.println("Ohh...Sorry, We couldn't find your destination. Please check beck.");
		}

	}

}

class Destinations {
	private String name;
	private String location;
	private String[] hotels;
	private double[] packageCost;
	private int[] noOfDays;

	Destinations() {

	}

	Destinations(String name, String location, String[] hotels, double[] cost,
			int[] days) {
		this.name = name;
		this.location = location;
		this.hotels = hotels;
		packageCost = cost;
		noOfDays = days;
	}

	public String getName() {
		return name;
	}

	public void setName(String z) {
		name = z;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String[] getHotels() {
		return hotels;
	}

	public void setHotels(String[] hotels) {
		this.hotels = hotels;
	}

	public double[] getPackageCost() {
		return packageCost;
	}

	public void setPackageCost(double[] packageCost) {
		this.packageCost = packageCost;
	}

	public int[] getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(int[] noOfDays) {
		this.noOfDays = noOfDays;
	}

	@Override
	public String toString() {
		String total = "The city " + name + " in " + location + "\n";
		for (int i = 0; i < hotels.length; i++) {
			total = total + Integer.toString(i + 1) + ")" + hotels[i] + "--"
					+ packageCost[i] + " -" + noOfDays[i] + "days pacakge\n";
			

		}
		return total;
	}

}
