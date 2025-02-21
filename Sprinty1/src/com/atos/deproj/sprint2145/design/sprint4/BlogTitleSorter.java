package com.atos.deproj.sprint2145.design.sprint4;

import java.util.Arrays;
import java.util.Comparator;

public class BlogTitleSorter {
    public static void main(String[] args) {

        // Example blog titles
        String[] blogTitles = {
                "AI and the Future of Work",
                "The Art of Effective Communication",
                "Java Concurrency Best Practices",
                "Understanding Blockchain Technology",
                "Sorting Algorithms in Java"
        };
        Arrays.sort(blogTitles, Comparator.comparingInt(String::length).reversed());

        System.out.println("blog titles sortd by length");
        for(String title:blogTitles){
            System.out.println(title);
        }
    }
}
