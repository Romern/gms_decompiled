package p000;

/* renamed from: byea */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byea extends bxvk implements bxxd {

    /* renamed from: b */
    public static final byea f165882b;

    /* renamed from: c */
    private static volatile bxxk f165883c;

    /* renamed from: a */
    public cbdv f165884a;

    static {
        byea byea = new byea();
        f165882b = byea;
        bxvk.m124024a(byea.class, byea);
    }

    private byea() {
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
            return bxvk.m124022a(f165882b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"a"});
        } else if (i2 == 3) {
            return new byea();
        } else {
            if (i2 == 4) {
                return new bxvd(f165882b);
            }
            if (i2 == 5) {
                return f165882b;
            }
            bxxk bxxk = f165883c;
            if (bxxk == null) {
                synchronized (byea.class) {
                    bxxk = f165883c;
                    if (bxxk == null) {
                        bxxk = new bxve(f165882b);
                        f165883c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
