package p000;

/* renamed from: abdl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abdl extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final abdl f57099a;

    /* renamed from: b */
    private static volatile bxxk f57100b;

    static {
        abdl abdl = new abdl();
        f57099a = abdl;
        GeneratedMessageLite.m124024a(abdl.class, abdl);
    }

    private abdl() {
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
            return GeneratedMessageLite.m124022a(f57099a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new abdl();
        }
        if (i2 == 4) {
            return new bxvd(f57099a);
        }
        if (i2 == 5) {
            return f57099a;
        }
        bxxk bxxk = f57100b;
        if (bxxk == null) {
            synchronized (abdl.class) {
                bxxk = f57100b;
                if (bxxk == null) {
                    bxxk = new bxve(f57099a);
                    f57100b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
