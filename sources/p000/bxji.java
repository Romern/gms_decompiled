package p000;

/* renamed from: bxji */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxji extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bxji f163641b;

    /* renamed from: d */
    private static volatile bxxk f163642d;

    /* renamed from: a */
    public bxjd f163643a;

    /* renamed from: c */
    private int f163644c;

    static {
        bxji bxji = new bxji();
        f163641b = bxji;
        GeneratedMessageLite.m124024a(bxji.class, bxji);
    }

    private bxji() {
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
            return GeneratedMessageLite.m124022a(f163641b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bxji();
        } else {
            if (i2 == 4) {
                return new bxvd(f163641b);
            }
            if (i2 == 5) {
                return f163641b;
            }
            bxxk bxxk = f163642d;
            if (bxxk == null) {
                synchronized (bxji.class) {
                    bxxk = f163642d;
                    if (bxxk == null) {
                        bxxk = new bxve(f163641b);
                        f163642d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
