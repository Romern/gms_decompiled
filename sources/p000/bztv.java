package p000;

/* renamed from: bztv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bztv extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bztv f171375a;

    /* renamed from: b */
    private static volatile bxxk f171376b;

    static {
        bztv bztv = new bztv();
        f171375a = bztv;
        GeneratedMessageLite.m124024a(bztv.class, bztv);
    }

    private bztv() {
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
            return GeneratedMessageLite.m124022a(f171375a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bztv();
        }
        if (i2 == 4) {
            return new bxvd(f171375a);
        }
        if (i2 == 5) {
            return f171375a;
        }
        bxxk bxxk = f171376b;
        if (bxxk == null) {
            synchronized (bztv.class) {
                bxxk = f171376b;
                if (bxxk == null) {
                    bxxk = new bxve(f171375a);
                    f171376b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
