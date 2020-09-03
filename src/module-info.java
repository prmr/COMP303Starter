module demo
{
	exports comp303.corp;
	exports comp303.music;
	exports comp303.demo;

	requires javafx.base;
	requires transitive javafx.controls;
	requires transitive javafx.graphics;
	requires static junit;
}