package p000;

/* renamed from: birc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class birc extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final birc f121379g;

    /* renamed from: j */
    private static volatile bxxk f121380j;

    /* renamed from: a */
    public int f121381a;

    /* renamed from: b */
    public bivr f121382b;

    /* renamed from: c */
    public birp f121383c;

    /* renamed from: d */
    public biok f121384d;

    /* renamed from: e */
    public biui f121385e;

    /* renamed from: f */
    public bivr f121386f;

    /* renamed from: h */
    private long f121387h;

    /* renamed from: i */
    private byte f121388i = 2;

    static {
        birc birc = new birc();
        f121379g = birc;
        GeneratedMessageLite.m124024a(birc.class, birc);
    }

    private birc() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121388i);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121388i = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f121379g, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0006\u0001ᔃ\u0000\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006", new Object[]{"a", "h", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new birc();
        } else {
            if (i2 == 4) {
                return new bxvd(f121379g);
            }
            if (i2 == 5) {
                return f121379g;
            }
            bxxk bxxk = f121380j;
            if (bxxk == null) {
                synchronized (birc.class) {
                    bxxk = f121380j;
                    if (bxxk == null) {
                        bxxk = new bxve(f121379g);
                        f121380j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
