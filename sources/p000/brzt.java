package p000;

/* renamed from: brzt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brzt extends bxvk implements bxxd {

    /* renamed from: d */
    public static final brzt f143787d;

    /* renamed from: e */
    private static volatile bxxk f143788e;

    /* renamed from: a */
    public int f143789a;

    /* renamed from: b */
    public String f143790b = "";

    /* renamed from: c */
    public String f143791c = "";

    static {
        brzt brzt = new brzt();
        f143787d = brzt;
        bxvk.m124024a(brzt.class, brzt);
    }

    private brzt() {
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
            return bxvk.m124022a(f143787d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new brzt();
        } else {
            if (i2 == 4) {
                return new bxvd(f143787d);
            }
            if (i2 == 5) {
                return f143787d;
            }
            bxxk bxxk = f143788e;
            if (bxxk == null) {
                synchronized (brzt.class) {
                    bxxk = f143788e;
                    if (bxxk == null) {
                        bxxk = new bxve(f143787d);
                        f143788e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
