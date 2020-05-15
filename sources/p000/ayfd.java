package p000;

/* renamed from: ayfd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayfd extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final ayfd f97461d;

    /* renamed from: e */
    private static volatile bxxk f97462e;

    /* renamed from: a */
    public int f97463a;

    /* renamed from: b */
    public String f97464b = "";

    /* renamed from: c */
    public long f97465c;

    static {
        ayfd ayfd = new ayfd();
        f97461d = ayfd;
        GeneratedMessageLite.m124024a(ayfd.class, ayfd);
    }

    private ayfd() {
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
            return GeneratedMessageLite.m124022a(f97461d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new ayfd();
        } else {
            if (i2 == 4) {
                return new bxvd(f97461d);
            }
            if (i2 == 5) {
                return f97461d;
            }
            bxxk bxxk = f97462e;
            if (bxxk == null) {
                synchronized (ayfd.class) {
                    bxxk = f97462e;
                    if (bxxk == null) {
                        bxxk = new bxve(f97461d);
                        f97462e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
