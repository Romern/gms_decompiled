package p000;

/* renamed from: btbk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btbk extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final btbk f148145f;

    /* renamed from: g */
    private static volatile bxxk f148146g;

    /* renamed from: a */
    public btbc f148147a;

    /* renamed from: b */
    public btbp f148148b;

    /* renamed from: c */
    public bszw f148149c;

    /* renamed from: d */
    public long f148150d;

    /* renamed from: e */
    public int f148151e;

    static {
        btbk btbk = new btbk();
        f148145f = btbk;
        GeneratedMessageLite.m124024a(btbk.class, btbk);
    }

    private btbk() {
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
            return GeneratedMessageLite.m124022a(f148145f, "\u0000\u0005\u0000\u0000\u0001\u0006\u0005\u0000\u0000\u0000\u0001\t\u0002\t\u0004\t\u0005\u0002\u0006\u0004", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new btbk();
        } else {
            if (i2 == 4) {
                return new bxvd(f148145f);
            }
            if (i2 == 5) {
                return f148145f;
            }
            bxxk bxxk = f148146g;
            if (bxxk == null) {
                synchronized (btbk.class) {
                    bxxk = f148146g;
                    if (bxxk == null) {
                        bxxk = new bxve(f148145f);
                        f148146g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
