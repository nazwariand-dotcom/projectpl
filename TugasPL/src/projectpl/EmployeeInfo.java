package projectpl;

import java.util.Scanner;

public class EmployeeInfo {
    private StringBuilder name;
    private String code;
    private String deptId;
    private Scanner in;

    public EmployeeInfo() {
        in = new Scanner(System.in);
        setName();
        setDeptId();
        
    }

    public String getCode() {
        return code;
    }

    public String getDeptId() {
    return deptId;
}

    private void setName() {
        String input = inputName();
        name = new StringBuilder(input);

        if (checkName(name)) {
            createEmployeeCode(name);
        } else {
            code = "guest";
        }
    }

    private void setDeptId() {
        System.out.print("Enter Dept ID (Format: 1 huruf besar, 3 huruf kecil, 2 angka. Contoh: Tech01): ");
        String id = in.nextLine();

        if (validId(id)) {
            deptId = reverseString(id);
        } else {
            deptId = "None01";
        }
    }

                @Override
        public String toString() {
            return "Code: " + code + "\nDept: " + deptId;
        }

    public String reverseString(String id) {
    if (id.isEmpty()) {
        return id;
    }
    return reverseString(id.substring(1)) + id.charAt(0);
}

    private boolean validId(String id) {
    return id.matches("[A-Z][a-z]{3}\\d{2}");
    }

    private String inputName() {
        System.out.print("masukan nama karyawan: ");
        return in.nextLine();
    }

    private boolean checkName(StringBuilder name) {
        return name.toString().contains(" ");
    }

    private void createEmployeeCode(StringBuilder name) {
        String[] parts = name.toString().split(" ");
        code = parts[0].substring(0,1) + parts[1];
    }
    
    public StringBuilder getName() {
        return name;
    }
}
