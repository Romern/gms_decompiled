package p000;

/* renamed from: bsjq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsjq extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bsjq f144834d;

    /* renamed from: e */
    private static volatile bxxk f144835e;

    /* renamed from: a */
    public bsjs f144836a;

    /* renamed from: b */
    public bsjr f144837b;

    /* renamed from: c */
    public bsjp f144838c;

    static {
        bsjq bsjq = new bsjq();
        f144834d = bsjq;
        bxvk.m124024a(bsjq.class, bsjq);
    }

    private bsjq() {
        bxxn bxxn = bxxn.f165040b;
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
            return bxvk.m124022a(f144834d, "\u0000\u0003\u0000\u0000\u0001\u0005\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0005\t", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bsjq();
        } else {
            if (i2 == 4) {
                return new bxvd(f144834d);
            }
            if (i2 == 5) {
                return f144834d;
            }
            bxxk bxxk = f144835e;
            if (bxxk == null) {
                synchronized (bsjq.class) {
                    bxxk = f144835e;
                    if (bxxk == null) {
                        bxxk = new bxve(f144834d);
                        f144835e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
