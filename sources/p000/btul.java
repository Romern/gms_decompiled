package p000;

/* renamed from: btul */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btul extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final btul f150503a;

    /* renamed from: b */
    private static volatile bxxk f150504b;

    static {
        btul btul = new btul();
        f150503a = btul;
        GeneratedMessageLite.m124024a(btul.class, btul);
    }

    private btul() {
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
            return GeneratedMessageLite.m124022a(f150503a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new btul();
        }
        if (i2 == 4) {
            return new bxvd(f150503a);
        }
        if (i2 == 5) {
            return f150503a;
        }
        bxxk bxxk = f150504b;
        if (bxxk == null) {
            synchronized (btul.class) {
                bxxk = f150504b;
                if (bxxk == null) {
                    bxxk = new bxve(f150503a);
                    f150504b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
