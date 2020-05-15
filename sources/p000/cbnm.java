package p000;

/* renamed from: cbnm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbnm extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final cbnm f177739a;

    /* renamed from: b */
    private static volatile bxxk f177740b;

    static {
        cbnm cbnm = new cbnm();
        f177739a = cbnm;
        GeneratedMessageLite.m124024a(cbnm.class, cbnm);
    }

    private cbnm() {
        bxvm bxvm = bxvm.f164965b;
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
            return GeneratedMessageLite.m124022a(f177739a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new cbnm();
        }
        if (i2 == 4) {
            return new bxvd(f177739a);
        }
        if (i2 == 5) {
            return f177739a;
        }
        bxxk bxxk = f177740b;
        if (bxxk == null) {
            synchronized (cbnm.class) {
                bxxk = f177740b;
                if (bxxk == null) {
                    bxxk = new bxve(f177739a);
                    f177740b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
