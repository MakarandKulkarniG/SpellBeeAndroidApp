package com.makarandkulkarni.spellbee;

import android.util.Log;

/**
 * Created by makarand on 1/14/2016.
 */
public class Word {
    private String spelling;
    private int correct;
    private int attempt;

    public Word(String word) {
        spelling = word;

        correct = attempt = 0;
    }

    public int getAttempt() { return attempt; }

    public int getCorrect() { return correct; }

    public void setCorrect(int val) { correct = val; }

    public void setAttempt(int val) { attempt = val; }

    public void incAttempt() { attempt += 1; }

    public void incCorrect() {
        correct += 1;
    }

    public String getSpelling() {
        return spelling;
    }

    public boolean isCorrect(String spelt) {
        return (spelling == spelt);
    }

    public boolean checkSpelling(String spelt) {
        attempt ++;

        if (spelling.equals(spelt)) {
            correct++;
            return true;
        } else {
            return false;
        }
    }
}
