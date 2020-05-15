package p000;

/* renamed from: byrj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byrj extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final byrj f167479e;

    /* renamed from: g */
    private static volatile bxxk f167480g;

    /* renamed from: a */
    public int f167481a;

    /* renamed from: b */
    public int f167482b = 1;

    /* renamed from: c */
    public ByteString f167483c = ByteString.f164797b;

    /* renamed from: d */
    public ByteString f167484d = ByteString.f164797b;

    /* renamed from: f */
    private byte f167485f = 2;

    static {
        byrj byrj = new byrj();
        f167479e = byrj;
        GeneratedMessageLite.m124024a(byrj.class, byrj);
    }

    private byrj() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f167485f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f167485f = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f167479e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔌ\u0000\u0002ᔊ\u0001\u0003ᔊ\u0002", new Object[]{"a", "b", byrh.f167473a, "c", "d"});
        } else if (i2 == 3) {
            return new byrj();
        } else {
            if (i2 == 4) {
                return new bxvd(f167479e);
            }
            if (i2 == 5) {
                return f167479e;
            }
            bxxk bxxk = f167480g;
            if (bxxk == null) {
                synchronized (byrj.class) {
                    bxxk = f167480g;
                    if (bxxk == null) {
                        bxxk = new bxve(f167479e);
                        f167480g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
