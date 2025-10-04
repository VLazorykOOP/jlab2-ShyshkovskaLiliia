public class Money {
    private long hryvnias;
    private byte kopiyky;

    public Money(long hryvnias, byte kopiyky) {
        long totalKopiyky = hryvnias * 100 + kopiyky;
        this.hryvnias = totalKopiyky / 100;
        this.kopiyky = (byte) (totalKopiyky % 100);
    }

    public Money add(Money other) {
        long newHryvnias = this.hryvnias + other.hryvnias;
        byte newKopiyky = (byte) (this.kopiyky + other.kopiyky);
        return new Money(newHryvnias, newKopiyky);
    }

    public Money subtract(Money other) {
        long newHryvnias = this.hryvnias - other.hryvnias;
        byte newKopiyky = (byte) (this.kopiyky - other.kopiyky);
        return new Money(newHryvnias, newKopiyky);
    }

    public double divide(Money other) {
        double thisTotal = this.hryvnias + this.kopiyky / 100.0;
        double otherTotal = other.hryvnias + other.kopiyky / 100.0;
        return thisTotal / otherTotal;
    }

    public Money divideByNumber(double number) {
        double totalHryvnias = (this.hryvnias + this.kopiyky / 100.0) / number;
        long newHryvnias = (long) totalHryvnias;
        byte newKopiyky = (byte) Math.round((totalHryvnias - newHryvnias) * 100);
        return new Money(newHryvnias, newKopiyky);
    }

    public boolean isEqual(Money other) {
        return this.hryvnias == other.hryvnias && this.kopiyky == other.kopiyky;
    }

    public boolean isGreater(Money other) {
        if (this.hryvnias > other.hryvnias) return true;
        if (this.hryvnias == other.hryvnias) return this.kopiyky > other.kopiyky;
        return false;
    }

    public boolean isLess(Money other) {
        if (this.hryvnias < other.hryvnias) return true;
        if (this.hryvnias == other.hryvnias) return this.kopiyky < other.kopiyky;
        return false;
    }

    public String toString() {
        return hryvnias + "," + (kopiyky < 10 ? "0" + kopiyky : kopiyky);
    }
}