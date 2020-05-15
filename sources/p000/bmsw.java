package p000;

/* renamed from: bmsw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmsw extends GeneratedMessageLite implements bxxd {

    /* renamed from: r */
    public static final bmsw f130761r;

    /* renamed from: s */
    private static volatile bxxk f130762s;

    /* renamed from: a */
    public ByteString f130763a = ByteString.f164797b;

    /* renamed from: b */
    public int f130764b;

    /* renamed from: c */
    public ByteString f130765c = ByteString.f164797b;

    /* renamed from: d */
    public ByteString f130766d = ByteString.f164797b;

    /* renamed from: e */
    public ByteString f130767e = ByteString.f164797b;

    /* renamed from: f */
    public ByteString f130768f = ByteString.f164797b;

    /* renamed from: g */
    public ByteString f130769g = ByteString.f164797b;

    /* renamed from: h */
    public ByteString f130770h = ByteString.f164797b;

    /* renamed from: i */
    public ByteString f130771i = ByteString.f164797b;

    /* renamed from: j */
    public ByteString f130772j = ByteString.f164797b;

    /* renamed from: k */
    public ByteString f130773k = ByteString.f164797b;

    /* renamed from: l */
    public ByteString f130774l = ByteString.f164797b;

    /* renamed from: m */
    public ByteString f130775m = ByteString.f164797b;

    /* renamed from: n */
    public bmsu f130776n;

    /* renamed from: o */
    public ByteString f130777o = ByteString.f164797b;

    /* renamed from: p */
    public ByteString f130778p = ByteString.f164797b;

    /* renamed from: q */
    public bxwc f130779q = bxxn.f165040b;

    static {
        bmsw bmsw = new bmsw();
        f130761r = bmsw;
        GeneratedMessageLite.m124024a(bmsw.class, bmsw);
    }

    private bmsw() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 1) {
            return null;
        }
        if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f130761r, "\u0000\u0011\u0000\u0000\u0001\u0011\u0011\u0000\u0001\u0000\u0001\u0004\u0002\n\u0003\n\u0004\n\u0005\n\u0006\n\u0007\n\b\n\t\n\n\n\u000b\n\f\n\r\t\u000e\n\u000f\n\u0010\u001b\u0011\n", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", bmsv.class, "a"});
        } else if (i2 == 3) {
            return new bmsw();
        } else {
            if (i2 == 4) {
                return new bxvd(f130761r);
            }
            if (i2 == 5) {
                return f130761r;
            }
            bxxk bxxk = f130762s;
            if (bxxk == null) {
                synchronized (bmsw.class) {
                    bxxk = f130762s;
                    if (bxxk == null) {
                        bxxk = new bxve(f130761r);
                        f130762s = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
