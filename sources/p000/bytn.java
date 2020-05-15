package p000;

/* renamed from: bytn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bytn extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final bytn f167686h;

    /* renamed from: i */
    private static volatile bxxk f167687i;

    /* renamed from: a */
    public int f167688a;

    /* renamed from: b */
    public bytr f167689b;

    /* renamed from: c */
    public String f167690c = "";

    /* renamed from: d */
    public String f167691d = "";

    /* renamed from: e */
    public boolean f167692e;

    /* renamed from: f */
    public String f167693f = "";

    /* renamed from: g */
    public String f167694g = "";

    static {
        bytn bytn = new bytn();
        f167686h = bytn;
        GeneratedMessageLite.m124024a(bytn.class, bytn);
    }

    private bytn() {
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
            return GeneratedMessageLite.m124022a(f167686h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0001\u0002ဉ\u0000\u0003ဇ\u0003\u0004ဈ\u0002\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"a", "c", "b", "e", "d", "f", "g"});
        } else if (i2 == 3) {
            return new bytn();
        } else {
            if (i2 == 4) {
                return new bxvd(f167686h);
            }
            if (i2 == 5) {
                return f167686h;
            }
            bxxk bxxk = f167687i;
            if (bxxk == null) {
                synchronized (bytn.class) {
                    bxxk = f167687i;
                    if (bxxk == null) {
                        bxxk = new bxve(f167686h);
                        f167687i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
