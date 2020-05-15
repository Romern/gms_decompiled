package p000;

/* renamed from: mth */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mth extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final mth f34664e;

    /* renamed from: f */
    private static volatile bxxk f34665f;

    /* renamed from: a */
    public int f34666a;

    /* renamed from: b */
    public int f34667b;

    /* renamed from: c */
    public int f34668c;

    /* renamed from: d */
    public long f34669d;

    static {
        mth mth = new mth();
        f34664e = mth;
        GeneratedMessageLite.m124024a(mth.class, mth);
    }

    private mth() {
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
            return GeneratedMessageLite.m124022a(f34664e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", mtf.m25602b(), "c", mtg.f34663a, "d"});
        } else if (i2 == 3) {
            return new mth();
        } else {
            if (i2 == 4) {
                return new bxvd(f34664e);
            }
            if (i2 == 5) {
                return f34664e;
            }
            bxxk bxxk = f34665f;
            if (bxxk == null) {
                synchronized (mth.class) {
                    bxxk = f34665f;
                    if (bxxk == null) {
                        bxxk = new bxve(f34664e);
                        f34665f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
