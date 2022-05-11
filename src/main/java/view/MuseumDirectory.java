package view;

import model.*;

import java.util.Locale;
import java.util.Scanner;

public class MuseumDirectory {
    public static void main(String[] args) {
        System.out.println("Welcome to Nashville Museum Directory");
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        System.out.println("Choose which museum you want to visit");
        System.out.println("You can bundle to get a discount");
        int groupCount = 0;
        MuseumDir museumdir = new MuseumDir();


        do {
            System.out.println("1 For Art Museum * 2 Country Music Hall * 3 For Parthenon Museum * 4 For Lane Motor Museum * Choose C for CheckOut");
            String input = scanner.nextLine();

            if (input.toUpperCase().equals("1")) {
            System.out.println("Great choice Art is Fun.");
            Group group = new ArtMuseum();
            museumdir.addGroup(group);
        } else if (input.toUpperCase().equals("2")) {
            System.out.println("Great choice Music energizes you.");
            Group group = new CountryMusicHall();
            museumdir.addGroup(group);
        } else if (input.toUpperCase().equals("3")) {
            System.out.println("Great choice back to the roots of civilization.");
            Group group = new ParthenonMuseum();
            museumdir.addGroup(group);
        } else if (input.toUpperCase().equals("4")) {
            System.out.println("Great choice vintage cars loved by millions.");
            Group group = new LaneMotorMuseum();
            museumdir.addGroup(group);
        } else if (input.toUpperCase().equals("C")) {
            quit = true;
        } else {
            System.out.println("Looking forward to adding this museum to our collection");
            System.out.println("Please choose from the list");
            continue;
        }
        groupCount++;
    } while(!quit &&groupCount< 4);
        System.out.println(museumdir);
}

}
