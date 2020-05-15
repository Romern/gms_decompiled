package p000;

/* renamed from: bsli */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsli extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bsli f144923d;

    /* renamed from: e */
    private static volatile bxxk f144924e;

    /* renamed from: a */
    public int f144925a;

    /* renamed from: b */
    public int f144926b;

    /* renamed from: c */
    public String f144927c = "";

    static {
        bsli bsli = new bsli();
        f144923d = bsli;
        bxvk.m124024a(bsli.class, bsli);
    }

    private bsli() {
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
            return bxvk.m124022a(f144923d, "\u0001\u0002\u0000\u0001\u0002\u0004\u0002\u0000\u0000\u0000\u0002ဌ\u0000\u0004ဈ\u0002", new Object[]{"a", "b", bsll.f144929a, "c"});
        } else if (i2 == 3) {
            return new bsli();
        } else {
            if (i2 == 4) {
                return new bxvd(f144923d);
            }
            if (i2 == 5) {
                return f144923d;
            }
            bxxk bxxk = f144924e;
            if (bxxk == null) {
                synchronized (bsli.class) {
                    bxxk = f144924e;
                    if (bxxk == null) {
                        bxxk = new bxve(f144923d);
                        f144924e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
