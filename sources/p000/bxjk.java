package p000;

/* renamed from: bxjk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxjk extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bxjk f163646e;

    /* renamed from: f */
    private static volatile bxxk f163647f;

    /* renamed from: a */
    public int f163648a;

    /* renamed from: b */
    public String f163649b = "";

    /* renamed from: c */
    public int f163650c;

    /* renamed from: d */
    public int f163651d;

    static {
        bxjk bxjk = new bxjk();
        f163646e = bxjk;
        GeneratedMessageLite.m124024a(bxjk.class, bxjk);
    }

    private bxjk() {
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
            return GeneratedMessageLite.m124022a(f163646e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", "c", bxjj.f163645a, "d", bxco.m122578b()});
        } else if (i2 == 3) {
            return new bxjk();
        } else {
            if (i2 == 4) {
                return new bxvd(f163646e);
            }
            if (i2 == 5) {
                return f163646e;
            }
            bxxk bxxk = f163647f;
            if (bxxk == null) {
                synchronized (bxjk.class) {
                    bxxk = f163647f;
                    if (bxxk == null) {
                        bxxk = new bxve(f163646e);
                        f163647f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
