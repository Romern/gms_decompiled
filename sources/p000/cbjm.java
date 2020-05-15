package p000;

/* renamed from: cbjm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbjm extends bxvk implements bxxd {

    /* renamed from: a */
    public static final cbjm f177343a;

    /* renamed from: b */
    private static volatile bxxk f177344b;

    static {
        cbjm cbjm = new cbjm();
        f177343a = cbjm;
        bxvk.m124024a(cbjm.class, cbjm);
    }

    private cbjm() {
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
            return bxvk.m124022a(f177343a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new cbjm();
        }
        if (i2 == 4) {
            return new bxvd(f177343a);
        }
        if (i2 == 5) {
            return f177343a;
        }
        bxxk bxxk = f177344b;
        if (bxxk == null) {
            synchronized (cbjm.class) {
                bxxk = f177344b;
                if (bxxk == null) {
                    bxxk = new bxve(f177343a);
                    f177344b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
