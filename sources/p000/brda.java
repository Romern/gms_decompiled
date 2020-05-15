package p000;

/* renamed from: brda */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brda extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final bxvu f142458h = new brcy();

    /* renamed from: i */
    public static final brda f142459i;

    /* renamed from: j */
    private static volatile bxxk f142460j;

    /* renamed from: a */
    public int f142461a;

    /* renamed from: b */
    public bral f142462b;

    /* renamed from: c */
    public bxwc f142463c = bxxn.f165040b;

    /* renamed from: d */
    public brcz f142464d;

    /* renamed from: e */
    public brao f142465e;

    /* renamed from: f */
    public boolean f142466f;

    /* renamed from: g */
    public bxvt f142467g = bxvm.f164965b;

    static {
        brda brda = new brda();
        f142459i = brda;
        GeneratedMessageLite.m124024a(brda.class, brda);
    }

    private brda() {
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
            return GeneratedMessageLite.m124022a(f142459i, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဉ\u0001\u0005ဉ\u0003\u0006ဇ\u0004\u0007\u001e", new Object[]{"a", "b", "c", bree.class, "d", "e", "f", "g", brcm.m113876b()});
        } else if (i2 == 3) {
            return new brda();
        } else {
            if (i2 == 4) {
                return new bxvd(f142459i);
            }
            if (i2 == 5) {
                return f142459i;
            }
            bxxk bxxk = f142460j;
            if (bxxk == null) {
                synchronized (brda.class) {
                    bxxk = f142460j;
                    if (bxxk == null) {
                        bxxk = new bxve(f142459i);
                        f142460j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
