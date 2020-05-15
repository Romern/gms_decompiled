package p000;

/* renamed from: bkza */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkza extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bkza f125541d;

    /* renamed from: e */
    private static volatile bxxk f125542e;

    /* renamed from: a */
    public int f125543a;

    /* renamed from: b */
    public int f125544b;

    /* renamed from: c */
    public boolean f125545c;

    static {
        bkza bkza = new bkza();
        f125541d = bkza;
        GeneratedMessageLite.m124024a(bkza.class, bkza);
    }

    private bkza() {
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
            return GeneratedMessageLite.m124022a(f125541d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bkza();
        } else {
            if (i2 == 4) {
                return new bxvd(f125541d);
            }
            if (i2 == 5) {
                return f125541d;
            }
            bxxk bxxk = f125542e;
            if (bxxk == null) {
                synchronized (bkza.class) {
                    bxxk = f125542e;
                    if (bxxk == null) {
                        bxxk = new bxve(f125541d);
                        f125542e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
