
### 1. Static Method Reference:
```java
// Custom functional interface for static method reference
interface StringOperation {
    String operate(String s);
}

// Example class with a static method
class StringUtils {
    static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}

// Using static method reference
StringOperation reverseOperation = StringUtils::reverse;
String result = reverseOperation.operate("hello"); // This will return "olleh"
```

### 2. Instance Method Reference:
```java
// Custom functional interface for instance method reference
interface AgeChecker {
    boolean checkAge(Person person);
}

// Example class with an instance method
class Person {
    private int age;

    Person(int age) {
        this.age = age;
    }

    boolean isAdult() {
        return age >= 18;
    }
}

// Using instance method reference
Person person = new Person(25);
AgeChecker adultChecker = Person::isAdult;
boolean isAdult = adultChecker.checkAge(person); // This will return true
```

### 3. Constructor Reference:
```java
// Custom functional interface for constructor reference
interface CarFactory {
    Car createCar(String model);
}

// Example class with a constructor
class Car {
    private String model;

    Car(String model) {
        this.model = model;
    }

    String getModel() {
        return model;
    }
}

// Using constructor reference
CarFactory carFactory = Car::new;
Car myCar = carFactory.createCar("Toyota");
System.out.println(myCar.getModel()); // This will print "Toyota"
```

### 4. Arbitrary Object Method Reference:
```java
// Custom functional interface for arbitrary object method reference
interface NumberOperation {
    int operate(NumberUtils utils, int num);
}

// Example class with an instance method
class NumberUtils {
    int square(int num) {
        return num * num;
    }
}

// Using arbitrary object method reference
NumberUtils numberUtils = new NumberUtils();
NumberOperation squareOperation = NumberUtils::square;
int result = squareOperation.operate(numberUtils, 5); // This will return 25
```

