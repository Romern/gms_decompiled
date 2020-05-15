package p000;

/* renamed from: bybz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bybz extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final bybz f165612h;

    /* renamed from: i */
    private static volatile bxxk f165613i;

    /* renamed from: a */
    public int f165614a;

    /* renamed from: b */
    public String f165615b = "";

    /* renamed from: c */
    public String f165616c = "";

    /* renamed from: d */
    public String f165617d = "";

    /* renamed from: e */
    public boolean f165618e;

    /* renamed from: f */
    public int f165619f;

    /* renamed from: g */
    public String f165620g = "";

    static {
        bybz bybz = new bybz();
        f165612h = bybz;
        GeneratedMessageLite.m124024a(bybz.class, bybz);
    }

    private bybz() {
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
            return GeneratedMessageLite.m124022a(f165612h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005င\u0004\u0006ဈ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new bybz();
        } else {
            if (i2 == 4) {
                return new bxvd(f165612h);
            }
            if (i2 == 5) {
                return f165612h;
            }
            bxxk bxxk = f165613i;
            if (bxxk == null) {
                synchronized (bybz.class) {
                    bxxk = f165613i;
                    if (bxxk == null) {
                        bxxk = new bxve(f165612h);
                        f165613i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
