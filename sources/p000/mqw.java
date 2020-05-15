package p000;

/* renamed from: mqw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mqw extends bxvk implements bxxd {

    /* renamed from: f */
    public static final mqw f34359f;

    /* renamed from: g */
    private static volatile bxxk f34360g;

    /* renamed from: a */
    public int f34361a;

    /* renamed from: b */
    public int f34362b;

    /* renamed from: c */
    public String f34363c = "";

    /* renamed from: d */
    public boolean f34364d;

    /* renamed from: e */
    public boolean f34365e;

    static {
        mqw mqw = new mqw();
        f34359f = mqw;
        bxvk.m124024a(mqw.class, mqw);
    }

    private mqw() {
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
            return bxvk.m124022a(f34359f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", mqv.f34358a, "c", "d", "e"});
        } else if (i2 == 3) {
            return new mqw();
        } else {
            if (i2 == 4) {
                return new bxvd(f34359f);
            }
            if (i2 == 5) {
                return f34359f;
            }
            bxxk bxxk = f34360g;
            if (bxxk == null) {
                synchronized (mqw.class) {
                    bxxk = f34360g;
                    if (bxxk == null) {
                        bxxk = new bxve(f34359f);
                        f34360g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
