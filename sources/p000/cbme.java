package p000;

/* renamed from: cbme */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbme extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final cbme f177607c;

    /* renamed from: d */
    private static volatile bxxk f177608d;

    /* renamed from: a */
    public ByteString f177609a = ByteString.f164797b;

    /* renamed from: b */
    public String f177610b = "";

    static {
        cbme cbme = new cbme();
        f177607c = cbme;
        GeneratedMessageLite.m124024a(cbme.class, cbme);
    }

    private cbme() {
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
            return GeneratedMessageLite.m124022a(f177607c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002Ȉ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new cbme();
        } else {
            if (i2 == 4) {
                return new bxvd(f177607c);
            }
            if (i2 == 5) {
                return f177607c;
            }
            bxxk bxxk = f177608d;
            if (bxxk == null) {
                synchronized (cbme.class) {
                    bxxk = f177608d;
                    if (bxxk == null) {
                        bxxk = new bxve(f177607c);
                        f177608d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
