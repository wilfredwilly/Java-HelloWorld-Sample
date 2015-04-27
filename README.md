##Sample Java Hello World Web App
This is a sample Java Hello World web app written to illustrate how to deploy an app to the Covisint PaaS. 

All that this app does is outputs `Hello World!!!` for any URL. The app uses Spring MVC, servlet 3.1. The build tool is Gradle.

###Compiling and packaging

```
./gradlew war
```

This will generate a war in `./build/libs` folder.