package p000;

/* renamed from: caoc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caoc {

    /* renamed from: a */
    public final double f175437a;

    /* renamed from: b */
    public final double f175438b;

    public caoc(double d, double d2) {
        this.f175437a = d;
        this.f175438b = d2;
    }

    public final String toString() {
        String d = Double.toString(this.f175437a * 57.29577951308232d);
        double d2 = this.f175438b;
        StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 25);
        sb.append(d);
        sb.append(",");
        sb.append(d2 * 57.29577951308232d);
        return sb.toString();
    }
}
