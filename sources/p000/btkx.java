package p000;

/* renamed from: btkx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btkx extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final btkx f149323f;

    /* renamed from: g */
    private static volatile bxxk f149324g;

    /* renamed from: a */
    public ByteString f149325a = ByteString.f164797b;

    /* renamed from: b */
    public ByteString f149326b = ByteString.f164797b;

    /* renamed from: c */
    public btlv f149327c;

    /* renamed from: d */
    public int f149328d;

    /* renamed from: e */
    public btkw f149329e;

    static {
        btkx btkx = new btkx();
        f149323f = btkx;
        GeneratedMessageLite.m124024a(btkx.class, btkx);
    }

    private btkx() {
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
            return GeneratedMessageLite.m124022a(f149323f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\n\u0002\n\u0003\t\u0004\f\u0005\t", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new btkx();
        } else {
            if (i2 == 4) {
                return new bxvd(f149323f);
            }
            if (i2 == 5) {
                return f149323f;
            }
            bxxk bxxk = f149324g;
            if (bxxk == null) {
                synchronized (btkx.class) {
                    bxxk = f149324g;
                    if (bxxk == null) {
                        bxxk = new bxve(f149323f);
                        f149324g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
