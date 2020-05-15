package p000;

/* renamed from: bucy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bucy extends GeneratedMessageLite implements bxxd {

    /* renamed from: k */
    public static final bucy f153423k;

    /* renamed from: l */
    private static volatile bxxk f153424l;

    /* renamed from: a */
    public int f153425a;

    /* renamed from: b */
    public int f153426b;

    /* renamed from: c */
    public int f153427c;

    /* renamed from: d */
    public float f153428d;

    /* renamed from: e */
    public float f153429e;

    /* renamed from: f */
    public float f153430f;

    /* renamed from: g */
    public float f153431g;

    /* renamed from: h */
    public float f153432h;

    /* renamed from: i */
    public float f153433i;

    /* renamed from: j */
    public float f153434j;

    static {
        bucy bucy = new bucy();
        f153423k = bucy;
        GeneratedMessageLite.m124024a(bucy.class, bucy);
    }

    private bucy() {
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
            return GeneratedMessageLite.m124022a(f153423k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဏ\u0000\u0002ဏ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ခ\u0006\bခ\u0007\tခ\b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"});
        } else if (i2 == 3) {
            return new bucy();
        } else {
            if (i2 == 4) {
                return new bxvd(f153423k);
            }
            if (i2 == 5) {
                return f153423k;
            }
            bxxk bxxk = f153424l;
            if (bxxk == null) {
                synchronized (bucy.class) {
                    bxxk = f153424l;
                    if (bxxk == null) {
                        bxxk = new bxve(f153423k);
                        f153424l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
