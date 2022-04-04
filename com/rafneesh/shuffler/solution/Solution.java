package com.rafneesh.shuffler.solution;

public class Solution {

    public String restoreString(String s, int[] indices) {

        char[] chr = new char[s.length()];

        int index = 0;


        for (var i : indices) {

            chr[i] = s.charAt(index);
            index++;

        }
        return new String(chr);

    }
}