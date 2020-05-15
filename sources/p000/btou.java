package p000;

/* renamed from: btou */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btou extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final btou f149804a;

    /* renamed from: b */
    private static volatile bxxk f149805b;

    static {
        btou btou = new btou();
        f149804a = btou;
        GeneratedMessageLite.m124024a(btou.class, btou);
    }

    private btou() {
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
            return GeneratedMessageLite.m124022a(f149804a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new btou();
        }
        if (i2 == 4) {
            return new bxvd(f149804a);
        }
        if (i2 == 5) {
            return f149804a;
        }
        bxxk bxxk = f149805b;
        if (bxxk == null) {
            synchronized (btou.class) {
                bxxk = f149805b;
                if (bxxk == null) {
                    bxxk = new bxve(f149804a);
                    f149805b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
