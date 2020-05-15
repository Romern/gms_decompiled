package p000;

/* renamed from: lbg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lbg extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final lbg f25722a;

    /* renamed from: c */
    private static volatile bxxk f25723c;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f25724b;

    static {
        lbg lbg = new lbg();
        f25722a = lbg;
        GeneratedMessageLite.m124024a(lbg.class, lbg);
    }

    private lbg() {
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
            return GeneratedMessageLite.m124022a(f25722a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"b"});
        } else if (i2 == 3) {
            return new lbg();
        } else {
            if (i2 == 4) {
                return new bxvd(f25722a);
            }
            if (i2 == 5) {
                return f25722a;
            }
            bxxk bxxk = f25723c;
            if (bxxk == null) {
                synchronized (lbg.class) {
                    bxxk = f25723c;
                    if (bxxk == null) {
                        bxxk = new bxve(f25722a);
                        f25723c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
