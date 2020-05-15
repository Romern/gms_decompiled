package p000;

/* renamed from: bisq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bisq extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bisq f121590f;

    /* renamed from: h */
    private static volatile bxxk f121591h;

    /* renamed from: a */
    public int f121592a;

    /* renamed from: b */
    public int f121593b;

    /* renamed from: c */
    public int f121594c;

    /* renamed from: d */
    public int f121595d;

    /* renamed from: e */
    public int f121596e;

    /* renamed from: g */
    private byte f121597g = 2;

    static {
        bisq bisq = new bisq();
        f121590f = bisq;
        bxvk.m124024a(bisq.class, bisq);
    }

    private bisq() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121597g);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121597g = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f121590f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001ᔄ\u0000\u0002ᔄ\u0001\u0003င\u0002\u0004ဌ\u0003", new Object[]{"a", "b", "c", "d", "e", biso.f121589a});
        } else if (i2 == 3) {
            return new bisq();
        } else {
            if (i2 == 4) {
                return new bxvd(f121590f);
            }
            if (i2 == 5) {
                return f121590f;
            }
            bxxk bxxk = f121591h;
            if (bxxk == null) {
                synchronized (bisq.class) {
                    bxxk = f121591h;
                    if (bxxk == null) {
                        bxxk = new bxve(f121590f);
                        f121591h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
