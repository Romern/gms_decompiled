package p000;

/* renamed from: byti */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byti extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final byti f167671d;

    /* renamed from: f */
    private static volatile bxxk f167672f;

    /* renamed from: a */
    public int f167673a;

    /* renamed from: b */
    public ByteString f167674b = ByteString.f164797b;

    /* renamed from: c */
    public ByteString f167675c = ByteString.f164797b;

    /* renamed from: e */
    private byte f167676e = 2;

    static {
        byti byti = new byti();
        f167671d = byti;
        GeneratedMessageLite.m124024a(byti.class, byti);
    }

    private byti() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f167676e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f167676e = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f167671d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔊ\u0000\u0002ᔊ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new byti();
        } else {
            if (i2 == 4) {
                return new bxvd(f167671d);
            }
            if (i2 == 5) {
                return f167671d;
            }
            bxxk bxxk = f167672f;
            if (bxxk == null) {
                synchronized (byti.class) {
                    bxxk = f167672f;
                    if (bxxk == null) {
                        bxxk = new bxve(f167671d);
                        f167672f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
