package p000;

/* renamed from: cabv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cabv extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final cabv f172481b;

    /* renamed from: c */
    private static volatile bxxk f172482c;

    /* renamed from: a */
    public bxwc f172483a = bxxn.f165040b;

    static {
        cabv cabv = new cabv();
        f172481b = cabv;
        GeneratedMessageLite.m124024a(cabv.class, cabv);
    }

    private cabv() {
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
            return GeneratedMessageLite.m124022a(f172481b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
        } else if (i2 == 3) {
            return new cabv();
        } else {
            if (i2 == 4) {
                return new cabu();
            }
            if (i2 == 5) {
                return f172481b;
            }
            bxxk bxxk = f172482c;
            if (bxxk == null) {
                synchronized (cabv.class) {
                    bxxk = f172482c;
                    if (bxxk == null) {
                        bxxk = new bxve(f172481b);
                        f172482c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
