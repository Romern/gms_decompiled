package p000;

/* renamed from: lau */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lau extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final lau f25613i;

    /* renamed from: j */
    private static volatile bxxk f25614j;

    /* renamed from: a */
    public long f25615a;

    /* renamed from: b */
    public boolean f25616b;

    /* renamed from: c */
    public boolean f25617c;

    /* renamed from: d */
    public kzz f25618d;

    /* renamed from: e */
    public lbf f25619e;

    /* renamed from: f */
    public int f25620f;

    /* renamed from: g */
    public int f25621g;

    /* renamed from: h */
    public boolean f25622h;

    static {
        lau lau = new lau();
        f25613i = lau;
        GeneratedMessageLite.m124024a(lau.class, lau);
    }

    private lau() {
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
            return GeneratedMessageLite.m124022a(f25613i, "\u0000\b\u0000\u0000\u0003\n\b\u0000\u0000\u0000\u0003\u0002\u0004\u0007\u0005\u0007\u0006\t\u0007\t\b\f\t\f\n\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new lau();
        } else {
            if (i2 == 4) {
                return new bxvd(f25613i);
            }
            if (i2 == 5) {
                return f25613i;
            }
            bxxk bxxk = f25614j;
            if (bxxk == null) {
                synchronized (lau.class) {
                    bxxk = f25614j;
                    if (bxxk == null) {
                        bxxk = new bxve(f25613i);
                        f25614j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
