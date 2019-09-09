# COMP303 Starter Project

Starter project configuration for the course [COMP 303 Software Development](https://github.com/prmr/COMP303)  at McGill University

This repository is configured to be seamlessly imported into the latest version of the [Eclipse IDE](https://www.eclipse.org/). However, if you know what you are doing, you can import the project into the IDE of your choice. The code are instructions are for Java 8.

To set yourself up:

1. Make sure you have [Eclipse for Java](https://www.eclipse.org/) (or your favorite Java IDE) and [Java 8](https://www.oracle.com/java/technologies/jre8-downloads.html).
2. Install the Checkstyle Eclipse Plug-in. In Eclipse, select `Help | Eclipse Marketplace...` and enter `Checkstyle` in the `Find:` box. From the results, install `Checkstyle Plug-In...`.
3. Clone this GitHub repository into your Eclipse workspace. In the Eclipse package explorer, right-click and select `Import... | Git -> Projects from Git | Clone URI` and under URI enter `https://github.com/prmr/COMP303Starter`, then click-through, requesting to import existing Eclipse projects. Once imported, the project should compile without errors.
4. While you're at it, clone the [JetUML](https://github.com/prmr/JetUML) project into your Eclipse workspace. For convenience, you can also download the [executable file](https://github.com/prmr/JetUML/blob/master/docs/install.md) and place it somewhere convenient.
5. Similarly, clone the [Minesweeper](https://github.com/prmr/Minesweeper) and [Solitaire](https://github.com/prmr/Solitaire) projects into your Eclipse workspace.

To ensure that everything works and start experimenting:

1. In package `demo`, right-click on the file `Welcome.java` and select `Run As... | Java Application`. You should see a small GUI application appear. Try the different buttons which should do the obvious thing.
2. Right-click on the file `TestAlternatingLabelProvider.java` and select `Run As... | JUnit Test`. A green bar should appear.
3. Right-click again on the file `TestAlternatingLabelProvider.java` and select `Coverage As... | JUnit Test`. A green bar should appear, along with a view showing coverage information. If you go back to the source code file, most lines should be highlighted in green. The meaning of this will be explained later in the term.
4. Access the "Problems" view in Eclipse. You should see two warnings of the type "Checkstyle Problem".

Once everything works as described above, try the following:

1. Fix the code to make the Checkstyle warnings go away. To see the full list of coding rules checked by the tool, right-click on the project and select `Properties | Checkstyle | Configure` and play around with the viewer.
2. Change line 37 of file `AlternatingLabelProvider.java` to return `aLabel1` instead of `aLabel2`, and re-run the test. The test should fail.
3. Learn some [seriously useful shortcuts](http://www.vogella.com/tutorials/EclipseShortcuts/article.html). My personal favorites are: `CTRL-1`, `CTRL-SHIFT-R`, `CTRL-SPACE`, `CTRL-O`, `ALT-SHIFT-R`.

---

<a rel="license" href="http://creativecommons.org/licenses/by-nc-nd/4.0/"><img alt="Creative Commons License" style="border-width:0" src="https://i.creativecommons.org/l/by-nc-nd/4.0/88x31.png" /></a>

Unless otherwise noted, the content of this repository is licensed under a <a rel="license" href="http://creativecommons.org/licenses/by-nc-nd/4.0/">Creative Commons Attribution-NonCommercial-NoDerivatives 4.0 International License</a>. 

Copyright Martin P. Robillard 2017
