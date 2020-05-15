package p000;

/* renamed from: btjo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btjo extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final btjo f149153b;

    /* renamed from: c */
    private static volatile bxxk f149154c;

    /* renamed from: a */
    public int f149155a;

    static {
        btjo btjo = new btjo();
        f149153b = btjo;
        GeneratedMessageLite.m124024a(btjo.class, btjo);
    }

    private btjo() {
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
            return GeneratedMessageLite.m124022a(f149153b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
        } else if (i2 == 3) {
            return new btjo();
        } else {
            if (i2 == 4) {
                return new bxvd(f149153b);
            }
            if (i2 == 5) {
                return f149153b;
            }
            bxxk bxxk = f149154c;
            if (bxxk == null) {
                synchronized (btjo.class) {
                    bxxk = f149154c;
                    if (bxxk == null) {
                        bxxk = new bxve(f149153b);
                        f149154c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
