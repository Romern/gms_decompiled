package p000;

/* renamed from: dms */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dms extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final dms f13598e;

    /* renamed from: f */
    private static volatile bxxk f13599f;

    /* renamed from: a */
    public int f13600a;

    /* renamed from: b */
    public String f13601b = "";

    /* renamed from: c */
    public String f13602c = "";

    /* renamed from: d */
    public int f13603d;

    static {
        dms dms = new dms();
        f13598e = dms;
        GeneratedMessageLite.m124024a(dms.class, dms);
    }

    private dms() {
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
            return GeneratedMessageLite.m124022a(f13598e, "\u0001\u0003\u0000\u0001\u0001d\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001dင\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new dms();
        } else {
            if (i2 == 4) {
                return new bxvd(f13598e);
            }
            if (i2 == 5) {
                return f13598e;
            }
            bxxk bxxk = f13599f;
            if (bxxk == null) {
                synchronized (dms.class) {
                    bxxk = f13599f;
                    if (bxxk == null) {
                        bxxk = new bxve(f13598e);
                        f13599f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
