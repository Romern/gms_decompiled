package p000;

/* renamed from: bvfm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvfm extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bvfm f155885e;

    /* renamed from: f */
    private static volatile bxxk f155886f;

    /* renamed from: a */
    public int f155887a;

    /* renamed from: b */
    public long f155888b;

    /* renamed from: c */
    public long f155889c;

    /* renamed from: d */
    public int f155890d;

    static {
        bvfm bvfm = new bvfm();
        f155885e = bvfm;
        GeneratedMessageLite.m124024a(bvfm.class, bvfm);
    }

    private bvfm() {
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
            return GeneratedMessageLite.m124022a(f155885e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", "c", "d", bvjd.f156340a});
        } else if (i2 == 3) {
            return new bvfm();
        } else {
            if (i2 == 4) {
                return new bxvd(f155885e);
            }
            if (i2 == 5) {
                return f155885e;
            }
            bxxk bxxk = f155886f;
            if (bxxk == null) {
                synchronized (bvfm.class) {
                    bxxk = f155886f;
                    if (bxxk == null) {
                        bxxk = new bxve(f155885e);
                        f155886f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
