package p000;

/* renamed from: byfz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byfz extends bxvk implements bxxd {

    /* renamed from: i */
    public static final byfz f166084i;

    /* renamed from: j */
    private static volatile bxxk f166085j;

    /* renamed from: a */
    public boab f166086a;

    /* renamed from: b */
    public bxwc f166087b = bxxn.f165040b;

    /* renamed from: c */
    public bxwc f166088c = bxxn.f165040b;

    /* renamed from: d */
    public String f166089d = "";

    /* renamed from: e */
    public String f166090e = "";

    /* renamed from: f */
    public String f166091f = "";

    /* renamed from: g */
    public int f166092g;

    /* renamed from: h */
    public String f166093h = "";

    static {
        byfz byfz = new byfz();
        f166084i = byfz;
        bxvk.m124024a(byfz.class, byfz);
    }

    private byfz() {
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
            return bxvk.m124022a(f166084i, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0002\u0000\u0001\t\u0002\u001b\u0003\u001b\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007\u000b\bȈ", new Object[]{"a", "b", boab.class, "c", boab.class, "d", "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new byfz();
        } else {
            if (i2 == 4) {
                return new bxvd(f166084i);
            }
            if (i2 == 5) {
                return f166084i;
            }
            bxxk bxxk = f166085j;
            if (bxxk == null) {
                synchronized (byfz.class) {
                    bxxk = f166085j;
                    if (bxxk == null) {
                        bxxk = new bxve(f166084i);
                        f166085j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
