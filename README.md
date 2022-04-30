
# Head First Patterns
This repository contains an implementation of examples from the book "Head First Design Patterns" 2nd edition by Eric Freeman and Elizabeth Robson.


## Languages

<img src="https://www.svgrepo.com/show/303617/kotlin-1-logo.svg" alt="Kotlin" width=16><img src="https://www.svgrepo.com/show/184143/java.svg" alt="Java" width=19>
 
## Maven Dependencies

[Kotlin](https://www.jetbrains.com/opensource/kotlin/)\
[Lombok](https://projectlombok.org/)\
[Flogger](https://google.github.io/flogger/)\
[JetBrains Annotations](https://www.jetbrains.com/help/idea/annotating-source-code.html#bundled-annotations)\
[Microutils](https://github.com/MicroUtils/kotlin-logging)\
[SLF4J](https://www.slf4j.org/)



## Links

- [Head First Design Patterns](https://www.oreilly.com/library/view/head-first-design/9781492077992/)
- [Refactoring Guru Design Patterns](https://refactoring.guru/design-patterns)


## Patterns

### Strategy
Strategy is a behavioral design pattern that lets you define a family of algorithms, put each of them into a separate class, and make their objects interchangeable.\
The Strategy pattern suggests that you take a class that does something specific in a lot of different ways and extract all of these algorithms into separate classes called strategies.\
The original class, called context, must have a field for storing a reference to one of the strategies. The context delegates the work to a linked strategy object instead of executing it on its own.\
The context isn’t responsible for selecting an appropriate algorithm for the job. Instead, the client passes the desired strategy to the context. In fact, the context doesn’t know much about strategies. It works with all strategies through the same generic interface, which only exposes a single method for triggering the algorithm encapsulated within the selected strategy.\
This way the context becomes independent of concrete strategies, so you can add new algorithms or modify existing ones without changing the code of the context or other strategies.

#### Structure


<em>General</em>

<img width="936" alt="image" src="https://user-images.githubusercontent.com/73034324/165866264-1345bd0f-3503-4eec-ba45-5b9eea6c91c4.png">

<em>Project</em>

<img width="963" alt="image" src="https://user-images.githubusercontent.com/73034324/165866296-ae3b47d6-47ef-4ff9-9979-855d3de83023.png">


### Observer
Observer is a behavioral design pattern that lets you define a subscription mechanism to notify multiple objects about any events that happen to the object they’re observing.\
The Observer pattern suggests that you add a subscription mechanism to the publisher class so individual objects can subscribe to or unsubscribe from a stream of events coming from that publisher. In reality, this mechanism consists of 1) an array field for storing a list of references to subscriber objects and 2) several public methods which allow adding subscribers to and removing them from that list.\
Now, whenever an important event happens to the publisher, it goes over its subscribers and calls the specific notification method on their objects.\
Real apps might have dozens of different subscriber classes that are interested in tracking events of the same publisher class. You wouldn’t want to couple the publisher to all of those classes. Besides, you might not even know about some of them beforehand if your publisher class is supposed to be used by other people.\
That’s why it’s crucial that all subscribers implement the same interface and that the publisher communicates with them only via that interface. This interface should declare the notification method along with a set of parameters that the publisher can use to pass some contextual data along with the notification.\

![image](https://user-images.githubusercontent.com/73034324/166114569-ec8f8d74-aa42-4598-a72e-3fd43caaae0d.png)


<em>General</em>

<img width="1009" alt="image" src="https://user-images.githubusercontent.com/73034324/166114582-062bfee7-4c40-4415-bf3f-c2942653e03a.png">


<em>Project</em>

<img width="728" alt="image" src="https://user-images.githubusercontent.com/73034324/166114587-07f0cfcc-44d7-4466-bd38-27c63e3e7d9d.png">

