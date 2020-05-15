package p000;

/* renamed from: byys */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byys extends bxvg implements bxvh {

    /* renamed from: d */
    public static final byys f169002d;

    /* renamed from: f */
    private static volatile bxxk f169003f;

    /* renamed from: a */
    public int f169004a;

    /* renamed from: b */
    public int f169005b;

    /* renamed from: c */
    public bxtx f169006c = bxtx.f164797b;

    /* renamed from: e */
    private byte f169007e = 2;

    static {
        byys byys = new byys();
        f169002d = byys;
        bxvk.m124024a(byys.class, byys);
    }

    private byys() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f169007e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f169007e = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f169002d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ည\u0001", new Object[]{"a", "b", bzai.f169216a, "c"});
        } else if (i2 == 3) {
            return new byys();
        } else {
            if (i2 == 4) {
                return new bxvf(f169002d);
            }
            if (i2 == 5) {
                return f169002d;
            }
            bxxk bxxk = f169003f;
            if (bxxk == null) {
                synchronized (byys.class) {
                    bxxk = f169003f;
                    if (bxxk == null) {
                        bxxk = new bxve(f169002d);
                        f169003f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
