package p000;

/* renamed from: blbu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blbu extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final blbu f125867b;

    /* renamed from: d */
    private static volatile bxxk f125868d;

    /* renamed from: a */
    public bxwc f125869a = bxxn.f165040b;

    /* renamed from: c */
    private byte f125870c = 2;

    static {
        blbu blbu = new blbu();
        f125867b = blbu;
        GeneratedMessageLite.m124024a(blbu.class, blbu);
    }

    private blbu() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f125870c);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f125870c = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f125867b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0001\u0002Л", new Object[]{"a", blby.class});
        } else if (i2 == 3) {
            return new blbu();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][][]) null, (char[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f125867b;
            }
            bxxk bxxk = f125868d;
            if (bxxk == null) {
                synchronized (blbu.class) {
                    bxxk = f125868d;
                    if (bxxk == null) {
                        bxxk = new bxve(f125867b);
                        f125868d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
