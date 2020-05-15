package p000;

/* renamed from: bwoo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwoo extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bwoo f160468d;

    /* renamed from: e */
    public static final bxvj f160469e;

    /* renamed from: g */
    private static volatile bxxk f160470g;

    /* renamed from: a */
    public int f160471a = 0;

    /* renamed from: b */
    public Object f160472b;

    /* renamed from: c */
    public int f160473c;

    /* renamed from: f */
    private int f160474f;

    static {
        bwoo bwoo = new bwoo();
        f160468d = bwoo;
        GeneratedMessageLite.m124024a(bwoo.class, bwoo);
        bwoq bwoq = bwoq.f160480d;
        bwoo bwoo2 = f160468d;
        f160469e = GeneratedMessageLite.m124006a(bwoq, bwoo2, bwoo2, 233806715, bxzf.MESSAGE);
    }

    private bwoo() {
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
            return GeneratedMessageLite.m124022a(f160468d, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဿ\u0000\u0003ဿ\u0000\u0004ြ\u0000", new Object[]{"b", "a", "f", "c", bwom.f160467a, bwnz.f160427a, bwob.f160428a, bwop.class});
        } else if (i2 == 3) {
            return new bwoo();
        } else {
            if (i2 == 4) {
                return new bxvd(f160468d);
            }
            if (i2 == 5) {
                return f160468d;
            }
            bxxk bxxk = f160470g;
            if (bxxk == null) {
                synchronized (bwoo.class) {
                    bxxk = f160470g;
                    if (bxxk == null) {
                        bxxk = new bxve(f160468d);
                        f160470g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
