import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import club.smarti.asserts.Asserts;
import club.smarti.asserts.exceptions.AssertClassException;
import club.smarti.asserts.exceptions.AssertNullCheckException;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestClass {

    @Test
    public void testAssignable() {
        assertDoesNotThrow(() -> Asserts.assignable(Class.class, Class.class));
        assertThrows(AssertClassException.class, () -> Asserts.assignable(Class.class, Object.class));

        assertDoesNotThrow(() -> Asserts.assignable(boolean.class, boolean.class));
        assertDoesNotThrow(() -> Asserts.assignable(boolean.class, Boolean.class));
        assertDoesNotThrow(() -> Asserts.assignable(Boolean.class, Boolean.class));
        assertThrows(AssertClassException.class, () -> Asserts.assignable(boolean.class, byte.class));
        assertThrows(AssertClassException.class, () -> Asserts.assignable(boolean.class, int.class));
        assertThrows(AssertClassException.class, () -> Asserts.assignable(Boolean.class, byte.class));
        assertThrows(AssertClassException.class, () -> Asserts.assignable(Boolean.class, Integer.class));
        assertThrows(AssertClassException.class, () -> Asserts.assignable(Boolean.class, Object.class));

        assertDoesNotThrow(() -> Asserts.assignable(byte.class, byte.class));
        assertDoesNotThrow(() -> Asserts.assignable(byte.class, Byte.class));
        assertDoesNotThrow(() -> Asserts.assignable(Byte.class, Byte.class));
        assertThrows(AssertClassException.class, () -> Asserts.assignable(byte.class, short.class));
        assertThrows(AssertClassException.class, () -> Asserts.assignable(byte.class, int.class));

        assertDoesNotThrow(() -> Asserts.assignable(short.class, byte.class));
        assertDoesNotThrow(() -> Asserts.assignable(short.class, short.class));
        assertDoesNotThrow(() -> Asserts.assignable(short.class, Short.class));
        assertDoesNotThrow(() -> Asserts.assignable(Short.class, Short.class));
        assertThrows(AssertClassException.class, () -> Asserts.assignable(short.class, int.class));
        assertThrows(AssertClassException.class, () -> Asserts.assignable(short.class, float.class));

        assertDoesNotThrow(() -> Asserts.assignable(char.class, char.class));
        assertDoesNotThrow(() -> Asserts.assignable(char.class, Character.class));
        assertDoesNotThrow(() -> Asserts.assignable(Character.class, Character.class));
        assertThrows(AssertClassException.class, () -> Asserts.assignable(char.class, byte.class));
        assertThrows(AssertClassException.class, () -> Asserts.assignable(char.class, short.class));
        assertThrows(AssertClassException.class, () -> Asserts.assignable(char.class, int.class));
        assertThrows(AssertClassException.class, () -> Asserts.assignable(char.class, float.class));
        assertThrows(AssertClassException.class, () -> Asserts.assignable(char.class, Byte.class));
        assertThrows(AssertClassException.class, () -> Asserts.assignable(char.class, Object.class));
        assertThrows(AssertClassException.class, () -> Asserts.assignable(Character.class, Byte.class));
        assertThrows(AssertClassException.class, () -> Asserts.assignable(Character.class, Integer.class));
        assertThrows(AssertClassException.class, () -> Asserts.assignable(Character.class, Object.class));

        assertDoesNotThrow(() -> Asserts.assignable(int.class, byte.class));
        assertDoesNotThrow(() -> Asserts.assignable(int.class, char.class));
        assertDoesNotThrow(() -> Asserts.assignable(int.class, short.class));
        assertDoesNotThrow(() -> Asserts.assignable(int.class, Byte.class));
        assertDoesNotThrow(() -> Asserts.assignable(int.class, Short.class));
        assertDoesNotThrow(() -> Asserts.assignable(int.class, Character.class));
        assertDoesNotThrow(() -> Asserts.assignable(int.class, Integer.class));
        assertDoesNotThrow(() -> Asserts.assignable(Integer.class, Integer.class));
        assertThrows(AssertClassException.class, () -> Asserts.assignable(int.class, long.class));
        assertThrows(AssertClassException.class, () -> Asserts.assignable(int.class, float.class));
        assertThrows(AssertClassException.class, () -> Asserts.assignable(int.class, double.class));
        assertThrows(AssertClassException.class, () -> Asserts.assignable(int.class, Long.class));
        assertThrows(AssertClassException.class, () -> Asserts.assignable(int.class, Object.class));
        assertThrows(AssertClassException.class, () -> Asserts.assignable(Integer.class, Byte.class));
        assertThrows(AssertClassException.class, () -> Asserts.assignable(Integer.class, Short.class));
        assertThrows(AssertClassException.class, () -> Asserts.assignable(Integer.class, Character.class));
        assertThrows(AssertClassException.class, () -> Asserts.assignable(Integer.class, Long.class));
        assertThrows(AssertClassException.class, () -> Asserts.assignable(Integer.class, Float.class));
        assertThrows(AssertClassException.class, () -> Asserts.assignable(Integer.class, Double.class));
        assertThrows(AssertClassException.class, () -> Asserts.assignable(Integer.class, Number.class));
        assertThrows(AssertClassException.class, () -> Asserts.assignable(Integer.class, Object.class));

        assertDoesNotThrow(() -> Asserts.assignable(long.class, byte.class));
        assertDoesNotThrow(() -> Asserts.assignable(long.class, char.class));
        assertDoesNotThrow(() -> Asserts.assignable(long.class, short.class));
        assertDoesNotThrow(() -> Asserts.assignable(long.class, int.class));
        assertDoesNotThrow(() -> Asserts.assignable(long.class, Byte.class));
        assertDoesNotThrow(() -> Asserts.assignable(long.class, Short.class));
        assertDoesNotThrow(() -> Asserts.assignable(long.class, Character.class));
        assertDoesNotThrow(() -> Asserts.assignable(long.class, Integer.class));
        assertDoesNotThrow(() -> Asserts.assignable(long.class, Long.class));
        assertDoesNotThrow(() -> Asserts.assignable(Long.class, Long.class));
        assertThrows(AssertClassException.class, () -> Asserts.assignable(long.class, float.class));
        assertThrows(AssertClassException.class, () -> Asserts.assignable(long.class, double.class));
        assertThrows(AssertClassException.class, () -> Asserts.assignable(long.class, Double.class));
        assertThrows(AssertClassException.class, () -> Asserts.assignable(long.class, Object.class));
        assertThrows(AssertClassException.class, () -> Asserts.assignable(Long.class, Byte.class));
        assertThrows(AssertClassException.class, () -> Asserts.assignable(Long.class, Integer.class));
        assertThrows(AssertClassException.class, () -> Asserts.assignable(Long.class, Float.class));

        assertDoesNotThrow(() -> Asserts.assignable(float.class, byte.class));
        assertDoesNotThrow(() -> Asserts.assignable(float.class, char.class));
        assertDoesNotThrow(() -> Asserts.assignable(float.class, short.class));
        assertDoesNotThrow(() -> Asserts.assignable(float.class, int.class));
        assertDoesNotThrow(() -> Asserts.assignable(float.class, long.class));
        assertDoesNotThrow(() -> Asserts.assignable(float.class, Byte.class));
        assertDoesNotThrow(() -> Asserts.assignable(float.class, Short.class));
        assertDoesNotThrow(() -> Asserts.assignable(float.class, Character.class));
        assertDoesNotThrow(() -> Asserts.assignable(float.class, Integer.class));
        assertDoesNotThrow(() -> Asserts.assignable(float.class, Long.class));
        assertDoesNotThrow(() -> Asserts.assignable(float.class, Float.class));
        assertDoesNotThrow(() -> Asserts.assignable(Float.class, Float.class));
        assertThrows(AssertClassException.class, () -> Asserts.assignable(float.class, double.class));
        assertThrows(AssertClassException.class, () -> Asserts.assignable(float.class, Double.class));
        assertThrows(AssertClassException.class, () -> Asserts.assignable(float.class, Object.class));
        assertThrows(AssertClassException.class, () -> Asserts.assignable(Float.class, Byte.class));
        assertThrows(AssertClassException.class, () -> Asserts.assignable(Float.class, Integer.class));
        assertThrows(AssertClassException.class, () -> Asserts.assignable(Float.class, Double.class));
        assertThrows(AssertClassException.class, () -> Asserts.assignable(Float.class, Object.class));

        assertDoesNotThrow(() -> Asserts.assignable(double.class, byte.class));
        assertDoesNotThrow(() -> Asserts.assignable(double.class, char.class));
        assertDoesNotThrow(() -> Asserts.assignable(double.class, short.class));
        assertDoesNotThrow(() -> Asserts.assignable(double.class, int.class));
        assertDoesNotThrow(() -> Asserts.assignable(double.class, long.class));
        assertDoesNotThrow(() -> Asserts.assignable(double.class, Byte.class));
        assertDoesNotThrow(() -> Asserts.assignable(double.class, Short.class));
        assertDoesNotThrow(() -> Asserts.assignable(double.class, Character.class));
        assertDoesNotThrow(() -> Asserts.assignable(double.class, Integer.class));
        assertDoesNotThrow(() -> Asserts.assignable(double.class, Long.class));
        assertDoesNotThrow(() -> Asserts.assignable(double.class, Double.class));
        assertDoesNotThrow(() -> Asserts.assignable(Double.class, Double.class));
        assertThrows(AssertClassException.class, () -> Asserts.assignable(double.class, Object.class));
        assertThrows(AssertClassException.class, () -> Asserts.assignable(Double.class, Byte.class));
        assertThrows(AssertClassException.class, () -> Asserts.assignable(Double.class, Integer.class));
        assertThrows(AssertClassException.class, () -> Asserts.assignable(Double.class, Float.class));
        assertThrows(AssertClassException.class, () -> Asserts.assignable(Double.class, Object.class));

        assertDoesNotThrow(() -> Asserts.assignable(int[].class, int[].class));
        assertDoesNotThrow(() -> Asserts.assignable(Integer[].class, Integer[].class));
        assertDoesNotThrow(() -> Asserts.assignable(Object[].class, Integer[].class));
        assertThrows(AssertClassException.class, () -> Asserts.assignable(int[].class, byte[].class));
        assertThrows(AssertClassException.class, () -> Asserts.assignable(int[].class, Integer[].class));
        assertThrows(AssertClassException.class, () -> Asserts.assignable(Integer[].class, byte[].class));
        assertThrows(AssertClassException.class, () -> Asserts.assignable(Integer[].class, int[].class));
        assertThrows(AssertClassException.class, () -> Asserts.assignable(Integer[].class, Object[].class));

        assertDoesNotThrow(() -> Asserts.assignable(Map.class, Map.class));
        assertDoesNotThrow(() -> Asserts.assignable(Map.class, HashMap.class));
        assertDoesNotThrow(() -> Asserts.assignable(Cloneable.class, HashMap.class));
        assertThrows(AssertClassException.class, () -> Asserts.assignable(HashMap.class, Map.class));
        assertThrows(AssertClassException.class, () -> Asserts.assignable(HashMap.class, Cloneable.class));

        assertThrows(AssertNullCheckException.class, () -> Asserts.assignable(null, Object.class));
        assertThrows(AssertNullCheckException.class, () -> Asserts.assignable(Object.class, null));
    }
}