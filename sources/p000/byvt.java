package p000;

/* renamed from: byvt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byvt extends bxvk implements bxxd {

    /* renamed from: i */
    public static final byvt f168503i;

    /* renamed from: j */
    private static volatile bxxk f168504j;

    /* renamed from: a */
    public int f168505a;

    /* renamed from: b */
    public int f168506b;

    /* renamed from: c */
    public int f168507c;

    /* renamed from: d */
    public int f168508d;

    /* renamed from: e */
    public double f168509e;

    /* renamed from: f */
    public long f168510f;

    /* renamed from: g */
    public int f168511g;

    /* renamed from: h */
    public int f168512h;

    static {
        byvt byvt = new byvt();
        f168503i = byvt;
        bxvk.m124024a(byvt.class, byvt);
    }

    private byvt() {
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
            return bxvk.m124022a(f168503i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004က\u0003\u0005ဂ\u0004\u0006ဌ\u0005\u0007ဌ\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", bzak.f169217a, "h", bvja.f156300a});
        } else if (i2 == 3) {
            return new byvt();
        } else {
            if (i2 == 4) {
                return new bxvd(f168503i);
            }
            if (i2 == 5) {
                return f168503i;
            }
            bxxk bxxk = f168504j;
            if (bxxk == null) {
                synchronized (byvt.class) {
                    bxxk = f168504j;
                    if (bxxk == null) {
                        bxxk = new bxve(f168503i);
                        f168504j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
