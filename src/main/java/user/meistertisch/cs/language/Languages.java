package user.meistertisch.cs.language;

public enum Languages {
    GERMAN("de"),
    ENGLISH("en");

    String lang;

    Languages(String lang) {
        this.lang = lang;
    }

    public String getLang() {
        return lang;
    }
}
