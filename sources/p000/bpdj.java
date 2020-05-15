package p000;

/* renamed from: bpdj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpdj extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bpdj f136247f;

    /* renamed from: g */
    private static volatile bxxk f136248g;

    /* renamed from: a */
    public int f136249a;

    /* renamed from: b */
    public int f136250b;

    /* renamed from: c */
    public int f136251c;

    /* renamed from: d */
    public String f136252d = "";

    /* renamed from: e */
    public int f136253e;

    static {
        bpdj bpdj = new bpdj();
        f136247f = bpdj;
        bxvk.m124024a(bpdj.class, bpdj);
    }

    private bpdj() {
        bxxn bxxn = bxxn.f165040b;
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
            return bxvk.m124022a(f136247f, "\u0001\u0004\u0000\u0001\u0001\n\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\tဈ\u0007\nင\b", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bpdj();
        } else {
            if (i2 == 4) {
                return new bxvd(f136247f);
            }
            if (i2 == 5) {
                return f136247f;
            }
            bxxk bxxk = f136248g;
            if (bxxk == null) {
                synchronized (bpdj.class) {
                    bxxk = f136248g;
                    if (bxxk == null) {
                        bxxk = new bxve(f136247f);
                        f136248g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
