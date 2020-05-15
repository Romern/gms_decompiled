package p000;

/* renamed from: bgvk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgvk extends bxvk implements bxxd {

    /* renamed from: i */
    public static final bgvk f117667i;

    /* renamed from: j */
    private static volatile bxxk f117668j;

    /* renamed from: a */
    public int f117669a;

    /* renamed from: b */
    public boolean f117670b = true;

    /* renamed from: c */
    public boolean f117671c;

    /* renamed from: d */
    public boolean f117672d;

    /* renamed from: e */
    public boolean f117673e;

    /* renamed from: f */
    public boolean f117674f;

    /* renamed from: g */
    public boolean f117675g;

    /* renamed from: h */
    public boolean f117676h;

    static {
        bgvk bgvk = new bgvk();
        f117667i = bgvk;
        bxvk.m124024a(bgvk.class, bgvk);
    }

    private bgvk() {
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
            return bxvk.m124022a(f117667i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new bgvk();
        } else {
            if (i2 == 4) {
                return new bxvd(f117667i);
            }
            if (i2 == 5) {
                return f117667i;
            }
            bxxk bxxk = f117668j;
            if (bxxk == null) {
                synchronized (bgvk.class) {
                    bxxk = f117668j;
                    if (bxxk == null) {
                        bxxk = new bxve(f117667i);
                        f117668j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
