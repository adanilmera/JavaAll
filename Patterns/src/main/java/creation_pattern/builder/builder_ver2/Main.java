package creation_pattern.builder.builder_ver2;

public class Main {

    public static void main(String[] args) {
        SomeObject someObject = new SomeObject
                .Builder(100,"test")
                .setSome(120)
                .setString("test String")
                .setType(Type.TYPE3)
                .build();

        System.out.println(someObject);
    }
}
