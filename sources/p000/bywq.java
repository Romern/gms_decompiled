package p000;

/* renamed from: bywq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bywq extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bywq f168642f;

    /* renamed from: g */
    private static volatile bxxk f168643g;

    /* renamed from: a */
    public int f168644a;

    /* renamed from: b */
    public int f168645b;

    /* renamed from: c */
    public int f168646c;

    /* renamed from: d */
    public int f168647d;

    /* renamed from: e */
    public int f168648e;

    static {
        bywq bywq = new bywq();
        f168642f = bywq;
        bxvk.m124024a(bywq.class, bywq);
    }

    private bywq() {
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
            return bxvk.m124022a(f168642f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bywq();
        } else {
            if (i2 == 4) {
                return new bxvd(f168642f);
            }
            if (i2 == 5) {
                return f168642f;
            }
            bxxk bxxk = f168643g;
            if (bxxk == null) {
                synchronized (bywq.class) {
                    bxxk = f168643g;
                    if (bxxk == null) {
                        bxxk = new bxve(f168642f);
                        f168643g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
