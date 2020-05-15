package p000;

/* renamed from: cdtn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdtn extends bxvk implements bxxd {

    /* renamed from: e */
    public static final cdtn f181706e;

    /* renamed from: f */
    private static volatile bxxk f181707f;

    /* renamed from: a */
    public bxwc f181708a = bxxn.f165040b;

    /* renamed from: b */
    public bxwc f181709b = bxxn.f165040b;

    /* renamed from: c */
    public bxwc f181710c = bxxn.f165040b;

    /* renamed from: d */
    public bxwc f181711d = bxxn.f165040b;

    static {
        cdtn cdtn = new cdtn();
        f181706e = cdtn;
        bxvk.m124024a(cdtn.class, cdtn);
    }

    private cdtn() {
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
            return bxvk.m124022a(f181706e, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u001a\u0002\u001b\u0003\u001a\u0004\u001a", new Object[]{"a", "b", cdtm.class, "c", "d"});
        } else if (i2 == 3) {
            return new cdtn();
        } else {
            if (i2 == 4) {
                return new bxvd(f181706e);
            }
            if (i2 == 5) {
                return f181706e;
            }
            bxxk bxxk = f181707f;
            if (bxxk == null) {
                synchronized (cdtn.class) {
                    bxxk = f181707f;
                    if (bxxk == null) {
                        bxxk = new bxve(f181706e);
                        f181707f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
