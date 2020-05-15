package p000;

/* renamed from: bmgo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmgo extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bmgo f129290e;

    /* renamed from: f */
    private static volatile bxxk f129291f;

    /* renamed from: a */
    public int f129292a = 0;

    /* renamed from: b */
    public Object f129293b;

    /* renamed from: c */
    public bxvw f129294c = bxwq.f165002b;

    /* renamed from: d */
    public bxvw f129295d = bxwq.f165002b;

    static {
        bmgo bmgo = new bmgo();
        f129290e = bmgo;
        GeneratedMessageLite.m124024a(bmgo.class, bmgo);
    }

    private bmgo() {
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
            return GeneratedMessageLite.m124022a(f129290e, "\u0001\u0004\u0001\u0000\u0001\u0006\u0004\u0000\u0002\u0000\u0001ြ\u0000\u0002ြ\u0000\u0005%\u0006%", new Object[]{"b", "a", bmgl.class, bmfv.class, "c", "d"});
        } else if (i2 == 3) {
            return new bmgo();
        } else {
            if (i2 == 4) {
                return new bxvd((char[]) null, (short[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f129290e;
            }
            bxxk bxxk = f129291f;
            if (bxxk == null) {
                synchronized (bmgo.class) {
                    bxxk = f129291f;
                    if (bxxk == null) {
                        bxxk = new bxve(f129290e);
                        f129291f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
