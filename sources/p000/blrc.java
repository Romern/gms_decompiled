package p000;

/* renamed from: blrc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blrc extends bxvk implements bxxd {

    /* renamed from: c */
    public static final blrc f127432c;

    /* renamed from: d */
    private static volatile bxxk f127433d;

    /* renamed from: a */
    public int f127434a;

    /* renamed from: b */
    public blrk f127435b;

    static {
        blrc blrc = new blrc();
        f127432c = blrc;
        bxvk.m124024a(blrc.class, blrc);
    }

    private blrc() {
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
            return bxvk.m124022a(f127432c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new blrc();
        } else {
            if (i2 == 4) {
                return new bxvd(f127432c);
            }
            if (i2 == 5) {
                return f127432c;
            }
            bxxk bxxk = f127433d;
            if (bxxk == null) {
                synchronized (blrc.class) {
                    bxxk = f127433d;
                    if (bxxk == null) {
                        bxxk = new bxve(f127432c);
                        f127433d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
