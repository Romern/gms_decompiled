package p000;

/* renamed from: bxlw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxlw extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bxlw f163903b;

    /* renamed from: c */
    private static volatile bxxk f163904c;

    /* renamed from: a */
    public bxwc f163905a = bxxn.f165040b;

    static {
        bxlw bxlw = new bxlw();
        f163903b = bxlw;
        GeneratedMessageLite.m124024a(bxlw.class, bxlw);
    }

    private bxlw() {
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
            return GeneratedMessageLite.m124022a(f163903b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bxlv.class});
        } else if (i2 == 3) {
            return new bxlw();
        } else {
            if (i2 == 4) {
                return new bxvd(f163903b);
            }
            if (i2 == 5) {
                return f163903b;
            }
            bxxk bxxk = f163904c;
            if (bxxk == null) {
                synchronized (bxlw.class) {
                    bxxk = f163904c;
                    if (bxxk == null) {
                        bxxk = new bxve(f163903b);
                        f163904c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
