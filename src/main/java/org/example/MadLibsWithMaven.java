package org.example;

import java.util.stream.Stream;

public class MadLibsWithMaven {
    /*
  This program generates a mad libbed story using Maven
  Author: CMK
  Date: 14/02/2020
  */
    public static void main(String[] args) {

        //variables
        String name1 = "Jack";
        String adjective1 = "happy";
        String adjective2 = "beautiful";
        String adjective3 = "excited";
        String verb1 = "dance";
        String noun1 = "people";
        String noun2 = "tobacco";
        String noun3 = "music";
        String noun4 = "protesters";
        String noun5 = "yoghurt";
        String noun6 = "aliens";
        String name2 = "Joy";
        int number = 2149;
        String place1 = "Los Angeles";



        // This is a test comment. I'm practicing with Git!

        //The template for the story
        String story = "This morning " + name1 + " woke up feeling " + adjective1 + ". 'It is going to be a " + adjective2 + " day!'\nOutside, a bunch of " + noun1 + "s were protesting to keep " + noun2 + " in stores.\nThey began to " + verb1 + " to the rhythm of the " + noun3 + ", which made all the " + noun4 + "s very " + adjective3 + ". \nConcerned, " + name1 + " texted " + name2 + ", who flew " + name1 + " to " + place1 + " and dropped " + name1 + " in a puddle of frozen " + noun5 + ". \n" + name1 + " woke up in the year " + number + ", in a world where " + noun6 + "s ruled the world.";

        System.out.println(story);

    }
}
