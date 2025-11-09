Comprehensive .gitignore for Spring Boot / Java

-----------------------------------------------

IDE and Build Artifacts

IntelliJ IDEA specific files

.idea/
*.iws
*.iml
*.ipr

Eclipse specific files

.metadata
.project
.classpath
.settings/
*.log
*.bak

VS Code specific files

.vscode/

Maven generated directories and files

/target/

Gradle generated directories and files

.gradle/
/build/

Compiled class files

*.class
/bin/

Operating System Files

.DS_Store
Thumbs.db

Packaging and Artifacts

Logs, temporary files, and output

*.log
log/
temp/
/tmp/

Jar, War, Ear files

*.jar
*.war
*.ear

Spring Boot Specific

Embedded H2 Database files (H2 is often configured to store data in files)

If your H2 database is file-based, these must be ignored!

Check your application.properties for the database file name.

*.mv.db
*.trace.db

Other common configuration files (uncomment if you store secrets here)

application-dev.properties

application-prod.properties

Generated documentation

/doc/
/docs/
