package p000;

/* renamed from: btqd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btqd extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final btqd f149928a;

    /* renamed from: b */
    private static volatile bxxk f149929b;

    static {
        btqd btqd = new btqd();
        f149928a = btqd;
        GeneratedMessageLite.m124024a(btqd.class, btqd);
    }

    private btqd() {
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
            return GeneratedMessageLite.m124022a(f149928a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new btqd();
        }
        if (i2 == 4) {
            return new bxvd(f149928a);
        }
        if (i2 == 5) {
            return f149928a;
        }
        bxxk bxxk = f149929b;
        if (bxxk == null) {
            synchronized (btqd.class) {
                bxxk = f149929b;
                if (bxxk == null) {
                    bxxk = new bxve(f149928a);
                    f149929b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
