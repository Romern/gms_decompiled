package p000;

/* renamed from: bzei */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzei extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bzei f169650c;

    /* renamed from: d */
    private static volatile bxxk f169651d;

    /* renamed from: a */
    public int f169652a;

    /* renamed from: b */
    public boolean f169653b;

    static {
        bzei bzei = new bzei();
        f169650c = bzei;
        GeneratedMessageLite.m124024a(bzei.class, bzei);
    }

    private bzei() {
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
            return GeneratedMessageLite.m124022a(f169650c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0007", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bzei();
        } else {
            if (i2 == 4) {
                return new bxvd(f169650c);
            }
            if (i2 == 5) {
                return f169650c;
            }
            bxxk bxxk = f169651d;
            if (bxxk == null) {
                synchronized (bzei.class) {
                    bxxk = f169651d;
                    if (bxxk == null) {
                        bxxk = new bxve(f169650c);
                        f169651d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
