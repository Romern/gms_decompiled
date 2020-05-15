package p000;

/* renamed from: bxhh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxhh extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final bxhh f163382h;

    /* renamed from: i */
    private static volatile bxxk f163383i;

    /* renamed from: a */
    public int f163384a;

    /* renamed from: b */
    public int f163385b;

    /* renamed from: c */
    public int f163386c;

    /* renamed from: d */
    public int f163387d;

    /* renamed from: e */
    public int f163388e;

    /* renamed from: f */
    public int f163389f;

    /* renamed from: g */
    public int f163390g;

    static {
        bxhh bxhh = new bxhh();
        f163382h = bxhh;
        GeneratedMessageLite.m124024a(bxhh.class, bxhh);
    }

    private bxhh() {
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
            return GeneratedMessageLite.m124022a(f163382h, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0000\u0001င\u0000\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new bxhh();
        } else {
            if (i2 == 4) {
                return new bxvd(f163382h);
            }
            if (i2 == 5) {
                return f163382h;
            }
            bxxk bxxk = f163383i;
            if (bxxk == null) {
                synchronized (bxhh.class) {
                    bxxk = f163383i;
                    if (bxxk == null) {
                        bxxk = new bxve(f163382h);
                        f163383i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
