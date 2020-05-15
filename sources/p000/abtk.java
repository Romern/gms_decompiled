package p000;

/* renamed from: abtk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abtk extends bxvk implements bxxd {

    /* renamed from: d */
    public static final abtk f58246d;

    /* renamed from: e */
    private static volatile bxxk f58247e;

    /* renamed from: a */
    public int f58248a;

    /* renamed from: b */
    public boolean f58249b;

    /* renamed from: c */
    public bpxl f58250c;

    static {
        abtk abtk = new abtk();
        f58246d = abtk;
        bxvk.m124024a(abtk.class, abtk);
    }

    private abtk() {
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
            return bxvk.m124022a(f58246d, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003ဇ\u0000\u0004ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new abtk();
        } else {
            if (i2 == 4) {
                return new bxvd(f58246d);
            }
            if (i2 == 5) {
                return f58246d;
            }
            bxxk bxxk = f58247e;
            if (bxxk == null) {
                synchronized (abtk.class) {
                    bxxk = f58247e;
                    if (bxxk == null) {
                        bxxk = new bxve(f58246d);
                        f58247e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
