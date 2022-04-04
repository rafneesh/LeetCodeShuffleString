package com.rafneesh.shuffler;

import com.rafneesh.shuffler.solution.Solution;

import java.util.logging.Logger;

public class Application {

    private static final Logger LOGGER = Logger.getLogger(Application.class
            .getClass().getName());

    public static void main(String[] args) {

        Solution solution = new Solution();

        LOGGER.info(solution.restoreString("codeleet",
                new int[]{4,5,6,7,0,2,1,3}));



    }
}
