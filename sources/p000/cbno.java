package p000;

/* renamed from: cbno */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbno extends bxvk implements bxxd {

    /* renamed from: b */
    public static final cbno f177743b;

    /* renamed from: c */
    private static volatile bxxk f177744c;

    /* renamed from: a */
    public bxwc f177745a = bxxn.f165040b;

    static {
        cbno cbno = new cbno();
        f177743b = cbno;
        bxvk.m124024a(cbno.class, cbno);
    }

    private cbno() {
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
            return bxvk.m124022a(f177743b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", cbma.class});
        } else if (i2 == 3) {
            return new cbno();
        } else {
            if (i2 == 4) {
                return new bxvd(f177743b);
            }
            if (i2 == 5) {
                return f177743b;
            }
            bxxk bxxk = f177744c;
            if (bxxk == null) {
                synchronized (cbno.class) {
                    bxxk = f177744c;
                    if (bxxk == null) {
                        bxxk = new bxve(f177743b);
                        f177744c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
