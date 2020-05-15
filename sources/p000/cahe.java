package p000;

/* renamed from: cahe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cahe extends bxvk implements bxxd {

    /* renamed from: e */
    public static final cahe f174537e;

    /* renamed from: f */
    private static volatile bxxk f174538f;

    /* renamed from: a */
    public int f174539a;

    /* renamed from: b */
    public long f174540b;

    /* renamed from: c */
    public bxwc f174541c = bxxn.f165040b;

    /* renamed from: d */
    public bxtx f174542d = bxtx.f164797b;

    static {
        cahe cahe = new cahe();
        f174537e = cahe;
        bxvk.m124024a(cahe.class, cahe);
    }

    private cahe() {
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
            return bxvk.m124022a(f174537e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဂ\u0000\u0002\u001b\u0003ည\u0002", new Object[]{"a", "b", "c", cahd.class, "d"});
        } else if (i2 == 3) {
            return new cahe();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][][]) null, (float[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f174537e;
            }
            bxxk bxxk = f174538f;
            if (bxxk == null) {
                synchronized (cahe.class) {
                    bxxk = f174538f;
                    if (bxxk == null) {
                        bxxk = new bxve(f174537e);
                        f174538f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: c */
    public final void mo74643c() {
        if (!this.f174541c.mo73666a()) {
            this.f174541c = bxvk.m124021a(this.f174541c);
        }
    }
}
