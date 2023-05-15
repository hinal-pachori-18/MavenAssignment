package org.example;
import org.json.simple.JSONValue;
import java.util.HashMap;
import java.util.Map;

public class JsonData {
    public static void getData() {
        Map obj = new HashMap();
        obj.put("Name", "hinal");
        obj.put("Age", 12);
        obj.put("Email", "hinal.p@simformsolution.com");
        String jsonData = JSONValue.toJSONString(obj);
        System.out.println(jsonData);
    }
}
