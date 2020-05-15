package p000;

/* renamed from: bpxk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpxk extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bpxk f139724d;

    /* renamed from: e */
    private static volatile bxxk f139725e;

    /* renamed from: a */
    public int f139726a;

    /* renamed from: b */
    public bpxj f139727b;

    /* renamed from: c */
    public int f139728c;

    static {
        bpxk bpxk = new bpxk();
        f139724d = bpxk;
        bxvk.m124024a(bpxk.class, bpxk);
    }

    private bpxk() {
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
            return bxvk.m124022a(f139724d, "\u0001\u0002\u0000\u0001\u0006\t\u0002\u0000\u0000\u0000\u0006ဌ\t\tဉ\u0006", new Object[]{"a", "c", bqaw.m112489b(), "b"});
        } else if (i2 == 3) {
            return new bpxk();
        } else {
            if (i2 == 4) {
                return new bxvd(f139724d);
            }
            if (i2 == 5) {
                return f139724d;
            }
            bxxk bxxk = f139725e;
            if (bxxk == null) {
                synchronized (bpxk.class) {
                    bxxk = f139725e;
                    if (bxxk == null) {
                        bxxk = new bxve(f139724d);
                        f139725e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
