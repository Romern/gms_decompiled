package p000;

/* renamed from: bmme */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmme extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bmme f129999b;

    /* renamed from: d */
    private static volatile bxxk f130000d;

    /* renamed from: a */
    public int f130001a;

    /* renamed from: c */
    private int f130002c;

    static {
        bmme bmme = new bmme();
        f129999b = bmme;
        GeneratedMessageLite.m124024a(bmme.class, bmme);
    }

    private bmme() {
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
            return GeneratedMessageLite.m124022a(f129999b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", bmmc.f129998a});
        } else if (i2 == 3) {
            return new bmme();
        } else {
            if (i2 == 4) {
                return new bxvd(f129999b);
            }
            if (i2 == 5) {
                return f129999b;
            }
            bxxk bxxk = f130000d;
            if (bxxk == null) {
                synchronized (bmme.class) {
                    bxxk = f130000d;
                    if (bxxk == null) {
                        bxxk = new bxve(f129999b);
                        f130000d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
