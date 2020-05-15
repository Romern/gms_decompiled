package p000;

/* renamed from: bwol */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwol extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bwol f160460d;

    /* renamed from: e */
    public static final bxvj f160461e;

    /* renamed from: g */
    private static volatile bxxk f160462g;

    /* renamed from: a */
    public int f160463a = 0;

    /* renamed from: b */
    public Object f160464b;

    /* renamed from: c */
    public int f160465c;

    /* renamed from: f */
    private int f160466f;

    static {
        bwol bwol = new bwol();
        f160460d = bwol;
        bxvk.m124024a(bwol.class, bwol);
        bwoi bwoi = bwoi.f160451f;
        bwol bwol2 = f160460d;
        f160461e = bxvk.m124006a(bwoi, bwol2, bwol2, 232946268, bxzf.MESSAGE);
    }

    private bwol() {
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
            return bxvk.m124022a(f160460d, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဿ\u0000\u0003့\u0000", new Object[]{"b", "a", "f", "c", bwoj.f160459a, bwob.f160428a});
        } else if (i2 == 3) {
            return new bwol();
        } else {
            if (i2 == 4) {
                return new bxvd(f160460d);
            }
            if (i2 == 5) {
                return f160460d;
            }
            bxxk bxxk = f160462g;
            if (bxxk == null) {
                synchronized (bwol.class) {
                    bxxk = f160462g;
                    if (bxxk == null) {
                        bxxk = new bxve(f160460d);
                        f160462g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
