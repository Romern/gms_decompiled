package p000;

/* renamed from: byov */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byov extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final byov f167270a;

    /* renamed from: b */
    private static volatile bxxk f167271b;

    static {
        byov byov = new byov();
        f167270a = byov;
        GeneratedMessageLite.m124024a(byov.class, byov);
    }

    private byov() {
        bxxn bxxn = bxxn.f165040b;
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
            return GeneratedMessageLite.m124022a(f167270a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new byov();
        }
        if (i2 == 4) {
            return new bxvd(f167270a);
        }
        if (i2 == 5) {
            return f167270a;
        }
        bxxk bxxk = f167271b;
        if (bxxk == null) {
            synchronized (byov.class) {
                bxxk = f167271b;
                if (bxxk == null) {
                    bxxk = new bxve(f167270a);
                    f167271b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
