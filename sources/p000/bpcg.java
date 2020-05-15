package p000;

/* renamed from: bpcg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpcg extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bpcg f135720d;

    /* renamed from: e */
    private static volatile bxxk f135721e;

    /* renamed from: a */
    public int f135722a;

    /* renamed from: b */
    public int f135723b = 1;

    /* renamed from: c */
    public bxvt f135724c = bxvm.f164965b;

    static {
        bpcg bpcg = new bpcg();
        f135720d = bpcg;
        GeneratedMessageLite.m124024a(bpcg.class, bpcg);
    }

    private bpcg() {
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
            return GeneratedMessageLite.m124022a(f135720d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0003\u0016", new Object[]{"a", "b", bpce.f135719a, "c"});
        } else if (i2 == 3) {
            return new bpcg();
        } else {
            if (i2 == 4) {
                return new bpcf();
            }
            if (i2 == 5) {
                return f135720d;
            }
            bxxk bxxk = f135721e;
            if (bxxk == null) {
                synchronized (bpcg.class) {
                    bxxk = f135721e;
                    if (bxxk == null) {
                        bxxk = new bxve(f135720d);
                        f135721e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
