package p000;

/* renamed from: ltr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ltr extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final ltr f32982d;

    /* renamed from: f */
    private static volatile bxxk f32983f;

    /* renamed from: a */
    public int f32984a;

    /* renamed from: b */
    public String f32985b = "";

    /* renamed from: c */
    public ByteString f32986c = ByteString.f164797b;

    /* renamed from: e */
    private byte f32987e = 2;

    static {
        ltr ltr = new ltr();
        f32982d = ltr;
        GeneratedMessageLite.m124024a(ltr.class, ltr);
    }

    private ltr() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f32987e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f32987e = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f32982d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔈ\u0000\u0002ည\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new ltr();
        } else {
            if (i2 == 4) {
                return new bxvd(f32982d);
            }
            if (i2 == 5) {
                return f32982d;
            }
            bxxk bxxk = f32983f;
            if (bxxk == null) {
                synchronized (ltr.class) {
                    bxxk = f32983f;
                    if (bxxk == null) {
                        bxxk = new bxve(f32982d);
                        f32983f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
