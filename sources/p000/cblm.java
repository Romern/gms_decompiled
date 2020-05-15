package p000;

/* renamed from: cblm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cblm extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final cblm f177533a;

    /* renamed from: b */
    private static volatile bxxk f177534b;

    static {
        cblm cblm = new cblm();
        f177533a = cblm;
        GeneratedMessageLite.m124024a(cblm.class, cblm);
    }

    private cblm() {
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
            return GeneratedMessageLite.m124022a(f177533a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new cblm();
        }
        if (i2 == 4) {
            return new bxvd(f177533a);
        }
        if (i2 == 5) {
            return f177533a;
        }
        bxxk bxxk = f177534b;
        if (bxxk == null) {
            synchronized (cblm.class) {
                bxxk = f177534b;
                if (bxxk == null) {
                    bxxk = new bxve(f177533a);
                    f177534b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
