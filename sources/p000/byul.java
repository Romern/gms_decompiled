package p000;

/* renamed from: byul */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byul extends bxvk implements bxxd {

    /* renamed from: d */
    public static final byul f168303d;

    /* renamed from: e */
    private static volatile bxxk f168304e;

    /* renamed from: a */
    public int f168305a;

    /* renamed from: b */
    public long f168306b;

    /* renamed from: c */
    public long f168307c;

    static {
        byul byul = new byul();
        f168303d = byul;
        bxvk.m124024a(byul.class, byul);
    }

    private byul() {
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
            return bxvk.m124022a(f168303d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001စ\u0000\u0002စ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new byul();
        } else {
            if (i2 == 4) {
                return new bxvd(f168303d);
            }
            if (i2 == 5) {
                return f168303d;
            }
            bxxk bxxk = f168304e;
            if (bxxk == null) {
                synchronized (byul.class) {
                    bxxk = f168304e;
                    if (bxxk == null) {
                        bxxk = new bxve(f168303d);
                        f168304e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}