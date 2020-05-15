package p000;

/* renamed from: bqjf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqjf extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bqjf f140941e;

    /* renamed from: f */
    private static volatile bxxk f140942f;

    /* renamed from: a */
    public int f140943a;

    /* renamed from: b */
    public int f140944b;

    /* renamed from: c */
    public int f140945c;

    /* renamed from: d */
    public String f140946d = "";

    static {
        bqjf bqjf = new bqjf();
        f140941e = bqjf;
        GeneratedMessageLite.m124024a(bqjf.class, bqjf);
    }

    private bqjf() {
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
            return GeneratedMessageLite.m124022a(f140941e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", bqjx.f140973a, "c", bqjz.f140974a, "d"});
        } else if (i2 == 3) {
            return new bqjf();
        } else {
            if (i2 == 4) {
                return new bxvd(f140941e);
            }
            if (i2 == 5) {
                return f140941e;
            }
            bxxk bxxk = f140942f;
            if (bxxk == null) {
                synchronized (bqjf.class) {
                    bxxk = f140942f;
                    if (bxxk == null) {
                        bxxk = new bxve(f140941e);
                        f140942f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
