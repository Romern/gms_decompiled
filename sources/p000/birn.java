package p000;

/* renamed from: birn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class birn extends bxvk implements bxxd {

    /* renamed from: b */
    public static final birn f121428b;

    /* renamed from: e */
    private static volatile bxxk f121429e;

    /* renamed from: a */
    public int f121430a;

    /* renamed from: c */
    private int f121431c;

    /* renamed from: d */
    private byte f121432d = 2;

    static {
        birn birn = new birn();
        f121428b = birn;
        bxvk.m124024a(birn.class, birn);
    }

    private birn() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121432d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121432d = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f121428b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔄ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new birn();
        } else {
            if (i2 == 4) {
                return new bxvd(f121428b);
            }
            if (i2 == 5) {
                return f121428b;
            }
            bxxk bxxk = f121429e;
            if (bxxk == null) {
                synchronized (birn.class) {
                    bxxk = f121429e;
                    if (bxxk == null) {
                        bxxk = new bxve(f121428b);
                        f121429e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
