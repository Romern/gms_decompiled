package p000;

/* renamed from: zxj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zxj extends bxvk implements bxxd {

    /* renamed from: c */
    public static final zxj f56108c;

    /* renamed from: e */
    private static volatile bxxk f56109e;

    /* renamed from: a */
    public int f56110a;

    /* renamed from: b */
    public int f56111b;

    /* renamed from: d */
    private int f56112d;

    static {
        zxj zxj = new zxj();
        f56108c = zxj;
        bxvk.m124024a(zxj.class, zxj);
    }

    private zxj() {
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
            return bxvk.m124022a(f56108c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new zxj();
        } else {
            if (i2 == 4) {
                return new bxvd(f56108c);
            }
            if (i2 == 5) {
                return f56108c;
            }
            bxxk bxxk = f56109e;
            if (bxxk == null) {
                synchronized (zxj.class) {
                    bxxk = f56109e;
                    if (bxxk == null) {
                        bxxk = new bxve(f56108c);
                        f56109e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
