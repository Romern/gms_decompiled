package p000;

/* renamed from: beug */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beug {

    /* renamed from: a */
    public static final bnic f112472a = bnic.m109494a(1, 2, 7, 4, 8, 17, new Integer[0]);

    /* renamed from: b */
    public final bfmt f112473b;

    /* renamed from: c */
    public int f112474c = 0;

    /* renamed from: d */
    public int f112475d = 0;

    /* renamed from: e */
    public int f112476e = 0;

    public beug(bfmt bfmt) {
        this.f112473b = bfmt;
    }

    /* renamed from: a */
    public final void mo61149a() {
        this.f112474c = 0;
        this.f112476e = 0;
        this.f112475d = 0;
    }

    /* renamed from: b */
    public final boolean mo61150b() {
        bfmt bfmt = this.f112473b;
        if (bfmt == null) {
            return false;
        }
        for (beuh beuh : bfmt.mo61154a().values()) {
            if (beuh.f112478b) {
                return Math.min(Math.max(beuh.f112477a, 50), 100) > 50;
            }
        }
        return false;
    }
}
