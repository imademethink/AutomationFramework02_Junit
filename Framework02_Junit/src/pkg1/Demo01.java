package pkg1;

import org.junit.Test;

public class Demo01 {
    @Test
    public void Demo01Scenario01(){
        System.out.println("Demo01Scenario01");
    }
}



// Using command line
// "C:\Program Files\Java\jdk1.8.0_211\bin\java.exe"  -ea -Didea.test.cyclic.buffer.size=2097152 "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2019.1.1\lib\idea_rt.jar=51035:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2019.1.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2019.1.1\lib\idea_rt.jar;C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2019.1.1\plugins\junit\lib\junit-rt.jar;C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2019.1.1\plugins\junit\lib\junit5-rt.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\rt.jar;D:\TonyStark\Framework02_Junit\out\production\Framework02_Junit;D:\TonyStark\Framework02_Junit\external_jar\asm-1.0.2.jar;D:\TonyStark\Framework02_Junit\external_jar\dom4j-1.6.1.jar;D:\TonyStark\Framework02_Junit\external_jar\ini4j-0.5.4.jar;D:\TonyStark\Framework02_Junit\external_jar\jaxen-1.1.1.jar;D:\TonyStark\Framework02_Junit\external_jar\xmlunit-1.6.jar;D:\TonyStark\Framework02_Junit\external_jar\snakeyaml-1.5.jar;D:\TonyStark\Framework02_Junit\external_jar\json-smart-2.3.jar;D:\TonyStark\Framework02_Junit\external_jar\itextpdf-5.5.13.jar;D:\TonyStark\Framework02_Junit\external_jar\json-path-2.4.0.jar;D:\TonyStark\Framework02_Junit\external_jar\hamcrest-core-1.3.jar;D:\TonyStark\Framework02_Junit\external_jar\json-simple-1.1.1.jar;D:\TonyStark\Framework02_Junit\external_jar\zjsonpatch-0.4.10.jar;D:\TonyStark\Framework02_Junit\external_jar\sqlite-jdbc-3.31.1.jar;D:\TonyStark\Framework02_Junit\external_jar\jackson-core-2.10.1.jar;D:\TonyStark\Framework02_Junit\external_jar\jackson-core-2.11.0.jar;D:\TonyStark\Framework02_Junit\external_jar\slf4j-api-1.8.0-beta2.jar;D:\TonyStark\Framework02_Junit\external_jar\jackson-databind-2.11.0.jar;D:\TonyStark\Framework02_Junit\external_jar\commons-collections4-4.4.jar;D:\TonyStark\Framework02_Junit\external_jar\jackson-annotations-2.11.0.jar;D:\TonyStark\Framework02_Junit\external_jar\junit\junit-4.13.jar;D:\TonyStark\Framework02_Junit\external_jar\junit\junit-starter-core-5.0.2.jar;D:\TonyStark\Framework02_Junit\external_jar\selenium\selenium-server-standalone-3.141.59.jar;D:\TonyStark\Framework02_Junit\external_jar\poi-4.1.0\poi-4.1.0.jar;D:\TonyStark\Framework02_Junit\external_jar\poi-4.1.0\poi-ooxml-4.1.0.jar;D:\TonyStark\Framework02_Junit\external_jar\poi-4.1.0\poi-examples-4.1.0.jar;D:\TonyStark\Framework02_Junit\external_jar\poi-4.1.0\poi-excelant-4.1.0.jar;D:\TonyStark\Framework02_Junit\external_jar\poi-4.1.0\poi-scratchpad-4.1.0.jar;D:\TonyStark\Framework02_Junit\external_jar\poi-4.1.0\poi-ooxml-schemas-4.1.0.jar;D:\TonyStark\Framework02_Junit\external_jar\poi-4.1.0\lib\junit-4.12.jar;D:\TonyStark\Framework02_Junit\external_jar\poi-4.1.0\lib\log4j-1.2.17.jar;D:\TonyStark\Framework02_Junit\external_jar\poi-4.1.0\lib\jaxb-api-2.3.0.jar;D:\TonyStark\Framework02_Junit\external_jar\poi-4.1.0\lib\activation-1.1.1.jar;D:\TonyStark\Framework02_Junit\external_jar\poi-4.1.0\lib\jaxb-core-2.3.0.1.jar;D:\TonyStark\Framework02_Junit\external_jar\poi-4.1.0\lib\jaxb-impl-2.3.0.1.jar;D:\TonyStark\Framework02_Junit\external_jar\poi-4.1.0\lib\commons-codec-1.12.jar;D:\TonyStark\Framework02_Junit\external_jar\poi-4.1.0\lib\commons-logging-1.2.jar;D:\TonyStark\Framework02_Junit\external_jar\poi-4.1.0\lib\commons-math3-3.6.1.jar;D:\TonyStark\Framework02_Junit\external_jar\poi-4.1.0\lib\commons-compress-1.18.jar;D:\TonyStark\Framework02_Junit\external_jar\poi-4.1.0\lib\commons-collections4-4.3.jar;D:\TonyStark\Framework02_Junit\external_jar\poi-4.1.0\ooxml-lib\curvesapi-1.06.jar;D:\TonyStark\Framework02_Junit\external_jar\poi-4.1.0\ooxml-lib\xmlbeans-3.1.0.jar" com.intellij.rt.execution.junit.JUnitStarter -ideVersion5 -junit4 pkg1.Demo01
