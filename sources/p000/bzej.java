package p000;

/* renamed from: bzej */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzej extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final bzej f169654i;

    /* renamed from: j */
    private static volatile bxxk f169655j;

    /* renamed from: a */
    public boolean f169656a;

    /* renamed from: b */
    public int f169657b;

    /* renamed from: c */
    public boolean f169658c;

    /* renamed from: d */
    public boolean f169659d;

    /* renamed from: e */
    public boolean f169660e;

    /* renamed from: f */
    public int f169661f;

    /* renamed from: g */
    public int f169662g;

    /* renamed from: h */
    public int f169663h;

    static {
        bzej bzej = new bzej();
        f169654i = bzej;
        GeneratedMessageLite.m124024a(bzej.class, bzej);
    }

    private bzej() {
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
            return GeneratedMessageLite.m124022a(f169654i, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u0007\u0002\f\u0003\u0007\u0004\u0007\u0005\u0007\u0006\u0004\u0007\u0004\b\u0004", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new bzej();
        } else {
            if (i2 == 4) {
                return new bxvd(f169654i);
            }
            if (i2 == 5) {
                return f169654i;
            }
            bxxk bxxk = f169655j;
            if (bxxk == null) {
                synchronized (bzej.class) {
                    bxxk = f169655j;
                    if (bxxk == null) {
                        bxxk = new bxve(f169654i);
                        f169655j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
