package p000;

/* renamed from: btjx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btjx extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final btjx f149192h;

    /* renamed from: i */
    private static volatile bxxk f149193i;

    /* renamed from: a */
    public int f149194a = 0;

    /* renamed from: b */
    public Object f149195b;

    /* renamed from: c */
    public ByteString f149196c = ByteString.f164797b;

    /* renamed from: d */
    public int f149197d;

    /* renamed from: e */
    public String f149198e = "";

    /* renamed from: f */
    public String f149199f = "";

    /* renamed from: g */
    public boolean f149200g;

    static {
        btjx btjx = new btjx();
        f149192h = btjx;
        GeneratedMessageLite.m124024a(btjx.class, btjx);
    }

    private btjx() {
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
            return GeneratedMessageLite.m124022a(f149192h, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\n\u0002\f\u0003Ȉ\u0004Ȉ\u0005<\u0000\u0006\u0007\u0007<\u0000", new Object[]{"b", "a", "c", "d", "e", "f", btka.class, "g", btln.class});
        } else if (i2 == 3) {
            return new btjx();
        } else {
            if (i2 == 4) {
                return new bxvd(f149192h);
            }
            if (i2 == 5) {
                return f149192h;
            }
            bxxk bxxk = f149193i;
            if (bxxk == null) {
                synchronized (btjx.class) {
                    bxxk = f149193i;
                    if (bxxk == null) {
                        bxxk = new bxve(f149192h);
                        f149193i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
