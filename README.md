Address formatter is a java based automation for formatting differnt addressess input to the desired output in json. 

### Tech stack used in building the framework 
#### Programming language used: java 1.8
#### Unit Test framework : TestNG version 6.14.3

##### Build tool: Maven
#### IDE : Eclipse Version: 2019-03 (4.11.0)

### Prerequisite 1
#### java should be installed on the system.To check if java is available on the system, go to command prompt and type java -version.It should display: 
    
"java version "1.8.0_201"
Java(TM) SE Runtime Environment (build 1.8.0_201-b09)
Java HotSpot(TM) 64-Bit Server VM (build 25.201-b09, mixed mode)".



### Installation
1. unzip the project folder and open in eclipse 
    (File-->Open Projects from File System ). Select the directory where 
    the project folder is available.



#### Project Design Strategy
1. All the dependency required for project execution are available under pom.xml.


#### For executing the tests, expand addressFormatter\src\test\java\addressFormatterTest and right click pom.xml and select Run As --> Maven test(ensure once project is downloaded, the needed dependencies be downloaded by maven. This may take some and the status can be viewed in bottom right corner "Building Workspace")

#### Individual results for the test can also be view by right click test.xml and selecting Run As --> TestNG

#### Configurations in pom.xml

Do mention the path of java compiler which is on your local system, into the following path  build --> plugins--> configurations--> executable tab 
 ```<build>
		<plugins>
			<plugin>
				<artifactId>maven-compiler-plugin</artifactId>
				<version>3.1</version>
				<configuration>
					<source>1.8</source>
					<target>1.8</target>
					<fork>true</fork>
					<executable>C:\Program Files\Java\jdk1.8.0_201\bin\javac</executable>
				</configuration>
			</plugin>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-surefire-plugin</artifactId>
				<version>3.0.0-M3</version>
				<configuration>
					<suiteXmlFiles>
						<suiteXmlFile>testng.xml</suiteXmlFile>
					</suiteXmlFiles>
				</configuration>
			</plugin>
		</plugins>
	</build>````

