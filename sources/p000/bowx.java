package p000;

/* renamed from: bowx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bowx extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bowx f135200f;

    /* renamed from: g */
    private static volatile bxxk f135201g;

    /* renamed from: a */
    public int f135202a;

    /* renamed from: b */
    public bosx f135203b;

    /* renamed from: c */
    public long f135204c;

    /* renamed from: d */
    public int f135205d;

    /* renamed from: e */
    public int f135206e;

    static {
        bowx bowx = new bowx();
        f135200f = bowx;
        GeneratedMessageLite.m124024a(bowx.class, bowx);
    }

    private bowx() {
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
            return GeneratedMessageLite.m124022a(f135200f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001ဂ\u0002\u0003ဌ\u0005\u0005ဉ\u0000\u0006ဌ\u0006", new Object[]{"a", "c", "d", boww.f135199a, "b", "e", bowv.f135198a});
        } else if (i2 == 3) {
            return new bowx();
        } else {
            if (i2 == 4) {
                return new bxvd(f135200f);
            }
            if (i2 == 5) {
                return f135200f;
            }
            bxxk bxxk = f135201g;
            if (bxxk == null) {
                synchronized (bowx.class) {
                    bxxk = f135201g;
                    if (bxxk == null) {
                        bxxk = new bxve(f135200f);
                        f135201g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
