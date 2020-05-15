package p000;

/* renamed from: bzoy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzoy extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final bzoy f170880i;

    /* renamed from: j */
    private static volatile bxxk f170881j;

    /* renamed from: a */
    public int f170882a;

    /* renamed from: b */
    public int f170883b;

    /* renamed from: c */
    public bzpe f170884c;

    /* renamed from: d */
    public bzpc f170885d;

    /* renamed from: e */
    public bzpb f170886e;

    /* renamed from: f */
    public String f170887f = "";

    /* renamed from: g */
    public String f170888g = "";

    /* renamed from: h */
    public String f170889h = "";

    static {
        bzoy bzoy = new bzoy();
        f170880i = bzoy;
        GeneratedMessageLite.m124024a(bzoy.class, bzoy);
    }

    private bzoy() {
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
            return GeneratedMessageLite.m124022a(f170880i, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဉ\u0001\u0005ဉ\u0003\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဉ\u0004", new Object[]{"a", "b", bzow.f170879a, "c", "d", "f", "g", "h", "e"});
        } else if (i2 == 3) {
            return new bzoy();
        } else {
            if (i2 == 4) {
                return new bxvd(f170880i);
            }
            if (i2 == 5) {
                return f170880i;
            }
            bxxk bxxk = f170881j;
            if (bxxk == null) {
                synchronized (bzoy.class) {
                    bxxk = f170881j;
                    if (bxxk == null) {
                        bxxk = new bxve(f170880i);
                        f170881j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
