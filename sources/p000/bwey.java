package p000;

/* renamed from: bwey */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwey extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final bwey f159035i;

    /* renamed from: j */
    private static volatile bxxk f159036j;

    /* renamed from: a */
    public int f159037a;

    /* renamed from: b */
    public String f159038b = "";

    /* renamed from: c */
    public String f159039c = "";

    /* renamed from: d */
    public int f159040d;

    /* renamed from: e */
    public int f159041e;

    /* renamed from: f */
    public String f159042f = "";

    /* renamed from: g */
    public String f159043g = "";

    /* renamed from: h */
    public int f159044h;

    static {
        bwey bwey = new bwey();
        f159035i = bwey;
        GeneratedMessageLite.m124024a(bwey.class, bwey);
    }

    private bwey() {
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
            return GeneratedMessageLite.m124022a(f159035i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004င\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဌ\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", bwew.f159034a});
        } else if (i2 == 3) {
            return new bwey();
        } else {
            if (i2 == 4) {
                return new bxvd(f159035i);
            }
            if (i2 == 5) {
                return f159035i;
            }
            bxxk bxxk = f159036j;
            if (bxxk == null) {
                synchronized (bwey.class) {
                    bxxk = f159036j;
                    if (bxxk == null) {
                        bxxk = new bxve(f159035i);
                        f159036j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
