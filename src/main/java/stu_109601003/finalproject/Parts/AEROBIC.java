package stu_109601003.finalproject.Parts;


public enum AEROBIC implements MusclePart {
    AEROBIC("有氧");

    private final String name;

    AEROBIC(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

