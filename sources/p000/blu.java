package p000;

/* renamed from: blu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blu extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final blu f5122b;

    /* renamed from: c */
    private static volatile bxxk f5123c;

    /* renamed from: a */
    public bxwc f5124a = bxxn.f165040b;

    static {
        blu blu = new blu();
        f5122b = blu;
        GeneratedMessageLite.m124024a(blu.class, blu);
    }

    private blu() {
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
            return GeneratedMessageLite.m124022a(f5122b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", blt.class});
        } else if (i2 == 3) {
            return new blu();
        } else {
            if (i2 == 4) {
                return new bxvd(f5122b);
            }
            if (i2 == 5) {
                return f5122b;
            }
            bxxk bxxk = f5123c;
            if (bxxk == null) {
                synchronized (blu.class) {
                    bxxk = f5123c;
                    if (bxxk == null) {
                        bxxk = new bxve(f5122b);
                        f5123c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
