package p000;

/* renamed from: cbjj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbjj extends bxvk implements bxxd {

    /* renamed from: a */
    public static final cbjj f177335a;

    /* renamed from: b */
    private static volatile bxxk f177336b;

    static {
        cbjj cbjj = new cbjj();
        f177335a = cbjj;
        bxvk.m124024a(cbjj.class, cbjj);
    }

    private cbjj() {
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
            return bxvk.m124022a(f177335a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new cbjj();
        }
        if (i2 == 4) {
            return new bxvd(f177335a);
        }
        if (i2 == 5) {
            return f177335a;
        }
        bxxk bxxk = f177336b;
        if (bxxk == null) {
            synchronized (cbjj.class) {
                bxxk = f177336b;
                if (bxxk == null) {
                    bxxk = new bxve(f177335a);
                    f177336b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
