package com.stzbzz.top50;

import java.util.LinkedList;
import java.util.List;

import com.stzbzz.top50.steps.Step02;

/**
 * Hello world!
 *
 */
public class App {
    static List<Solution> solutions = new LinkedList<>();

    public static void main(String[] args) {
        solutions.add(new Step02());
        solutions.stream().forEach(solution->{
            System.out.println("-------------------");
            System.out.println(solution);
            solution.run();
            System.out.println("-------------------");
        });
    }
}
