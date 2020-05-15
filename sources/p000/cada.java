package p000;

/* renamed from: cada */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cada extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final cada f172644d;

    /* renamed from: f */
    private static volatile bxxk f172645f;

    /* renamed from: a */
    public String f172646a = "";

    /* renamed from: b */
    public caaw f172647b;

    /* renamed from: c */
    public int f172648c;

    /* renamed from: e */
    private int f172649e;

    static {
        cada cada = new cada();
        f172644d = cada;
        GeneratedMessageLite.m124024a(cada.class, cada);
    }

    private cada() {
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
            return GeneratedMessageLite.m124022a(f172644d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဌ\u0002", new Object[]{"e", "a", "b", "c", cacy.f172643a});
        } else if (i2 == 3) {
            return new cada();
        } else {
            if (i2 == 4) {
                return new bxvd(f172644d);
            }
            if (i2 == 5) {
                return f172644d;
            }
            bxxk bxxk = f172645f;
            if (bxxk == null) {
                synchronized (cada.class) {
                    bxxk = f172645f;
                    if (bxxk == null) {
                        bxxk = new bxve(f172644d);
                        f172645f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
