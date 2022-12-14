package transport;

public enum Size {
    XS(10, 25), S(26, 50), M(51, 80), L(81, 120), XL(121, 150);

    private Integer min;
    private Integer max;

    Size(Integer min, Integer max) {
        this.min = min;
        this.max = max;
    }

    Size() {
    }

    public Integer getMin() {
        return min;
    }

    public Integer getMax() {
        return max;
    }


//    public static Size getValue(int value) {
//        for (Size e : Size.values()) {
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
                " до " + max +
                " мест";
    }
}
