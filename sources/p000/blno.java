package p000;

/* renamed from: blno */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blno extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final blno f127009d;

    /* renamed from: f */
    private static volatile bxxk f127010f;

    /* renamed from: a */
    public int f127011a;

    /* renamed from: b */
    public String f127012b = "";

    /* renamed from: c */
    public blnn f127013c;

    /* renamed from: e */
    private byte f127014e = 2;

    static {
        blno blno = new blno();
        f127009d = blno;
        GeneratedMessageLite.m124024a(blno.class, blno);
    }

    private blno() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f127014e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f127014e = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f127009d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0001\u0002ဈ\u0001\u0003ᐉ\u0002", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new blno();
        } else {
            if (i2 == 4) {
                return new bxvd(f127009d);
            }
            if (i2 == 5) {
                return f127009d;
            }
            bxxk bxxk = f127010f;
            if (bxxk == null) {
                synchronized (blno.class) {
                    bxxk = f127010f;
                    if (bxxk == null) {
                        bxxk = new bxve(f127009d);
                        f127010f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
