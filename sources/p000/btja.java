package p000;

/* renamed from: btja */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btja extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final btja f149062e;

    /* renamed from: f */
    private static volatile bxxk f149063f;

    /* renamed from: a */
    public boolean f149064a;

    /* renamed from: b */
    public int f149065b;

    /* renamed from: c */
    public int f149066c;

    /* renamed from: d */
    public int f149067d;

    static {
        btja btja = new btja();
        f149062e = btja;
        GeneratedMessageLite.m124024a(btja.class, btja);
    }

    private btja() {
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
            return GeneratedMessageLite.m124022a(f149062e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0007\u0002\u0004\u0003\u0004\u0004\u0004", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new btja();
        } else {
            if (i2 == 4) {
                return new bxvd(f149062e);
            }
            if (i2 == 5) {
                return f149062e;
            }
            bxxk bxxk = f149063f;
            if (bxxk == null) {
                synchronized (btja.class) {
                    bxxk = f149063f;
                    if (bxxk == null) {
                        bxxk = new bxve(f149062e);
                        f149063f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
