package p000;

/* renamed from: cahv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cahv extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final cahv f174600h;

    /* renamed from: i */
    private static volatile bxxk f174601i;

    /* renamed from: a */
    public int f174602a;

    /* renamed from: b */
    public int f174603b;

    /* renamed from: c */
    public int f174604c;

    /* renamed from: d */
    public int f174605d;

    /* renamed from: e */
    public int f174606e;

    /* renamed from: f */
    public int f174607f;

    /* renamed from: g */
    public caii f174608g;

    static {
        cahv cahv = new cahv();
        f174600h = cahv;
        GeneratedMessageLite.m124024a(cahv.class, cahv);
    }

    private cahv() {
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
            return GeneratedMessageLite.m124022a(f174600h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003င\u0003\u0004င\u0004\u0006ဉ\u0006\u0007င\u0002", new Object[]{"a", "b", cahs.f174598a, "c", caht.f174599a, "e", "f", "g", "d"});
        } else if (i2 == 3) {
            return new cahv();
        } else {
            if (i2 == 4) {
                return new bxvd(f174600h);
            }
            if (i2 == 5) {
                return f174600h;
            }
            bxxk bxxk = f174601i;
            if (bxxk == null) {
                synchronized (cahv.class) {
                    bxxk = f174601i;
                    if (bxxk == null) {
                        bxxk = new bxve(f174600h);
                        f174601i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
