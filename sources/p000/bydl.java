package p000;

/* renamed from: bydl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bydl extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bydl f165798a;

    /* renamed from: e */
    private static volatile bxxk f165799e;

    /* renamed from: b */
    private int f165800b;

    /* renamed from: c */
    private String f165801c = "";

    /* renamed from: d */
    private byte f165802d = 2;

    static {
        bydl bydl = new bydl();
        f165798a = bydl;
        bxvk.m124024a(bydl.class, bydl);
    }

    private bydl() {
        bxtx bxtx = bxtx.f164797b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f165802d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f165802d = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f165798a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔈ\u0000", new Object[]{"b", "c"});
        } else if (i2 == 3) {
            return new bydl();
        } else {
            if (i2 == 4) {
                return new bxvd(f165798a);
            }
            if (i2 == 5) {
                return f165798a;
            }
            bxxk bxxk = f165799e;
            if (bxxk == null) {
                synchronized (bydl.class) {
                    bxxk = f165799e;
                    if (bxxk == null) {
                        bxxk = new bxve(f165798a);
                        f165799e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
