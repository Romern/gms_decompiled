package p000;

/* renamed from: bpup */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpup extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bpup f139273c;

    /* renamed from: d */
    private static volatile bxxk f139274d;

    /* renamed from: a */
    public int f139275a = 0;

    /* renamed from: b */
    public Object f139276b;

    static {
        bpup bpup = new bpup();
        f139273c = bpup;
        bxvk.m124024a(bpup.class, bpup);
    }

    private bpup() {
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
            return bxvk.m124022a(f139273c, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001ြ\u0000", new Object[]{"b", "a", bpuo.class});
        } else if (i2 == 3) {
            return new bpup();
        } else {
            if (i2 == 4) {
                return new bxvd(f139273c);
            }
            if (i2 == 5) {
                return f139273c;
            }
            bxxk bxxk = f139274d;
            if (bxxk == null) {
                synchronized (bpup.class) {
                    bxxk = f139274d;
                    if (bxxk == null) {
                        bxxk = new bxve(f139273c);
                        f139274d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
