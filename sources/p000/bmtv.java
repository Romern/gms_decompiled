package p000;

/* renamed from: bmtv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmtv extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bmtv f130913c;

    /* renamed from: e */
    private static volatile bxxk f130914e;

    /* renamed from: a */
    public int f130915a;

    /* renamed from: b */
    public String f130916b = "";

    /* renamed from: d */
    private int f130917d;

    static {
        bmtv bmtv = new bmtv();
        f130913c = bmtv;
        GeneratedMessageLite.m124024a(bmtv.class, bmtv);
    }

    private bmtv() {
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
            return GeneratedMessageLite.m124022a(f130913c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဈ\u0002", new Object[]{"d", "a", bmtt.f130912a, "b"});
        } else if (i2 == 3) {
            return new bmtv();
        } else {
            if (i2 == 4) {
                return new bxvd(f130913c);
            }
            if (i2 == 5) {
                return f130913c;
            }
            bxxk bxxk = f130914e;
            if (bxxk == null) {
                synchronized (bmtv.class) {
                    bxxk = f130914e;
                    if (bxxk == null) {
                        bxxk = new bxve(f130913c);
                        f130914e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
