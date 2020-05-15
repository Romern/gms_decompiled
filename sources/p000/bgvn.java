package p000;

/* renamed from: bgvn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgvn extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bgvn f117695b;

    /* renamed from: c */
    private static volatile bxxk f117696c;

    /* renamed from: a */
    public bxwc f117697a = bxxn.f165040b;

    static {
        bgvn bgvn = new bgvn();
        f117695b = bgvn;
        GeneratedMessageLite.m124024a(bgvn.class, bgvn);
    }

    private bgvn() {
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
            return GeneratedMessageLite.m124022a(f117695b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bgvo.class});
        } else if (i2 == 3) {
            return new bgvn();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[]) null, (int[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f117695b;
            }
            bxxk bxxk = f117696c;
            if (bxxk == null) {
                synchronized (bgvn.class) {
                    bxxk = f117696c;
                    if (bxxk == null) {
                        bxxk = new bxve(f117695b);
                        f117696c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
