public enum AircraftType {
    HUGE(300),
    BIG(150),
    MEDIUM(80),
    SMALL(30),
    TINY(5);

    private final int value;

    AircraftType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}


