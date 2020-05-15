package p000;

/* renamed from: bzcb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzcb extends bxvg implements bxvh {

    /* renamed from: b */
    public static final bzcb f169293b;

    /* renamed from: d */
    private static volatile bxxk f169294d;

    /* renamed from: a */
    public bxwc f169295a = bxxn.f165040b;

    /* renamed from: c */
    private byte f169296c = 2;

    static {
        bzcb bzcb = new bzcb();
        f169293b = bzcb;
        bxvk.m124024a(bzcb.class, bzcb);
    }

    private bzcb() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f169296c);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f169296c = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f169293b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", byzo.class});
        } else if (i2 == 3) {
            return new bzcb();
        } else {
            if (i2 == 4) {
                return new bxvf(f169293b);
            }
            if (i2 == 5) {
                return f169293b;
            }
            bxxk bxxk = f169294d;
            if (bxxk == null) {
                synchronized (bzcb.class) {
                    bxxk = f169294d;
                    if (bxxk == null) {
                        bxxk = new bxve(f169293b);
                        f169294d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
