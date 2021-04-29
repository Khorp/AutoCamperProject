public interface AutoCamper {

    type camperType = type.standard;
    int reading = 0;

    enum type{
        basic,
        standard,
        luxury
    }

    public void setCamperType();

    public type getCamperType();



}
