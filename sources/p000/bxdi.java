package p000;

/* renamed from: bxdi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxdi extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bxdi f163030e;

    /* renamed from: f */
    private static volatile bxxk f163031f;

    /* renamed from: a */
    public int f163032a;

    /* renamed from: b */
    public int f163033b;

    /* renamed from: c */
    public long f163034c;

    /* renamed from: d */
    public int f163035d;

    static {
        bxdi bxdi = new bxdi();
        f163030e = bxdi;
        GeneratedMessageLite.m124024a(bxdi.class, bxdi);
    }

    private bxdi() {
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
            return GeneratedMessageLite.m124022a(f163030e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003င\u0002", new Object[]{"a", "b", bxdg.f163029a, "c", "d"});
        } else if (i2 == 3) {
            return new bxdi();
        } else {
            if (i2 == 4) {
                return new bxvd(f163030e);
            }
            if (i2 == 5) {
                return f163030e;
            }
            bxxk bxxk = f163031f;
            if (bxxk == null) {
                synchronized (bxdi.class) {
                    bxxk = f163031f;
                    if (bxxk == null) {
                        bxxk = new bxve(f163030e);
                        f163031f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
