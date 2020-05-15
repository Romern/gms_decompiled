package p000;

/* renamed from: byju */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byju extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final byju f166700a;

    /* renamed from: b */
    private static volatile bxxk f166701b;

    static {
        byju byju = new byju();
        f166700a = byju;
        GeneratedMessageLite.m124024a(byju.class, byju);
    }

    private byju() {
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
            return GeneratedMessageLite.m124022a(f166700a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new byju();
        }
        if (i2 == 4) {
            return new bxvd(f166700a);
        }
        if (i2 == 5) {
            return f166700a;
        }
        bxxk bxxk = f166701b;
        if (bxxk == null) {
            synchronized (byju.class) {
                bxxk = f166701b;
                if (bxxk == null) {
                    bxxk = new bxve(f166700a);
                    f166701b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
