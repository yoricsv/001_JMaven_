## [001_JMaven_][JMaven] > **Compiling and Testing**

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
Apache Maven is a software project management and comprehension tool. Based on the concept of a project object model (POM), Maven can manage a project's build, reporting and documentation from a central piece of information.


---
### Just for me Configuration (CMD):
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

#### *Tomcat shutdown following command:* 
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

#### *Tomcat shutdown following command:* 
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