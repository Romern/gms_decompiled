package p000;

/* renamed from: bxoq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxoq extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bxoq f164193g;

    /* renamed from: h */
    private static volatile bxxk f164194h;

    /* renamed from: a */
    public int f164195a;

    /* renamed from: b */
    public int f164196b;

    /* renamed from: c */
    public long f164197c;

    /* renamed from: d */
    public bxoo f164198d;

    /* renamed from: e */
    public long f164199e = -1;

    /* renamed from: f */
    public bxwc f164200f = bxxn.f165040b;

    static {
        bxoq bxoq = new bxoq();
        f164193g = bxoq;
        bxvk.m124024a(bxoq.class, bxoq);
    }

    private bxoq() {
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
            return bxvk.m124022a(f164193g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001င\u0000\u0002ဂ\u0001\u0003ဉ\u0002\u0004ဂ\u0003\u0005\u001b", new Object[]{"a", "b", "c", "d", "e", "f", bxop.class});
        } else if (i2 == 3) {
            return new bxoq();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][]) null, (boolean[]) null);
            }
            if (i2 == 5) {
                return f164193g;
            }
            bxxk bxxk = f164194h;
            if (bxxk == null) {
                synchronized (bxoq.class) {
                    bxxk = f164194h;
                    if (bxxk == null) {
                        bxxk = new bxve(f164193g);
                        f164194h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
