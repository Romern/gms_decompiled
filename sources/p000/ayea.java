package p000;

/* renamed from: ayea */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayea extends bxvk implements bxxd {

    /* renamed from: c */
    public static final ayea f97270c;

    /* renamed from: e */
    private static volatile bxxk f97271e;

    /* renamed from: a */
    public int f97272a;

    /* renamed from: b */
    public String f97273b = "";

    /* renamed from: d */
    private byte f97274d = 2;

    static {
        ayea ayea = new ayea();
        f97270c = ayea;
        bxvk.m124024a(ayea.class, ayea);
    }

    private ayea() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f97274d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f97274d = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f97270c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new ayea();
        } else {
            if (i2 == 4) {
                return new bxvd(f97270c);
            }
            if (i2 == 5) {
                return f97270c;
            }
            bxxk bxxk = f97271e;
            if (bxxk == null) {
                synchronized (ayea.class) {
                    bxxk = f97271e;
                    if (bxxk == null) {
                        bxxk = new bxve(f97270c);
                        f97271e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
