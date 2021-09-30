## [001_JMaven_][JMaven] > **Project Object Model** *(POM)*

## <p align=center>[Configuration][MavenCfg] | [New project][NewMvnPro] | [Compiling and Testing][ConmpTest]  <br/> [POM][MvnPOM] | [Lifecycle][LifeCycl] | [Build Profiles][BldProf] </p>

<!--
* [001_JMaven_][JMaven]
* [Configuration][MavenCfg]
* [New project][NewMvnPro]
* [Compiling and Testing][ConmpTest]
* [Project Object Model][MvnPOM] *(POM)*
* [Lifecycle][LifeCycl]
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

# <p align=center><b>Project Object Model</b> <i>(POM)</i></p>

"Project Object Model" is an XML representation of a Maven project held in a file named `pom.xml`. When in the presence of Maven folks, speaking of a project is speaking in the philosophical sense, beyond a mere collection of files containing code. A project contains configuration files, as well as the developers involved and the roles they play, the defect tracking system, the organization and licenses, the URL of where the project lives, the project's dependencies, and all of the other little pieces that come into play to give code life. It is a one-stop-shop for all things concerning the project. In fact, in the Maven world, a project does not need to contain any code at all, merely a `pom.xml`.

```xml
<project xmlns              ="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi          ="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation ="http://maven.apache.org/POM/4.0.0
                              https://maven.apache.org/xsd/maven-4.0.0.xsd">

    <modelVersion>4.0.0</modelVersion>
 
    <!-- The Basics -->
    <groupId>                ... </groupId>         <!-- <groupId>org.codehaus.mojo</groupId> -->
    <artifactId>             ... </artifactId>
    <version>                ... </version>

    <packaging>              ... </packaging>
    <dependencies>           ... </dependencies>
    <parent>                 ... </parent>
    <dependencyManagement>   ... </dependencyManagement>
    <modules>                ... </modules>
    <properties>             ... </properties>
 
    <!-- Build Settings -->
    <build>                  ... </build>
    <reporting>              ... </reporting>
    
    <!-- More Project Information -->
    <name>                   ... </name>
    <description>            ... </description>
    <url>                    ... </url>
    <inceptionYear>          ... </inceptionYear>
    <licenses>               ... </licenses>
    <organization>           ... </organization>
    <developers>             ... </developers>
    <contributors>           ... </contributors>
    
    <!-- Environment Settings -->
    <issueManagement>        ... </issueManagement>
    <ciManagement>           ... </ciManagement>
    <mailingLists>           ... </mailingLists>
    <scm>                    ... </scm>
    <prerequisites>          ... </prerequisites>
    <repositories>           ... </repositories>
    <pluginRepositories>     ... </pluginRepositories>
    <distributionManagement> ... </distributionManagement>
    <profiles>               ... </profiles>

</project>
```
---

<br/>
