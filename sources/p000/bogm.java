package p000;

/* renamed from: bogm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bogm extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bogm f133003e;

    /* renamed from: f */
    private static volatile bxxk f133004f;

    /* renamed from: a */
    public int f133005a;

    /* renamed from: b */
    public int f133006b;

    /* renamed from: c */
    public int f133007c;

    /* renamed from: d */
    public long f133008d;

    static {
        bogm bogm = new bogm();
        f133003e = bogm;
        GeneratedMessageLite.m124024a(bogm.class, bogm);
    }

    private bogm() {
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
            return GeneratedMessageLite.m124022a(f133003e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", bogq.m111183b(), "c", bogn.f133009a, "d"});
        } else if (i2 == 3) {
            return new bogm();
        } else {
            if (i2 == 4) {
                return new bxvd(f133003e);
            }
            if (i2 == 5) {
                return f133003e;
            }
            bxxk bxxk = f133004f;
            if (bxxk == null) {
                synchronized (bogm.class) {
                    bxxk = f133004f;
                    if (bxxk == null) {
                        bxxk = new bxve(f133003e);
                        f133004f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
