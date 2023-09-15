Maven Java Project

mvn clean -> clear "target" folder
mvn compile -> compile java classes to .class (byte code) in target
mvn test (include compile, run all test cases)
mvn package -> (include compile + test), generate jar in target folder
mvn install -> (include compile + test + package), copy jar to .m2 folder (local repository)

Maven Spring Boot Project:
mvn spring-boot:run -> start up app server(Web + App)

Step1: @SpringbootApplication (this file shoulde be located at root directory)

Step2: @ComponentScan -> Find Java class that annotated by @Component (@controller, @service, @Repository, @Configuration).
for example, Acontoller.class, Bservice,class

Step3: new objects of Acontroller.class & Bservice.class, put them into the SpringContext

Step3.1: Acontroller.class depends on Bservice.class (Because you @ Autowire B Service.class)
Step3.2: So, it will new Bservice. class first.
Step3.3: It will find the object of Bservice from SpringContext in order to create the new object of Acontroller
(inject BService object)

bean: it's an object (全局唯一)
context 入面既object
如果有2個autowired會有2個object, 佢唔會知道裝砍邊個 會出error




