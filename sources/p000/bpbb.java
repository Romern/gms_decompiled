package p000;

/* renamed from: bpbb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpbb extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bpbb f135578e;

    /* renamed from: f */
    private static volatile bxxk f135579f;

    /* renamed from: a */
    public int f135580a;

    /* renamed from: b */
    public String f135581b = "";

    /* renamed from: c */
    public int f135582c;

    /* renamed from: d */
    public int f135583d;

    static {
        bpbb bpbb = new bpbb();
        f135578e = bpbb;
        GeneratedMessageLite.m124024a(bpbb.class, bpbb);
    }

    private bpbb() {
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
            return GeneratedMessageLite.m124022a(f135578e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", "c", bpba.f135577a, "d", bpaz.f135576a});
        } else if (i2 == 3) {
            return new bpbb();
        } else {
            if (i2 == 4) {
                return new bxvd(f135578e);
            }
            if (i2 == 5) {
                return f135578e;
            }
            bxxk bxxk = f135579f;
            if (bxxk == null) {
                synchronized (bpbb.class) {
                    bxxk = f135579f;
                    if (bxxk == null) {
                        bxxk = new bxve(f135578e);
                        f135579f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
