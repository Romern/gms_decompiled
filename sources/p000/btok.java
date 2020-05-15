package p000;

/* renamed from: btok */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btok extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final btok f149766a;

    /* renamed from: b */
    private static volatile bxxk f149767b;

    static {
        btok btok = new btok();
        f149766a = btok;
        GeneratedMessageLite.m124024a(btok.class, btok);
    }

    private btok() {
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
            return GeneratedMessageLite.m124022a(f149766a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new btok();
        }
        if (i2 == 4) {
            return new bxvd(f149766a);
        }
        if (i2 == 5) {
            return f149766a;
        }
        bxxk bxxk = f149767b;
        if (bxxk == null) {
            synchronized (btok.class) {
                bxxk = f149767b;
                if (bxxk == null) {
                    bxxk = new bxve(f149766a);
                    f149767b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
