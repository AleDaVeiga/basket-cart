# Shopping cart com VRaptor 4 e AngularJS

## Necessário

Deve estar instalado [Java](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html), [Maven](https://maven.apache.org/download.cgi), [Tomcat 7](https://tomcat.apache.org/download-80.cgi), [Node JS](https://nodejs.org/en/download/) e [Git](https://git-scm.com/download/win).

## Compilar

Abra o prompt de comando na pasta raiz do projeto e execute:

```
mvn clean package
```

## Iniciar

Após compilar seu projeto você pode rodá-lo com um tomcat7 ou +:

```
mvn tomcat7:run
```

Cuidado para jamais executar mvn tomcat:run pois ele usará um tomcat6 (incompatível).
