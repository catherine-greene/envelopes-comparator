package softserve.academy;


class Envelope implements Comparable<Envelope> {
    private double side1;
    private double side2;

    double getSide1() {
        return side1;
    }

    void setSide1(String side1) throws NumberFormatException {
        this.side1 = Double.parseDouble(side1);
        if (this.side1 <= 0) {
            throw new IllegalArgumentException("Size must be greater than zero");
        }
    }

    double getSide2() {
        return side2;
    }

    void setSide2(String side2) throws NumberFormatException {
        this.side2 = Double.parseDouble(side2);
        if (this.side2 <= 0) {
            throw new IllegalArgumentException("Size must be greater than zero");
        }
    }


    @Override
    public int compareTo(Envelope envelope) {
        if (getSide1() > envelope.getSide1() && getSide2() > envelope.getSide2()) {
            return 1;
        } else if (getSide1() < envelope.getSide1() && getSide2() < envelope.getSide2()) {
            return -1;
        } else {
            return 0;
        }
    }
}
