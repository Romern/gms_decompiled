package p000;

/* renamed from: bwzf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwzf extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bwzf f161591f;

    /* renamed from: h */
    private static volatile bxxk f161592h;

    /* renamed from: a */
    public int f161593a;

    /* renamed from: b */
    public bwmg f161594b;

    /* renamed from: c */
    public bwyw f161595c;

    /* renamed from: d */
    public ByteString f161596d = ByteString.f164797b;

    /* renamed from: e */
    public ByteString f161597e = ByteString.f164797b;

    /* renamed from: g */
    private byte f161598g = 2;

    static {
        bwzf bwzf = new bwzf();
        f161591f = bwzf;
        GeneratedMessageLite.m124024a(bwzf.class, bwzf);
    }

    private bwzf() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f161598g);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f161598g = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f161591f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ည\u0002\u0003ည\u0003\u0004ᐉ\u0001", new Object[]{"a", "b", "d", "e", "c"});
        } else if (i2 == 3) {
            return new bwzf();
        } else {
            if (i2 == 4) {
                return new bxvd(f161591f);
            }
            if (i2 == 5) {
                return f161591f;
            }
            bxxk bxxk = f161592h;
            if (bxxk == null) {
                synchronized (bwzf.class) {
                    bxxk = f161592h;
                    if (bxxk == null) {
                        bxxk = new bxve(f161591f);
                        f161592h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
