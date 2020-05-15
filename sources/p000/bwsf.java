package p000;

/* renamed from: bwsf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwsf extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bwsf f160851b;

    /* renamed from: c */
    public static final bxvj f160852c;

    /* renamed from: e */
    private static volatile bxxk f160853e;

    /* renamed from: a */
    public String f160854a = "";

    /* renamed from: d */
    private int f160855d;

    static {
        bwsf bwsf = new bwsf();
        f160851b = bwsf;
        bxvk.m124024a(bwsf.class, bwsf);
        bwny bwny = bwny.f160414k;
        bwsf bwsf2 = f160851b;
        f160852c = bxvk.m124006a(bwny, bwsf2, bwsf2, 247679520, bxzf.MESSAGE);
    }

    private bwsf() {
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
            return bxvk.m124022a(f160851b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"d", "a"});
        } else if (i2 == 3) {
            return new bwsf();
        } else {
            if (i2 == 4) {
                return new bxvd(f160851b);
            }
            if (i2 == 5) {
                return f160851b;
            }
            bxxk bxxk = f160853e;
            if (bxxk == null) {
                synchronized (bwsf.class) {
                    bxxk = f160853e;
                    if (bxxk == null) {
                        bxxk = new bxve(f160851b);
                        f160853e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
