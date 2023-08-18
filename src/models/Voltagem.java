package models;

import java.lang.annotation.Repeatable;

@Repeatable(Voltagens.class)
public @interface Voltagem {
    String tensao();
}
