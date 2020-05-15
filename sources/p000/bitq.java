package p000;

/* renamed from: bitq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bitq extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bitq f121696d;

    /* renamed from: f */
    private static volatile bxxk f121697f;

    /* renamed from: a */
    public int f121698a;

    /* renamed from: b */
    public long f121699b;

    /* renamed from: c */
    public ByteString f121700c = ByteString.f164797b;

    /* renamed from: e */
    private byte f121701e = 2;

    static {
        bitq bitq = new bitq();
        f121696d = bitq;
        GeneratedMessageLite.m124024a(bitq.class, bitq);
    }

    private bitq() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121701e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121701e = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f121696d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔂ\u0000\u0002ည\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bitq();
        } else {
            if (i2 == 4) {
                return new bxvd(f121696d);
            }
            if (i2 == 5) {
                return f121696d;
            }
            bxxk bxxk = f121697f;
            if (bxxk == null) {
                synchronized (bitq.class) {
                    bxxk = f121697f;
                    if (bxxk == null) {
                        bxxk = new bxve(f121696d);
                        f121697f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
