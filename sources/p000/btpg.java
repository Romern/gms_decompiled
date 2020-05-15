package p000;

/* renamed from: btpg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btpg extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final btpg f149845a;

    /* renamed from: b */
    private static volatile bxxk f149846b;

    static {
        btpg btpg = new btpg();
        f149845a = btpg;
        GeneratedMessageLite.m124024a(btpg.class, btpg);
    }

    private btpg() {
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
            return GeneratedMessageLite.m124022a(f149845a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new btpg();
        }
        if (i2 == 4) {
            return new bxvd(f149845a);
        }
        if (i2 == 5) {
            return f149845a;
        }
        bxxk bxxk = f149846b;
        if (bxxk == null) {
            synchronized (btpg.class) {
                bxxk = f149846b;
                if (bxxk == null) {
                    bxxk = new bxve(f149845a);
                    f149846b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
