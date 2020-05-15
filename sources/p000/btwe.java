package p000;

/* renamed from: btwe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btwe extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final btwe f152694a;

    /* renamed from: b */
    private static volatile bxxk f152695b;

    static {
        btwe btwe = new btwe();
        f152694a = btwe;
        GeneratedMessageLite.m124024a(btwe.class, btwe);
    }

    private btwe() {
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
            return GeneratedMessageLite.m124022a(f152694a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new btwe();
        }
        if (i2 == 4) {
            return new bxvd(f152694a);
        }
        if (i2 == 5) {
            return f152694a;
        }
        bxxk bxxk = f152695b;
        if (bxxk == null) {
            synchronized (btwe.class) {
                bxxk = f152695b;
                if (bxxk == null) {
                    bxxk = new bxve(f152694a);
                    f152695b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
