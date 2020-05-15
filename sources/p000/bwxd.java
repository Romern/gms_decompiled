package p000;

/* renamed from: bwxd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwxd extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bwxd f161328f;

    /* renamed from: g */
    private static volatile bxxk f161329g;

    /* renamed from: a */
    public int f161330a;

    /* renamed from: b */
    public float f161331b;

    /* renamed from: c */
    public float f161332c;

    /* renamed from: d */
    public float f161333d;

    /* renamed from: e */
    public int f161334e;

    static {
        bwxd bwxd = new bwxd();
        f161328f = bwxd;
        GeneratedMessageLite.m124024a(bwxd.class, bwxd);
    }

    private bwxd() {
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
            return GeneratedMessageLite.m124022a(f161328f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", "c", "d", "e", bwwy.m122386b()});
        } else if (i2 == 3) {
            return new bwxd();
        } else {
            if (i2 == 4) {
                return new bxvd(f161328f);
            }
            if (i2 == 5) {
                return f161328f;
            }
            bxxk bxxk = f161329g;
            if (bxxk == null) {
                synchronized (bwxd.class) {
                    bxxk = f161329g;
                    if (bxxk == null) {
                        bxxk = new bxve(f161328f);
                        f161329g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
