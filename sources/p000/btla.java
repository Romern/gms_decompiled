package p000;

/* renamed from: btla */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btla extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final btla f149333d;

    /* renamed from: e */
    private static volatile bxxk f149334e;

    /* renamed from: a */
    public int f149335a = 0;

    /* renamed from: b */
    public Object f149336b;

    /* renamed from: c */
    public ByteString f149337c = ByteString.f164797b;

    static {
        btla btla = new btla();
        f149333d = btla;
        GeneratedMessageLite.m124024a(btla.class, btla);
    }

    private btla() {
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
            return GeneratedMessageLite.m124022a(f149333d, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\n\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"b", "a", "c", btkv.class, btkx.class, btkz.class, btku.class});
        } else if (i2 == 3) {
            return new btla();
        } else {
            if (i2 == 4) {
                return new bxvd(f149333d);
            }
            if (i2 == 5) {
                return f149333d;
            }
            bxxk bxxk = f149334e;
            if (bxxk == null) {
                synchronized (btla.class) {
                    bxxk = f149334e;
                    if (bxxk == null) {
                        bxxk = new bxve(f149333d);
                        f149334e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
