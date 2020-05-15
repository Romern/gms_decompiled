package p000;

/* renamed from: actd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class actd extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final actd f60721f;

    /* renamed from: g */
    public static final bxvj f60722g;

    /* renamed from: i */
    private static volatile bxxk f60723i;

    /* renamed from: a */
    public int f60724a;

    /* renamed from: b */
    public caef f60725b;

    /* renamed from: c */
    public actg f60726c;

    /* renamed from: d */
    public cafx f60727d;

    /* renamed from: e */
    public ByteString f60728e = ByteString.f164797b;

    /* renamed from: h */
    private byte f60729h = 2;

    static {
        actd actd = new actd();
        f60721f = actd;
        GeneratedMessageLite.m124024a(actd.class, actd);
        bygn bygn = bygn.f166357a;
        actd actd2 = f60721f;
        f60722g = GeneratedMessageLite.m124006a(bygn, actd2, actd2, 220671791, bxzf.MESSAGE);
    }

    private actd() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f60729h);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f60729h = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f60721f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0003ᐉ\u0002\u0004ည\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new actd();
        } else {
            if (i2 == 4) {
                return new bxvd(f60721f);
            }
            if (i2 == 5) {
                return f60721f;
            }
            bxxk bxxk = f60723i;
            if (bxxk == null) {
                synchronized (actd.class) {
                    bxxk = f60723i;
                    if (bxxk == null) {
                        bxxk = new bxve(f60721f);
                        f60723i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
