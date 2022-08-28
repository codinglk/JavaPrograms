package com.codinglk.java8;

import com.codinglk.model.Car;
import com.codinglk.util.JavaProgramsUtil;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author codinglk
 * Java 8 Optional
 */
public class Java8Optional {
    public static void main(String[] args) {

        JavaProgramsUtil javaProgramsUtil = new JavaProgramsUtil();

        // Creating Optional Objects
        Optional<String> emptyObj = Optional.empty();
        System.out.println(emptyObj.isPresent()); // It will return false

        // Create an Optional object with the static method of()
        String name = "codinglk";
        Optional<String> optObj = Optional.of(name);
        System.out.println(optObj.isPresent()); // It will return true

        /** Argument passed to the of() method can't be null. Otherwise, we'll get a NullPointerException
         String name1 = null;
         Optional<String> optObj1 = Optional.of(name1);
         System.out.println(optObj1.isPresent()); // NullPointerException
         */

        //In case we expect some null values, we can use the ofNullable() method
        String name2 = "codinglk";
        Optional<String> optObj2 = Optional.ofNullable(name2);
        System.out.println(optObj2.isPresent()); // It will return true

        String name3 = null;
        Optional<String> optObj3 = Optional.ofNullable(name3);
        System.out.println(optObj3.isPresent()); // It will return false

        // In typical functional programming style, we can execute perform an action on an object that is actually present
        Optional<String> optObj4 = Optional.of("codinglk");
        optObj4.ifPresent(userName -> System.out.println(userName.length()));

        // orElse() method returns the wrapped value if it's present, and its argument otherwise
        String nullUserName = null;
        String userName = Optional.ofNullable(nullUserName).orElse("LK");
        System.out.println(userName);

        // orElseGet() method is similar to orElse(). However, instead of taking a value to return if the Optional
        // value is not present, it takes a supplier functional interface, which is invoked and returns the value of the invocation
        String nullUserName1 = null;
        String userName1 = Optional.ofNullable(nullUserName1).orElseGet(() -> "LK");
        System.out.println(userName1);

        String text = null;
        String defaultText = Optional.ofNullable(text).orElseGet(javaProgramsUtil.getDefaultValue());
        System.out.println(defaultText);

        /**
         // When the wrapped value is not present, orElseThrow throws an exception:
         String nullValue = null;
         String value = Optional.ofNullable(nullValue).orElseThrow(
         IllegalArgumentException::new);
         */

        // retrieving the wrapped value using the get() method
        Optional<String> optObject = Optional.of("codinglk");
        String obtObjectValue = optObject.get();
        System.out.println(obtObjectValue);

        // retrieving the wrapped value using the get() method, using ofNullable so that we can check isPresent to avoid
        // null pointer exception
        Optional<String> optObject1 = Optional.ofNullable(null);
        if(optObject1.isPresent()){
            // these lines will not be executed, no value present
            String obtObjectValue1 = optObject1.get();
            System.out.println(obtObjectValue1);
        }

        // Conditional Return With filter()
        Integer age = 36;
        Optional<Integer> ageOptional = Optional.of(age);
        boolean isAge36 = ageOptional.filter(a -> a == 36).isPresent();
        System.out.println("isAge36 - "+isAge36);
        boolean isAge37 = ageOptional.filter(a -> a == 37).isPresent();
        System.out.println("isAge37 - "+ isAge37);

        // The map call is simply used to transform a value to some other value
        List<String> employeeNames = Arrays.asList(
                "Mike", "Everett", "LK", "Mel", "Rob", "codinglk");
        Optional<List<String>> listOptional = Optional.of(employeeNames);
        int size = listOptional
                .map(List::size)
                .orElse(0);
        System.out.println(size);

        // Calling priceIsInRange method, check this method code (using map,filter and isPresent) in JavaProgramsUtil class
        System.out.println("Calling priceIsInRange method -> ");
        System.out.println(javaProgramsUtil.priceIsInRange(new Car(1000000.0)));
        System.out.println(javaProgramsUtil.priceIsInRange(new Car(2000000.0)));
        System.out.println(javaProgramsUtil.priceIsInRange(new Car(3000000.0)));
        System.out.println(javaProgramsUtil.priceIsInRange(new Car(4000000.0)));
        System.out.println(javaProgramsUtil.priceIsInRange(new Car(null)));

    }

}
