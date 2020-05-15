package p000;

/* renamed from: bxcw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxcw extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bxcw f162994e;

    /* renamed from: f */
    private static volatile bxxk f162995f;

    /* renamed from: a */
    public int f162996a;

    /* renamed from: b */
    public String f162997b = "";

    /* renamed from: c */
    public String f162998c = "";

    /* renamed from: d */
    public String f162999d = "";

    static {
        bxcw bxcw = new bxcw();
        f162994e = bxcw;
        GeneratedMessageLite.m124024a(bxcw.class, bxcw);
    }

    private bxcw() {
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
            return GeneratedMessageLite.m124022a(f162994e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bxcw();
        } else {
            if (i2 == 4) {
                return new bxvd(f162994e);
            }
            if (i2 == 5) {
                return f162994e;
            }
            bxxk bxxk = f162995f;
            if (bxxk == null) {
                synchronized (bxcw.class) {
                    bxxk = f162995f;
                    if (bxxk == null) {
                        bxxk = new bxve(f162994e);
                        f162995f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
