package p000;

/* renamed from: bxlr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxlr extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bxlr f163883e;

    /* renamed from: f */
    public static final bxvj f163884f;

    /* renamed from: g */
    private static volatile bxxk f163885g;

    /* renamed from: a */
    public int f163886a;

    /* renamed from: b */
    public String f163887b = "";

    /* renamed from: c */
    public bxlq f163888c;

    /* renamed from: d */
    public bxcm f163889d;

    static {
        bxlr bxlr = new bxlr();
        f163883e = bxlr;
        GeneratedMessageLite.m124024a(bxlr.class, bxlr);
        bxcf bxcf = bxcf.f162779a;
        bxlr bxlr2 = f163883e;
        f163884f = GeneratedMessageLite.m124006a(bxcf, bxlr2, bxlr2, 124010145, bxzf.MESSAGE);
    }

    private bxlr() {
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
            return GeneratedMessageLite.m124022a(f163883e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bxlr();
        } else {
            if (i2 == 4) {
                return new bxvd(f163883e);
            }
            if (i2 == 5) {
                return f163883e;
            }
            bxxk bxxk = f163885g;
            if (bxxk == null) {
                synchronized (bxlr.class) {
                    bxxk = f163885g;
                    if (bxxk == null) {
                        bxxk = new bxve(f163883e);
                        f163885g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
