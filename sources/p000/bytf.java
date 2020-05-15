package p000;

/* renamed from: bytf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bytf extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bytf f167664d;

    /* renamed from: f */
    private static volatile bxxk f167665f;

    /* renamed from: a */
    public int f167666a;

    /* renamed from: b */
    public ByteString f167667b = ByteString.f164797b;

    /* renamed from: c */
    public ByteString f167668c = ByteString.f164797b;

    /* renamed from: e */
    private byte f167669e = 2;

    static {
        bytf bytf = new bytf();
        f167664d = bytf;
        GeneratedMessageLite.m124024a(bytf.class, bytf);
    }

    private bytf() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f167669e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f167669e = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f167664d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔊ\u0000\u0002ᔊ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bytf();
        } else {
            if (i2 == 4) {
                return new bxvd(f167664d);
            }
            if (i2 == 5) {
                return f167664d;
            }
            bxxk bxxk = f167665f;
            if (bxxk == null) {
                synchronized (bytf.class) {
                    bxxk = f167665f;
                    if (bxxk == null) {
                        bxxk = new bxve(f167664d);
                        f167665f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
