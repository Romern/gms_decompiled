package p000;

/* renamed from: byyb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byyb extends bxvg implements bxvh {

    /* renamed from: j */
    public static final byyb f168875j;

    /* renamed from: n */
    private static volatile bxxk f168876n;

    /* renamed from: a */
    public long f168877a = 5000;

    /* renamed from: b */
    public long f168878b = 300;

    /* renamed from: c */
    public long f168879c = 8000;

    /* renamed from: d */
    public long f168880d = 3000;

    /* renamed from: e */
    public long f168881e = 10000;

    /* renamed from: f */
    public long f168882f = 5000;

    /* renamed from: g */
    public long f168883g;

    /* renamed from: h */
    public long f168884h = 1000;

    /* renamed from: i */
    public long f168885i = 500;

    /* renamed from: k */
    private int f168886k;

    /* renamed from: l */
    private byte f168887l = 2;

    static {
        byyb byyb = new byyb();
        f168875j = byyb;
        GeneratedMessageLite.m124024a(byyb.class, byyb);
    }

    private byyb() {
    }

    /* renamed from: a */
    public static /* synthetic */ void m125492a(byyb byyb) {
        byyb.f168886k |= 1;
        byyb.f168877a = 5000;
    }

    /* renamed from: b */
    public static /* synthetic */ void m125493b(byyb byyb) {
        byyb.f168886k |= 2;
        byyb.f168878b = 300;
    }

    /* renamed from: c */
    public static /* synthetic */ void m125494c(byyb byyb) {
        byyb.f168886k |= 4;
        byyb.f168879c = 8000;
    }

    /* renamed from: d */
    public static /* synthetic */ void m125495d(byyb byyb) {
        byyb.f168886k |= 8;
        byyb.f168880d = 3000;
    }

    /* renamed from: e */
    public static /* synthetic */ void m125496e(byyb byyb) {
        byyb.f168886k |= 16;
        byyb.f168881e = 10000;
    }

    /* renamed from: f */
    public static /* synthetic */ void m125497f(byyb byyb) {
        byyb.f168886k |= 32;
        byyb.f168882f = 5000;
    }

    /* renamed from: g */
    public static /* synthetic */ void m125498g(byyb byyb) {
        byyb.f168886k |= 512;
        byyb.f168883g = 0;
    }

    /* renamed from: h */
    public static /* synthetic */ void m125499h(byyb byyb) {
        byyb.f168886k |= 1024;
        byyb.f168884h = 1000;
    }

    /* renamed from: i */
    public static /* synthetic */ void m125500i(byyb byyb) {
        byyb.f168886k |= 2048;
        byyb.f168885i = 100;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f168887l);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f168887l = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f168875j, "\u0001\t\u0000\u0001\u0001\r\t\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u000bဂ\t\fဂ\n\rဂ\u000b", new Object[]{"k", "a", "b", "c", "d", "e", "f", "g", "h", "i"});
        } else if (i2 == 3) {
            return new byyb();
        } else {
            if (i2 == 4) {
                return new bxvf(f168875j);
            }
            if (i2 == 5) {
                return f168875j;
            }
            bxxk bxxk = f168876n;
            if (bxxk == null) {
                synchronized (byyb.class) {
                    bxxk = f168876n;
                    if (bxxk == null) {
                        bxxk = new bxve(f168875j);
                        f168876n = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
