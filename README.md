# 001_JMaven_

## <p align=center>[Configuration][MavenCfg] | [New project][NewMvnPro] | [Compiling and Testing][ConmpTest]  <br/> [POM][MvnPOM] | [Life Cycle][LifeCycl] | [Build Profiles][BldProf] </p>

<!--
* [Configuration][MavenCfg]
* [New project][NewMvnPro]
* [Compiling and Testing][ConmpTest]
* [Project Object Model][MvnPOM] *(POM)*
* [Life Cycle][LifeCycl]
* [Build Profiles][BldProf]

-->

[MavenCfg]: res/001_Git_and_GitHub_/Git_And_GitHub.md
[NewMvnPro]: res/002_Windows_/Windows.md
[ConmpTest]: res/003_Linux_(Unix)_/Linux_(Unix).md
[MvnPOM]: res/004_Networks_/Networks.md
[LifeCycl]: res/005_Programming_languages_/Programming.md
[BldProf]: res/006_Databases_/Databases.md

---
<br/>
<!-- ---------------------------------- * Navigation * ---------------------------------- -->

# <p align=center><b>Maven and Grandle</b></p>

Apache Maven is a software project management and comprehension tool. Based on the concept of a project object model (POM), Maven can manage a project's build, reporting and documentation from a central piece of information.

## Download and Install
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

### For Enterprise course:
```bash
set JAVA_HOME=D:\java\OpenJDK_v.11\openjdk-11.0.1.9
```
```bash
set PATH=%PATH%;%JAVA_HOME%\bin
```

> ***NOTE***: Use the `/M` switch to make the setx command once to permanently create the system variable.

5. Add the Maven `\bin` directory to `PATH`

### For Enterprise course:
```bash
set MAVEN_HOME=D:\java\maven_v.3.6.3
```
```bash
set PATH=%PATH%;%MAVEN_HOME%\bin
```

6. Confirm with `mvn -v` in a new shell. The result should look similar to:

```bash
Apache Maven 3.6.3 (cecedd343002696d0abb50b32b541b8a6ba2883f)
Maven home: C:\Users\Yoric\OneDrive\Desctop\001_PROJECTS_\001_Java_Projects_\#_HOMEWORKS_\#_JavaEnterprise_\env\maven_v.3.6.3\bin\..
Java version: 15.0.1, vendor: AdoptOpenJDK, runtime: C:\Program Files\AdoptOpenJDK\jdk-15.0.1.9-hotspot
Default locale: en_US, platform encoding: Cp1252
OS name: "windows 10", version: "10.0", arch: "amd64", family: "windows"
```

---
### Just for me (CMD):
```bash
set JDK_VERSION=openJDK_v.11
set MAVEN_VERSION=maven_v.3.6.3
set JAVA_HOME=%USERPROFILE%\OneDrive\Desctop\001_PROJECTS_\001_Java_Projects_\env\%JDK_VERSION%
set MAVEN_HOME=%USERPROFILE%\OneDrive\Desctop\001_PROJECTS_\001_Java_Projects_\env\%MAVEN_VERSION%
set PATH=%PATH%;%JAVA_HOME%\bin
set PATH=%PATH%;%MAVEN_HOME%\bin
java -version
mvn --version
```

### Just for me (PWSH):
```bash
$env:JDK_VERSION="openJDK_v.11"
$env:MAVEN_VERSION="maven_v.3.6.3"
$env:JAVA_HOME="$env:USERPROFILE\OneDrive\Desctop\001_PROJECTS_\001_Java_Projects_\env\$env:JDK_VERSION"
$env:MAVEN_HOME="$env:USERPROFILE\OneDrive\Desctop\001_PROJECTS_\001_Java_Projects_\env\$env:MAVEN_VERSION"
$env:PATH="$env:PATH;$env:JAVA_HOME\bin"
$env:PATH="$env:PATH;$env:MAVEN_HOME\bin"
java -version
mvn --version
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
