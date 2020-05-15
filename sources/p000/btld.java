package p000;

/* renamed from: btld */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btld extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final btld f149350e;

    /* renamed from: f */
    private static volatile bxxk f149351f;

    /* renamed from: a */
    public int f149352a = 0;

    /* renamed from: b */
    public Object f149353b;

    /* renamed from: c */
    public String f149354c = "";

    /* renamed from: d */
    public int f149355d;

    static {
        btld btld = new btld();
        f149350e = btld;
        GeneratedMessageLite.m124024a(btld.class, btld);
    }

    private btld() {
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
            return GeneratedMessageLite.m124022a(f149350e, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003<\u0000\u0004?\u0000", new Object[]{"b", "a", "c", "d", btiy.class});
        } else if (i2 == 3) {
            return new btld();
        } else {
            if (i2 == 4) {
                return new bxvd(f149350e);
            }
            if (i2 == 5) {
                return f149350e;
            }
            bxxk bxxk = f149351f;
            if (bxxk == null) {
                synchronized (btld.class) {
                    bxxk = f149351f;
                    if (bxxk == null) {
                        bxxk = new bxve(f149350e);
                        f149351f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
