package ExamProject;

import java.util.ArrayList;
import java.util.List;

public class Collection2 {
    public static void main(String[] args) {

        slovarr();

    }

    public static void slovarr() {
        List<String> arr = new ArrayList<>(List.of("Dima", "Antoni", "Aleksey", "Vasya", "Leonid"));

        System.out.println(arr.size());

        for (String el: arr) {
            System.out.println(el);
        }

    }
}
