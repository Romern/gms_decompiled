package p000;

/* renamed from: btet */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btet extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final btet f148559h;

    /* renamed from: i */
    private static volatile bxxk f148560i;

    /* renamed from: a */
    public int f148561a;

    /* renamed from: b */
    public String f148562b = "";

    /* renamed from: c */
    public ByteString f148563c = ByteString.f164797b;

    /* renamed from: d */
    public btea f148564d;

    /* renamed from: e */
    public bldz f148565e;

    /* renamed from: f */
    public btcz f148566f;

    /* renamed from: g */
    public int f148567g;

    static {
        btet btet = new btet();
        f148559h = btet;
        GeneratedMessageLite.m124024a(btet.class, btet);
    }

    private btet() {
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
            return GeneratedMessageLite.m124022a(f148559h, "\u0000\u0007\u0000\u0000\u0001\n\u0007\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003\f\u0005\n\u0006\t\b\t\n\t", new Object[]{"a", "b", "g", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new btet();
        } else {
            if (i2 == 4) {
                return new bxvd(f148559h);
            }
            if (i2 == 5) {
                return f148559h;
            }
            bxxk bxxk = f148560i;
            if (bxxk == null) {
                synchronized (btet.class) {
                    bxxk = f148560i;
                    if (bxxk == null) {
                        bxxk = new bxve(f148559h);
                        f148560i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
