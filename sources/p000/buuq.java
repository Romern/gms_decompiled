package p000;

/* renamed from: buuq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buuq extends bxvk implements bxxd {

    /* renamed from: e */
    public static final buuq f154972e;

    /* renamed from: f */
    private static volatile bxxk f154973f;

    /* renamed from: a */
    public int f154974a;

    /* renamed from: b */
    public int f154975b;

    /* renamed from: c */
    public long f154976c;

    /* renamed from: d */
    public bxtx f154977d = bxtx.f164797b;

    static {
        buuq buuq = new buuq();
        f154972e = buuq;
        bxvk.m124024a(buuq.class, buuq);
    }

    private buuq() {
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
            return bxvk.m124022a(f154972e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001\u0003ည\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new buuq();
        } else {
            if (i2 == 4) {
                return new bxvd(f154972e);
            }
            if (i2 == 5) {
                return f154972e;
            }
            bxxk bxxk = f154973f;
            if (bxxk == null) {
                synchronized (buuq.class) {
                    bxxk = f154973f;
                    if (bxxk == null) {
                        bxxk = new bxve(f154972e);
                        f154973f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
