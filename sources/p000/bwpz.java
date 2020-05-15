package p000;

/* renamed from: bwpz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwpz extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final bwpz f160626h;

    /* renamed from: i */
    private static volatile bxxk f160627i;

    /* renamed from: a */
    public int f160628a;

    /* renamed from: b */
    public int f160629b;

    /* renamed from: c */
    public String f160630c = "";

    /* renamed from: d */
    public String f160631d = "";

    /* renamed from: e */
    public bwtd f160632e;

    /* renamed from: f */
    public String f160633f = "";

    /* renamed from: g */
    public String f160634g = "";

    static {
        bwpz bwpz = new bwpz();
        f160626h = bwpz;
        GeneratedMessageLite.m124024a(bwpz.class, bwpz);
    }

    private bwpz() {
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
            return GeneratedMessageLite.m124022a(f160626h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"a", "b", bwqa.f160635a, "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new bwpz();
        } else {
            if (i2 == 4) {
                return new bxvd(f160626h);
            }
            if (i2 == 5) {
                return f160626h;
            }
            bxxk bxxk = f160627i;
            if (bxxk == null) {
                synchronized (bwpz.class) {
                    bxxk = f160627i;
                    if (bxxk == null) {
                        bxxk = new bxve(f160626h);
                        f160627i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
