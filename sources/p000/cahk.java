package p000;

/* renamed from: cahk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cahk extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final cahk f174551c;

    /* renamed from: e */
    private static volatile bxxk f174552e;

    /* renamed from: a */
    public String f174553a = "";

    /* renamed from: b */
    public long f174554b;

    /* renamed from: d */
    private int f174555d;

    static {
        cahk cahk = new cahk();
        f174551c = cahk;
        GeneratedMessageLite.m124024a(cahk.class, cahk);
    }

    private cahk() {
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
            return GeneratedMessageLite.m124022a(f174551c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new cahk();
        } else {
            if (i2 == 4) {
                return new bxvd(f174551c);
            }
            if (i2 == 5) {
                return f174551c;
            }
            bxxk bxxk = f174552e;
            if (bxxk == null) {
                synchronized (cahk.class) {
                    bxxk = f174552e;
                    if (bxxk == null) {
                        bxxk = new bxve(f174551c);
                        f174552e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
