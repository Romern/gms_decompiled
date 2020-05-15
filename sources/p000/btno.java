package p000;

/* renamed from: btno */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btno extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final btno f149668a;

    /* renamed from: b */
    private static volatile bxxk f149669b;

    static {
        btno btno = new btno();
        f149668a = btno;
        GeneratedMessageLite.m124024a(btno.class, btno);
    }

    private btno() {
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
            return GeneratedMessageLite.m124022a(f149668a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new btno();
        }
        if (i2 == 4) {
            return new bxvd(f149668a);
        }
        if (i2 == 5) {
            return f149668a;
        }
        bxxk bxxk = f149669b;
        if (bxxk == null) {
            synchronized (btno.class) {
                bxxk = f149669b;
                if (bxxk == null) {
                    bxxk = new bxve(f149668a);
                    f149669b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
