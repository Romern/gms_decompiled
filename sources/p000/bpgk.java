package p000;

/* renamed from: bpgk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpgk extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bpgk f137503d;

    /* renamed from: e */
    private static volatile bxxk f137504e;

    /* renamed from: a */
    public int f137505a;

    /* renamed from: b */
    public int f137506b;

    /* renamed from: c */
    public String f137507c = "";

    static {
        bpgk bpgk = new bpgk();
        f137503d = bpgk;
        GeneratedMessageLite.m124024a(bpgk.class, bpgk);
    }

    private bpgk() {
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
            return GeneratedMessageLite.m124022a(f137503d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", bzzv.m126374b(), "c"});
        } else if (i2 == 3) {
            return new bpgk();
        } else {
            if (i2 == 4) {
                return new bxvd(f137503d);
            }
            if (i2 == 5) {
                return f137503d;
            }
            bxxk bxxk = f137504e;
            if (bxxk == null) {
                synchronized (bpgk.class) {
                    bxxk = f137504e;
                    if (bxxk == null) {
                        bxxk = new bxve(f137503d);
                        f137504e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
