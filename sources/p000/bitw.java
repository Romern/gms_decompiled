package p000;

/* renamed from: bitw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bitw extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bitw f121727d;

    /* renamed from: f */
    private static volatile bxxk f121728f;

    /* renamed from: a */
    public int f121729a;

    /* renamed from: b */
    public int f121730b = 1;

    /* renamed from: c */
    public boolean f121731c;

    /* renamed from: e */
    private byte f121732e = 2;

    static {
        bitw bitw = new bitw();
        f121727d = bitw;
        GeneratedMessageLite.m124024a(bitw.class, bitw);
    }

    private bitw() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121732e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121732e = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f121727d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဌ\u0000\u0002ᔇ\u0001", new Object[]{"a", "b", bisf.m102782b(), "c"});
        } else if (i2 == 3) {
            return new bitw();
        } else {
            if (i2 == 4) {
                return new bxvd(f121727d);
            }
            if (i2 == 5) {
                return f121727d;
            }
            bxxk bxxk = f121728f;
            if (bxxk == null) {
                synchronized (bitw.class) {
                    bxxk = f121728f;
                    if (bxxk == null) {
                        bxxk = new bxve(f121727d);
                        f121728f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
