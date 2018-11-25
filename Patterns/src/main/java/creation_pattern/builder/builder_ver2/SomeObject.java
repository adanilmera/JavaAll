package creation_pattern.builder.builder_ver2;

/**
 *
 */
public class SomeObject {

    //обязательные поля
    private int mostField;
    private String mostField2;

    //дополнительные поля
    private int some;
    private String string;
    private Type type;

    public int getMostField() {
        return mostField;
    }

    public String getMostField2() {
        return mostField2;
    }

    public int getSome() {
        return some;
    }

    public String getString() {
        return string;
    }

    public Type getType() {
        return type;
    }


    private SomeObject(Builder builder){
        type=builder.type;
        string =builder.string;
        some=builder.some;
        mostField=builder.mostField;
        mostField2=builder.mostField2;
    }

    @Override
    public String toString() {
        return "SomeObject{" +
                "mostField=" + mostField +
                ", mostField2='" + mostField2 + '\'' +
                ", some=" + some +
                ", string='" + string + '\'' +
                ", type=" + type +
                '}';
    }

    /**
     * Строитель
     */
    public static class Builder{

        //обязательные поля
        private int mostField;
        private String mostField2;

        //дополнительные параметры инициализирубтся значениями по умолчанию
        private int some=0;
        private String string="";
        private Type type=Type.TYPE1;

        public Builder(int _mostField,String _mostField2){
            this.mostField=_mostField;
            this.mostField2=_mostField2;
        }


        public Builder setSome(int some){
            this.some=some;
            return this;
        }

        public Builder setString(String string){
            this.string=string;
            return this;
        }

        public Builder setType(Type type){
            this.type=type;
            return this;
        }

        public SomeObject build(){
            return new SomeObject(this);
        }
    }
}
