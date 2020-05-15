package p000;

/* renamed from: bsjd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsjd extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bsjd f144778e;

    /* renamed from: f */
    private static volatile bxxk f144779f;

    /* renamed from: a */
    public String f144780a = "";

    /* renamed from: b */
    public bxwc f144781b = bxxn.f165040b;

    /* renamed from: c */
    public bxwc f144782c = bxxn.f165040b;

    /* renamed from: d */
    public bxww f144783d = bxww.f165013b;

    static {
        bsjd bsjd = new bsjd();
        f144778e = bsjd;
        bxvk.m124024a(bsjd.class, bsjd);
    }

    private bsjd() {
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
            return bxvk.m124022a(f144778e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0001\u0002\u0000\u0001Ȉ\u0002\u001b\u0003\u001b\u00042", new Object[]{"a", "b", bsji.class, "c", bsjc.class, "d", bsjb.f144773a});
        } else if (i2 == 3) {
            return new bsjd();
        } else {
            if (i2 == 4) {
                return new bsja();
            }
            if (i2 == 5) {
                return f144778e;
            }
            bxxk bxxk = f144779f;
            if (bxxk == null) {
                synchronized (bsjd.class) {
                    bxxk = f144779f;
                    if (bxxk == null) {
                        bxxk = new bxve(f144778e);
                        f144779f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
