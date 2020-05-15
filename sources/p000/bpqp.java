package p000;

/* renamed from: bpqp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpqp extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bpqp f138773a;

    /* renamed from: e */
    private static volatile bxxk f138774e;

    /* renamed from: b */
    private int f138775b;

    /* renamed from: c */
    private bplh f138776c;

    /* renamed from: d */
    private byte f138777d = 2;

    static {
        bpqp bpqp = new bpqp();
        f138773a = bpqp;
        bxvk.m124024a(bpqp.class, bpqp);
    }

    private bpqp() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f138777d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f138777d = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f138773a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", "c"});
        } else if (i2 == 3) {
            return new bpqp();
        } else {
            if (i2 == 4) {
                return new bxvd(f138773a);
            }
            if (i2 == 5) {
                return f138773a;
            }
            bxxk bxxk = f138774e;
            if (bxxk == null) {
                synchronized (bpqp.class) {
                    bxxk = f138774e;
                    if (bxxk == null) {
                        bxxk = new bxve(f138773a);
                        f138774e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
