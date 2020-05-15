package p000;

/* renamed from: byiq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byiq extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final byiq f166593a;

    /* renamed from: b */
    private static volatile bxxk f166594b;

    static {
        byiq byiq = new byiq();
        f166593a = byiq;
        GeneratedMessageLite.m124024a(byiq.class, byiq);
    }

    private byiq() {
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
            return GeneratedMessageLite.m124022a(f166593a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new byiq();
        }
        if (i2 == 4) {
            return new bxvd(f166593a);
        }
        if (i2 == 5) {
            return f166593a;
        }
        bxxk bxxk = f166594b;
        if (bxxk == null) {
            synchronized (byiq.class) {
                bxxk = f166594b;
                if (bxxk == null) {
                    bxxk = new bxve(f166593a);
                    f166594b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
