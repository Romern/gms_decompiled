package p000;

/* renamed from: bmhu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmhu extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final bxvu f129488j = new bmht();

    /* renamed from: k */
    public static final bmhu f129489k;

    /* renamed from: l */
    private static volatile bxxk f129490l;

    /* renamed from: a */
    public int f129491a;

    /* renamed from: b */
    public bxwc f129492b = bxxn.f165040b;

    /* renamed from: c */
    public bmno f129493c;

    /* renamed from: d */
    public int f129494d;

    /* renamed from: e */
    public ByteString f129495e = ByteString.f164797b;

    /* renamed from: f */
    public bmno f129496f;

    /* renamed from: g */
    public String f129497g = "";

    /* renamed from: h */
    public String f129498h = "";

    /* renamed from: i */
    public bxvt f129499i = bxvm.f164965b;

    static {
        bmhu bmhu = new bmhu();
        f129489k = bmhu;
        GeneratedMessageLite.m124024a(bmhu.class, bmhu);
    }

    private bmhu() {
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
            return GeneratedMessageLite.m124022a(f129489k, "\u0001\b\u0000\u0001\u0001\f\b\u0000\u0002\u0000\u0001\u001b\u0003င\u0001\u0004ည\u0002\u0007ဈ\u0004\bဈ\u0005\tဉ\u0000\u000bဉ\u0003\f\u001e", new Object[]{"a", "b", bmhs.class, "d", "e", "g", "h", "c", "f", "i", bmfk.m107977b()});
        } else if (i2 == 3) {
            return new bmhu();
        } else {
            if (i2 == 4) {
                return new bxvd(f129489k);
            }
            if (i2 == 5) {
                return f129489k;
            }
            bxxk bxxk = f129490l;
            if (bxxk == null) {
                synchronized (bmhu.class) {
                    bxxk = f129490l;
                    if (bxxk == null) {
                        bxxk = new bxve(f129489k);
                        f129490l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
