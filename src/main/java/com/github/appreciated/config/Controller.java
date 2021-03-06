package com.github.appreciated.config;

import com.github.appreciated.Swiper;

public class Controller {

    private Swiper control;
    private Boolean inverse;
    private String by;

    public Controller() {
    }

    public Boolean isInverse() {
        return inverse;
    }

    public Swiper getControl() {
        return control;
    }

    public void setControl(Swiper control) {
        this.control = control;
    }

    public Boolean getInverse() {
        return inverse;
    }

    public void setInverse(Boolean inverse) {
        this.inverse = inverse;
    }

    public String getBy() {
        return by;
    }

    public void setBy(String by) {
        this.by = by;
    }

}
