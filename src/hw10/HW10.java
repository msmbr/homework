package hw10;

import java.util.*;

public class HW10 {
    //1
    public int countOccurrence(List<String> lst, String str) {
        int result = 0;
        for(String lstStr: lst) {
            if(lstStr.equals(str)) {
                ++result;
            }
        }
        return result;
    }

    public List<String> getRandomList(List<String> lst, int count) {
        List<String> resultLst = new ArrayList<>();
        for(int i = 0; i < count; ++i) {
            resultLst.add(getRandomWord(lst));
        }
        return resultLst;
    }

    public String getRandomWord(List<String> lst) {
        return lst.get((int) (Math.random() * lst.size()));
    }

    //2
    public <T> List<T> toList(T[] arr) {
        List<T> lst = new ArrayList<>();
        for(T element: arr) {
            lst.add(element);
        }
        return lst;
    }

    //3
    public <T> List<T> findUnique(List<T> lst) {
        return new ArrayList<T>(new HashSet<>(lst));
    }

    //4
    public List<Word> findOccurrence(List<String> lst) {
        List<Word> resultLst = new ArrayList<>();
        for(String u: findUnique(lst)) {
            resultLst.add(new Word(u, countOccurrence(lst, u)));
        }

        return resultLst;
    }

    public Map<String, Integer> findOccurrence2(List<String> lst) {
        Map<String, Integer> map = new HashMap<>();
        for(String e: lst) {
            if(map.containsKey(e)) {
                map.put(e, map.get(e) + 1);
            } else {
                map.put(e, 1);
            }
        }

        return map;
    }
}
