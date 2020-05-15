package p000;

/* renamed from: bzkp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzkp extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bzkp f170452g;

    /* renamed from: h */
    private static volatile bxxk f170453h;

    /* renamed from: a */
    public int f170454a;

    /* renamed from: b */
    public bzkq f170455b;

    /* renamed from: c */
    public bzkr f170456c;

    /* renamed from: d */
    public bzkz f170457d;

    /* renamed from: e */
    public bxwc f170458e = bxxn.f165040b;

    /* renamed from: f */
    public bzky f170459f;

    static {
        bzkp bzkp = new bzkp();
        f170452g = bzkp;
        bxvk.m124024a(bzkp.class, bzkp);
    }

    private bzkp() {
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
            return bxvk.m124022a(f170452g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\u001b\u0005ဉ\u0003", new Object[]{"a", "b", "c", "d", "e", bzko.class, "f"});
        } else if (i2 == 3) {
            return new bzkp();
        } else {
            if (i2 == 4) {
                return new bxvd(f170452g);
            }
            if (i2 == 5) {
                return f170452g;
            }
            bxxk bxxk = f170453h;
            if (bxxk == null) {
                synchronized (bzkp.class) {
                    bxxk = f170453h;
                    if (bxxk == null) {
                        bxxk = new bxve(f170452g);
                        f170453h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
