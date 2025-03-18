# cloche-example
## A functional example of a basic multiplatform cloche project

To add mixins or access wideners, simply put them anywhere in the project(not in resources), and add them as follows:
```kotlin
accessWideners.from(file("name.accessWidener"))
mixins.from(file("name.mixins.json"))
```

in the neoforge or fabric block, or add a `common` block if needed in both
