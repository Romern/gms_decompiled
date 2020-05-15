package p000;

/* renamed from: bsrg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsrg extends bxvk implements bxxd {

    /* renamed from: m */
    public static final bsrg f146749m;

    /* renamed from: n */
    private static volatile bxxk f146750n;

    /* renamed from: a */
    public int f146751a;

    /* renamed from: b */
    public int f146752b;

    /* renamed from: c */
    public bsqi f146753c;

    /* renamed from: d */
    public bsqk f146754d;

    /* renamed from: e */
    public bsqn f146755e;

    /* renamed from: f */
    public bsqs f146756f;

    /* renamed from: g */
    public bsqz f146757g;

    /* renamed from: h */
    public bsri f146758h;

    /* renamed from: i */
    public bsru f146759i;

    /* renamed from: j */
    public bsry f146760j;

    /* renamed from: k */
    public bssf f146761k;

    /* renamed from: l */
    public bssh f146762l;

    static {
        bsrg bsrg = new bsrg();
        f146749m = bsrg;
        bxvk.m124024a(bsrg.class, bsrg);
    }

    private bsrg() {
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
            return bxvk.m124022a(f146749m, "\u0001\n\u0000\u0002\u0002/\n\u0000\u0000\u0000\u0002ဉ\u0000\u0003ဉ\u001e\u0004ဉ\u0001\u0005ဉ\u001b\fဉ\u0002\rဉ\n\u000fဉ('ဉ!)ဉ\u0003/ဉ\u0005", new Object[]{"a", "b", "c", "j", "d", "i", "e", "h", "l", "k", "f", "g"});
        } else if (i2 == 3) {
            return new bsrg();
        } else {
            if (i2 == 4) {
                return new bxvd(f146749m);
            }
            if (i2 == 5) {
                return f146749m;
            }
            bxxk bxxk = f146750n;
            if (bxxk == null) {
                synchronized (bsrg.class) {
                    bxxk = f146750n;
                    if (bxxk == null) {
                        bxxk = new bxve(f146749m);
                        f146750n = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
