package p000;

/* renamed from: bpkj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpkj extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bpkj f137973d;

    /* renamed from: e */
    private static volatile bxxk f137974e;

    /* renamed from: a */
    public int f137975a;

    /* renamed from: b */
    public long f137976b;

    /* renamed from: c */
    public int f137977c;

    static {
        bpkj bpkj = new bpkj();
        f137973d = bpkj;
        bxvk.m124024a(bpkj.class, bpkj);
    }

    private bpkj() {
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
            return bxvk.m124022a(f137973d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bpkj();
        } else {
            if (i2 == 4) {
                return new bxvd(f137973d);
            }
            if (i2 == 5) {
                return f137973d;
            }
            bxxk bxxk = f137974e;
            if (bxxk == null) {
                synchronized (bpkj.class) {
                    bxxk = f137974e;
                    if (bxxk == null) {
                        bxxk = new bxve(f137973d);
                        f137974e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
