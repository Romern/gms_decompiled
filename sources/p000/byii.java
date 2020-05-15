package p000;

/* renamed from: byii */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byii extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final byii f166566b;

    /* renamed from: d */
    private static volatile bxxk f166567d;

    /* renamed from: a */
    public bygw f166568a;

    /* renamed from: c */
    private int f166569c;

    static {
        byii byii = new byii();
        f166566b = byii;
        GeneratedMessageLite.m124024a(byii.class, byii);
    }

    private byii() {
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
            return GeneratedMessageLite.m124022a(f166566b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new byii();
        } else {
            if (i2 == 4) {
                return new bxvd(f166566b);
            }
            if (i2 == 5) {
                return f166566b;
            }
            bxxk bxxk = f166567d;
            if (bxxk == null) {
                synchronized (byii.class) {
                    bxxk = f166567d;
                    if (bxxk == null) {
                        bxxk = new bxve(f166566b);
                        f166567d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
