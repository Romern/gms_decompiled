package p000;

/* renamed from: bomr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bomr extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final bomr f133700h;

    /* renamed from: i */
    private static volatile bxxk f133701i;

    /* renamed from: a */
    public int f133702a;

    /* renamed from: b */
    public bxwc f133703b = bxxn.f165040b;

    /* renamed from: c */
    public boolean f133704c;

    /* renamed from: d */
    public boolean f133705d;

    /* renamed from: e */
    public boolean f133706e;

    /* renamed from: f */
    public boolean f133707f;

    /* renamed from: g */
    public String f133708g = "";

    static {
        bomr bomr = new bomr();
        f133700h = bomr;
        GeneratedMessageLite.m124024a(bomr.class, bomr);
    }

    private bomr() {
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
            return GeneratedMessageLite.m124022a(f133700h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u001a\u0002ဇ\u0000\u0003ဇ\u0001\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဈ\u0004", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new bomr();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][]) null, (boolean[]) null);
            }
            if (i2 == 5) {
                return f133700h;
            }
            bxxk bxxk = f133701i;
            if (bxxk == null) {
                synchronized (bomr.class) {
                    bxxk = f133701i;
                    if (bxxk == null) {
                        bxxk = new bxve(f133700h);
                        f133701i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
