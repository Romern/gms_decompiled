package p000;

/* renamed from: bomy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bomy extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bomy f133736f;

    /* renamed from: g */
    private static volatile bxxk f133737g;

    /* renamed from: a */
    public int f133738a;

    /* renamed from: b */
    public boolean f133739b;

    /* renamed from: c */
    public boolean f133740c;

    /* renamed from: d */
    public int f133741d;

    /* renamed from: e */
    public String f133742e = "";

    static {
        bomy bomy = new bomy();
        f133736f = bomy;
        bxvk.m124024a(bomy.class, bomy);
    }

    private bomy() {
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
            return bxvk.m124022a(f133736f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003င\u0002\u0004ဈ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bomy();
        } else {
            if (i2 == 4) {
                return new bxvd(f133736f);
            }
            if (i2 == 5) {
                return f133736f;
            }
            bxxk bxxk = f133737g;
            if (bxxk == null) {
                synchronized (bomy.class) {
                    bxxk = f133737g;
                    if (bxxk == null) {
                        bxxk = new bxve(f133736f);
                        f133737g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
