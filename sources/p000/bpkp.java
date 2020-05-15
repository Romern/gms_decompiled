package p000;

/* renamed from: bpkp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpkp extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bpkp f137997e;

    /* renamed from: f */
    private static volatile bxxk f137998f;

    /* renamed from: a */
    public int f137999a;

    /* renamed from: b */
    public bpkj f138000b;

    /* renamed from: c */
    public int f138001c;

    /* renamed from: d */
    public int f138002d;

    static {
        bpkp bpkp = new bpkp();
        f137997e = bpkp;
        bxvk.m124024a(bpkp.class, bpkp);
    }

    private bpkp() {
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
            return bxvk.m124022a(f137997e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003င\u0002", new Object[]{"a", "b", "c", bpko.f137996a, "d"});
        } else if (i2 == 3) {
            return new bpkp();
        } else {
            if (i2 == 4) {
                return new bxvd(f137997e);
            }
            if (i2 == 5) {
                return f137997e;
            }
            bxxk bxxk = f137998f;
            if (bxxk == null) {
                synchronized (bpkp.class) {
                    bxxk = f137998f;
                    if (bxxk == null) {
                        bxxk = new bxve(f137997e);
                        f137998f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
