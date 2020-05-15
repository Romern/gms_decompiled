package p000;

/* renamed from: bspg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bspg extends bxvk implements bxxd {

    /* renamed from: k */
    public static final bspg f146478k;

    /* renamed from: l */
    private static volatile bxxk f146479l;

    /* renamed from: a */
    public int f146480a;

    /* renamed from: b */
    public int f146481b;

    /* renamed from: c */
    public int f146482c;

    /* renamed from: d */
    public int f146483d;

    /* renamed from: e */
    public int f146484e;

    /* renamed from: f */
    public int f146485f;

    /* renamed from: g */
    public int f146486g;

    /* renamed from: h */
    public int f146487h;

    /* renamed from: i */
    public int f146488i = -1;

    /* renamed from: j */
    public int f146489j = -1;

    static {
        bspg bspg = new bspg();
        f146478k = bspg;
        bxvk.m124024a(bspg.class, bspg);
    }

    private bspg() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 1) {
            return null;
        }
        if (i2 == 2) {
            return bxvk.m124022a(f146478k, "\u0001\t\u0000\u0001\u0001\u000b\t\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\bင\u0007\tင\b\nင\t\u000bင\n", new Object[]{"a", "b", bspf.f146477a, "c", "d", "e", "f", "g", "h", "i", "j"});
        } else if (i2 == 3) {
            return new bspg();
        } else {
            if (i2 == 4) {
                return new bxvd(f146478k);
            }
            if (i2 == 5) {
                return f146478k;
            }
            bxxk bxxk = f146479l;
            if (bxxk == null) {
                synchronized (bspg.class) {
                    bxxk = f146479l;
                    if (bxxk == null) {
                        bxxk = new bxve(f146478k);
                        f146479l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
