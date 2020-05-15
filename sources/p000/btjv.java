package p000;

/* renamed from: btjv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btjv extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final btjv f149184c;

    /* renamed from: d */
    private static volatile bxxk f149185d;

    /* renamed from: a */
    public String f149186a = "";

    /* renamed from: b */
    public int f149187b;

    static {
        btjv btjv = new btjv();
        f149184c = btjv;
        GeneratedMessageLite.m124024a(btjv.class, btjv);
    }

    private btjv() {
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
            return GeneratedMessageLite.m124022a(f149184c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0004", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new btjv();
        } else {
            if (i2 == 4) {
                return new bxvd(f149184c);
            }
            if (i2 == 5) {
                return f149184c;
            }
            bxxk bxxk = f149185d;
            if (bxxk == null) {
                synchronized (btjv.class) {
                    bxxk = f149185d;
                    if (bxxk == null) {
                        bxxk = new bxve(f149184c);
                        f149185d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
