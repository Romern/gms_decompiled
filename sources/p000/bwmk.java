package p000;

/* renamed from: bwmk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwmk extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bwmk f160283b;

    /* renamed from: e */
    private static volatile bxxk f160284e;

    /* renamed from: a */
    public bwzh f160285a;

    /* renamed from: c */
    private int f160286c;

    /* renamed from: d */
    private byte f160287d = 2;

    static {
        bwmk bwmk = new bwmk();
        f160283b = bwmk;
        bxvk.m124024a(bwmk.class, bwmk);
    }

    private bwmk() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f160287d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f160287d = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f160283b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bwmk();
        } else {
            if (i2 == 4) {
                return new bxvd(f160283b);
            }
            if (i2 == 5) {
                return f160283b;
            }
            bxxk bxxk = f160284e;
            if (bxxk == null) {
                synchronized (bwmk.class) {
                    bxxk = f160284e;
                    if (bxxk == null) {
                        bxxk = new bxve(f160283b);
                        f160284e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
