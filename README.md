
# Head First Patterns
This repository contains an implementation of examples from the book "Head First Design Patterns" 2nd edition by Eric Freeman and Elizabeth Robson.


## Languages

<img src="https://www.svgrepo.com/show/303617/kotlin-1-logo.svg" alt="Kotlin" width=32>
<img src="https://www.svgrepo.com/show/184143/java.svg" alt="Java" width=38>
 
## Maven Dependencies

[Kotlin](https://www.jetbrains.com/opensource/kotlin/)\
[Lombok](https://projectlombok.org/)\
[Flogger](https://google.github.io/flogger/)\
[JetBrains Annotations](https://www.jetbrains.com/help/idea/annotating-source-code.html#bundled-annotations)



## Links

- [Head First Design Patterns](https://www.oreilly.com/library/view/head-first-design/9781492077992/)


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



