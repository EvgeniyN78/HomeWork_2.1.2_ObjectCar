package transport;

public enum LoadCapasity {
    N1(3.5f, 12f), N2(13f, 20f), N3(21f, 500f);

    private Float min;
    private Float max;

    LoadCapasity(Float min, Float max) {
        this.min = min;
        this.max = max;
    }

    LoadCapasity() {
    }

    public Float getMin() {
        return min;
    }

    public Float getMax() {
        return max;
    }


//    public static LoadCapasity getValue(float value) {
//        for (LoadCapasity e : LoadCapasity.values()) {
//            if (value >= e.getMin() && value <= e.getMax()) {
//                System.out.println(e);
//                return e;
//            }
//        }
//        return null;
//    }

    @Override
    public String toString() {
        return "от " + min +
                " тонн, до " + max +
                " тонн";
    }
}
