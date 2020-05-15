package p000;

/* renamed from: bomi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bomi extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bomi f133655b;

    /* renamed from: d */
    private static volatile bxxk f133656d;

    /* renamed from: a */
    public bxwc f133657a = bxxn.f165040b;

    /* renamed from: c */
    private byte f133658c = 2;

    static {
        bomi bomi = new bomi();
        f133655b = bomi;
        bxvk.m124024a(bomi.class, bomi);
    }

    private bomi() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f133658c);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f133658c = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f133655b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", bomg.class});
        } else if (i2 == 3) {
            return new bomi();
        } else {
            if (i2 == 4) {
                return new bomh();
            }
            if (i2 == 5) {
                return f133655b;
            }
            bxxk bxxk = f133656d;
            if (bxxk == null) {
                synchronized (bomi.class) {
                    bxxk = f133656d;
                    if (bxxk == null) {
                        bxxk = new bxve(f133655b);
                        f133656d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
