package com.atos.deproj.sprint2145.design.stream.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test12 {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("alice", "bob", "charlie");

        List<String> upperCaseNames = names.stream()
                .map(String::toUpperCase)
                .toList();

    }
}
