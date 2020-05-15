package p000;

/* renamed from: btuj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btuj extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final btuj f150495a;

    /* renamed from: b */
    private static volatile bxxk f150496b;

    static {
        btuj btuj = new btuj();
        f150495a = btuj;
        GeneratedMessageLite.m124024a(btuj.class, btuj);
    }

    private btuj() {
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
            return GeneratedMessageLite.m124022a(f150495a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new btuj();
        }
        if (i2 == 4) {
            return new bxvd(f150495a);
        }
        if (i2 == 5) {
            return f150495a;
        }
        bxxk bxxk = f150496b;
        if (bxxk == null) {
            synchronized (btuj.class) {
                bxxk = f150496b;
                if (bxxk == null) {
                    bxxk = new bxve(f150495a);
                    f150496b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
