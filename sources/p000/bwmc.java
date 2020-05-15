package p000;

/* renamed from: bwmc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwmc extends bxvg implements bxvh {

    /* renamed from: c */
    public static final bwmc f160239c;

    /* renamed from: e */
    private static volatile bxxk f160240e;

    /* renamed from: a */
    public int f160241a = 0;

    /* renamed from: b */
    public Object f160242b;

    /* renamed from: d */
    private byte f160243d = 2;

    static {
        bwmc bwmc = new bwmc();
        f160239c = bwmc;
        GeneratedMessageLite.m124024a(bwmc.class, bwmc);
    }

    private bwmc() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f160243d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f160243d = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f160239c, "\u0001\u0002\u0001\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001ွ\u0000\u0003ျ\u0000", new Object[]{"b", "a"});
        } else if (i2 == 3) {
            return new bwmc();
        } else {
            if (i2 == 4) {
                return new bxvf(f160239c);
            }
            if (i2 == 5) {
                return f160239c;
            }
            bxxk bxxk = f160240e;
            if (bxxk == null) {
                synchronized (bwmc.class) {
                    bxxk = f160240e;
                    if (bxxk == null) {
                        bxxk = new bxve(f160239c);
                        f160240e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
