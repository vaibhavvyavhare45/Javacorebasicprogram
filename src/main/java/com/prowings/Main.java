package com.prowings;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> li=Arrays.asList(4,5,2,6,7,1,2,3);
        List<Integer> li1=li.stream().filter(i->i%2!=0).collect(Collectors.toList());
        System.out.println(li1);

        int[] numbers={1, 5, 3, 8, 2, 7, 4};
         int secondHighestNumber=Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder())
                 .distinct().skip(1).findFirst().orElse(-1);
        System.out.println(secondHighestNumber);

        //the date of the next occurring wednesday using java 8
        LocalDate today=LocalDate.now();
        LocalDate nextWednesday=today.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println("next wednesday on: "+nextWednesday);
        System.out.println(today);
    }
}