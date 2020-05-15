package p000;

/* renamed from: bssp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bssp extends GeneratedMessageLite implements bxxd {

    /* renamed from: l */
    public static final bssp f146893l;

    /* renamed from: m */
    private static volatile bxxk f146894m;

    /* renamed from: a */
    public int f146895a;

    /* renamed from: b */
    public int f146896b;

    /* renamed from: c */
    public String f146897c = "";

    /* renamed from: d */
    public String f146898d = "";

    /* renamed from: e */
    public int f146899e;

    /* renamed from: f */
    public String f146900f = "";

    /* renamed from: g */
    public String f146901g = "";

    /* renamed from: h */
    public String f146902h = "";

    /* renamed from: i */
    public String f146903i = "";

    /* renamed from: j */
    public bxwc f146904j = bxxn.f165040b;

    /* renamed from: k */
    public ByteString f146905k = ByteString.f164797b;

    static {
        bssp bssp = new bssp();
        f146893l = bssp;
        GeneratedMessageLite.m124024a(bssp.class, bssp);
    }

    private bssp() {
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
            return GeneratedMessageLite.m124022a(f146893l, "\u0001\n\u0000\u0001\u0003\f\n\u0000\u0001\u0000\u0003ဈ\u0004\u0004ဈ\u0005\u0005ဈ\u0006\u0006ဈ\u0007\u0007ဈ\u0002\bင\u0003\tင\u0000\nဈ\u0001\u000b\u001a\fည\b", new Object[]{"a", "f", "g", "h", "i", "d", "e", "b", "c", "j", "k"});
        } else if (i2 == 3) {
            return new bssp();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][][]) null, (boolean[][][]) null);
            }
            if (i2 == 5) {
                return f146893l;
            }
            bxxk bxxk = f146894m;
            if (bxxk == null) {
                synchronized (bssp.class) {
                    bxxk = f146894m;
                    if (bxxk == null) {
                        bxxk = new bxve(f146893l);
                        f146894m = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
