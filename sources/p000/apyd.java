package p000;

/* renamed from: apyd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apyd extends bxvk implements bxxd {

    /* renamed from: a */
    public static final apyd f85119a;

    /* renamed from: b */
    private static volatile bxxk f85120b;

    static {
        apyd apyd = new apyd();
        f85119a = apyd;
        bxvk.m124024a(apyd.class, apyd);
    }

    private apyd() {
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
            return bxvk.m124022a(f85119a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new apyd();
        }
        if (i2 == 4) {
            return new bxvd(f85119a);
        }
        if (i2 == 5) {
            return f85119a;
        }
        bxxk bxxk = f85120b;
        if (bxxk == null) {
            synchronized (apyd.class) {
                bxxk = f85120b;
                if (bxxk == null) {
                    bxxk = new bxve(f85119a);
                    f85120b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
