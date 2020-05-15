package p000;

/* renamed from: bpxh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpxh extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bpxh f139708d;

    /* renamed from: e */
    private static volatile bxxk f139709e;

    /* renamed from: a */
    public int f139710a;

    /* renamed from: b */
    public bpxg f139711b;

    /* renamed from: c */
    public bpxi f139712c;

    static {
        bpxh bpxh = new bpxh();
        f139708d = bpxh;
        GeneratedMessageLite.m124024a(bpxh.class, bpxh);
    }

    private bpxh() {
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
            return GeneratedMessageLite.m124022a(f139708d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bpxh();
        } else {
            if (i2 == 4) {
                return new bxvd(f139708d);
            }
            if (i2 == 5) {
                return f139708d;
            }
            bxxk bxxk = f139709e;
            if (bxxk == null) {
                synchronized (bpxh.class) {
                    bxxk = f139709e;
                    if (bxxk == null) {
                        bxxk = new bxve(f139708d);
                        f139709e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
