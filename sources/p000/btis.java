package p000;

/* renamed from: btis */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btis extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final btis f149029f;

    /* renamed from: g */
    private static volatile bxxk f149030g;

    /* renamed from: a */
    public btiv f149031a;

    /* renamed from: b */
    public btiu f149032b;

    /* renamed from: c */
    public long f149033c;

    /* renamed from: d */
    public ByteString f149034d = ByteString.f164797b;

    /* renamed from: e */
    public btio f149035e;

    static {
        btis btis = new btis();
        f149029f = btis;
        GeneratedMessageLite.m124024a(btis.class, btis);
    }

    private btis() {
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
            return GeneratedMessageLite.m124022a(f149029f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\t\u0002\t\u0003\n\u0004\u0002\u0005\t", new Object[]{"a", "b", "d", "c", "e"});
        } else if (i2 == 3) {
            return new btis();
        } else {
            if (i2 == 4) {
                return new bxvd(f149029f);
            }
            if (i2 == 5) {
                return f149029f;
            }
            bxxk bxxk = f149030g;
            if (bxxk == null) {
                synchronized (btis.class) {
                    bxxk = f149030g;
                    if (bxxk == null) {
                        bxxk = new bxve(f149029f);
                        f149030g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
