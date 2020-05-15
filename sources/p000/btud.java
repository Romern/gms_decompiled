package p000;

/* renamed from: btud */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btud extends bxvk implements bxxd {

    /* renamed from: b */
    public static final btud f150454b;

    /* renamed from: d */
    private static volatile bxxk f150455d;

    /* renamed from: a */
    public int f150456a;

    /* renamed from: c */
    private bzvu f150457c;

    static {
        btud btud = new btud();
        f150454b = btud;
        bxvk.m124024a(btud.class, btud);
    }

    private btud() {
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
            return bxvk.m124022a(f150454b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"a", "c"});
        } else if (i2 == 3) {
            return new btud();
        } else {
            if (i2 == 4) {
                return new bxvd(f150454b);
            }
            if (i2 == 5) {
                return f150454b;
            }
            bxxk bxxk = f150455d;
            if (bxxk == null) {
                synchronized (btud.class) {
                    bxxk = f150455d;
                    if (bxxk == null) {
                        bxxk = new bxve(f150454b);
                        f150455d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
