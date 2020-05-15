package p000;

/* renamed from: bvlg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvlg extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bvlg f156529e;

    /* renamed from: f */
    private static volatile bxxk f156530f;

    /* renamed from: a */
    public int f156531a;

    /* renamed from: b */
    public bvov f156532b;

    /* renamed from: c */
    public bvme f156533c;

    /* renamed from: d */
    public int f156534d;

    static {
        bvlg bvlg = new bvlg();
        f156529e = bvlg;
        bxvk.m124024a(bvlg.class, bvlg);
    }

    private bvlg() {
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
            return bxvk.m124022a(f156529e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003င\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bvlg();
        } else {
            if (i2 == 4) {
                return new bxvd(f156529e);
            }
            if (i2 == 5) {
                return f156529e;
            }
            bxxk bxxk = f156530f;
            if (bxxk == null) {
                synchronized (bvlg.class) {
                    bxxk = f156530f;
                    if (bxxk == null) {
                        bxxk = new bxve(f156529e);
                        f156530f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
