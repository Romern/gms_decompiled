package p000;

/* renamed from: bsid */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsid extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bsid f144664a;

    /* renamed from: b */
    private static volatile bxxk f144665b;

    static {
        bsid bsid = new bsid();
        f144664a = bsid;
        bxvk.m124024a(bsid.class, bsid);
    }

    private bsid() {
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
            return bxvk.m124022a(f144664a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bsid();
        }
        if (i2 == 4) {
            return new bxvd(f144664a);
        }
        if (i2 == 5) {
            return f144664a;
        }
        bxxk bxxk = f144665b;
        if (bxxk == null) {
            synchronized (bsid.class) {
                bxxk = f144665b;
                if (bxxk == null) {
                    bxxk = new bxve(f144664a);
                    f144665b = bxxk;
                }
            }
        }
        return bxxk;
    }
}