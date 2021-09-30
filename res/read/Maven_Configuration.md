## [001_JMaven_][JMaven] > **Maven Download and Configuration**

## <p align=center>[Configuration][MavenCfg] | [New project][NewMvnPro] | [Compiling and Testing][ConmpTest]  <br/> [POM][MvnPOM] | [Life Cycle][LifeCycl] | [Build Profiles][BldProf] </p>

<!--
* [001_JMaven_][JMaven]
* [Configuration][MavenCfg]
* [New project][NewMvnPro]
* [Compiling and Testing][ConmpTest]
* [Project Object Model][MvnPOM] *(POM)*
* [Life Cycle][LifeCycl]
* [Build Profiles][BldProf]
-->

[JMaven]: ../../README.md
[MavenCfg]: Maven_Configuration.md
[NewMvnPro]: Maven_NewProject.md
[ConmpTest]: Maven_CompilationAndTesting.md
[MvnPOM]: Maven_POM.md
[LifeCycl]: Maven_Lifecycle.md
[BldProf]: Maven_BuildProfile.md

<!-- ---------------------------------- * Navigation * ---------------------------------- -->

# <p align=center><b>Installing and Configuring</b></p>

## CONTENTS:
* Download and Installing
* Configuration
  * [pom.xml][1]
  * [settings.xml][2]
  * **Maven CLI Commands**:
    * command structure
    * Simple stuff
    * ARTIFACTS
    * RELEASING
    * TOMCAT PLUGIN

---
<br/>

## Download and Installing
1. **Before** installing Apache-Maven, you need to download and install the JDK from the official Oracle website *(Use the following [Java SE Download][loadJDK] link)*.
2. Click the [Download Mavan][loadMvn] link to go to the official Apache website and get the latest version. 
3. Extract distribution archives in any directories *(use your preferred archive extraction tool)*.
4. Add the `bin` directory of the created directory `apache-maven-3.6.x` to the `PATH` environment variable

### **TIP:** For **Unix-based OS** (Mac or Linux)
1. Run the Terminal `[Ctrl]+[alt]+[T]` 
2. Check environment variable value:

```bash
echo $JAVA_HOME
```

3. If the response isn't something like this `/Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home` 
4. Add the JDK `Home` directory to `PATH` and repeat the step 2. In other, go to step 5.

```bash
export PATH=/Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home:$PATH
```

5. Add the Maven `bin` directory to `PATH`

```bash
export PATH=/opt/apache-maven-3.8.2/bin:$PATH
```
6. Confirm with `mvn -v` in a new shell. The result should look similar to:

```bash
$ Apache Maven 3.8.2 (ea98e05a04480131370aa0c110b8c54cf726c06f)
$ Maven home: /opt/apache-maven-3.8.2
$ Java version: 1.8.0_45, vendor: Oracle Corporation
$ Java home: /Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/jre
$ Default locale: en_US, platform encoding: UTF-8
$ OS name: "mac os x", version: "10.8.5", arch: "x86_64", family: "mac"
```

### **TIP:** For **Windows OS**
1. Run the CommandPrompt `[Win]+[R]` -> Type: *`cmd`* -> `[Shift]+[Ctrl]+[Enter]` (to get admin rights)
2. Check environment variable value e.g.

```bash
echo %JAVA_HOME%
```
3. If the response isn't something like this `D:\java\openjdk-11.0.x.x` 

4. Add the path to JDK `\bin` folder to `PATH` and repeat the step 2. In other, go to step 5.

### For Enterprise course (CMD):
```bash
set JAVA_HOME=D:\java\OpenJDK_v.11\openjdk-11.0.1.9
set PATH=%PATH%;%JAVA_HOME%\bin
java -version
```

### For Enterprise course (PWSH):
```bash
$env:JAVA_HOME="D:\java\OpenJDK_v.11\openjdk-11.0.1.9"
$env:PATH="$env:PATH;$env:JAVA_HOME\bin"
java -version
```

> ***NOTE***: Use the `/M` switch to make the setx command once to permanently create the system variable.

5. Add the Maven `\bin` directory to `PATH`

### For Enterprise course (CMD):
```bash
set MAVEN_HOME=D:\java\maven_v.3.6.3
set PATH=%PATH%;%MAVEN_HOME%\bin
```

### For Enterprise course (PWSH):
```bash
$env:MAVEN_HOME="D:\java\maven_v.3.6.3"
$env:PATH="$env:PATH;$env:MAVEN_HOME\bin"
mvn -v
```

6. Confirm with `mvn -v` in a new shell. The result should look similar to:

```bash
Apache Maven 3.6.3 (cecedd343002696d0abb50b32b541b8a6ba2883f)
Maven home: C:\Users\Yoric\OneDrive\Desctop\001_PROJECTS_\001_Java_Projects_\env\Maven_v.3.6.3\bin\..
Java version: 11, vendor: Oracle Corporation, runtime: C:\Users\Yoric\OneDrive\Desctop\001_PROJECTS_\001_Java_Projects_\env\OpenJDK_v.11
Default locale: en_US, platform encoding: Cp1251
OS name: "windows 10", version: "10.0", arch: "amd64", family: "windows"
```

---
<br/>

# <p align=center><b>Configuration</b></p>

## Maven CLI Commands

### General command structure
```bash
mvn -P<profile> <command> <scope>
```

### Simple stuff
```bash
mvn help
mvn compile
mvn validate
mvn verify
mvn test
mvn clean 
mvn clean package
mvn clean install
mvn clean deploy
```

### ARTIFACTS
```bash
mvn archetype:create                                # Create pom.xml

mvn archetype:create                                # Create JAR
    -DgroupId=<group> \
    -DartifactId=<new id>

mvn archetype:create                                # Create WAR
    -DgroupId=<group>     \
    -DartifactId=<new id> \
    -DarchetypeArtifactId=maven-archetype-webapp

mvn install:install-file <params>                   # Install dependencies
```

### RELEASING
```bash
mvn deploy:deploy-file <params ...>

# Useful release options:
#   -P <profile>
#   -Dusername=<user>
#   -Dpassword=<password>

mvn release:prepare
mvn release:clean
mvn release:perform
```

### TOMCAT PLUGIN
```bash
mvn tomcat:deploy
mvn tomcat:redeploy
mvn tomcat:undeploy
mvn tomcat:stop
mvn tomcat:start
```

<!--
* [Download JDK][loadJDK]
* [Download Maven][loadMvn]
* [pom.xml][1]
* [settings.xml][2]
-->

[loadJDK]: https://www.oracle.com/javadownload
[loadMvn]: https://maven.apache.org/download.cgi
[1]: https://maven.apache.org/pom.html
[2]: https://maven.apache.org/settings.html

---
<br/>