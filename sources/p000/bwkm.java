package p000;

/* renamed from: bwkm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwkm extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bwkm f159987a;

    /* renamed from: b */
    private static volatile bxxk f159988b;

    static {
        bwkm bwkm = new bwkm();
        f159987a = bwkm;
        GeneratedMessageLite.m124024a(bwkm.class, bwkm);
    }

    private bwkm() {
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
            return GeneratedMessageLite.m124022a(f159987a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bwkm();
        }
        if (i2 == 4) {
            return new bxvd(f159987a);
        }
        if (i2 == 5) {
            return f159987a;
        }
        bxxk bxxk = f159988b;
        if (bxxk == null) {
            synchronized (bwkm.class) {
                bxxk = f159988b;
                if (bxxk == null) {
                    bxxk = new bxve(f159987a);
                    f159988b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
