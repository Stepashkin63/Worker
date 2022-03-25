package ru.stepashkin.hw1;
@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(String result);
}
