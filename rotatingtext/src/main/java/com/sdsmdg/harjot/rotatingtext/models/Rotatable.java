package com.sdsmdg.harjot.rotatingtext.models;

import android.graphics.Color;
import android.graphics.Path;

/**
 * Created by Harjot on 01-May-17.
 */

public class Rotatable {
    private int color = Color.BLACK;
    private String[] text;
    private int updateDuration = 2000;
    private int animationDuration = 1000;
    private int currentWordNumber;

    private float size = 24.0f;
    private int strokeWidth = -1;

    private Path pathIn, pathOut;

    public Rotatable(int updateDuration, String... text) {
        this.updateDuration = updateDuration;
        this.text = text;
        currentWordNumber = -1;
    }

    public Rotatable(int color, int updateDuration, String... text) {
        this.color = color;
        this.updateDuration = updateDuration;
        this.text = text;
        currentWordNumber = 0;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public String[] getText() {
        return text;
    }

    public void setText(String... text) {
        this.text = text;
    }

    public int getUpdateDuration() {
        return updateDuration;
    }

    public void setUpdateDuration(int updateDuration) {
        this.updateDuration = updateDuration;
    }

    public int getNextWordNumber() {
        currentWordNumber = (currentWordNumber + 1) % text.length;
        return currentWordNumber;
    }

    public String peekNextWord() {
        return text[(currentWordNumber + 1) % text.length];
    }

    public String getNextWord() {
        return text[getNextWordNumber()];
    }

    public String getPreviousWord() {
        if (currentWordNumber == 0)
            return text[(text.length - 1)];
        else
            return text[currentWordNumber - 1];
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public int getStrokeWidth() {
        return strokeWidth;
    }

    public void setStrokeWidth(int strokeWidth) {
        this.strokeWidth = strokeWidth;
    }

    public int getAnimationDuration() {
        return animationDuration;
    }

    public void setAnimationDuration(int animationDuration) {
        this.animationDuration = animationDuration;
    }

    public Path getPathIn() {
        return pathIn;
    }

    public void setPathIn(Path pathIn) {
        this.pathIn = pathIn;
    }

    public Path getPathOut() {
        return pathOut;
    }

    public void setPathOut(Path pathOut) {
        this.pathOut = pathOut;
    }
}