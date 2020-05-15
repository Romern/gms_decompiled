package p000;

/* renamed from: bpya */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpya extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bpya f139814c;

    /* renamed from: d */
    private static volatile bxxk f139815d;

    /* renamed from: a */
    public int f139816a;

    /* renamed from: b */
    public int f139817b;

    static {
        bpya bpya = new bpya();
        f139814c = bpya;
        GeneratedMessageLite.m124024a(bpya.class, bpya);
    }

    private bpya() {
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
            return GeneratedMessageLite.m124022a(f139814c, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0000\u0005ဌ\u0004", new Object[]{"a", "b", bqam.m112473b()});
        } else if (i2 == 3) {
            return new bpya();
        } else {
            if (i2 == 4) {
                return new bxvd(f139814c);
            }
            if (i2 == 5) {
                return f139814c;
            }
            bxxk bxxk = f139815d;
            if (bxxk == null) {
                synchronized (bpya.class) {
                    bxxk = f139815d;
                    if (bxxk == null) {
                        bxxk = new bxve(f139814c);
                        f139815d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
