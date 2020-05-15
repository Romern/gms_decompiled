package p000;

/* renamed from: bitp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bitp extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bitp f121689e;

    /* renamed from: g */
    private static volatile bxxk f121690g;

    /* renamed from: a */
    public int f121691a;

    /* renamed from: b */
    public long f121692b;

    /* renamed from: c */
    public boolean f121693c;

    /* renamed from: d */
    public ByteString f121694d = ByteString.f164797b;

    /* renamed from: f */
    private byte f121695f = 2;

    static {
        bitp bitp = new bitp();
        f121689e = bitp;
        GeneratedMessageLite.m124024a(bitp.class, bitp);
    }

    private bitp() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121695f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121695f = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f121689e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᔂ\u0000\u0002ဇ\u0001\u0003ည\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bitp();
        } else {
            if (i2 == 4) {
                return new bxvd(f121689e);
            }
            if (i2 == 5) {
                return f121689e;
            }
            bxxk bxxk = f121690g;
            if (bxxk == null) {
                synchronized (bitp.class) {
                    bxxk = f121690g;
                    if (bxxk == null) {
                        bxxk = new bxve(f121689e);
                        f121690g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
