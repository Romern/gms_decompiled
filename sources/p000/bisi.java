package p000;

/* renamed from: bisi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bisi extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bisi f121563d;

    /* renamed from: f */
    private static volatile bxxk f121564f;

    /* renamed from: a */
    public int f121565a;

    /* renamed from: b */
    public int f121566b;

    /* renamed from: c */
    public boolean f121567c;

    /* renamed from: e */
    private byte f121568e = 2;

    static {
        bisi bisi = new bisi();
        f121563d = bisi;
        bxvk.m124024a(bisi.class, bisi);
    }

    private bisi() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121568e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121568e = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f121563d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001င\u0000\u0002ᔇ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bisi();
        } else {
            if (i2 == 4) {
                return new bxvd(f121563d);
            }
            if (i2 == 5) {
                return f121563d;
            }
            bxxk bxxk = f121564f;
            if (bxxk == null) {
                synchronized (bisi.class) {
                    bxxk = f121564f;
                    if (bxxk == null) {
                        bxxk = new bxve(f121563d);
                        f121564f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
