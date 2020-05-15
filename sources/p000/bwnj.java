package p000;

/* renamed from: bwnj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwnj extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bwnj f160360d;

    /* renamed from: e */
    public static final bxvj f160361e;

    /* renamed from: g */
    private static volatile bxxk f160362g;

    /* renamed from: a */
    public int f160363a = 0;

    /* renamed from: b */
    public Object f160364b;

    /* renamed from: c */
    public int f160365c;

    /* renamed from: f */
    private int f160366f;

    static {
        bwnj bwnj = new bwnj();
        f160360d = bwnj;
        bxvk.m124024a(bwnj.class, bwnj);
        bwoq bwoq = bwoq.f160480d;
        bwnj bwnj2 = f160360d;
        f160361e = bxvk.m124006a(bwoq, bwnj2, bwnj2, 232057536, bxzf.MESSAGE);
    }

    private bwnj() {
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
            return bxvk.m124022a(f160360d, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ြ\u0000", new Object[]{"b", "a", "f", "c", bwnh.f160359a, bwng.class});
        } else if (i2 == 3) {
            return new bwnj();
        } else {
            if (i2 == 4) {
                return new bxvd(f160360d);
            }
            if (i2 == 5) {
                return f160360d;
            }
            bxxk bxxk = f160362g;
            if (bxxk == null) {
                synchronized (bwnj.class) {
                    bxxk = f160362g;
                    if (bxxk == null) {
                        bxxk = new bxve(f160360d);
                        f160362g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
