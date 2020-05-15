package p000;

/* renamed from: bzeo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzeo extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bzeo f169695b;

    /* renamed from: c */
    private static volatile bxxk f169696c;

    /* renamed from: a */
    public bxwc f169697a = bxxn.f165040b;

    static {
        bzeo bzeo = new bzeo();
        f169695b = bzeo;
        bxvk.m124024a(bzeo.class, bzeo);
    }

    private bzeo() {
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
            return bxvk.m124022a(f169695b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bzen.class});
        } else if (i2 == 3) {
            return new bzeo();
        } else {
            if (i2 == 4) {
                return new bxvd(f169695b);
            }
            if (i2 == 5) {
                return f169695b;
            }
            bxxk bxxk = f169696c;
            if (bxxk == null) {
                synchronized (bzeo.class) {
                    bxxk = f169696c;
                    if (bxxk == null) {
                        bxxk = new bxve(f169695b);
                        f169696c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
