package p000;

/* renamed from: btey */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btey extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final btey f148593a;

    /* renamed from: b */
    private static volatile bxxk f148594b;

    static {
        btey btey = new btey();
        f148593a = btey;
        GeneratedMessageLite.m124024a(btey.class, btey);
    }

    private btey() {
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
            return GeneratedMessageLite.m124022a(f148593a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new btey();
        }
        if (i2 == 4) {
            return new bxvd(f148593a);
        }
        if (i2 == 5) {
            return f148593a;
        }
        bxxk bxxk = f148594b;
        if (bxxk == null) {
            synchronized (btey.class) {
                bxxk = f148594b;
                if (bxxk == null) {
                    bxxk = new bxve(f148593a);
                    f148594b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
