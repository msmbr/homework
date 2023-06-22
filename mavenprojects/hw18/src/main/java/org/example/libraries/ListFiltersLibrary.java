package org.example.libraries;

import java.util.List;

public class ListFiltersLibrary {
    public List<String> getLowerCaseAndFourLengthList(List<String> lst) {
        List<String> res = lst.stream().filter(e -> e.length() == 4 && e.equals(e.toLowerCase())).toList();
        res.forEach(e -> System.out.print(e + " "));
        return res;
    }
}
