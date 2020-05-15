package p000;

/* renamed from: bunc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bunc extends bunf {
    public bunc(int i, int i2, int i3) {
        super(m120020a(i, i2, i3));
    }

    /* renamed from: a */
    public static int m120019a(long j) {
        return bunf.m120042a(j, 4, 65535, 0, 65535);
    }

    /* renamed from: b */
    public static int m120021b(long j) {
        return bunf.m120042a(j, 20, 65535, 0, 65535);
    }

    /* renamed from: c */
    public static int m120022c(long j) {
        return bunf.m120042a(j, 36, 65535, 0, 65535);
    }

    public final String toString() {
        return "[type: CDMA, SID: " + mo72869a() + ", NID: " + mo72870b() + ", BID: " + mo72871c() + "]";
    }

    /* renamed from: a */
    public static long m120020a(int i, int i2, int i3) {
        return bunf.m120044c(i2, 65535, 20) | bunf.m120044c(i, 65535, 4) | 3 | bunf.m120044c(i3, 65535, 36);
    }

    /* renamed from: b */
    public final int mo72870b() {
        return m120021b(this.f154305a);
    }

    /* renamed from: c */
    public final int mo72871c() {
        return m120022c(this.f154305a);
    }

    /* renamed from: a */
    public final int mo72869a() {
        return m120019a(this.f154305a);
    }
}
