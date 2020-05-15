package p000;

/* renamed from: byyd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byyd extends bxvg implements bxvh {

    /* renamed from: g */
    public static final byyd f168903g;

    /* renamed from: i */
    private static volatile bxxk f168904i;

    /* renamed from: a */
    public int f168905a;

    /* renamed from: b */
    public byyo f168906b;

    /* renamed from: c */
    public byyo f168907c;

    /* renamed from: d */
    public byyo f168908d;

    /* renamed from: e */
    public byyo f168909e;

    /* renamed from: f */
    public byyo f168910f;

    /* renamed from: h */
    private byte f168911h = 2;

    static {
        byyd byyd = new byyd();
        f168903g = byyd;
        GeneratedMessageLite.m124024a(byyd.class, byyd);
    }

    private byyd() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f168911h);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f168911h = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f168903g, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0005ဉ\u0004\u0007ဉ\u0006", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new byyd();
        } else {
            if (i2 == 4) {
                return new bxvf(f168903g);
            }
            if (i2 == 5) {
                return f168903g;
            }
            bxxk bxxk = f168904i;
            if (bxxk == null) {
                synchronized (byyd.class) {
                    bxxk = f168904i;
                    if (bxxk == null) {
                        bxxk = new bxve(f168903g);
                        f168904i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
