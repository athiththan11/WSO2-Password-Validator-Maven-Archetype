# WSO2 Password Validators Maven Archetype <!-- omit on toc -->

Maven Archetype for WSO2 Password Validators. Use the following maven archetype to generate maven projects to implement WSO2 related custom password validators for WSO2 Identity Servers.

```xml
<dependency>
    <groupId>com.athiththan.wso2</groupId>
    <artifactId>wso2-password-validators</artifactId>
    <version>1.0.0</version>
</dependency>
```

## Usage

```shell
mvn archetype:generate  -DarchetypeGroupId=com.athiththan.wso2          \
                        -DarchetypeArtifactId=wso2-password-validators  \
                        -DarchetypeVersion=1.0.0                        \
                        -DgroupId=<Group ID>                            \
                        -DartifactId=<Artifact ID>
```
