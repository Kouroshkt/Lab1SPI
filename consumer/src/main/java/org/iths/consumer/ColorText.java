package org.iths.consumer;

import java.lang.annotation.*;

@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ColorText {
    enum Value {
        RED("Red", "\u001B[31m"),
        GREEN("Green", "\u001B[32m"),
        BLUE("Blue", "\u001B[34m"),
        YELLOW("Yellow", "\u001B[33m"),
        ORANGE("Orange", "\u001B[38;5;208m"),
        PURPLE("Purple", "\u001B[35m"),
        PINK("Pink", "\u001B[38;5;206m"),
        CYAN("Cyan", "\u001B[36m"),
        MAGENTA("Magenta", "\u001B[35m"),
        BLACK("Black", "\u001B[30m");

        private final String name;
        private final String code;

        Value(String name, String code) {
            this.name = name;
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public String getCode() {
            return code;
        }
    }
    Value value();
}
