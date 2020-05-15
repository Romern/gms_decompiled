package p000;

/* renamed from: bmff */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmff extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bmff f129085e;

    /* renamed from: g */
    private static volatile bxxk f129086g;

    /* renamed from: a */
    public int f129087a;

    /* renamed from: b */
    public bmeb f129088b;

    /* renamed from: c */
    public bxwc f129089c = bxxn.f165040b;

    /* renamed from: d */
    public boolean f129090d = true;

    /* renamed from: f */
    private byte f129091f = 2;

    static {
        bmff bmff = new bmff();
        f129085e = bmff;
        GeneratedMessageLite.m124024a(bmff.class, bmff);
    }

    private bmff() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f129091f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f129091f = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f129085e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0002\u0001ᐉ\u0000\u0002ဇ\u0001\u0004Л", new Object[]{"a", "b", "d", "c", bmfi.class});
        } else if (i2 == 3) {
            return new bmff();
        } else {
            if (i2 == 4) {
                return new bxvd(f129085e);
            }
            if (i2 == 5) {
                return f129085e;
            }
            bxxk bxxk = f129086g;
            if (bxxk == null) {
                synchronized (bmff.class) {
                    bxxk = f129086g;
                    if (bxxk == null) {
                        bxxk = new bxve(f129085e);
                        f129086g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
