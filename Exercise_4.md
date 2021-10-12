# Model View Controller

### Advantages:
+ Good modularity

+ Views are able to be changed or added during execution without effecting the model

+ Makes collaboration more efficient for developers to update programs

### Disadvantages: 
- High coupling

- Can cause the data display to be slowed and effect performance of user interface negatively 

- MVC causes the components within the user interface to be highly reliant on model components


# Model View Controller with Interfaces

### Advantages:
+ Removes coupling through interfaces

+ Easy to implement new objects for future use cases

+ Good code reusability

### Disadvantages: 
- Strict modularity, requires updating individual classes that implements the interface

- Difficult to make large changes in functionality of program


# Observer Pattern

### Advantages:
+ Loose coupling between the objects

+ Efficently update objects without modifying the observer class 

### Disadvantages: 
- Notifications passed by observer can fail in certain scenarios 

- Can result in higher complexity and lead to unintended performance issues if the pattern is not correctly applied  
