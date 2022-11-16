package com.pak.HelloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

}
//url:-https://medium.com/javarevisited/how-to-increment-versions-for-the-maven-build-java-project-a7596cc501c2
//0.0.0 first time.
//mvn versions:set -DnewVersion=0.0.1 //now 0.0.1

//mvn validate -DbumpPatch //now 0.0.2
//mvn validate -DbumpMinor //now 0.1.0
//mvn validate -DbumpMajor //now 1.0.0