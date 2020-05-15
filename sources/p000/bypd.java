package p000;

/* renamed from: bypd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bypd extends bxvk implements bxxd {

    /* renamed from: i */
    public static final bypd f167317i;

    /* renamed from: j */
    private static volatile bxxk f167318j;

    /* renamed from: a */
    public int f167319a;

    /* renamed from: b */
    public int f167320b = -1;

    /* renamed from: c */
    public long f167321c;

    /* renamed from: d */
    public long f167322d;

    /* renamed from: e */
    public bxwc f167323e = bxxn.f165040b;

    /* renamed from: f */
    public long f167324f;

    /* renamed from: g */
    public byqq f167325g;

    /* renamed from: h */
    public byqn f167326h;

    static {
        bypd bypd = new bypd();
        f167317i = bypd;
        bxvk.m124024a(bypd.class, bypd);
    }

    private bypd() {
        bxtx bxtx = bxtx.f164797b;
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
            return bxvk.m124022a(f167317i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဌ\u0000\u0002စ\u0001\u0003စ\u0002\u0004\u001b\u0005စ\u0003\u0006ဉ\u0004\u0007ဉ\u0005", new Object[]{"a", "b", byoo.m125035b(), "c", "d", "e", bypj.class, "f", "g", "h"});
        } else if (i2 == 3) {
            return new bypd();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][]) null, (short[]) null);
            }
            if (i2 == 5) {
                return f167317i;
            }
            bxxk bxxk = f167318j;
            if (bxxk == null) {
                synchronized (bypd.class) {
                    bxxk = f167318j;
                    if (bxxk == null) {
                        bxxk = new bxve(f167317i);
                        f167318j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
