package org.example.libraries;

import org.example.Pair;

import java.util.List;

public class ListConversionLibrary {
    public List<Pair> getPairList(List<String> lst) {
        return lst.stream().map((s) -> new Pair(s, s.toUpperCase())).toList();
    }
}
