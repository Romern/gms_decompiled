package p000;

import java.util.Arrays;

/* renamed from: bhuh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhuh {

    /* renamed from: a */
    public final double f119637a;

    /* renamed from: b */
    public final double f119638b;

    /* renamed from: c */
    public final double f119639c;

    public bhuh(double d, double d2, double d3) {
        this.f119637a = d;
        this.f119638b = d2;
        this.f119639c = d3;
    }

    /* renamed from: a */
    public static bhuh m101543a(bhub bhub) {
        double d = (double) bhub.f119605a;
        Double.isNaN(d);
        double d2 = d * 1.0E-7d * 0.017453292519943295d;
        double d3 = (double) bhub.f119606b;
        Double.isNaN(d3);
        double d4 = d3 * 1.0E-7d * 0.017453292519943295d;
        double cos = Math.cos(d2);
        return new bhuh(Math.cos(d4) * cos, Math.sin(d4) * cos, Math.sin(d2));
    }

    /* renamed from: b */
    public static final bhuh m101546b(bhuh bhuh, double d) {
        return new bhuh(bhuh.f119637a / d, bhuh.f119638b / d, bhuh.f119639c / d);
    }

    /* renamed from: c */
    public static final bhuh m101548c(bhuh bhuh, bhuh bhuh2) {
        return new bhuh(bhuh.f119637a * bhuh2.f119637a, bhuh.f119638b * bhuh2.f119638b, bhuh.f119639c * bhuh2.f119639c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bhuh) {
            bhuh bhuh = (bhuh) obj;
            if (Double.compare(this.f119637a, bhuh.f119637a) == 0 && Double.compare(this.f119638b, bhuh.f119638b) == 0 && Double.compare(this.f119639c, bhuh.f119639c) == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Double.valueOf(this.f119637a), Double.valueOf(this.f119638b), Double.valueOf(this.f119639c)});
    }

    /* renamed from: a */
    public static final bhuh m101544a(bhuh bhuh, double d) {
        return new bhuh(d * bhuh.f119637a, bhuh.f119638b * d, bhuh.f119639c * d);
    }

    /* renamed from: b */
    public static final bhuh m101547b(bhuh bhuh, bhuh bhuh2) {
        return new bhuh(bhuh.f119637a - bhuh2.f119637a, bhuh.f119638b - bhuh2.f119638b, bhuh.f119639c - bhuh2.f119639c);
    }

    /* renamed from: a */
    public static final bhuh m101545a(bhuh bhuh, bhuh bhuh2) {
        return new bhuh(bhuh.f119637a + bhuh2.f119637a, bhuh.f119638b + bhuh2.f119638b, bhuh.f119639c + bhuh2.f119639c);
    }

    /* renamed from: a */
    public final bhub mo64309a() {
        if (Math.abs(this.f119637a) > 1.0d || Math.abs(this.f119638b) > 1.0d || Math.abs(this.f119639c) > 1.0d) {
            return null;
        }
        double d = this.f119639c;
        double d2 = this.f119637a;
        double d3 = this.f119638b;
        return new bhub((int) Math.round(Math.atan2(d, Math.sqrt((d2 * d2) + (d3 * d3))) * 57.29577951308232d * 1.0E7d), (int) Math.round(Math.atan2(this.f119638b, this.f119637a) * 57.29577951308232d * 1.0E7d), 0, Float.NaN, "unknown", 0, -1.0f);
    }
}
