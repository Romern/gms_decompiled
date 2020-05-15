package p000;

/* renamed from: bwft */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwft extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bwft f159131e;

    /* renamed from: f */
    private static volatile bxxk f159132f;

    /* renamed from: a */
    public int f159133a;

    /* renamed from: b */
    public int f159134b = 0;

    /* renamed from: c */
    public Object f159135c;

    /* renamed from: d */
    public int f159136d;

    static {
        bwft bwft = new bwft();
        f159131e = bwft;
        GeneratedMessageLite.m124024a(bwft.class, bwft);
    }

    private bwft() {
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
            return GeneratedMessageLite.m124022a(f159131e, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002့\u0000\u0003်\u0000\u0004့\u0000\u0005့\u0000", new Object[]{"c", "b", "a", "d", bwfb.f159046a});
        } else if (i2 == 3) {
            return new bwft();
        } else {
            if (i2 == 4) {
                return new bxvd(f159131e);
            }
            if (i2 == 5) {
                return f159131e;
            }
            bxxk bxxk = f159132f;
            if (bxxk == null) {
                synchronized (bwft.class) {
                    bxxk = f159132f;
                    if (bxxk == null) {
                        bxxk = new bxve(f159131e);
                        f159132f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
