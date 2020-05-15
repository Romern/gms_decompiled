package p000;

/* renamed from: bwnq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwnq extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bwnq f160379b;

    /* renamed from: c */
    public static final bxvj f160380c;

    /* renamed from: e */
    private static volatile bxxk f160381e;

    /* renamed from: a */
    public int f160382a;

    /* renamed from: d */
    private int f160383d;

    static {
        bwnq bwnq = new bwnq();
        f160379b = bwnq;
        bxvk.m124024a(bwnq.class, bwnq);
        bwny bwny = bwny.f160414k;
        bwnq bwnq2 = f160379b;
        f160380c = bxvk.m124006a(bwny, bwnq2, bwnq2, 248595894, bxzf.MESSAGE);
    }

    private bwnq() {
        bxwq bxwq = bxwq.f165002b;
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
            return bxvk.m124022a(f160379b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"d", "a", bwno.f160378a});
        } else if (i2 == 3) {
            return new bwnq();
        } else {
            if (i2 == 4) {
                return new bxvd(f160379b);
            }
            if (i2 == 5) {
                return f160379b;
            }
            bxxk bxxk = f160381e;
            if (bxxk == null) {
                synchronized (bwnq.class) {
                    bxxk = f160381e;
                    if (bxxk == null) {
                        bxxk = new bxve(f160379b);
                        f160381e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
