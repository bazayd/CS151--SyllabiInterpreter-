package dataContainers;

public class ContactInformation implements SyllabusEntities {
    private String desc;
    public static void main(String[] args) {

    }
    public ContactInformation (String desc) {
        this.desc = desc;
    }

    public String[] getInfo() {
        return new String[]{desc};
    }
    public String getTitle() {
        return desc;
    }
}
