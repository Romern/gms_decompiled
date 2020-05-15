package p000;

/* renamed from: bxhl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxhl extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bxhl f163417d;

    /* renamed from: e */
    private static volatile bxxk f163418e;

    /* renamed from: a */
    public int f163419a;

    /* renamed from: b */
    public long f163420b;

    /* renamed from: c */
    public long f163421c;

    static {
        bxhl bxhl = new bxhl();
        f163417d = bxhl;
        GeneratedMessageLite.m124024a(bxhl.class, bxhl);
    }

    private bxhl() {
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
            return GeneratedMessageLite.m124022a(f163417d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bxhl();
        } else {
            if (i2 == 4) {
                return new bxvd(f163417d);
            }
            if (i2 == 5) {
                return f163417d;
            }
            bxxk bxxk = f163418e;
            if (bxxk == null) {
                synchronized (bxhl.class) {
                    bxxk = f163418e;
                    if (bxxk == null) {
                        bxxk = new bxve(f163417d);
                        f163418e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
