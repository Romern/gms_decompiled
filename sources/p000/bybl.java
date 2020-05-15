package p000;

/* renamed from: bybl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bybl extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bybl f165517e;

    /* renamed from: f */
    private static volatile bxxk f165518f;

    /* renamed from: a */
    public int f165519a;

    /* renamed from: b */
    public String f165520b = "";

    /* renamed from: c */
    public String f165521c = "";

    /* renamed from: d */
    public byaz f165522d;

    static {
        bybl bybl = new bybl();
        f165517e = bybl;
        GeneratedMessageLite.m124024a(bybl.class, bybl);
    }

    private bybl() {
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
            return GeneratedMessageLite.m124022a(f165517e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bybl();
        } else {
            if (i2 == 4) {
                return new bxvd(f165517e);
            }
            if (i2 == 5) {
                return f165517e;
            }
            bxxk bxxk = f165518f;
            if (bxxk == null) {
                synchronized (bybl.class) {
                    bxxk = f165518f;
                    if (bxxk == null) {
                        bxxk = new bxve(f165517e);
                        f165518f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
