package p000;

/* renamed from: ime */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1082ime extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final C1082ime f21351g;

    /* renamed from: h */
    private static volatile bxxk f21352h;

    /* renamed from: a */
    public int f21353a;

    /* renamed from: b */
    public int f21354b;

    /* renamed from: c */
    public int f21355c;

    /* renamed from: d */
    public ByteString f21356d = ByteString.f164797b;

    /* renamed from: e */
    public bxwc f21357e = bxxn.f165040b;

    /* renamed from: f */
    public boolean f21358f;

    static {
        C1082ime ime = new C1082ime();
        f21351g = ime;
        GeneratedMessageLite.m124024a(C1082ime.class, ime);
    }

    private C1082ime() {
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
            return GeneratedMessageLite.m124022a(f21351g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003ည\u0002\u0004\u001c\u0005ဇ\u0003", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new C1082ime();
        } else {
            if (i2 == 4) {
                return new bxvd(f21351g);
            }
            if (i2 == 5) {
                return f21351g;
            }
            bxxk bxxk = f21352h;
            if (bxxk == null) {
                synchronized (C1082ime.class) {
                    bxxk = f21352h;
                    if (bxxk == null) {
                        bxxk = new bxve(f21351g);
                        f21352h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
