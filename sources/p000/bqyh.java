package p000;

/* renamed from: bqyh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqyh extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bqyh f141944d;

    /* renamed from: e */
    private static volatile bxxk f141945e;

    /* renamed from: a */
    public int f141946a;

    /* renamed from: b */
    public bqyk f141947b;

    /* renamed from: c */
    public bqyg f141948c;

    static {
        bqyh bqyh = new bqyh();
        f141944d = bqyh;
        GeneratedMessageLite.m124024a(bqyh.class, bqyh);
    }

    private bqyh() {
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
            return GeneratedMessageLite.m124022a(f141944d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bqyh();
        } else {
            if (i2 == 4) {
                return new bxvd(f141944d);
            }
            if (i2 == 5) {
                return f141944d;
            }
            bxxk bxxk = f141945e;
            if (bxxk == null) {
                synchronized (bqyh.class) {
                    bxxk = f141945e;
                    if (bxxk == null) {
                        bxxk = new bxve(f141944d);
                        f141945e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
