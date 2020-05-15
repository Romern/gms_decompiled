package p000;

/* renamed from: bysy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bysy extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bysy f167632d;

    /* renamed from: f */
    private static volatile bxxk f167633f;

    /* renamed from: a */
    public int f167634a;

    /* renamed from: b */
    public ByteString f167635b = ByteString.f164797b;

    /* renamed from: c */
    public ByteString f167636c = ByteString.f164797b;

    /* renamed from: e */
    private byte f167637e = 2;

    static {
        bysy bysy = new bysy();
        f167632d = bysy;
        GeneratedMessageLite.m124024a(bysy.class, bysy);
    }

    private bysy() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f167637e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f167637e = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f167632d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔊ\u0000\u0002ᔊ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bysy();
        } else {
            if (i2 == 4) {
                return new bxvd(f167632d);
            }
            if (i2 == 5) {
                return f167632d;
            }
            bxxk bxxk = f167633f;
            if (bxxk == null) {
                synchronized (bysy.class) {
                    bxxk = f167633f;
                    if (bxxk == null) {
                        bxxk = new bxve(f167632d);
                        f167633f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
