## Setting up starter code on Intellij:

1. Go to File > New > Project from version control
2. You will notice that no program files are actually in your `Project` library. 
3. Go to File > Project Structure
4. Find `Modules` in the left panel
5. Click on `COMP 303` > Select `comp303` > Right-click and check `Sources`

6. You should now see `src` directory now. But if you try running `Welcome` by right-clicking and selecting "Run Welcome", it might show you an error like this:

```java
/home/ojas/IdeaProjects/COMP303Starter/src/module-info.java:7:20
java: module not found: javafx.base
```

Here's how to fix it:

7. Go back to File > Project Structure
8. Go to `Project` and in SDK choose `liberica-full-23`
9. Then go to `Libraries` in Project Structure
10. Click on the little "+" icon and select Maven
11. In the textbox type in javafx and scroll down to find `org.openjfx:javafx-base:22-ea+16`
12. Install this and do the same for `openjfx.javafx.controls12` and `junit:junit:4.13.2`
13. That's it! It should work now.  
