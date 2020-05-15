package p000;

/* renamed from: bsjk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsjk extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bsjk f144805d;

    /* renamed from: e */
    private static volatile bxxk f144806e;

    /* renamed from: a */
    public bxwc f144807a = bxxn.f165040b;

    /* renamed from: b */
    public bsjj f144808b;

    /* renamed from: c */
    public long f144809c;

    static {
        bsjk bsjk = new bsjk();
        f144805d = bsjk;
        GeneratedMessageLite.m124024a(bsjk.class, bsjk);
    }

    private bsjk() {
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
            return GeneratedMessageLite.m124022a(f144805d, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0001\u0000\u0001\u001b\u0003\t\u0004\u0002", new Object[]{"a", bsjd.class, "b", "c"});
        } else if (i2 == 3) {
            return new bsjk();
        } else {
            if (i2 == 4) {
                return new bxvd(f144805d);
            }
            if (i2 == 5) {
                return f144805d;
            }
            bxxk bxxk = f144806e;
            if (bxxk == null) {
                synchronized (bsjk.class) {
                    bxxk = f144806e;
                    if (bxxk == null) {
                        bxxk = new bxve(f144805d);
                        f144806e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
