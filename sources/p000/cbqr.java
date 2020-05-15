package p000;

/* renamed from: cbqr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbqr extends bxvk implements bxxd {

    /* renamed from: g */
    public static final cbqr f178055g;

    /* renamed from: h */
    private static volatile bxxk f178056h;

    /* renamed from: a */
    public cbqj f178057a;

    /* renamed from: b */
    public cbpp f178058b;

    /* renamed from: c */
    public cbpr f178059c;

    /* renamed from: d */
    public int f178060d;

    /* renamed from: e */
    public bxtx f178061e = bxtx.f164797b;

    /* renamed from: f */
    public bxwc f178062f = bxxn.f165040b;

    static {
        cbqr cbqr = new cbqr();
        f178055g = cbqr;
        bxvk.m124024a(cbqr.class, cbqr);
    }

    private cbqr() {
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
            return bxvk.m124022a(f178055g, "\u0000\u0006\u0000\u0000\u0001\u0007\u0006\u0000\u0001\u0000\u0001\t\u0003\t\u0004\f\u0005\t\u0006\n\u0007\u001b", new Object[]{"a", "b", "d", "c", "e", "f", cbqe.class});
        } else if (i2 == 3) {
            return new cbqr();
        } else {
            if (i2 == 4) {
                return new bxvd((float[]) null, (int[]) null);
            }
            if (i2 == 5) {
                return f178055g;
            }
            bxxk bxxk = f178056h;
            if (bxxk == null) {
                synchronized (cbqr.class) {
                    bxxk = f178056h;
                    if (bxxk == null) {
                        bxxk = new bxve(f178055g);
                        f178056h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
