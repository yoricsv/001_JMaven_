## [001_JMaven_][JMaven] > **New project**

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

--- 
<br/>
<!-- ---------------------------------- * Navigation * ---------------------------------- -->

# <p align=center><b>Maven</b></p>




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
Maven home: C:\Users\Yoric\OneDrive\Desctop\001_PROJECTS_\001_Java_Projects_\env\maven_v.3.6.3\bin\..
Java version: 15.0.1, vendor: AdoptOpenJDK, runtime: C:\Program Files\AdoptOpenJDK\jdk-15.0.1.9-hotspot
Default locale: en_US, platform encoding: Cp1252
OS name: "windows 10", version: "10.0", arch: "amd64", family: "windows"
```

---
### Just for me (CMD):
```bash
set JDK_VERSION=OpenJDK_v.11
set MAVEN_VERSION=Maven_v.3.6.3
set TOMCAT_VERSION=Tomcat_v.10.0.11
set JAVA_HOME=%USERPROFILE%\OneDrive\Desctop\001_PROJECTS_\001_Java_Projects_\env\%JDK_VERSION%
set M2_HOME=%USERPROFILE%\OneDrive\Desctop\001_PROJECTS_\001_Java_Projects_\env\%MAVEN_VERSION%
set CATALINA_HOME=%USERPROFILE%\OneDrive\Desctop\001_PROJECTS_\001_Java_Projects_\env\%TOMCAT_VERSION%
set PATH=%PATH%;%JAVA_HOME%\bin
set PATH=%PATH%;%M2_HOME%\bin
set PATH=%PATH%;%CATALINA_HOME%
java -version
mvn -v
"%CATALINA_HOME%\bin\catalina.bat" start
```

### Tomcat shutdown following command: 
```bash
"%CATALINA_HOME%\bin\catalina.bat" stop
```

### Just for me (PWSH):
```bash
$env:JDK_VERSION="OpenJDK_v.11"
$env:MAVEN_VERSION="Maven_v.3.6.3"
$env:TOMCAT_VERSION="Tomcat_v.10.0.11"
$env:JAVA_HOME="$env:USERPROFILE\OneDrive\Desctop\001_PROJECTS_\001_Java_Projects_\env\$env:JDK_VERSION"
$env:M2_HOME="$env:USERPROFILE\OneDrive\Desctop\001_PROJECTS_\001_Java_Projects_\env\$env:MAVEN_VERSION"
$env:CATALINA_HOME="$env:USERPROFILE\OneDrive\Desctop\001_PROJECTS_\001_Java_Projects_\env\$env:TOMCAT_VERSION"
$env:PATH="$env:PATH;$env:JAVA_HOME\bin"
$env:PATH="$env:PATH;$env:M2_HOME\bin"
$env:PATH="$env:PATH;$env:CATALINA_HOME"
java -version
mvn --version
& $env:CATALINA_HOME\bin\catalina.bat start
```

### Tomcat shutdown following command: 
```bash
& $env:CATALINA_HOME\bin\catalina.bat stop
```

### Just for me (*nix):
```bash
export JDK_VERSION="OpenJDK_v.11"
export MAVEN_VERSION="Maven_v.3.6.3"
export TOMCAT_VERSION="Tomcat_v.10.0.11"
export JAVA_HOME="$HOME/Desctop/001_PROJECTS_/001_Java_Projects_/env/$JDK_VERSION"
export M2_HOME="$HOME/Desctop/001_PROJECTS_/001_Java_Projects_/env/$MAVEN_VERSION"
export CATALINA_HOME="$HOME/Desctop/001_PROJECTS_/001_Java_Projects_/env/$TOMCAT_VERSION"
export PATH=$PATH:$JAVA_HOME/bin
export PATH=$PATH:$M2_HOME/bin
export PATH=$PATH:$CATALINA_HOME
java -version
mvn --version
$CATALINA_HOME/bin/startup.sh start
```

### Tomcat shutdown following command: 
```bash
$CATALINA_HOME/bin/catalina.sh stop
```


---
<br/>


<!--
* [Download JDK][loadJDK]
* [Download Maven][loadMvn]
-->

[loadJDK]: https://www.oracle.com/javadownload
[loadMvn]: https://maven.apache.org/download.cgi




## CONTENTS:<!--Done!-->
* [Maven Configuration][MavenCfg]
* [Create a new project][NewMvnPro]
* [Compiling and Testing][ConmpTest]
* [Project Object Model][MvnPOM] *(POM)*
* [Life Cycle][LifeCycl]
* [Build Profiles][BldProf]
* [Docker & Kubernetes][7]
* [Embedded systems][8]


### Cheat-Sheets:
* [MarkDown][9]
* [Git Commands][10]
* [Command Prompt (cmd) Commands][11]
* [PowerShell Comandlets][12]


<!--
* [MarkDown][9]
* [Git Commands][10]
-->

[9]: res/001_Git_and_GitHub_/res/001_Markdown_README_/read/MarkDown.md
[10]: res/001_Git_and_GitHub_/res/002_Git_Commands_/read/Git_Commands.md
[11]: res/002_Windows_/res/32_Cmd_PROMPT_/read/CommandPrompt_commands.md
[12]: res/002_Windows_/res/32_Cmdlet_POWERSHELL_/read/PowerShell.md

---
<br/>