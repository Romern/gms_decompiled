package p000;

/* renamed from: bsif */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsif extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bsif f144704g;

    /* renamed from: i */
    private static volatile bxxk f144705i;

    /* renamed from: a */
    public bsig f144706a;

    /* renamed from: b */
    public String f144707b = "";

    /* renamed from: c */
    public String f144708c = "";

    /* renamed from: d */
    public String f144709d = "";

    /* renamed from: e */
    public bsie f144710e;

    /* renamed from: f */
    public bsih f144711f;

    /* renamed from: h */
    private bxyg f144712h;

    static {
        bsif bsif = new bsif();
        f144704g = bsif;
        bxvk.m124024a(bsif.class, bsif);
    }

    private bsif() {
        bxxn bxxn = bxxn.f165040b;
        bxvm bxvm = bxvm.f164965b;
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
            return bxvk.m124022a(f144704g, "\u0000\u0007\u0000\u0000\u0001\u0014\u0007\u0000\u0000\u0000\u0001\t\u0006Ȉ\nȈ\u000bȈ\f\t\u0012\t\u0014\t", new Object[]{"a", "b", "c", "d", "e", "f", "h"});
        } else if (i2 == 3) {
            return new bsif();
        } else {
            if (i2 == 4) {
                return new bxvd(f144704g);
            }
            if (i2 == 5) {
                return f144704g;
            }
            bxxk bxxk = f144705i;
            if (bxxk == null) {
                synchronized (bsif.class) {
                    bxxk = f144705i;
                    if (bxxk == null) {
                        bxxk = new bxve(f144704g);
                        f144705i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
