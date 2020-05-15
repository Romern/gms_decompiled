package p000;

/* renamed from: blud */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blud extends bxvk implements bxxd {

    /* renamed from: c */
    public static final blud f127787c;

    /* renamed from: d */
    private static volatile bxxk f127788d;

    /* renamed from: a */
    public int f127789a;

    /* renamed from: b */
    public bltz f127790b;

    static {
        blud blud = new blud();
        f127787c = blud;
        bxvk.m124024a(blud.class, blud);
    }

    private blud() {
        bxtx bxtx = bxtx.f164797b;
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
            return bxvk.m124022a(f127787c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new blud();
        } else {
            if (i2 == 4) {
                return new bxvd(f127787c);
            }
            if (i2 == 5) {
                return f127787c;
            }
            bxxk bxxk = f127788d;
            if (bxxk == null) {
                synchronized (blud.class) {
                    bxxk = f127788d;
                    if (bxxk == null) {
                        bxxk = new bxve(f127787c);
                        f127788d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
