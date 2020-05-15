package p000;

/* renamed from: bldw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bldw extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bldw f126144e;

    /* renamed from: f */
    private static volatile bxxk f126145f;

    /* renamed from: a */
    public int f126146a;

    /* renamed from: b */
    public bleu f126147b;

    /* renamed from: c */
    public String f126148c = "";

    /* renamed from: d */
    public String f126149d = "";

    static {
        bldw bldw = new bldw();
        f126144e = bldw;
        GeneratedMessageLite.m124024a(bldw.class, bldw);
    }

    private bldw() {
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
            return GeneratedMessageLite.m124022a(f126144e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bldw();
        } else {
            if (i2 == 4) {
                return new bxvd(f126144e);
            }
            if (i2 == 5) {
                return f126144e;
            }
            bxxk bxxk = f126145f;
            if (bxxk == null) {
                synchronized (bldw.class) {
                    bxxk = f126145f;
                    if (bxxk == null) {
                        bxxk = new bxve(f126144e);
                        f126145f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
