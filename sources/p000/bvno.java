package p000;

/* renamed from: bvno */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvno extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bvno f156953b;

    /* renamed from: c */
    private static volatile bxxk f156954c;

    /* renamed from: a */
    public bxwc f156955a = bxxn.f165040b;

    static {
        bvno bvno = new bvno();
        f156953b = bvno;
        GeneratedMessageLite.m124024a(bvno.class, bvno);
    }

    private bvno() {
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
            return GeneratedMessageLite.m124022a(f156953b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bvnq.class});
        } else if (i2 == 3) {
            return new bvno();
        } else {
            if (i2 == 4) {
                return new bxvd(f156953b);
            }
            if (i2 == 5) {
                return f156953b;
            }
            bxxk bxxk = f156954c;
            if (bxxk == null) {
                synchronized (bvno.class) {
                    bxxk = f156954c;
                    if (bxxk == null) {
                        bxxk = new bxve(f156953b);
                        f156954c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
