package p000;

/* renamed from: bvfk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvfk extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bvfk f155875e;

    /* renamed from: f */
    private static volatile bxxk f155876f;

    /* renamed from: a */
    public int f155877a;

    /* renamed from: b */
    public int f155878b;

    /* renamed from: c */
    public long f155879c;

    /* renamed from: d */
    public String f155880d = "";

    static {
        bvfk bvfk = new bvfk();
        f155875e = bvfk;
        GeneratedMessageLite.m124024a(bvfk.class, bvfk);
    }

    private bvfk() {
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
            return GeneratedMessageLite.m124022a(f155875e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", bvfj.f155874a, "c", "d"});
        } else if (i2 == 3) {
            return new bvfk();
        } else {
            if (i2 == 4) {
                return new bxvd(f155875e);
            }
            if (i2 == 5) {
                return f155875e;
            }
            bxxk bxxk = f155876f;
            if (bxxk == null) {
                synchronized (bvfk.class) {
                    bxxk = f155876f;
                    if (bxxk == null) {
                        bxxk = new bxve(f155875e);
                        f155876f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
