package p000;

/* renamed from: lao */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lao extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final lao f25582e;

    /* renamed from: f */
    private static volatile bxxk f25583f;

    /* renamed from: a */
    public int f25584a;

    /* renamed from: b */
    public boolean f25585b;

    /* renamed from: c */
    public boolean f25586c;

    /* renamed from: d */
    public boolean f25587d;

    static {
        lao lao = new lao();
        f25582e = lao;
        GeneratedMessageLite.m124024a(lao.class, lao);
    }

    private lao() {
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
            return GeneratedMessageLite.m124022a(f25582e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002\u0007\u0003\u0007\u0004\u0007", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new lao();
        } else {
            if (i2 == 4) {
                return new bxvd(f25582e);
            }
            if (i2 == 5) {
                return f25582e;
            }
            bxxk bxxk = f25583f;
            if (bxxk == null) {
                synchronized (lao.class) {
                    bxxk = f25583f;
                    if (bxxk == null) {
                        bxxk = new bxve(f25582e);
                        f25583f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
