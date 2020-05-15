package p000;

/* renamed from: abeo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abeo extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final abeo f57262h;

    /* renamed from: i */
    private static volatile bxxk f57263i;

    /* renamed from: a */
    public int f57264a;

    /* renamed from: b */
    public abep f57265b;

    /* renamed from: c */
    public abeq f57266c;

    /* renamed from: d */
    public abet f57267d;

    /* renamed from: e */
    public String f57268e = "";

    /* renamed from: f */
    public aber f57269f;

    /* renamed from: g */
    public int f57270g;

    static {
        abeo abeo = new abeo();
        f57262h = abeo;
        GeneratedMessageLite.m124024a(abeo.class, abeo);
    }

    private abeo() {
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
            return GeneratedMessageLite.m124022a(f57262h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဈ\u0003\u0005ဉ\u0004\u0006ဌ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g", bzpq.f170948a});
        } else if (i2 == 3) {
            return new abeo();
        } else {
            if (i2 == 4) {
                return new bxvd(f57262h);
            }
            if (i2 == 5) {
                return f57262h;
            }
            bxxk bxxk = f57263i;
            if (bxxk == null) {
                synchronized (abeo.class) {
                    bxxk = f57263i;
                    if (bxxk == null) {
                        bxxk = new bxve(f57262h);
                        f57263i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
