package club.smarti.asserts;

import org.jetbrains.annotations.Contract;

import club.smarti.asserts.exceptions.AssertClassException;
import club.smarti.java.Classes;

abstract class Asserts_5_Class extends Asserts_4_Equal {

    /**
     * Assert that the source class is equal or extends/implement target class/interface
     *
     * @param target -
     * @param source - class to be checked
     * @param debugInfo - optional list of debug data
     */
    @Contract(pure = true, value = "null, _, _ -> fail; _, null, _ -> fail")
    public static void assignable(Class<?> target, Class<?> source, Object... debugInfo) {
        if (ENABLED) {
            notNull(target, target, source, debugInfo);
            notNull(source, target, source, debugInfo);

            if (target != source) { // bypass
                if (!Classes.isAssignable(target, source)) {
                    throwIt(new AssertClassException(target, source, debugInfo));
                }
            }
        }
    }
}