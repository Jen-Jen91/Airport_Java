public enum AircraftType {
    HUGE(500),
    BIG(250),
    MEDIUM(100),
    SMALL(50),
    TINY(20);

    private final int value;

    AircraftType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}


