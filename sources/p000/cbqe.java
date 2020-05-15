package p000;

/* renamed from: cbqe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbqe extends bxvk implements bxxd {

    /* renamed from: c */
    public static final cbqe f178010c;

    /* renamed from: d */
    private static volatile bxxk f178011d;

    /* renamed from: a */
    public String f178012a = "";

    /* renamed from: b */
    public String f178013b = "";

    static {
        cbqe cbqe = new cbqe();
        f178010c = cbqe;
        bxvk.m124024a(cbqe.class, cbqe);
    }

    private cbqe() {
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
            return bxvk.m124022a(f178010c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new cbqe();
        } else {
            if (i2 == 4) {
                return new bxvd(f178010c);
            }
            if (i2 == 5) {
                return f178010c;
            }
            bxxk bxxk = f178011d;
            if (bxxk == null) {
                synchronized (cbqe.class) {
                    bxxk = f178011d;
                    if (bxxk == null) {
                        bxxk = new bxve(f178010c);
                        f178011d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
