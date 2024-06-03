package com.ey.problem2;

import java.util.*;

public class CityStateMap {
    public static void main(String[] args) {
        Map<String, String> cityStateMap = new HashMap<>();

        cityStateMap.put("Amaravathi", "Andhra Pradesh");
        cityStateMap.put("Hyderabad", "Telangana");
        cityStateMap.put("Chennai", "Tamil Nadu");
        cityStateMap.put("Bengaluru", "Karnataka");
        cityStateMap.put("Mumbai", "Maharashtra");

        System.out.println("+++State City Map Menu+++");
        System.out.println("Please select the option");
        System.out.println("To get all the cities type - 1");
        System.out.println("To get all the states type - 2");
        System.out.println("To get city for a state type - 3");
        System.out.println("To add a new city state pair type - 4");
        System.out.println("To delete all the cities in a state type - 5");

        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                Set<String> cities = cityStateMap.keySet();
                System.out.println(cities);
                break;
            case 2:
                Collection<String> states = cityStateMap.values();
                System.out.println(states);
                break;
            case 3:
                System.out.println("Enter the city name:");
                String city = scanner.next();
                System.out.println(cityStateMap.get(city));
                break;
            case 4:
                System.out.println("Enter the city name:");
                String newCity = scanner.next();
                System.out.println("Enter the State name:");
                String newState = scanner.next();
                cityStateMap.put(newCity, newState);
                System.out.println(cityStateMap.entrySet());
                break;
            case 5:
                System.out.println("Enter the city name:");
                String cityToRemove = scanner.next();
                cityStateMap.remove(cityToRemove);
                System.out.println(cityStateMap.entrySet());
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    }
}
