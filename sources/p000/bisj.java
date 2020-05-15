package p000;

/* renamed from: bisj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bisj extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bisj f121569d;

    /* renamed from: f */
    private static volatile bxxk f121570f;

    /* renamed from: a */
    public int f121571a = 1;

    /* renamed from: b */
    public int f121572b;

    /* renamed from: c */
    public boolean f121573c;

    /* renamed from: e */
    private int f121574e;

    static {
        bisj bisj = new bisj();
        f121569d = bisj;
        bxvk.m124024a(bisj.class, bisj);
    }

    private bisj() {
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
            return bxvk.m124022a(f121569d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003ဇ\u0002", new Object[]{"e", "a", bisf.m102782b(), "b", "c"});
        } else if (i2 == 3) {
            return new bisj();
        } else {
            if (i2 == 4) {
                return new bxvd(f121569d);
            }
            if (i2 == 5) {
                return f121569d;
            }
            bxxk bxxk = f121570f;
            if (bxxk == null) {
                synchronized (bisj.class) {
                    bxxk = f121570f;
                    if (bxxk == null) {
                        bxxk = new bxve(f121569d);
                        f121570f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
