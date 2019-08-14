package com.ex;

import lombok.Data;

import java.util.List;

/**
 * Created by 李新宇
 * 2019-08-13 10:13
 */
@Data
public class Demo<T> {
    private List<T> list;
}
