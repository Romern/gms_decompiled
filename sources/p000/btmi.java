package p000;

/* renamed from: btmi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btmi extends bxvk implements bxxd {

    /* renamed from: c */
    public static final btmi f149491c;

    /* renamed from: d */
    private static volatile bxxk f149492d;

    /* renamed from: a */
    public int f149493a;

    /* renamed from: b */
    public long f149494b;

    static {
        btmi btmi = new btmi();
        f149491c = btmi;
        bxvk.m124024a(btmi.class, btmi);
    }

    private btmi() {
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
            return bxvk.m124022a(f149491c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0002", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new btmi();
        } else {
            if (i2 == 4) {
                return new bxvd(f149491c);
            }
            if (i2 == 5) {
                return f149491c;
            }
            bxxk bxxk = f149492d;
            if (bxxk == null) {
                synchronized (btmi.class) {
                    bxxk = f149492d;
                    if (bxxk == null) {
                        bxxk = new bxve(f149491c);
                        f149492d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
