package p000;

/* renamed from: borb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class borb extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final borb f134371f;

    /* renamed from: g */
    private static volatile bxxk f134372g;

    /* renamed from: a */
    public int f134373a;

    /* renamed from: b */
    public long f134374b;

    /* renamed from: c */
    public String f134375c = "";

    /* renamed from: d */
    public boolean f134376d;

    /* renamed from: e */
    public int f134377e;

    static {
        borb borb = new borb();
        f134371f = borb;
        GeneratedMessageLite.m124024a(borb.class, borb);
    }

    private borb() {
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
            return GeneratedMessageLite.m124022a(f134371f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", "c", "d", "e", caes.f172851a});
        } else if (i2 == 3) {
            return new borb();
        } else {
            if (i2 == 4) {
                return new bxvd(f134371f);
            }
            if (i2 == 5) {
                return f134371f;
            }
            bxxk bxxk = f134372g;
            if (bxxk == null) {
                synchronized (borb.class) {
                    bxxk = f134372g;
                    if (bxxk == null) {
                        bxxk = new bxve(f134371f);
                        f134372g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
