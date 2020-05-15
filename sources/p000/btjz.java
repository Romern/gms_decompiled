package p000;

/* renamed from: btjz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btjz extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final btjz f149206d;

    /* renamed from: e */
    private static volatile bxxk f149207e;

    /* renamed from: a */
    public bxwc f149208a = bxxn.f165040b;

    /* renamed from: b */
    public bxwc f149209b = bxxn.f165040b;

    /* renamed from: c */
    public bxwc f149210c = bxxn.f165040b;

    static {
        btjz btjz = new btjz();
        f149206d = btjz;
        GeneratedMessageLite.m124024a(btjz.class, btjz);
    }

    private btjz() {
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
            return GeneratedMessageLite.m124022a(f149206d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001Ț\u0002Ț\u0003Ț", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new btjz();
        } else {
            if (i2 == 4) {
                return new bxvd(f149206d);
            }
            if (i2 == 5) {
                return f149206d;
            }
            bxxk bxxk = f149207e;
            if (bxxk == null) {
                synchronized (btjz.class) {
                    bxxk = f149207e;
                    if (bxxk == null) {
                        bxxk = new bxve(f149206d);
                        f149207e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
