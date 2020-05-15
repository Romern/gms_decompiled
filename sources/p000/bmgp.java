package p000;

/* renamed from: bmgp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmgp extends bxvk implements bxxd {

    /* renamed from: i */
    public static final bmgp f129296i;

    /* renamed from: j */
    private static volatile bxxk f129297j;

    /* renamed from: a */
    public int f129298a;

    /* renamed from: b */
    public bmdn f129299b;

    /* renamed from: c */
    public bmnr f129300c;

    /* renamed from: d */
    public bxwc f129301d = bxxn.f165040b;

    /* renamed from: e */
    public bxwc f129302e = bxxn.f165040b;

    /* renamed from: f */
    public bmbr f129303f;

    /* renamed from: g */
    public bmbr f129304g;

    /* renamed from: h */
    public bxwc f129305h;

    static {
        bmgp bmgp = new bmgp();
        f129296i = bmgp;
        bxvk.m124024a(bmgp.class, bmgp);
    }

    private bmgp() {
        bxvm bxvm = bxvm.f164965b;
        this.f129305h = bxxn.f165040b;
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
            return bxvk.m124022a(f129296i, "\u0001\u0007\u0000\u0001\u0003\r\u0007\u0000\u0003\u0000\u0003\u001b\u0005ဉ\u0002\u0006ဉ\u0003\b\u001b\nဉ\u0001\u000b\u001b\rဉ\u0000", new Object[]{"a", "d", bmqf.class, "f", "g", "h", bmjf.class, "c", "e", bmot.class, "b"});
        } else if (i2 == 3) {
            return new bmgp();
        } else {
            if (i2 == 4) {
                return new bxvd(f129296i);
            }
            if (i2 == 5) {
                return f129296i;
            }
            bxxk bxxk = f129297j;
            if (bxxk == null) {
                synchronized (bmgp.class) {
                    bxxk = f129297j;
                    if (bxxk == null) {
                        bxxk = new bxve(f129296i);
                        f129297j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
