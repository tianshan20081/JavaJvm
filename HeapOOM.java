/**
 * @Author:      gooker
 * @Email:       zhangshch0131@126.com
 * @DateTime:    2017-07-13 09:46:54
 * @Description: Description
 */
import java.util.List;
import java.util.ArrayList;


/**
* javac HeapOOM.java 
* java -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError HeapOOM
*
*/
public class HeapOOM{
    static class OOMObject{

    }


    public static void main(String[] args){
        List<OOMObject> list = new ArrayList();
        while(true){

            list.add(new OOMObject());
        }
        // System.out.println("hello");
    }
}