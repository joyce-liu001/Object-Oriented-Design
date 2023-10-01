# Specification

[https://www.cse.unsw.edu.au/~cs2511/21T3/FinalExam/](https://www.cse.unsw.edu.au/~cs2511/21T3/FinalExam/)

Question 1 (5 marks)
You are implementing a health application that monitors heart rate of a patient. If the heart rate of a patient is out of the required range, the application needs to inform all the relevant doctors and nurses. Doctors and nurses responsible for a patient may change over time. Give the most appropriate design pattern for the following situations, briefly justifying your answer.

A: The Observer Pattern is required for this use case as there is a subject class which has ongoing activity (the patient with the heart rate monitor) and subscribers who need to be updated (doctors and nurses who must be notified given a certain heart rate).
This pattern allows for doctors and nurses to also unsubscribe if their responsibilities change over time.

Question 2 (5 marks)
A user bought an application that reads data in JSON format, and displays results on a web page. Later, the user realised that one of their data sources is in XML format. Unfortunately, the user does not have access to the source code of the application, so it is not possible to change the application. Give the most appropriate design pattern for the following situations, briefly justifying your answer.

A:  The Adapter Pattern is intended to allow classes to work together in places where they wouldn't be able to due to incompatible interfaces.The adapter pattern is often used to make existing classes (APIs) work with a client class without modifying their source code.
In this situation it would be used to take in XML code and convert it to JSON which will be compatible with said application.


Question 3 (3 marks)
Briefly explain the important differences between the Decorator Pattern and the Builder Pattern, as discussed in the lectures.

The Builder pattern is structural and so provides multiple methods to build separate components where each component can be built to specification as required by a situation.
The Decorator pattern is creational and so provides the ability to attach new behaviours to a certain objects by using wrapper objects which contain additional behaviours.
The builder pattern allows you to create components in a custom manner however once received these components cannot have functionality added.
The decorator pattern on the other hand allows you to add and remove functionality from a certain object dynamically throughout runtime.


Question 4 (3 marks)
Which of the following statements is true? (There may be more than one). Justify your answer.

a. Template Method lets subclasses redefine an algorithm, keeping certain steps invariants.
b. Subclasses of the Template Method can redefine only certain parts of a behaviour without changing the algorithm's structure.
c. A subclass calls the operations of a parent class and not the other way around.
d. Template pattern works on the object level, letting you switch behaviours at runtime

A: b, Define the skeleton of an algorithm in an operation, deferring some steps to subclasses. Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.


Question 5 (3 marks)
a. Identify one code smell in this program. (1 mark): Feature Envy [10][10]

b. Identify and explain the most pertinent (problematic) design smell in this program. (2 marks)
too tightly couple, 前端后端耦合


Question 7 (2 marks)

Which of the following is correct? There may be more than one correct answer.

a. List<Integer> is a subtype of List<Object>.
b. List<?> matches List<Object> and List<Integer>.
c. The wildcard < ? extends Foo > matches Foo and any subtype of Foo, where Foo is any type.
d. The wildcard < ? extends Foo > matches Foo and any super type of Foo, where Foo is any type.

A: b and c

Question 8 (3 marks)
What will the above program print? With reference to concepts surrounding inheritance, explain your answer.
A:  "Woof woof"

Question 9 (4 marks)
Is this valid inheritance? Justify your answer.


Both the Abstract Factory and Factory Method are creational design patterns that involve an interface to produce objects from.
The Abstract Factory differs in that its intent is to allow the software to create different related/dependent objects without defining their concrete classes.
The Factory Method however allows the creation of one object but allows its subclasses to instantiate it and decide which class to instantiate the object under.