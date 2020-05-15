package p000;

/* renamed from: bwhn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwhn extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bwhn f159531f;

    /* renamed from: h */
    private static volatile bxxk f159532h;

    /* renamed from: a */
    public long f159533a;

    /* renamed from: b */
    public bxwc f159534b = bxxn.f165040b;

    /* renamed from: c */
    public bwhr f159535c;

    /* renamed from: d */
    public boolean f159536d;

    /* renamed from: e */
    public ByteString f159537e = ByteString.f164797b;

    /* renamed from: g */
    private int f159538g;

    static {
        bwhn bwhn = new bwhn();
        f159531f = bwhn;
        GeneratedMessageLite.m124024a(bwhn.class, bwhn);
    }

    private bwhn() {
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
            return GeneratedMessageLite.m124022a(f159531f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဂ\u0000\u0002\u001b\u0003ဉ\u0001\u0004ဇ\u0002\u0005ည\u0003", new Object[]{"g", "a", "b", bwhs.class, "c", "d", "e"});
        } else if (i2 == 3) {
            return new bwhn();
        } else {
            if (i2 == 4) {
                return new bxvd(f159531f);
            }
            if (i2 == 5) {
                return f159531f;
            }
            bxxk bxxk = f159532h;
            if (bxxk == null) {
                synchronized (bwhn.class) {
                    bxxk = f159532h;
                    if (bxxk == null) {
                        bxxk = new bxve(f159531f);
                        f159532h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
