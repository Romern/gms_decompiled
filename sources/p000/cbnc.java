package p000;

/* renamed from: cbnc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbnc extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final cbnc f177716b;

    /* renamed from: c */
    private static volatile bxxk f177717c;

    /* renamed from: a */
    public cbmf f177718a;

    static {
        cbnc cbnc = new cbnc();
        f177716b = cbnc;
        GeneratedMessageLite.m124024a(cbnc.class, cbnc);
    }

    private cbnc() {
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
            return GeneratedMessageLite.m124022a(f177716b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
        } else if (i2 == 3) {
            return new cbnc();
        } else {
            if (i2 == 4) {
                return new bxvd(f177716b);
            }
            if (i2 == 5) {
                return f177716b;
            }
            bxxk bxxk = f177717c;
            if (bxxk == null) {
                synchronized (cbnc.class) {
                    bxxk = f177717c;
                    if (bxxk == null) {
                        bxxk = new bxve(f177716b);
                        f177717c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
