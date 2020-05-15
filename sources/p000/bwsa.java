package p000;

/* renamed from: bwsa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwsa extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bwsa f160821b;

    /* renamed from: c */
    public static final bxvj f160822c;

    /* renamed from: e */
    private static volatile bxxk f160823e;

    /* renamed from: a */
    public int f160824a;

    /* renamed from: d */
    private int f160825d;

    static {
        bwsa bwsa = new bwsa();
        f160821b = bwsa;
        bxvk.m124024a(bwsa.class, bwsa);
        bwoq bwoq = bwoq.f160480d;
        bwsa bwsa2 = f160821b;
        f160822c = bxvk.m124006a(bwoq, bwsa2, bwsa2, 264984587, bxzf.MESSAGE);
    }

    private bwsa() {
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
            return bxvk.m124022a(f160821b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"d", "a", bwry.f160820a});
        } else if (i2 == 3) {
            return new bwsa();
        } else {
            if (i2 == 4) {
                return new bxvd(f160821b);
            }
            if (i2 == 5) {
                return f160821b;
            }
            bxxk bxxk = f160823e;
            if (bxxk == null) {
                synchronized (bwsa.class) {
                    bxxk = f160823e;
                    if (bxxk == null) {
                        bxxk = new bxve(f160821b);
                        f160823e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
