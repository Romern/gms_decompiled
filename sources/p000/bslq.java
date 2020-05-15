package p000;

/* renamed from: bslq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bslq extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bslq f144938b;

    /* renamed from: d */
    private static volatile bxxk f144939d;

    /* renamed from: a */
    public int f144940a;

    /* renamed from: c */
    private int f144941c;

    static {
        bslq bslq = new bslq();
        f144938b = bslq;
        bxvk.m124024a(bslq.class, bslq);
    }

    private bslq() {
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
            return bxvk.m124022a(f144938b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", bslj.f144928a});
        } else if (i2 == 3) {
            return new bslq();
        } else {
            if (i2 == 4) {
                return new bxvd(f144938b);
            }
            if (i2 == 5) {
                return f144938b;
            }
            bxxk bxxk = f144939d;
            if (bxxk == null) {
                synchronized (bslq.class) {
                    bxxk = f144939d;
                    if (bxxk == null) {
                        bxxk = new bxve(f144938b);
                        f144939d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
