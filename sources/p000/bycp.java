package p000;

/* renamed from: bycp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bycp extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bycp f165677a;

    /* renamed from: b */
    private static volatile bxxk f165678b;

    static {
        bycp bycp = new bycp();
        f165677a = bycp;
        GeneratedMessageLite.m124024a(bycp.class, bycp);
    }

    private bycp() {
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
            return GeneratedMessageLite.m124022a(f165677a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bycp();
        }
        if (i2 == 4) {
            return new bxvd(f165677a);
        }
        if (i2 == 5) {
            return f165677a;
        }
        bxxk bxxk = f165678b;
        if (bxxk == null) {
            synchronized (bycp.class) {
                bxxk = f165678b;
                if (bxxk == null) {
                    bxxk = new bxve(f165677a);
                    f165678b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
