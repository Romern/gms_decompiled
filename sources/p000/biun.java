package p000;

/* renamed from: biun */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biun extends bxvk implements bxxd {

    /* renamed from: c */
    public static final biun f121822c;

    /* renamed from: f */
    private static volatile bxxk f121823f;

    /* renamed from: a */
    public int f121824a = 1;

    /* renamed from: b */
    public int f121825b;

    /* renamed from: d */
    private int f121826d;

    /* renamed from: e */
    private byte f121827e = 2;

    static {
        biun biun = new biun();
        f121822c = biun;
        bxvk.m124024a(biun.class, biun);
    }

    private biun() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121827e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121827e = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f121822c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဌ\u0000\u0002ᔄ\u0001", new Object[]{"d", "a", bisf.m102782b(), "b"});
        } else if (i2 == 3) {
            return new biun();
        } else {
            if (i2 == 4) {
                return new bxvd(f121822c);
            }
            if (i2 == 5) {
                return f121822c;
            }
            bxxk bxxk = f121823f;
            if (bxxk == null) {
                synchronized (biun.class) {
                    bxxk = f121823f;
                    if (bxxk == null) {
                        bxxk = new bxve(f121822c);
                        f121823f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
