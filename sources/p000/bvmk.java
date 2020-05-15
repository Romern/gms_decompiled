package p000;

/* renamed from: bvmk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvmk extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bxvu f156744d = new bvmf();

    /* renamed from: e */
    public static final bvmk f156745e;

    /* renamed from: g */
    private static volatile bxxk f156746g;

    /* renamed from: a */
    public bxwc f156747a = bxxn.f165040b;

    /* renamed from: b */
    public int f156748b;

    /* renamed from: c */
    public bxvt f156749c = bxvm.f164965b;

    /* renamed from: f */
    private int f156750f;

    static {
        bvmk bvmk = new bvmk();
        f156745e = bvmk;
        GeneratedMessageLite.m124024a(bvmk.class, bvmk);
    }

    private bvmk() {
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
            return GeneratedMessageLite.m124022a(f156745e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002ဌ\u0000\u0003\u001e", new Object[]{"f", "a", bvpf.class, "b", bvmg.f156650a, "c", bvmj.m121260b()});
        } else if (i2 == 3) {
            return new bvmk();
        } else {
            if (i2 == 4) {
                return new bxvd(f156745e);
            }
            if (i2 == 5) {
                return f156745e;
            }
            bxxk bxxk = f156746g;
            if (bxxk == null) {
                synchronized (bvmk.class) {
                    bxxk = f156746g;
                    if (bxxk == null) {
                        bxxk = new bxve(f156745e);
                        f156746g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
