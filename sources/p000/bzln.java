package p000;

/* renamed from: bzln */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzln extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bzln f170550f;

    /* renamed from: g */
    private static volatile bxxk f170551g;

    /* renamed from: a */
    public int f170552a;

    /* renamed from: b */
    public String f170553b = "";

    /* renamed from: c */
    public byum f170554c;

    /* renamed from: d */
    public byul f170555d;

    /* renamed from: e */
    public long f170556e;

    static {
        bzln bzln = new bzln();
        f170550f = bzln;
        bxvk.m124024a(bzln.class, bzln);
    }

    private bzln() {
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
            return bxvk.m124022a(f170550f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဂ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bzln();
        } else {
            if (i2 == 4) {
                return new bxvd(f170550f);
            }
            if (i2 == 5) {
                return f170550f;
            }
            bxxk bxxk = f170551g;
            if (bxxk == null) {
                synchronized (bzln.class) {
                    bxxk = f170551g;
                    if (bxxk == null) {
                        bxxk = new bxve(f170550f);
                        f170551g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
