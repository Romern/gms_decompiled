package p000;

/* renamed from: cakp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cakp extends bxvk implements bxxd {

    /* renamed from: g */
    public static final cakp f175028g;

    /* renamed from: h */
    private static volatile bxxk f175029h;

    /* renamed from: a */
    public bxwc f175030a = bxxn.f165040b;

    /* renamed from: b */
    public long f175031b;

    /* renamed from: c */
    public int f175032c;

    /* renamed from: d */
    public long f175033d;

    /* renamed from: e */
    public int f175034e;

    /* renamed from: f */
    public cako f175035f;

    static {
        cakp cakp = new cakp();
        f175028g = cakp;
        bxvk.m124024a(cakp.class, cakp);
    }

    private cakp() {
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
            return bxvk.m124022a(f175028g, "\u0000\u0006\u0000\u0000\u0001\b\u0006\u0000\u0001\u0000\u0001\u001c\u0002\u0002\u0005\f\u0006\u0002\u0007\f\b\t", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new cakp();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][][]) null, (int[][]) null);
            }
            if (i2 == 5) {
                return f175028g;
            }
            bxxk bxxk = f175029h;
            if (bxxk == null) {
                synchronized (cakp.class) {
                    bxxk = f175029h;
                    if (bxxk == null) {
                        bxxk = new bxve(f175028g);
                        f175029h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
