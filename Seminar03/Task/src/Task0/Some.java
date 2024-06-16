package Task0;

import java.io.Serializable;

public interface Some extends Serializable, Cloneable, Comparable<Some> {
    Double PI = 3.14159265358979323846;

    default int foo(int a, String b) {
        return 0;
    }

    // final в методе означанет, что его нельзя переопределить, т.е. он финальный. В простых переменных означает константа.
    // в классе означает, что клас без детный, т.е. не может иметь наследников.
}
