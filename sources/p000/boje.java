package p000;

/* renamed from: boje */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boje extends bxvk implements bxxd {

    /* renamed from: c */
    public static final boje f133263c;

    /* renamed from: d */
    private static volatile bxxk f133264d;

    /* renamed from: a */
    public int f133265a;

    /* renamed from: b */
    public String f133266b = "";

    static {
        boje boje = new boje();
        f133263c = boje;
        bxvk.m124024a(boje.class, boje);
    }

    private boje() {
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
            return bxvk.m124022a(f133263c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0001", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new boje();
        } else {
            if (i2 == 4) {
                return new bxvd(f133263c);
            }
            if (i2 == 5) {
                return f133263c;
            }
            bxxk bxxk = f133264d;
            if (bxxk == null) {
                synchronized (boje.class) {
                    bxxk = f133264d;
                    if (bxxk == null) {
                        bxxk = new bxve(f133263c);
                        f133264d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
