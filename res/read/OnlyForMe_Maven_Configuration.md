# [001_JMaven_][JMaven] > **Maven Configuration** *(Only for me)*

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

# <p align=center><b>Maven Configuration</b> <i>(Only for me)</i></p>

## Via Command Prompt (CMD):

### To see all system Enviroment Variables (CMD):

> NOTE: to get full list have to `set` for special variable use `echo %_env_name_%`
```bash
set
```

or

```bash
echo %PATH%
```

```bash
set JDK_VERSION=OpenJDK_v.11
set MAVEN_VERSION=Maven_v.3.6.3
set TOMCAT_VERSION=Tomcat_v.10.0.11
set JAVA_HOME=%OneDrive%\Desktop\001_PROJECTS_\001_Java_Projects_\env\%JDK_VERSION%
set M2_HOME=%OneDrive%\Desktop\001_PROJECTS_\001_Java_Projects_\env\%MAVEN_VERSION%
set CATALINA_HOME=%OneDrive%\Desktop\001_PROJECTS_\001_Java_Projects_\env\%TOMCAT_VERSION%
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

## Via PowerShell (PWSH):

### To see all system Enviroment Variables (PWSH):

> NOTE: `dir` and `gci` are both *aliases* for `Get-ChildItem`
```bash
dir env:
```

```bash
$env:JDK_VERSION="OpenJDK_v.11"
$env:MAVEN_VERSION="Maven_v.3.6.3"
$env:TOMCAT_VERSION="Tomcat_v.9.0.53"
$env:JAVA_HOME="$env:OneDrive\Desktop\001_PROJECTS_\001_Java_Projects_\env\$env:JDK_VERSION"
$env:M2_HOME="$env:OneDrive\Desktop\001_PROJECTS_\001_Java_Projects_\env\$env:MAVEN_VERSION"
$env:CATALINA_HOME="$env:OneDrive\Desktop\001_PROJECTS_\001_Java_Projects_\env\$env:TOMCAT_VERSION"
$env:PATH="$env:PATH;$env:JAVA_HOME\bin"
$env:PATH="$env:PATH;$env:M2_HOME\bin"
$env:PATH="$env:PATH;$env:CATALINA_HOME"
java -version
mvn --version
& $env:CATALINA_HOME\bin\catalina.bat start
```

```bash
$env:JDK_VERSION="OpenJDK_v.11"
$env:MAVEN_VERSION="Maven_v.3.6.3"
$env:TOMCAT_VERSION="Tomcat_v.10.0.11"
$env:JAVA_HOME="$env:OneDrive\Desktop\001_PROJECTS_\001_Java_Projects_\env\$env:JDK_VERSION"
$env:M2_HOME="$env:OneDrive\Desktop\001_PROJECTS_\001_Java_Projects_\env\$env:MAVEN_VERSION"
$env:CATALINA_HOME="$env:OneDrive\Desktop\001_PROJECTS_\001_Java_Projects_\env\$env:TOMCAT_VERSION"
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

## Via Terminal (*nix):

```bash
export JDK_VERSION="OpenJDK_v.11"
export MAVEN_VERSION="Maven_v.3.6.3"
export TOMCAT_VERSION="Tomcat_v.10.0.11"
export JAVA_HOME="$HOME/Desktop/001_PROJECTS_/001_Java_Projects_/env/$JDK_VERSION"
export M2_HOME="$HOME/Desktop/001_PROJECTS_/001_Java_Projects_/env/$MAVEN_VERSION"
export CATALINA_HOME="$HOME/Desktop/001_PROJECTS_/001_Java_Projects_/env/$TOMCAT_VERSION"
export PATH=$PATH:$JAVA_HOME/bin
export PATH=$PATH:$M2_HOME/bin
export PATH=$PATH:$CATALINA_HOME
java -version
mvn --version
$CATALINA_HOME/bin/startup.sh start
```

### *Tomcat shutdown following command:* 

```bash
$CATALINA_HOME/bin/catalina.sh stop
```

---
