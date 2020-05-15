package p000;

/* renamed from: wzl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wzl extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final wzl f51607f;

    /* renamed from: g */
    private static volatile bxxk f51608g;

    /* renamed from: a */
    public int f51609a;

    /* renamed from: b */
    public int f51610b;

    /* renamed from: c */
    public int f51611c;

    /* renamed from: d */
    public int f51612d;

    /* renamed from: e */
    public int f51613e;

    static {
        wzl wzl = new wzl();
        f51607f = wzl;
        GeneratedMessageLite.m124024a(wzl.class, wzl);
    }

    private wzl() {
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
            return GeneratedMessageLite.m124022a(f51607f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new wzl();
        } else {
            if (i2 == 4) {
                return new bxvd(f51607f);
            }
            if (i2 == 5) {
                return f51607f;
            }
            bxxk bxxk = f51608g;
            if (bxxk == null) {
                synchronized (wzl.class) {
                    bxxk = f51608g;
                    if (bxxk == null) {
                        bxxk = new bxve(f51607f);
                        f51608g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
