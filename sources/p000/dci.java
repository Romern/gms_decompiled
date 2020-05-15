package p000;

/* renamed from: dci */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dci extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final dci f12811g;

    /* renamed from: h */
    private static volatile bxxk f12812h;

    /* renamed from: a */
    public int f12813a;

    /* renamed from: b */
    public String f12814b = "";

    /* renamed from: c */
    public String f12815c = "";

    /* renamed from: d */
    public long f12816d;

    /* renamed from: e */
    public long f12817e;

    /* renamed from: f */
    public long f12818f;

    static {
        dci dci = new dci();
        f12811g = dci;
        GeneratedMessageLite.m124024a(dci.class, dci);
    }

    private dci() {
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
            return GeneratedMessageLite.m124022a(f12811g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new dci();
        } else {
            if (i2 == 4) {
                return new bxvd(f12811g);
            }
            if (i2 == 5) {
                return f12811g;
            }
            bxxk bxxk = f12812h;
            if (bxxk == null) {
                synchronized (dci.class) {
                    bxxk = f12812h;
                    if (bxxk == null) {
                        bxxk = new bxve(f12811g);
                        f12812h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
