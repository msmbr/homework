package org.example;

import java.util.Objects;

public class Pair {
    private String lCase, uCase;

    public Pair(String lCase, String uCase) {
        this.lCase = lCase;
        this.uCase = uCase;
    }

    public String getlCase() {
        return lCase;
    }

    public void setlCase(String lCase) {
        this.lCase = lCase;
    }

    public String getuCase() {
        return uCase;
    }

    public void setuCase(String uCase) {
        this.uCase = uCase;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "lCase='" + lCase + '\'' +
                ", uCase='" + uCase + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Pair pair = (Pair) o;
        return Objects.equals(lCase, pair.lCase) && Objects.equals(uCase, pair.uCase);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lCase, uCase);
    }
}
