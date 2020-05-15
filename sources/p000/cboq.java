package p000;

/* renamed from: cboq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cboq extends bxvk implements bxxd {

    /* renamed from: b */
    public static final cboq f177849b;

    /* renamed from: c */
    private static volatile bxxk f177850c;

    /* renamed from: a */
    public cbop f177851a;

    static {
        cboq cboq = new cboq();
        f177849b = cboq;
        bxvk.m124024a(cboq.class, cboq);
    }

    private cboq() {
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
            return bxvk.m124022a(f177849b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"a"});
        } else if (i2 == 3) {
            return new cboq();
        } else {
            if (i2 == 4) {
                return new bxvd(f177849b);
            }
            if (i2 == 5) {
                return f177849b;
            }
            bxxk bxxk = f177850c;
            if (bxxk == null) {
                synchronized (cboq.class) {
                    bxxk = f177850c;
                    if (bxxk == null) {
                        bxxk = new bxve(f177849b);
                        f177850c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
