package p000;

/* renamed from: bwjt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwjt extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bwjt f159866c;

    /* renamed from: d */
    private static volatile bxxk f159867d;

    /* renamed from: a */
    public int f159868a;

    /* renamed from: b */
    public bmaj f159869b;

    static {
        bwjt bwjt = new bwjt();
        f159866c = bwjt;
        GeneratedMessageLite.m124024a(bwjt.class, bwjt);
    }

    private bwjt() {
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
            return GeneratedMessageLite.m124022a(f159866c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bwjt();
        } else {
            if (i2 == 4) {
                return new bxvd(f159866c);
            }
            if (i2 == 5) {
                return f159866c;
            }
            bxxk bxxk = f159867d;
            if (bxxk == null) {
                synchronized (bwjt.class) {
                    bxxk = f159867d;
                    if (bxxk == null) {
                        bxxk = new bxve(f159866c);
                        f159867d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
