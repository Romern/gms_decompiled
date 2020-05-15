package p000;

/* renamed from: cbqc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbqc extends bxvk implements bxxd {

    /* renamed from: c */
    public static final cbqc f178002c;

    /* renamed from: d */
    private static volatile bxxk f178003d;

    /* renamed from: a */
    public String f178004a = "";

    /* renamed from: b */
    public String f178005b = "";

    static {
        cbqc cbqc = new cbqc();
        f178002c = cbqc;
        bxvk.m124024a(cbqc.class, cbqc);
    }

    private cbqc() {
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
            return bxvk.m124022a(f178002c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new cbqc();
        } else {
            if (i2 == 4) {
                return new bxvd(f178002c);
            }
            if (i2 == 5) {
                return f178002c;
            }
            bxxk bxxk = f178003d;
            if (bxxk == null) {
                synchronized (cbqc.class) {
                    bxxk = f178003d;
                    if (bxxk == null) {
                        bxxk = new bxve(f178002c);
                        f178003d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
