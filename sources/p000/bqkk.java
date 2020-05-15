package p000;

/* renamed from: bqkk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqkk extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bqkk f140995d;

    /* renamed from: e */
    private static volatile bxxk f140996e;

    /* renamed from: a */
    public int f140997a;

    /* renamed from: b */
    public String f140998b = "";

    /* renamed from: c */
    public long f140999c;

    static {
        bqkk bqkk = new bqkk();
        f140995d = bqkk;
        GeneratedMessageLite.m124024a(bqkk.class, bqkk);
    }

    private bqkk() {
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
            return GeneratedMessageLite.m124022a(f140995d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bqkk();
        } else {
            if (i2 == 4) {
                return new bxvd(f140995d);
            }
            if (i2 == 5) {
                return f140995d;
            }
            bxxk bxxk = f140996e;
            if (bxxk == null) {
                synchronized (bqkk.class) {
                    bxxk = f140996e;
                    if (bxxk == null) {
                        bxxk = new bxve(f140995d);
                        f140996e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
