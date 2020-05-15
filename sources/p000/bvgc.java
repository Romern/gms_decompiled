package p000;

/* renamed from: bvgc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvgc extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bvgc f155955d;

    /* renamed from: e */
    private static volatile bxxk f155956e;

    /* renamed from: a */
    public int f155957a;

    /* renamed from: b */
    public int f155958b;

    /* renamed from: c */
    public long f155959c;

    static {
        bvgc bvgc = new bvgc();
        f155955d = bvgc;
        GeneratedMessageLite.m124024a(bvgc.class, bvgc);
    }

    private bvgc() {
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
            return GeneratedMessageLite.m124022a(f155955d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", bvgb.f155954a, "c"});
        } else if (i2 == 3) {
            return new bvgc();
        } else {
            if (i2 == 4) {
                return new bxvd(f155955d);
            }
            if (i2 == 5) {
                return f155955d;
            }
            bxxk bxxk = f155956e;
            if (bxxk == null) {
                synchronized (bvgc.class) {
                    bxxk = f155956e;
                    if (bxxk == null) {
                        bxxk = new bxve(f155955d);
                        f155956e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
