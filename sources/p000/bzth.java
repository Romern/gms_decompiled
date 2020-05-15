package p000;

/* renamed from: bzth */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzth extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bzth f171326b;

    /* renamed from: c */
    private static volatile bxxk f171327c;

    /* renamed from: a */
    public String f171328a = "";

    static {
        bzth bzth = new bzth();
        f171326b = bzth;
        GeneratedMessageLite.m124024a(bzth.class, bzth);
    }

    private bzth() {
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
            return GeneratedMessageLite.m124022a(f171326b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bzth();
        } else {
            if (i2 == 4) {
                return new bxvd(f171326b);
            }
            if (i2 == 5) {
                return f171326b;
            }
            bxxk bxxk = f171327c;
            if (bxxk == null) {
                synchronized (bzth.class) {
                    bxxk = f171327c;
                    if (bxxk == null) {
                        bxxk = new bxve(f171326b);
                        f171327c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
