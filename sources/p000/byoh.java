package p000;

/* renamed from: byoh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byoh extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final byoh f167206h;

    /* renamed from: i */
    private static volatile bxxk f167207i;

    /* renamed from: a */
    public int f167208a;

    /* renamed from: b */
    public String f167209b = "";

    /* renamed from: c */
    public String f167210c = "";

    /* renamed from: d */
    public String f167211d = "";

    /* renamed from: e */
    public String f167212e = "";

    /* renamed from: f */
    public int f167213f;

    /* renamed from: g */
    public int f167214g;

    static {
        byoh byoh = new byoh();
        f167206h = byoh;
        GeneratedMessageLite.m124024a(byoh.class, byoh);
    }

    private byoh() {
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
            return GeneratedMessageLite.m124022a(f167206h, "\u0001\u0006\u0000\u0001\u0001f\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0011ဈ\u0002dဈ\u0004eင\u0005fင\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new byoh();
        } else {
            if (i2 == 4) {
                return new bxvd(f167206h);
            }
            if (i2 == 5) {
                return f167206h;
            }
            bxxk bxxk = f167207i;
            if (bxxk == null) {
                synchronized (byoh.class) {
                    bxxk = f167207i;
                    if (bxxk == null) {
                        bxxk = new bxve(f167206h);
                        f167207i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
