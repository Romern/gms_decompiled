package p000;

/* renamed from: bymv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bymv extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bymv f167079c;

    /* renamed from: d */
    private static volatile bxxk f167080d;

    /* renamed from: a */
    public String f167081a = "";

    /* renamed from: b */
    public bxwc f167082b = bxxn.f165040b;

    static {
        bymv bymv = new bymv();
        f167079c = bymv;
        bxvk.m124024a(bymv.class, bymv);
    }

    private bymv() {
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
            return bxvk.m124022a(f167079c, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0001\u0000\u0001Ȉ\u0003Ț", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bymv();
        } else {
            if (i2 == 4) {
                return new bxvd(f167079c);
            }
            if (i2 == 5) {
                return f167079c;
            }
            bxxk bxxk = f167080d;
            if (bxxk == null) {
                synchronized (bymv.class) {
                    bxxk = f167080d;
                    if (bxxk == null) {
                        bxxk = new bxve(f167079c);
                        f167080d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
