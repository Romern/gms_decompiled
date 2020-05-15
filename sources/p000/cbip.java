package p000;

/* renamed from: cbip */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbip extends bxvk implements bxxd {

    /* renamed from: c */
    public static final cbip f177281c;

    /* renamed from: d */
    private static volatile bxxk f177282d;

    /* renamed from: a */
    public cbhu f177283a;

    /* renamed from: b */
    public String f177284b = "";

    static {
        cbip cbip = new cbip();
        f177281c = cbip;
        bxvk.m124024a(cbip.class, cbip);
    }

    private cbip() {
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
            return bxvk.m124022a(f177281c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002Ȉ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new cbip();
        } else {
            if (i2 == 4) {
                return new bxvd(f177281c);
            }
            if (i2 == 5) {
                return f177281c;
            }
            bxxk bxxk = f177282d;
            if (bxxk == null) {
                synchronized (cbip.class) {
                    bxxk = f177282d;
                    if (bxxk == null) {
                        bxxk = new bxve(f177281c);
                        f177282d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
