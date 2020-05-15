package p000;

/* renamed from: blbz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blbz extends bxvg implements bxvh {

    /* renamed from: a */
    public static final blbz f125890a;

    /* renamed from: c */
    private static volatile bxxk f125891c;

    /* renamed from: b */
    private byte f125892b = 2;

    static {
        blbz blbz = new blbz();
        f125890a = blbz;
        GeneratedMessageLite.m124024a(blbz.class, blbz);
    }

    private blbz() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f125892b);
        }
        byte b = 1;
        if (i2 == 1) {
            if (obj == null) {
                b = 0;
            }
            this.f125892b = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f125890a, "\u0001\u0000", (Object[]) null);
        } else {
            if (i2 == 3) {
                return new blbz();
            }
            if (i2 == 4) {
                return new bxvf(f125890a);
            }
            if (i2 == 5) {
                return f125890a;
            }
            bxxk bxxk = f125891c;
            if (bxxk == null) {
                synchronized (blbz.class) {
                    bxxk = f125891c;
                    if (bxxk == null) {
                        bxxk = new bxve(f125890a);
                        f125891c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
