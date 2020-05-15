package p000;

/* renamed from: bzck */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzck extends bxvg implements bxvh {

    /* renamed from: h */
    public static final bzck f169346h;

    /* renamed from: j */
    private static volatile bxxk f169347j;

    /* renamed from: a */
    public int f169348a;

    /* renamed from: b */
    public bzcm f169349b;

    /* renamed from: c */
    public bzce f169350c;

    /* renamed from: d */
    public bzcg f169351d;

    /* renamed from: e */
    public bzco f169352e;

    /* renamed from: f */
    public bzci f169353f;

    /* renamed from: g */
    public bzcc f169354g;

    /* renamed from: i */
    private byte f169355i = 2;

    static {
        bzck bzck = new bzck();
        f169346h = bzck;
        GeneratedMessageLite.m124024a(bzck.class, bzck);
    }

    private bzck() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f169355i);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f169355i = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f169346h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0006ᐉ\u0004\u0007ᐉ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new bzck();
        } else {
            if (i2 == 4) {
                return new bxvf(f169346h);
            }
            if (i2 == 5) {
                return f169346h;
            }
            bxxk bxxk = f169347j;
            if (bxxk == null) {
                synchronized (bzck.class) {
                    bxxk = f169347j;
                    if (bxxk == null) {
                        bxxk = new bxve(f169346h);
                        f169347j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
