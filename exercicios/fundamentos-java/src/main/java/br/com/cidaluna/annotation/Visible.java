package main.java.br.com.cidaluna.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // precisa sobreviver até runtime pra reflection ler
@Target(ElementType.FIELD)          // só faz sentido em campos
public @interface Visible {
    boolean value() default true; // define se o campo deve aparecer (true) ou ser ocultado (false)
}