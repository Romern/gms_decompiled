package p000;

/* renamed from: btpd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btpd extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final btpd f149833c;

    /* renamed from: d */
    private static volatile bxxk f149834d;

    /* renamed from: a */
    public String f149835a = "";

    /* renamed from: b */
    public ByteString f149836b = ByteString.f164797b;

    static {
        btpd btpd = new btpd();
        f149833c = btpd;
        GeneratedMessageLite.m124024a(btpd.class, btpd);
    }

    private btpd() {
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
            return GeneratedMessageLite.m124022a(f149833c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new btpd();
        } else {
            if (i2 == 4) {
                return new bxvd(f149833c);
            }
            if (i2 == 5) {
                return f149833c;
            }
            bxxk bxxk = f149834d;
            if (bxxk == null) {
                synchronized (btpd.class) {
                    bxxk = f149834d;
                    if (bxxk == null) {
                        bxxk = new bxve(f149833c);
                        f149834d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
