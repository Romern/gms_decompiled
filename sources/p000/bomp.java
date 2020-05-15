package p000;

/* renamed from: bomp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bomp extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bomp f133689f;

    /* renamed from: g */
    private static volatile bxxk f133690g;

    /* renamed from: a */
    public int f133691a;

    /* renamed from: b */
    public int f133692b;

    /* renamed from: c */
    public int f133693c;

    /* renamed from: d */
    public int f133694d;

    /* renamed from: e */
    public String f133695e = "";

    static {
        bomp bomp = new bomp();
        f133689f = bomp;
        bxvk.m124024a(bomp.class, bomp);
    }

    private bomp() {
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
            return bxvk.m124022a(f133689f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004ဈ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bomp();
        } else {
            if (i2 == 4) {
                return new bxvd(f133689f);
            }
            if (i2 == 5) {
                return f133689f;
            }
            bxxk bxxk = f133690g;
            if (bxxk == null) {
                synchronized (bomp.class) {
                    bxxk = f133690g;
                    if (bxxk == null) {
                        bxxk = new bxve(f133689f);
                        f133690g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
