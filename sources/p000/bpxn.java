package p000;

/* renamed from: bpxn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpxn extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bpxn f139738g;

    /* renamed from: h */
    private static volatile bxxk f139739h;

    /* renamed from: a */
    public int f139740a;

    /* renamed from: b */
    public int f139741b;

    /* renamed from: c */
    public bpwo f139742c;

    /* renamed from: d */
    public int f139743d;

    /* renamed from: e */
    public int f139744e;

    /* renamed from: f */
    public int f139745f;

    static {
        bpxn bpxn = new bpxn();
        f139738g = bpxn;
        bxvk.m124024a(bpxn.class, bpxn);
    }

    private bpxn() {
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
            return bxvk.m124022a(f139738g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဌ\u0003\u0004ဉ\u0002\u0005င\u0004\u0006င\u0005", new Object[]{"a", "b", bpzx.f140116a, "d", bpzy.f140117a, "c", "e", "f"});
        } else if (i2 == 3) {
            return new bpxn();
        } else {
            if (i2 == 4) {
                return new bxvd(f139738g);
            }
            if (i2 == 5) {
                return f139738g;
            }
            bxxk bxxk = f139739h;
            if (bxxk == null) {
                synchronized (bpxn.class) {
                    bxxk = f139739h;
                    if (bxxk == null) {
                        bxxk = new bxve(f139738g);
                        f139739h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
