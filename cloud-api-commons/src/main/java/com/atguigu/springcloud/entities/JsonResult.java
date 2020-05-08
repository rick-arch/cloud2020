package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class JsonResult<T> implements Serializable {
    private Integer code;
    private String message;
    private T data;

    public JsonResult(Integer code, String message) {
        this(code, message, null);
    }
}
