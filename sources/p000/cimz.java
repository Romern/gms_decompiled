package p000;

/* renamed from: cimz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cimz extends bxvg implements bxvh {

    /* renamed from: c */
    public static final cimz f190878c;

    /* renamed from: e */
    private static volatile bxxk f190879e;

    /* renamed from: a */
    public int f190880a;

    /* renamed from: b */
    public zzq f190881b;

    /* renamed from: d */
    private byte f190882d = 2;

    static {
        cimz cimz = new cimz();
        f190878c = cimz;
        bxvk.m124024a(cimz.class, cimz);
    }

    private cimz() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f190882d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f190882d = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f190878c, "\u0001\u0001\u0000\u0001\b\b\u0001\u0000\u0000\u0000\bဉ\u0005", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new cimz();
        } else {
            if (i2 == 4) {
                return new bxvf(f190878c);
            }
            if (i2 == 5) {
                return f190878c;
            }
            bxxk bxxk = f190879e;
            if (bxxk == null) {
                synchronized (cimz.class) {
                    bxxk = f190879e;
                    if (bxxk == null) {
                        bxxk = new bxve(f190878c);
                        f190879e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
