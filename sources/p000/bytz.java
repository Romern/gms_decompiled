package p000;

/* renamed from: bytz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bytz extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bytz f167736g;

    /* renamed from: h */
    private static volatile bxxk f167737h;

    /* renamed from: a */
    public int f167738a;

    /* renamed from: b */
    public String f167739b = "";

    /* renamed from: c */
    public int f167740c;

    /* renamed from: d */
    public String f167741d = "";

    /* renamed from: e */
    public int f167742e;

    /* renamed from: f */
    public int f167743f;

    static {
        bytz bytz = new bytz();
        f167736g = bytz;
        GeneratedMessageLite.m124024a(bytz.class, bytz);
    }

    private bytz() {
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
            return GeneratedMessageLite.m124022a(f167736g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0003င\u0003\u0004င\u0004\u0005ဌ\u0001", new Object[]{"a", "b", "d", "e", "f", "c", bytt.f167716a});
        } else if (i2 == 3) {
            return new bytz();
        } else {
            if (i2 == 4) {
                return new bxvd(f167736g);
            }
            if (i2 == 5) {
                return f167736g;
            }
            bxxk bxxk = f167737h;
            if (bxxk == null) {
                synchronized (bytz.class) {
                    bxxk = f167737h;
                    if (bxxk == null) {
                        bxxk = new bxve(f167736g);
                        f167737h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
