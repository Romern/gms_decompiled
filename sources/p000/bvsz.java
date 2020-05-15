package p000;

/* renamed from: bvsz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvsz extends bxvk implements bxxd {

    /* renamed from: h */
    public static final bvsz f157543h;

    /* renamed from: i */
    private static volatile bxxk f157544i;

    /* renamed from: a */
    public int f157545a;

    /* renamed from: b */
    public int f157546b;

    /* renamed from: c */
    public long f157547c;

    /* renamed from: d */
    public int f157548d;

    /* renamed from: e */
    public int f157549e;

    /* renamed from: f */
    public int f157550f;

    /* renamed from: g */
    public int f157551g;

    static {
        bvsz bvsz = new bvsz();
        f157543h = bvsz;
        bxvk.m124024a(bvsz.class, bvsz);
    }

    private bvsz() {
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
            return bxvk.m124022a(f157543h, "\u0001\u0006\u0000\u0001\u000b\u0014\u0006\u0000\u0000\u0000\u000bဌ\u0010\fင\u0011\u0011င\u0004\u0012ဃ\u0005\u0013ဌ\u0012\u0014ဌ\u0013", new Object[]{"a", "d", bvzg.f158290a, "e", "b", "c", "f", bvzb.f158279a, "g", bvzd.f158281a});
        } else if (i2 == 3) {
            return new bvsz();
        } else {
            if (i2 == 4) {
                return new bxvd(f157543h);
            }
            if (i2 == 5) {
                return f157543h;
            }
            bxxk bxxk = f157544i;
            if (bxxk == null) {
                synchronized (bvsz.class) {
                    bxxk = f157544i;
                    if (bxxk == null) {
                        bxxk = new bxve(f157543h);
                        f157544i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
