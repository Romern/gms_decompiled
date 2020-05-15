package p000;

/* renamed from: bzuj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzuj extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bzuj f171427b;

    /* renamed from: c */
    private static volatile bxxk f171428c;

    /* renamed from: a */
    public bzuk f171429a;

    static {
        bzuj bzuj = new bzuj();
        f171427b = bzuj;
        GeneratedMessageLite.m124024a(bzuj.class, bzuj);
    }

    private bzuj() {
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
            return GeneratedMessageLite.m124022a(f171427b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bzuj();
        } else {
            if (i2 == 4) {
                return new bxvd(f171427b);
            }
            if (i2 == 5) {
                return f171427b;
            }
            bxxk bxxk = f171428c;
            if (bxxk == null) {
                synchronized (bzuj.class) {
                    bxxk = f171428c;
                    if (bxxk == null) {
                        bxxk = new bxve(f171427b);
                        f171428c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
