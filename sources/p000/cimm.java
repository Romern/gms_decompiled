package p000;

/* renamed from: cimm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cimm extends bxvk implements bxxd {

    /* renamed from: d */
    public static final cimm f190748d;

    /* renamed from: e */
    private static volatile bxxk f190749e;

    /* renamed from: a */
    public int f190750a;

    /* renamed from: b */
    public int f190751b;

    /* renamed from: c */
    public cimn f190752c;

    static {
        cimm cimm = new cimm();
        f190748d = cimm;
        bxvk.m124024a(cimm.class, cimm);
    }

    private cimm() {
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
            return bxvk.m124022a(f190748d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new cimm();
        } else {
            if (i2 == 4) {
                return new bxvd(f190748d);
            }
            if (i2 == 5) {
                return f190748d;
            }
            bxxk bxxk = f190749e;
            if (bxxk == null) {
                synchronized (cimm.class) {
                    bxxk = f190749e;
                    if (bxxk == null) {
                        bxxk = new bxve(f190748d);
                        f190749e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
