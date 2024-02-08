# Comm-Parent [multi module spring boot project]

	 There are 2 way to create :
	 -------------------------
	 1) with spring boot parent tag in parent pom .
	 2) without spring boot parent tag in parent pom.
	 
	 1) lets do poc on first 1.

	  in eclipse:
	  
	  step1)--create parent project 
	  0) create spring boot project.
	  1) remove java files with packages [*Application.java *Test,*.properties files ]
	  2) add packaging type pom.
	  3) remove dependency & build tags.
	  4) 
	  
	  step2)--create module project [library one]
	   0) select parent project & create maven module
	   1) select create simple project checkbox .
	   
	   
	   step3)--create module project [server one]
	   0) perform step 2 first.
	   1) goto https://start.spring.io/
	   2) create project with sample artifacts & groupid.
	   3) select needed dependencies.
	   4) click on EXPLORE button & copy pom 
	   5) paste into notepad++ and replace Spring boot paraent tag with your parent .
	   6) replace module pom with this pom content.
	   7) from https://start.spring.io/ copy java file and past into project
	   8) create application.properties inside resource folder.
	   
	   
	   thats it...thanks.
	   
	   
	   
	   
	   
	   
	  