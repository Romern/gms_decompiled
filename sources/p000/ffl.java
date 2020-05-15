package p000;

/* renamed from: ffl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ffl extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final ffl f16459d;

    /* renamed from: e */
    private static volatile bxxk f16460e;

    /* renamed from: a */
    public String f16461a = "";

    /* renamed from: b */
    public String f16462b = "";

    /* renamed from: c */
    public int f16463c;

    static {
        ffl ffl = new ffl();
        f16459d = ffl;
        GeneratedMessageLite.m124024a(ffl.class, ffl);
    }

    private ffl() {
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
            return GeneratedMessageLite.m124022a(f16459d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0004", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new ffl();
        } else {
            if (i2 == 4) {
                return new bxvd(f16459d);
            }
            if (i2 == 5) {
                return f16459d;
            }
            bxxk bxxk = f16460e;
            if (bxxk == null) {
                synchronized (ffl.class) {
                    bxxk = f16460e;
                    if (bxxk == null) {
                        bxxk = new bxve(f16459d);
                        f16460e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
