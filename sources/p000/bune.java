package p000;

/* renamed from: bune */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bune extends bunf {
    public bune(int i, int i2, int i3) {
        super(m120036a(i, i2, i3));
    }

    /* renamed from: a */
    public static int m120035a(long j) {
        return bunf.m120042a(j, 4, 1023, 0, 999);
    }

    /* renamed from: b */
    public static int m120037b(long j) {
        return bunf.m120042a(j, 14, 2047, 0, 1099);
    }

    /* renamed from: c */
    public static int m120038c(long j) {
        return bunf.m120042a(j, 25, 268435455, 0, 268435455);
    }

    public final String toString() {
        return "[type: LTE, MCC: " + mo72878a() + ", MNC: " + mo72879b() + ", CI: " + mo72880c() + "]";
    }

    /* renamed from: a */
    public static long m120036a(int i, int i2, int i3) {
        return bunf.m120044c(i2, 1099, 14) | bunf.m120044c(i, 999, 4) | 4 | bunf.m120044c(i3, 268435455, 25);
    }

    /* renamed from: b */
    public final int mo72879b() {
        return m120037b(this.f154305a);
    }

    /* renamed from: c */
    public final int mo72880c() {
        return m120038c(this.f154305a);
    }

    /* renamed from: a */
    public final int mo72878a() {
        return m120035a(this.f154305a);
    }
}
