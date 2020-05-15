package p000;

/* renamed from: bmgl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmgl extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bmgl f129265g;

    /* renamed from: h */
    private static volatile bxxk f129266h;

    /* renamed from: a */
    public int f129267a;

    /* renamed from: b */
    public String f129268b = "";

    /* renamed from: c */
    public ByteString f129269c = ByteString.f164797b;

    /* renamed from: d */
    public bmgf f129270d;

    /* renamed from: e */
    public bmfv f129271e;

    /* renamed from: f */
    public bmkm f129272f;

    static {
        bmgl bmgl = new bmgl();
        f129265g = bmgl;
        GeneratedMessageLite.m124024a(bmgl.class, bmgl);
    }

    private bmgl() {
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
            return GeneratedMessageLite.m124022a(f129265g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0002\u0003ည\u0001\u0005ဉ\u0003\u0006ဉ\u0004", new Object[]{"a", "b", "d", "c", "e", "f"});
        } else if (i2 == 3) {
            return new bmgl();
        } else {
            if (i2 == 4) {
                return new bxvd(f129265g);
            }
            if (i2 == 5) {
                return f129265g;
            }
            bxxk bxxk = f129266h;
            if (bxxk == null) {
                synchronized (bmgl.class) {
                    bxxk = f129266h;
                    if (bxxk == null) {
                        bxxk = new bxve(f129265g);
                        f129266h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
