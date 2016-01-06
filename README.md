# COMP303Starter
Starter project configuration for my COMP 303 Software Development course at McGill University

For this project to be correctly imported in Eclipse, you need the following configuration:

* [Eclipse Mars.1](https://www.eclipse.org/downloads/index.php) extended with [checkstyle](http://marketplace.eclipse.org/content/checkstyle-plug) and [EclEmma](http://marketplace.eclipse.org/content/eclemma-java-code-coverage);
* A properly installed Java 7 execution environment;

To complete the setup, you need to point Eclipse to the JavaFX library. Do this:
1. Right click on the project in the Package Explorer and select `Properties | Java Build Path` then click on the `Libraries` tab.
2. Select `Add External JARs...` and find the file `jfxrt.jar`, which should be under the following subdirectory of your local Java installation directory: `...Java/jdk1.7.0.xxx/jre/lib`. Click `Apply`, then `OK`

Note that if you plan to publicly post your code somewhere (such as GitHub), it's a good idea to attach a license and copyright notice to it. See the `LICENSE` file for an example.

This project configuration will automatically use the recommended code formatting guidelines for the course automatically when you use Eclipe's various code generation features. It will also automatically check your code for violations to style rules.