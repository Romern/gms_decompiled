package p000;

/* renamed from: bxhc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxhc extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bxhc f163338e;

    /* renamed from: f */
    private static volatile bxxk f163339f;

    /* renamed from: a */
    public int f163340a;

    /* renamed from: b */
    public String f163341b = "";

    /* renamed from: c */
    public String f163342c = "";

    /* renamed from: d */
    public bxhl f163343d;

    static {
        bxhc bxhc = new bxhc();
        f163338e = bxhc;
        GeneratedMessageLite.m124024a(bxhc.class, bxhc);
    }

    private bxhc() {
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
            return GeneratedMessageLite.m124022a(f163338e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0004ဉ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bxhc();
        } else {
            if (i2 == 4) {
                return new bxvd(f163338e);
            }
            if (i2 == 5) {
                return f163338e;
            }
            bxxk bxxk = f163339f;
            if (bxxk == null) {
                synchronized (bxhc.class) {
                    bxxk = f163339f;
                    if (bxxk == null) {
                        bxxk = new bxve(f163338e);
                        f163339f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
