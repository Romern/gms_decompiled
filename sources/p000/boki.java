package p000;

/* renamed from: boki */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boki extends bxvk implements bxxd {

    /* renamed from: g */
    public static final boki f133411g;

    /* renamed from: j */
    private static volatile bxxk f133412j;

    /* renamed from: a */
    public int f133413a;

    /* renamed from: b */
    public bptv f133414b;

    /* renamed from: c */
    public bxwc f133415c = bxxn.f165040b;

    /* renamed from: d */
    public bptv f133416d;

    /* renamed from: e */
    public bpby f133417e;

    /* renamed from: f */
    public bomi f133418f;

    /* renamed from: h */
    private bptv f133419h;

    /* renamed from: i */
    private byte f133420i = 2;

    static {
        boki boki = new boki();
        f133411g = boki;
        bxvk.m124024a(boki.class, boki);
    }

    private boki() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f133420i);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f133420i = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f133411g, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0001\u0006\u0001ᐉ\u0000\u0002Л\u0003ᐉ\u0001\u0004ᐉ\u0004\u0007ᐉ\u0006\bᐉ\u0003", new Object[]{"a", "b", "c", bpcb.class, "d", "e", "f", "h"});
        } else if (i2 == 3) {
            return new boki();
        } else {
            if (i2 == 4) {
                return new bxvd((char[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f133411g;
            }
            bxxk bxxk = f133412j;
            if (bxxk == null) {
                synchronized (boki.class) {
                    bxxk = f133412j;
                    if (bxxk == null) {
                        bxxk = new bxve(f133411g);
                        f133412j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
