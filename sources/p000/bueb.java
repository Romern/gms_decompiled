package p000;

/* renamed from: bueb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bueb extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bueb f153559g;

    /* renamed from: h */
    private static volatile bxxk f153560h;

    /* renamed from: a */
    public int f153561a;

    /* renamed from: b */
    public int f153562b;

    /* renamed from: c */
    public budy f153563c;

    /* renamed from: d */
    public budx f153564d;

    /* renamed from: e */
    public long f153565e;

    /* renamed from: f */
    public buee f153566f;

    static {
        bueb bueb = new bueb();
        f153559g = bueb;
        GeneratedMessageLite.m124024a(bueb.class, bueb);
    }

    private bueb() {
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
            return GeneratedMessageLite.m124022a(f153559g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဃ\u0003\u0005ဉ\u0004", new Object[]{"a", "b", budz.f153558a, "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bueb();
        } else {
            if (i2 == 4) {
                return new bxvd(f153559g);
            }
            if (i2 == 5) {
                return f153559g;
            }
            bxxk bxxk = f153560h;
            if (bxxk == null) {
                synchronized (bueb.class) {
                    bxxk = f153560h;
                    if (bxxk == null) {
                        bxxk = new bxve(f153559g);
                        f153560h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
