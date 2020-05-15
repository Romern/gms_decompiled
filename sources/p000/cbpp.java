package p000;

/* renamed from: cbpp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbpp extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final cbpp f177942c;

    /* renamed from: d */
    private static volatile bxxk f177943d;

    /* renamed from: a */
    public int f177944a;

    /* renamed from: b */
    public int f177945b;

    static {
        cbpp cbpp = new cbpp();
        f177942c = cbpp;
        GeneratedMessageLite.m124024a(cbpp.class, cbpp);
    }

    private cbpp() {
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
            return GeneratedMessageLite.m124022a(f177942c, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\f\u0003\f", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new cbpp();
        } else {
            if (i2 == 4) {
                return new bxvd(f177942c);
            }
            if (i2 == 5) {
                return f177942c;
            }
            bxxk bxxk = f177943d;
            if (bxxk == null) {
                synchronized (cbpp.class) {
                    bxxk = f177943d;
                    if (bxxk == null) {
                        bxxk = new bxve(f177942c);
                        f177943d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
