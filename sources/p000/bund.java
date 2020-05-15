package p000;

/* renamed from: bund */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bund extends bunf {
    public bund(int i, int i2, int i3, int i4) {
        super(m120027a(i, i2, i3, i4));
    }

    /* renamed from: a */
    public static int m120026a(long j) {
        return bunf.m120042a(j, 4, 1023, 0, 999);
    }

    /* renamed from: b */
    public static int m120028b(long j) {
        return bunf.m120042a(j, 14, 2047, 0, 1099);
    }

    /* renamed from: c */
    public static int m120029c(long j) {
        return bunf.m120042a(j, 25, 65535, 0, 65535);
    }

    /* renamed from: d */
    public static int m120030d(long j) {
        return bunf.m120042a(j, 41, 65535, 0, 65535);
    }

    public final String toString() {
        return "[type: GSM, MCC: " + mo72873a() + ", MNC: " + mo72874b() + ", LAC: " + mo72875c() + ", CID: " + mo72876d() + "]";
    }

    /* renamed from: a */
    public static long m120027a(int i, int i2, int i3, int i4) {
        return bunf.m120044c(i2, 1099, 14) | bunf.m120044c(i, 999, 4) | 1 | bunf.m120044c(i3, 65535, 25) | bunf.m120044c(i4, 65535, 41);
    }

    /* renamed from: b */
    public final int mo72874b() {
        return m120028b(this.f154305a);
    }

    /* renamed from: c */
    public final int mo72875c() {
        return m120029c(this.f154305a);
    }

    /* renamed from: d */
    public final int mo72876d() {
        return m120030d(this.f154305a);
    }

    /* renamed from: a */
    public final int mo72873a() {
        return m120026a(this.f154305a);
    }
}
