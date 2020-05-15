package p000;

/* renamed from: bpwp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpwp extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bpwp f139543d;

    /* renamed from: e */
    private static volatile bxxk f139544e;

    /* renamed from: a */
    public int f139545a;

    /* renamed from: b */
    public int f139546b;

    /* renamed from: c */
    public int f139547c;

    static {
        bpwp bpwp = new bpwp();
        f139543d = bpwp;
        bxvk.m124024a(bpwp.class, bpwp);
    }

    private bpwp() {
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
            return bxvk.m124022a(f139543d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bpwp();
        } else {
            if (i2 == 4) {
                return new bxvd(f139543d);
            }
            if (i2 == 5) {
                return f139543d;
            }
            bxxk bxxk = f139544e;
            if (bxxk == null) {
                synchronized (bpwp.class) {
                    bxxk = f139544e;
                    if (bxxk == null) {
                        bxxk = new bxve(f139543d);
                        f139544e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
