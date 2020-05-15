package p000;

/* renamed from: bxas */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxas extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bxas f161738c;

    /* renamed from: d */
    public static final bxvj f161739d;

    /* renamed from: f */
    private static volatile bxxk f161740f;

    /* renamed from: a */
    public bxvw f161741a = bxwq.f165002b;

    /* renamed from: b */
    public String f161742b = "";

    /* renamed from: e */
    private int f161743e;

    static {
        bxas bxas = new bxas();
        f161738c = bxas;
        bxvk.m124024a(bxas.class, bxas);
        bwny bwny = bwny.f160414k;
        bxas bxas2 = f161738c;
        f161739d = bxvk.m124006a(bwny, bxas2, bxas2, 228971049, bxzf.MESSAGE);
    }

    private bxas() {
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
            return bxvk.m124022a(f161738c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0014\u0002ဈ\u0000", new Object[]{"e", "a", "b"});
        } else if (i2 == 3) {
            return new bxas();
        } else {
            if (i2 == 4) {
                return new bxvd(f161738c);
            }
            if (i2 == 5) {
                return f161738c;
            }
            bxxk bxxk = f161740f;
            if (bxxk == null) {
                synchronized (bxas.class) {
                    bxxk = f161740f;
                    if (bxxk == null) {
                        bxxk = new bxve(f161738c);
                        f161740f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
