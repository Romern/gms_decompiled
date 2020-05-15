package p000;

/* renamed from: bkld */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkld extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bkld f124721e;

    /* renamed from: f */
    private static volatile bxxk f124722f;

    /* renamed from: a */
    public int f124723a;

    /* renamed from: b */
    public String f124724b = "";

    /* renamed from: c */
    public boolean f124725c;

    /* renamed from: d */
    public String f124726d = "";

    static {
        bkld bkld = new bkld();
        f124721e = bkld;
        GeneratedMessageLite.m124024a(bkld.class, bkld);
    }

    private bkld() {
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
            return GeneratedMessageLite.m124022a(f124721e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဇ\u0002\u0005ဈ\u0004", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bkld();
        } else {
            if (i2 == 4) {
                return new bxvd(f124721e);
            }
            if (i2 == 5) {
                return f124721e;
            }
            bxxk bxxk = f124722f;
            if (bxxk == null) {
                synchronized (bkld.class) {
                    bxxk = f124722f;
                    if (bxxk == null) {
                        bxxk = new bxve(f124721e);
                        f124722f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
