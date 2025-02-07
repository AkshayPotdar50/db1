package com.atos.deproj.sprint2145.design;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class ArrayMinAndMax {
    int [] arr={10, 2, 5, 4, 87, 56, 32, 14, 78, 45, 21, 56};

    IntSummaryStatistics stats= Arrays.stream(arr).summaryStatistics();

    int min= stats.getMin();
    int max= stats.getMax();

    int min2=Arrays.stream(arr).min().orElseThrow(IllegalArgumentException::new);
    int max2=Arrays.stream(arr).max().orElseThrow(IllegalArgumentException::new);


}
