package p000;

/* renamed from: byyt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byyt extends bxvk implements bxxd {

    /* renamed from: d */
    public static final byyt f169008d;

    /* renamed from: f */
    private static volatile bxxk f169009f;

    /* renamed from: a */
    public int f169010a;

    /* renamed from: b */
    public byys f169011b;

    /* renamed from: c */
    public bxtx f169012c = bxtx.f164797b;

    /* renamed from: e */
    private byte f169013e = 2;

    static {
        byyt byyt = new byyt();
        f169008d = byyt;
        bxvk.m124024a(byyt.class, byyt);
    }

    private byyt() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f169013e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f169013e = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f169008d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ည\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new byyt();
        } else {
            if (i2 == 4) {
                return new bxvd(f169008d);
            }
            if (i2 == 5) {
                return f169008d;
            }
            bxxk bxxk = f169009f;
            if (bxxk == null) {
                synchronized (byyt.class) {
                    bxxk = f169009f;
                    if (bxxk == null) {
                        bxxk = new bxve(f169008d);
                        f169009f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
