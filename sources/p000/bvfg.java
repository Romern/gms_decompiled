package p000;

/* renamed from: bvfg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvfg extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bvfg f155859d;

    /* renamed from: e */
    private static volatile bxxk f155860e;

    /* renamed from: a */
    public int f155861a;

    /* renamed from: b */
    public bvga f155862b;

    /* renamed from: c */
    public bxun f155863c;

    static {
        bvfg bvfg = new bvfg();
        f155859d = bvfg;
        bxvk.m124024a(bvfg.class, bvfg);
    }

    private bvfg() {
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
            return bxvk.m124022a(f155859d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bvfg();
        } else {
            if (i2 == 4) {
                return new bxvd(f155859d);
            }
            if (i2 == 5) {
                return f155859d;
            }
            bxxk bxxk = f155860e;
            if (bxxk == null) {
                synchronized (bvfg.class) {
                    bxxk = f155860e;
                    if (bxxk == null) {
                        bxxk = new bxve(f155859d);
                        f155860e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
