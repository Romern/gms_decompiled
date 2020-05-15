package p000;

/* renamed from: cbjz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbjz extends bxvk implements bxxd {

    /* renamed from: a */
    public static final cbjz f177380a;

    /* renamed from: b */
    private static volatile bxxk f177381b;

    static {
        cbjz cbjz = new cbjz();
        f177380a = cbjz;
        bxvk.m124024a(cbjz.class, cbjz);
    }

    private cbjz() {
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
            return bxvk.m124022a(f177380a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new cbjz();
        }
        if (i2 == 4) {
            return new bxvd(f177380a);
        }
        if (i2 == 5) {
            return f177380a;
        }
        bxxk bxxk = f177381b;
        if (bxxk == null) {
            synchronized (cbjz.class) {
                bxxk = f177381b;
                if (bxxk == null) {
                    bxxk = new bxve(f177380a);
                    f177381b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
