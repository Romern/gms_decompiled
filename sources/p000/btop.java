package p000;

/* renamed from: btop */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btop extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final btop f149784b;

    /* renamed from: c */
    private static volatile bxxk f149785c;

    /* renamed from: a */
    public int f149786a;

    static {
        btop btop = new btop();
        f149784b = btop;
        GeneratedMessageLite.m124024a(btop.class, btop);
    }

    private btop() {
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
            return GeneratedMessageLite.m124022a(f149784b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"a"});
        } else if (i2 == 3) {
            return new btop();
        } else {
            if (i2 == 4) {
                return new bxvd(f149784b);
            }
            if (i2 == 5) {
                return f149784b;
            }
            bxxk bxxk = f149785c;
            if (bxxk == null) {
                synchronized (btop.class) {
                    bxxk = f149785c;
                    if (bxxk == null) {
                        bxxk = new bxve(f149784b);
                        f149785c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
