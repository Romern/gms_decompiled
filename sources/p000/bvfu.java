package p000;

/* renamed from: bvfu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvfu extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bvfu f155922d;

    /* renamed from: e */
    private static volatile bxxk f155923e;

    /* renamed from: a */
    public int f155924a;

    /* renamed from: b */
    public long f155925b;

    /* renamed from: c */
    public bvfe f155926c;

    static {
        bvfu bvfu = new bvfu();
        f155922d = bvfu;
        GeneratedMessageLite.m124024a(bvfu.class, bvfu);
    }

    private bvfu() {
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
            return GeneratedMessageLite.m124022a(f155922d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bvfu();
        } else {
            if (i2 == 4) {
                return new bxvd(f155922d);
            }
            if (i2 == 5) {
                return f155922d;
            }
            bxxk bxxk = f155923e;
            if (bxxk == null) {
                synchronized (bvfu.class) {
                    bxxk = f155923e;
                    if (bxxk == null) {
                        bxxk = new bxve(f155922d);
                        f155923e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
