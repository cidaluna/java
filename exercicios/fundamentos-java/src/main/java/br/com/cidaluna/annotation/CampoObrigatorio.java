package main.java.br.com.cidaluna.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // precisa sobreviver até runtime pra reflection conseguir ler
@Target(ElementType.FIELD)          // só pode ser aplicada em atributos (campos)
public @interface CampoObrigatorio {
    String mensagem() default "Campo obrigatório não preenchido";
}
