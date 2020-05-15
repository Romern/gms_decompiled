package p000;

/* renamed from: bzyi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzyi extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bzyi f171875d;

    /* renamed from: e */
    private static volatile bxxk f171876e;

    /* renamed from: a */
    public long f171877a;

    /* renamed from: b */
    public String f171878b = "";

    /* renamed from: c */
    public String f171879c = "";

    static {
        bzyi bzyi = new bzyi();
        f171875d = bzyi;
        GeneratedMessageLite.m124024a(bzyi.class, bzyi);
    }

    private bzyi() {
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
            return GeneratedMessageLite.m124022a(f171875d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0002\u0002Ȉ\u0003Ȉ", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bzyi();
        } else {
            if (i2 == 4) {
                return new bxvd(f171875d);
            }
            if (i2 == 5) {
                return f171875d;
            }
            bxxk bxxk = f171876e;
            if (bxxk == null) {
                synchronized (bzyi.class) {
                    bxxk = f171876e;
                    if (bxxk == null) {
                        bxxk = new bxve(f171875d);
                        f171876e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
