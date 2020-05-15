package p000;

/* renamed from: bvuw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvuw extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bvuw f157752c;

    /* renamed from: d */
    private static volatile bxxk f157753d;

    /* renamed from: a */
    public int f157754a;

    /* renamed from: b */
    public byex f157755b;

    static {
        bvuw bvuw = new bvuw();
        f157752c = bvuw;
        GeneratedMessageLite.m124024a(bvuw.class, bvuw);
    }

    private bvuw() {
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
            return GeneratedMessageLite.m124022a(f157752c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bvuw();
        } else {
            if (i2 == 4) {
                return new bxvd(f157752c);
            }
            if (i2 == 5) {
                return f157752c;
            }
            bxxk bxxk = f157753d;
            if (bxxk == null) {
                synchronized (bvuw.class) {
                    bxxk = f157753d;
                    if (bxxk == null) {
                        bxxk = new bxve(f157752c);
                        f157753d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
