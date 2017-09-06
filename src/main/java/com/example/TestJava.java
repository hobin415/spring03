package com.example;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class TestJava {
	
	static Log log = LogFactory.getLog(TestJava.class);
	
	public static void main(String[] args) {
		log.info("#############################");
		log.info("TestJava Commons Logging ....");
		log.info("#############################");
	}
}
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
<modelVersion>4.0.0</modelVersion>
<groupId>com.example</groupId>
<artifactId>spring03</artifactId>
<version>0.0.1-SNAPSHOT</version>
<build>
	<plugins>
		<plugin>
			<groupId>org.apache.maven.plugins</groupId>
			<artifactId>maven-compiler-plugin</artifactId>
			<version>3.6.1</version>
			<configuration>
				<source>1.8</source>
				<target>1.8</target>
			</configuration>		
		</plugin>
		<plugin>
			<groupId>net.alchim31.maven</groupId>
			<artifactId>scala-maven-plugin</artifactId>
			<version>3.2.2</version>
			<executions>
				<execution>
					<id>scala-compile</id>
					<phase>process-resources</phase>
					<goals>
						<goal>add-source</goal>
						<goal>compile</goal>
					</goals>
				</execution>
				<execution>
					<id>scala-test-compile</id>
					<phase>process-test-resources</phase>
					<goals>
						<goal>testCompile</goal>
					</goals>
				</execution>
			</executions>
		</plugin>
	</plugins>
</build>
<dependencies>
	<dependency>
		<groupId>org.scala-lang</groupId>
		<artifactId>scala-library</artifactId>
		<version>2.11.8</version>
	</dependency>
	<dependency>
		<groupId>junit</groupId>
		<artifactId>junit</artifactId>
		<version>3.8.2</version>
	</dependency>
	<dependency>
		<groupId>log4j</groupId>
		<artifactId>log4j</artifactId>
		<version>1.2.17</version>
	</dependency>
	<dependency>
		<groupId>commons-logging</groupId>
		<artifactId>commons-logging</artifactId>
		<version>1.2</version>
	</dependency>
</dependencies>
</project>