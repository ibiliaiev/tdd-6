package com.epam.workshop.dto;

import java.io.Serializable;

public class ResultDto implements Serializable {

    private long count;

    public ResultDto() {

    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }
}
