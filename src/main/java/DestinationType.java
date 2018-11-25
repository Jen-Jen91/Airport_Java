public enum DestinationType {

    SHETLAND("Scotland"),
    LONDON("UK"),
    BARCELONA("Western Europe"),
    AMSTERDAM("Western Europe"),
    TALLINN("Eastern Europe"),
    DUBAI("Western Asia"),
    BEIJING("Eastern Asia"),
    NYC("America");

    private final String value;

    DestinationType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }


}
