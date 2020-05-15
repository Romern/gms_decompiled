package p000;

/* renamed from: bwpg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwpg extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bwpg f160541c;

    /* renamed from: d */
    public static final bxvj f160542d;

    /* renamed from: e */
    private static volatile bxxk f160543e;

    /* renamed from: a */
    public int f160544a;

    /* renamed from: b */
    public String f160545b = "";

    static {
        bwpg bwpg = new bwpg();
        f160541c = bwpg;
        bxvk.m124024a(bwpg.class, bwpg);
        bwog bwog = bwog.f160437f;
        bwpg bwpg2 = f160541c;
        f160542d = bxvk.m124006a(bwog, bwpg2, bwpg2, 278927464, bxzf.MESSAGE);
    }

    private bwpg() {
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
            return bxvk.m124022a(f160541c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bwpg();
        } else {
            if (i2 == 4) {
                return new bxvd(f160541c);
            }
            if (i2 == 5) {
                return f160541c;
            }
            bxxk bxxk = f160543e;
            if (bxxk == null) {
                synchronized (bwpg.class) {
                    bxxk = f160543e;
                    if (bxxk == null) {
                        bxxk = new bxve(f160541c);
                        f160543e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
