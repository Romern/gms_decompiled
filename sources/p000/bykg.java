package p000;

/* renamed from: bykg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bykg extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bykg f166747c;

    /* renamed from: e */
    private static volatile bxxk f166748e;

    /* renamed from: a */
    public bxun f166749a;

    /* renamed from: b */
    public bxun f166750b;

    /* renamed from: d */
    private int f166751d;

    static {
        bykg bykg = new bykg();
        f166747c = bykg;
        GeneratedMessageLite.m124024a(bykg.class, bykg);
    }

    private bykg() {
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
            return GeneratedMessageLite.m124022a(f166747c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new bykg();
        } else {
            if (i2 == 4) {
                return new bxvd(f166747c);
            }
            if (i2 == 5) {
                return f166747c;
            }
            bxxk bxxk = f166748e;
            if (bxxk == null) {
                synchronized (bykg.class) {
                    bxxk = f166748e;
                    if (bxxk == null) {
                        bxxk = new bxve(f166747c);
                        f166748e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
