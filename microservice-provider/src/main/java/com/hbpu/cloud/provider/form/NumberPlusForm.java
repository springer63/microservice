package com.hbpu.cloud.provider.form;

import com.github.boot.framework.web.form.Form;
import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.NotNull;

/**
 * ${DESCRIPTION}
 *
 * @author chenjianhui
 * @create 2017/12/06
 **/
@Data
@ToString
public class NumberPlusForm implements Form {

    @NotNull
    private Integer a;

    @NotNull
    private Integer b;


}
