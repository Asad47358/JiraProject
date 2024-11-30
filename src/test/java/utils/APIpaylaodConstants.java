package utils;

import netscape.javascript.JSObject;
import org.json.JSONObject;

public class APIpaylaodConstants {

    public static String CreatEmpPayload(String emp_firstname,
                                         String emp_lastname,
                                         String emp_middle_name,
                                         String emp_gender,
                                         String emp_birthday,
                                         String emp_status,
                                         String emp_job_title){

        JSONObject obj = new JSONObject();
        obj.put("emp_firstname",emp_firstname);
        obj.put("emp_lastname",emp_lastname);
        obj.put("emp_middle_name",emp_middle_name);
        obj.put("emp_gender",emp_gender);
        obj.put("emp_birthday",emp_birthday);
        obj.put("emp_status",emp_status);
        obj.put("emp_job_title",emp_job_title);

        return obj.toString();
    }

    public static String UpdateEmp(
            String employee_id,
            String emp_firstname,
            String emp_lastname,
            String emp_middle_name,
            String emp_gender,
            String emp_birthday,
            String emp_status,
            String emp_job_title){

        JSONObject obj1 = new JSONObject();
        obj1.put("employee_id",employee_id);
        obj1.put("emp_lastname",emp_lastname);
        obj1.put("emp_firstname",emp_firstname);
        obj1.put("emp_middle_name",emp_middle_name);
        obj1.put("emp_gender",emp_gender);
        obj1.put("emp_birthday",emp_birthday);
        obj1.put("emp_status",emp_status);
        obj1.put("emp_job_title",emp_job_title);

        return obj1.toString();

    }
}
