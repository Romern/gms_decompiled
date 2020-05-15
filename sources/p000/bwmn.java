package p000;

/* renamed from: bwmn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwmn extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bwmn f160289e;

    /* renamed from: f */
    public static final bxvj f160290f;

    /* renamed from: g */
    private static volatile bxxk f160291g;

    /* renamed from: a */
    public int f160292a;

    /* renamed from: b */
    public int f160293b = 0;

    /* renamed from: c */
    public Object f160294c;

    /* renamed from: d */
    public int f160295d;

    static {
        bwmn bwmn = new bwmn();
        f160289e = bwmn;
        bxvk.m124024a(bwmn.class, bwmn);
        bwoi bwoi = bwoi.f160451f;
        bwmn bwmn2 = f160289e;
        f160290f = bxvk.m124006a(bwoi, bwmn2, bwmn2, 260216774, bxzf.MESSAGE);
    }

    private bwmn() {
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
            return bxvk.m124022a(f160289e, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဿ\u0000", new Object[]{"c", "b", "a", "d", bwml.f160288a, bwmu.m122116b()});
        } else if (i2 == 3) {
            return new bwmn();
        } else {
            if (i2 == 4) {
                return new bxvd(f160289e);
            }
            if (i2 == 5) {
                return f160289e;
            }
            bxxk bxxk = f160291g;
            if (bxxk == null) {
                synchronized (bwmn.class) {
                    bxxk = f160291g;
                    if (bxxk == null) {
                        bxxk = new bxve(f160289e);
                        f160291g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
