package p000;

/* renamed from: bqqv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqqv extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bqqv f141389d;

    /* renamed from: e */
    private static volatile bxxk f141390e;

    /* renamed from: a */
    public int f141391a;

    /* renamed from: b */
    public bqqx f141392b;

    /* renamed from: c */
    public bqrz f141393c;

    static {
        bqqv bqqv = new bqqv();
        f141389d = bqqv;
        bxvk.m124024a(bqqv.class, bqqv);
    }

    private bqqv() {
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
            return bxvk.m124022a(f141389d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bqqv();
        } else {
            if (i2 == 4) {
                return new bxvd(f141389d);
            }
            if (i2 == 5) {
                return f141389d;
            }
            bxxk bxxk = f141390e;
            if (bxxk == null) {
                synchronized (bqqv.class) {
                    bxxk = f141390e;
                    if (bxxk == null) {
                        bxxk = new bxve(f141389d);
                        f141390e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
