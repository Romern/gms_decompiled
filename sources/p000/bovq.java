package p000;

/* renamed from: bovq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bovq extends bxvk implements bxxd {

    /* renamed from: h */
    public static final bovq f135040h;

    /* renamed from: i */
    private static volatile bxxk f135041i;

    /* renamed from: a */
    public int f135042a;

    /* renamed from: b */
    public int f135043b;

    /* renamed from: c */
    public boolean f135044c;

    /* renamed from: d */
    public int f135045d;

    /* renamed from: e */
    public int f135046e;

    /* renamed from: f */
    public boolean f135047f;

    /* renamed from: g */
    public boolean f135048g;

    static {
        bovq bovq = new bovq();
        f135040h = bovq;
        bxvk.m124024a(bovq.class, bovq);
    }

    private bovq() {
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
            return bxvk.m124022a(f135040h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003င\u0002\u0004င\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new bovq();
        } else {
            if (i2 == 4) {
                return new bxvd(f135040h);
            }
            if (i2 == 5) {
                return f135040h;
            }
            bxxk bxxk = f135041i;
            if (bxxk == null) {
                synchronized (bovq.class) {
                    bxxk = f135041i;
                    if (bxxk == null) {
                        bxxk = new bxve(f135040h);
                        f135041i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
