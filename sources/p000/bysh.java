package p000;

/* renamed from: bysh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bysh extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bysh f167565d;

    /* renamed from: e */
    private static volatile bxxk f167566e;

    /* renamed from: a */
    public int f167567a;

    /* renamed from: b */
    public int f167568b = 1;

    /* renamed from: c */
    public String f167569c = "";

    static {
        bysh bysh = new bysh();
        f167565d = bysh;
        GeneratedMessageLite.m124024a(bysh.class, bysh);
    }

    private bysh() {
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
            return GeneratedMessageLite.m124022a(f167565d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", bysf.f167564a, "c"});
        } else if (i2 == 3) {
            return new bysh();
        } else {
            if (i2 == 4) {
                return new bxvd(f167565d);
            }
            if (i2 == 5) {
                return f167565d;
            }
            bxxk bxxk = f167566e;
            if (bxxk == null) {
                synchronized (bysh.class) {
                    bxxk = f167566e;
                    if (bxxk == null) {
                        bxxk = new bxve(f167565d);
                        f167566e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
