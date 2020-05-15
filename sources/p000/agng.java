package p000;

/* renamed from: agng */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agng extends bxvk implements bxxd {

    /* renamed from: f */
    public static final agng f66052f;

    /* renamed from: g */
    private static volatile bxxk f66053g;

    /* renamed from: a */
    public int f66054a;

    /* renamed from: b */
    public int f66055b;

    /* renamed from: c */
    public agno f66056c;

    /* renamed from: d */
    public agno f66057d;

    /* renamed from: e */
    public boolean f66058e;

    static {
        agng agng = new agng();
        f66052f = agng;
        bxvk.m124024a(agng.class, agng);
    }

    private agng() {
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
            return bxvk.m124022a(f66052f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new agng();
        } else {
            if (i2 == 4) {
                return new bxvd(f66052f);
            }
            if (i2 == 5) {
                return f66052f;
            }
            bxxk bxxk = f66053g;
            if (bxxk == null) {
                synchronized (agng.class) {
                    bxxk = f66053g;
                    if (bxxk == null) {
                        bxxk = new bxve(f66052f);
                        f66053g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
