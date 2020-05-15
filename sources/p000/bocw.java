package p000;

/* renamed from: bocw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bocw extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bocw f132642f;

    /* renamed from: g */
    private static volatile bxxk f132643g;

    /* renamed from: a */
    public int f132644a;

    /* renamed from: b */
    public boolean f132645b;

    /* renamed from: c */
    public String f132646c = "";

    /* renamed from: d */
    public long f132647d;

    /* renamed from: e */
    public int f132648e;

    static {
        bocw bocw = new bocw();
        f132642f = bocw;
        GeneratedMessageLite.m124024a(bocw.class, bocw);
    }

    private bocw() {
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
            return GeneratedMessageLite.m124022a(f132642f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004င\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bocw();
        } else {
            if (i2 == 4) {
                return new bxvd(f132642f);
            }
            if (i2 == 5) {
                return f132642f;
            }
            bxxk bxxk = f132643g;
            if (bxxk == null) {
                synchronized (bocw.class) {
                    bxxk = f132643g;
                    if (bxxk == null) {
                        bxxk = new bxve(f132642f);
                        f132643g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
