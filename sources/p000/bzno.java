package p000;

/* renamed from: bzno */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzno extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bzno f170731e;

    /* renamed from: f */
    private static volatile bxxk f170732f;

    /* renamed from: a */
    public int f170733a;

    /* renamed from: b */
    public bznn f170734b;

    /* renamed from: c */
    public bxwc f170735c = bxxn.f165040b;

    /* renamed from: d */
    public bxwc f170736d = bxxn.f165040b;

    static {
        bzno bzno = new bzno();
        f170731e = bzno;
        bxvk.m124024a(bzno.class, bzno);
    }

    private bzno() {
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
            return bxvk.m124022a(f170731e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0003\u001b", new Object[]{"a", "b", "c", bznn.class, "d", bznn.class});
        } else if (i2 == 3) {
            return new bzno();
        } else {
            if (i2 == 4) {
                return new bxvd(f170731e);
            }
            if (i2 == 5) {
                return f170731e;
            }
            bxxk bxxk = f170732f;
            if (bxxk == null) {
                synchronized (bzno.class) {
                    bxxk = f170732f;
                    if (bxxk == null) {
                        bxxk = new bxve(f170731e);
                        f170732f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
