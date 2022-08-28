package com.codinglk.util;

import com.codinglk.model.Car;

import java.util.Optional;
import java.util.function.Supplier;
/**
 * @author codinglk
 * Java Programs Util
 */
public class JavaProgramsUtil {
    public Supplier<? extends String> getDefaultValue() {
        Supplier<? extends String> obj = new Supplier<String>() {
            @Override
            public String get() {
                System.out.println("Get default value");
                return "This is the Default Value";
            }
        };
        return obj;
    }

    public boolean priceIsInRange(Car car) {
        return Optional.ofNullable(car)
                .map(Car::getPrice)
                .filter(p -> p >= 3000000)
                .filter(p -> p <= 5500000)
                .isPresent();
    }

}
