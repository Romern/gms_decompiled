package p000;

/* renamed from: bung */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bung extends bunf {
    public bung(int i, int i2, long j) {
        super(m120047a(i, i2, j));
    }

    /* renamed from: a */
    public static int m120046a(long j) {
        return bunf.m120042a(j, 4, 1023, 0, 999);
    }

    /* renamed from: b */
    public static int m120048b(long j) {
        return bunf.m120042a(j, 14, 2047, 0, 1099);
    }

    /* renamed from: c */
    public static long m120049c(long j) {
        long j2 = (j >> 25) & 68719476735L;
        bunf.m120045e(j2);
        return j2;
    }

    public final String toString() {
        return "[type: NR, MCC: " + mo72884a() + ", MNC: " + mo72885b() + ", NCI: " + mo72886c() + "]";
    }

    /* renamed from: a */
    public static long m120047a(int i, int i2, long j) {
        long c = bunf.m120044c(i, 999, 4);
        long c2 = bunf.m120044c(i2, 1099, 14);
        bunf.m120045e(j);
        return c2 | c | 5 | (j << 25);
    }

    /* renamed from: b */
    public final int mo72885b() {
        return m120048b(this.f154305a);
    }

    /* renamed from: c */
    public final long mo72886c() {
        return m120049c(this.f154305a);
    }

    /* renamed from: a */
    public final int mo72884a() {
        return m120046a(this.f154305a);
    }
}
