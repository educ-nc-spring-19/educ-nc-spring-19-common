# Library of common objects

### Installation
1. Clone this repository
2. Move to the repository root folder (which contains `pom.xml`)
3. Run following `maven` command to build and install this lib in `.m2` folder:
   ```
   mvn install
   ```

### Importing dependency (after installation)
- Add following to your `pom.xml`
   ```
   <dependency>
       <groupId>com.educ-nc-spring-19</groupId>
       <artifactId>educ-nc-spring-19-common</artifactId>
       <version>0.1.1-SNAPSHOT</version>
   </dependency>
   ```