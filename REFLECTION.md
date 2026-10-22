# Vehicle Rental Lab Reflection

## 1. Why should the fields be private?

Fields should be private to protect data from being changed directly. Getters and setters provide controlled access to the fields and can check whether a value is valid.

## 2. What happens if the Car constructor does not call `super(...)`?

Java tries to call the parent's no-argument constructor automatically. Since the `Vehicle` class has a constructor with parameters and no no-argument constructor, the `Car` constructor must call `super(brand, year)` or the program will not compile.

## 3. What is the difference between `this.type` and `super.type`?

`this.type` accesses the `type` variable declared in the `Car` class. `super.type` accesses the `type` variable declared in the parent `Vehicle` class.
