package p000;

/* renamed from: bwvd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwvd extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bxvu f161101c = new bwva();

    /* renamed from: e */
    public static final bwvd f161102e;

    /* renamed from: f */
    private static volatile bxxk f161103f;

    /* renamed from: a */
    public int f161104a;

    /* renamed from: b */
    public bxvt f161105b = bxvm.f164965b;

    /* renamed from: d */
    public String f161106d = "";

    static {
        bwvd bwvd = new bwvd();
        f161102e = bwvd;
        GeneratedMessageLite.m124024a(bwvd.class, bwvd);
    }

    private bwvd() {
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
            return GeneratedMessageLite.m124022a(f161102e, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001e\u0002ဈ\u0000", new Object[]{"a", "b", bwvc.m122336b(), "d"});
        } else if (i2 == 3) {
            return new bwvd();
        } else {
            if (i2 == 4) {
                return new bxvd(f161102e);
            }
            if (i2 == 5) {
                return f161102e;
            }
            bxxk bxxk = f161103f;
            if (bxxk == null) {
                synchronized (bwvd.class) {
                    bxxk = f161103f;
                    if (bxxk == null) {
                        bxxk = new bxve(f161102e);
                        f161103f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
