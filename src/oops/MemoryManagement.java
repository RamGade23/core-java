package oops;

public class MemoryManagement {

    int num;
    String name;
    static String collagename = "DY Patil";

    MemoryManagement() {
    }

    MemoryManagement(int n, String name) {
        num = n;
        this.name = name;
    }

    public static void main(String[] args) {
        String abc = "Akash";
        float f = 6.5f;
        MemoryManagement management = new MemoryManagement();
        management.msg(5);
    }

    private void msg(int num) {
        int a = num;
        String c = "Akash";
        String d = "Aishwarya";
        MemoryManagement mgmt1 = new MemoryManagement(7, "Rushi");
    }
}
