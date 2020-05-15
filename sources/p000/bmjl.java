package p000;

/* renamed from: bmjl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmjl extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bmjl f129720b;

    /* renamed from: d */
    private static volatile bxxk f129721d;

    /* renamed from: a */
    public bxwc f129722a;

    /* renamed from: c */
    private byte f129723c = 2;

    static {
        bmjl bmjl = new bmjl();
        f129720b = bmjl;
        bxvk.m124024a(bmjl.class, bmjl);
    }

    private bmjl() {
        bxxn bxxn = bxxn.f165040b;
        this.f129722a = bxxn.f165040b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f129723c);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f129723c = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f129720b, "\u0001\u0001\u0000\u0000\u0004\u0004\u0001\u0000\u0001\u0001\u0004Л", new Object[]{"a", bmeb.class});
        } else if (i2 == 3) {
            return new bmjl();
        } else {
            if (i2 == 4) {
                return new bxvd(f129720b);
            }
            if (i2 == 5) {
                return f129720b;
            }
            bxxk bxxk = f129721d;
            if (bxxk == null) {
                synchronized (bmjl.class) {
                    bxxk = f129721d;
                    if (bxxk == null) {
                        bxxk = new bxve(f129720b);
                        f129721d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
