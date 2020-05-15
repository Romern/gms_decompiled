package p000;

/* renamed from: bmfc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmfc extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bmfc f129065e;

    /* renamed from: f */
    private static volatile bxxk f129066f;

    /* renamed from: a */
    public int f129067a;

    /* renamed from: b */
    public String f129068b = "";

    /* renamed from: c */
    public ByteString f129069c = ByteString.f164797b;

    /* renamed from: d */
    public bxwc f129070d = bxxn.f165040b;

    static {
        bmfc bmfc = new bmfc();
        f129065e = bmfc;
        GeneratedMessageLite.m124024a(bmfc.class, bmfc);
    }

    private bmfc() {
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
            return GeneratedMessageLite.m124022a(f129065e, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ည\u0001\u0006\u001c", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bmfc();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][][]) null, (float[][][]) null);
            }
            if (i2 == 5) {
                return f129065e;
            }
            bxxk bxxk = f129066f;
            if (bxxk == null) {
                synchronized (bmfc.class) {
                    bxxk = f129066f;
                    if (bxxk == null) {
                        bxxk = new bxve(f129065e);
                        f129066f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
