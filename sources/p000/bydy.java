package p000;

/* renamed from: bydy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bydy extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bydy f165872e;

    /* renamed from: f */
    private static volatile bxxk f165873f;

    /* renamed from: a */
    public String f165874a = "";

    /* renamed from: b */
    public long f165875b;

    /* renamed from: c */
    public String f165876c = "";

    /* renamed from: d */
    public String f165877d = "";

    static {
        bydy bydy = new bydy();
        f165872e = bydy;
        GeneratedMessageLite.m124024a(bydy.class, bydy);
    }

    private bydy() {
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
            return GeneratedMessageLite.m124022a(f165872e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003Ȉ\u0004Ȉ", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bydy();
        } else {
            if (i2 == 4) {
                return new bxvd(f165872e);
            }
            if (i2 == 5) {
                return f165872e;
            }
            bxxk bxxk = f165873f;
            if (bxxk == null) {
                synchronized (bydy.class) {
                    bxxk = f165873f;
                    if (bxxk == null) {
                        bxxk = new bxve(f165872e);
                        f165873f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
