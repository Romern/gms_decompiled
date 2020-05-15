package p000;

/* renamed from: bota */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bota extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bota f134761a;

    /* renamed from: b */
    private static volatile bxxk f134762b;

    static {
        bota bota = new bota();
        f134761a = bota;
        GeneratedMessageLite.m124024a(bota.class, bota);
    }

    private bota() {
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
            return GeneratedMessageLite.m124022a(f134761a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bota();
        }
        if (i2 == 4) {
            return new bxvd(f134761a);
        }
        if (i2 == 5) {
            return f134761a;
        }
        bxxk bxxk = f134762b;
        if (bxxk == null) {
            synchronized (bota.class) {
                bxxk = f134762b;
                if (bxxk == null) {
                    bxxk = new bxve(f134761a);
                    f134762b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
