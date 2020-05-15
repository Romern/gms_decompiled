package p000;

/* renamed from: btbg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btbg extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final btbg f148129a;

    /* renamed from: b */
    private static volatile bxxk f148130b;

    static {
        btbg btbg = new btbg();
        f148129a = btbg;
        GeneratedMessageLite.m124024a(btbg.class, btbg);
    }

    private btbg() {
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
            return GeneratedMessageLite.m124022a(f148129a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new btbg();
        }
        if (i2 == 4) {
            return new bxvd(f148129a);
        }
        if (i2 == 5) {
            return f148129a;
        }
        bxxk bxxk = f148130b;
        if (bxxk == null) {
            synchronized (btbg.class) {
                bxxk = f148130b;
                if (bxxk == null) {
                    bxxk = new bxve(f148129a);
                    f148130b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
