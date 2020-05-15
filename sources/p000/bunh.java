package p000;

/* renamed from: bunh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bunh extends bunf {
    public bunh(int i, int i2, int i3) {
        super(m120054a(i, i2, i3));
    }

    /* renamed from: a */
    public static int m120053a(long j) {
        return bunf.m120042a(j, 4, 1023, 0, 999);
    }

    /* renamed from: b */
    public static int m120055b(long j) {
        return bunf.m120042a(j, 14, 2047, 0, 1099);
    }

    /* renamed from: c */
    public static int m120056c(long j) {
        return bunf.m120042a(j, 25, 268435455, 0, 268435455);
    }

    public final String toString() {
        return "[type: UMTS, MCC: " + mo72888a() + ", MNC: " + mo72889b() + ", LCID: " + mo72890c() + "]";
    }

    /* renamed from: a */
    public static long m120054a(int i, int i2, int i3) {
        return bunf.m120044c(i2, 1099, 14) | bunf.m120044c(i, 999, 4) | 2 | bunf.m120044c(i3, 268435455, 25);
    }

    /* renamed from: b */
    public final int mo72889b() {
        return m120055b(this.f154305a);
    }

    /* renamed from: c */
    public final int mo72890c() {
        return m120056c(this.f154305a);
    }

    /* renamed from: a */
    public final int mo72888a() {
        return m120053a(this.f154305a);
    }
}
