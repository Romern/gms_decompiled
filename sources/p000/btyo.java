package p000;

/* renamed from: btyo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btyo extends bxvk implements bxxd {

    /* renamed from: f */
    public static final btyo f152954f;

    /* renamed from: g */
    private static volatile bxxk f152955g;

    /* renamed from: a */
    public int f152956a;

    /* renamed from: b */
    public long f152957b;

    /* renamed from: c */
    public int f152958c;

    /* renamed from: d */
    public int f152959d;

    /* renamed from: e */
    public float f152960e;

    static {
        btyo btyo = new btyo();
        f152954f = btyo;
        bxvk.m124024a(btyo.class, btyo);
    }

    private btyo() {
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
            return bxvk.m124022a(f152954f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဃ\u0000\u0002င\u0001\u0003င\u0002\u0004ခ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new btyo();
        } else {
            if (i2 == 4) {
                return new bxvd(f152954f);
            }
            if (i2 == 5) {
                return f152954f;
            }
            bxxk bxxk = f152955g;
            if (bxxk == null) {
                synchronized (btyo.class) {
                    bxxk = f152955g;
                    if (bxxk == null) {
                        bxxk = new bxve(f152954f);
                        f152955g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
