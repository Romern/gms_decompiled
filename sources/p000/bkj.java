package p000;

/* renamed from: bkj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkj extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bkj f4972g;

    /* renamed from: h */
    private static volatile bxxk f4973h;

    /* renamed from: a */
    public int f4974a;

    /* renamed from: b */
    public long f4975b;

    /* renamed from: c */
    public long f4976c;

    /* renamed from: d */
    public long f4977d;

    /* renamed from: e */
    public bkq f4978e;

    /* renamed from: f */
    public boolean f4979f = true;

    static {
        bkj bkj = new bkj();
        f4972g = bkj;
        bxvk.m124024a(bkj.class, bkj);
    }

    private bkj() {
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
            return bxvk.m124022a(f4972g, "\u0001\u0005\u0000\u0001\u0001e\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002dဉ\u0007eဇ\b", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bkj();
        } else {
            if (i2 == 4) {
                return new bxvd(f4972g);
            }
            if (i2 == 5) {
                return f4972g;
            }
            bxxk bxxk = f4973h;
            if (bxxk == null) {
                synchronized (bkj.class) {
                    bxxk = f4973h;
                    if (bxxk == null) {
                        bxxk = new bxve(f4972g);
                        f4973h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
