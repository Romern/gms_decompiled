package p000;

/* renamed from: zzl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zzl extends bxvk implements bxxd {

    /* renamed from: c */
    public static final zzl f56302c;

    /* renamed from: d */
    private static volatile bxxk f56303d;

    /* renamed from: a */
    public int f56304a;

    /* renamed from: b */
    public int f56305b;

    static {
        zzl zzl = new zzl();
        f56302c = zzl;
        bxvk.m124024a(zzl.class, zzl);
    }

    private zzl() {
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
            return bxvk.m124022a(f56302c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new zzl();
        } else {
            if (i2 == 4) {
                return new bxvd(f56302c);
            }
            if (i2 == 5) {
                return f56302c;
            }
            bxxk bxxk = f56303d;
            if (bxxk == null) {
                synchronized (zzl.class) {
                    bxxk = f56303d;
                    if (bxxk == null) {
                        bxxk = new bxve(f56302c);
                        f56303d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
