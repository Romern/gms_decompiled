package p000;

/* renamed from: byck */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byck extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final byck f165660a;

    /* renamed from: b */
    private static volatile bxxk f165661b;

    static {
        byck byck = new byck();
        f165660a = byck;
        GeneratedMessageLite.m124024a(byck.class, byck);
    }

    private byck() {
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
            return GeneratedMessageLite.m124022a(f165660a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new byck();
        }
        if (i2 == 4) {
            return new bxvd(f165660a);
        }
        if (i2 == 5) {
            return f165660a;
        }
        bxxk bxxk = f165661b;
        if (bxxk == null) {
            synchronized (byck.class) {
                bxxk = f165661b;
                if (bxxk == null) {
                    bxxk = new bxve(f165660a);
                    f165661b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
