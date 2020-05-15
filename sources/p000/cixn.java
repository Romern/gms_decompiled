package p000;

/* renamed from: cixn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cixn extends bxvk implements bxxd {

    /* renamed from: g */
    public static final cixn f191691g;

    /* renamed from: h */
    private static volatile bxxk f191692h;

    /* renamed from: a */
    public int f191693a;

    /* renamed from: b */
    public boolean f191694b;

    /* renamed from: c */
    public String f191695c = "";

    /* renamed from: d */
    public long f191696d;

    /* renamed from: e */
    public double f191697e;

    /* renamed from: f */
    public cixm f191698f;

    static {
        cixn cixn = new cixn();
        f191691g = cixn;
        bxvk.m124024a(cixn.class, cixn);
    }

    private cixn() {
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
            return bxvk.m124022a(f191691g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004က\u0003\u0005ဉ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new cixn();
        } else {
            if (i2 == 4) {
                return new bxvd(f191691g);
            }
            if (i2 == 5) {
                return f191691g;
            }
            bxxk bxxk = f191692h;
            if (bxxk == null) {
                synchronized (cixn.class) {
                    bxxk = f191692h;
                    if (bxxk == null) {
                        bxxk = new bxve(f191691g);
                        f191692h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
