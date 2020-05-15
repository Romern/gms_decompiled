package p000;

/* renamed from: bvym */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvym extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bvym f158190f;

    /* renamed from: g */
    private static volatile bxxk f158191g;

    /* renamed from: a */
    public int f158192a;

    /* renamed from: b */
    public int f158193b;

    /* renamed from: c */
    public bvwb f158194c;

    /* renamed from: d */
    public bvxn f158195d;

    /* renamed from: e */
    public bvxo f158196e;

    static {
        bvym bvym = new bvym();
        f158190f = bvym;
        bxvk.m124024a(bvym.class, bvym);
    }

    private bvym() {
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
            return bxvk.m124022a(f158190f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001င\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0006ဉ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bvym();
        } else {
            if (i2 == 4) {
                return new bxvd(f158190f);
            }
            if (i2 == 5) {
                return f158190f;
            }
            bxxk bxxk = f158191g;
            if (bxxk == null) {
                synchronized (bvym.class) {
                    bxxk = f158191g;
                    if (bxxk == null) {
                        bxxk = new bxve(f158190f);
                        f158191g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
