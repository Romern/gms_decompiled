package p000;

/* renamed from: bpqg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpqg extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bpqg f138726c;

    /* renamed from: d */
    private static volatile bxxk f138727d;

    /* renamed from: a */
    public int f138728a;

    /* renamed from: b */
    public int f138729b;

    static {
        bpqg bpqg = new bpqg();
        f138726c = bpqg;
        bxvk.m124024a(bpqg.class, bpqg);
    }

    private bpqg() {
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
            return bxvk.m124022a(f138726c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bpot.m112131b()});
        } else if (i2 == 3) {
            return new bpqg();
        } else {
            if (i2 == 4) {
                return new bxvd(f138726c);
            }
            if (i2 == 5) {
                return f138726c;
            }
            bxxk bxxk = f138727d;
            if (bxxk == null) {
                synchronized (bpqg.class) {
                    bxxk = f138727d;
                    if (bxxk == null) {
                        bxxk = new bxve(f138726c);
                        f138727d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
