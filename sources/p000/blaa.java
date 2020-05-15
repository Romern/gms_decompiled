package p000;

/* renamed from: blaa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blaa extends bxvk implements bxxd {

    /* renamed from: a */
    public static final blaa f125724a;

    /* renamed from: f */
    private static volatile bxxk f125725f;

    /* renamed from: b */
    private int f125726b;

    /* renamed from: c */
    private int f125727c;

    /* renamed from: d */
    private int f125728d;

    /* renamed from: e */
    private byte f125729e = 2;

    static {
        blaa blaa = new blaa();
        f125724a = blaa;
        bxvk.m124024a(blaa.class, blaa);
    }

    private blaa() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f125729e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f125729e = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f125724a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔌ\u0000\u0002ᔌ\u0001", new Object[]{"b", "c", blfv.f126412a, "d", blfw.f126413a});
        } else if (i2 == 3) {
            return new blaa();
        } else {
            if (i2 == 4) {
                return new bxvd(f125724a);
            }
            if (i2 == 5) {
                return f125724a;
            }
            bxxk bxxk = f125725f;
            if (bxxk == null) {
                synchronized (blaa.class) {
                    bxxk = f125725f;
                    if (bxxk == null) {
                        bxxk = new bxve(f125724a);
                        f125725f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
