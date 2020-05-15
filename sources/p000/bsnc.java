package p000;

/* renamed from: bsnc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsnc extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bsnc f146223g;

    /* renamed from: i */
    private static volatile bxxk f146224i;

    /* renamed from: a */
    public boab f146225a;

    /* renamed from: b */
    public bxwc f146226b = bxxn.f165040b;

    /* renamed from: c */
    public bxwc f146227c = bxxn.f165040b;

    /* renamed from: d */
    public bxwc f146228d = bxxn.f165040b;

    /* renamed from: e */
    public String f146229e = "";

    /* renamed from: f */
    public String f146230f = "";

    /* renamed from: h */
    private int f146231h;

    static {
        bsnc bsnc = new bsnc();
        f146223g = bsnc;
        bxvk.m124024a(bsnc.class, bsnc);
    }

    private bsnc() {
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
            return bxvk.m124022a(f146223g, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0003\u0000\u0001ဉ\u0000\u0002\u001b\u0003\u001b\u0004\u001b\u0005ဈ\u0001\u0006ဈ\u0002", new Object[]{"h", "a", "b", boab.class, "c", boab.class, "d", boab.class, "e", "f"});
        } else if (i2 == 3) {
            return new bsnc();
        } else {
            if (i2 == 4) {
                return new bxvd(f146223g);
            }
            if (i2 == 5) {
                return f146223g;
            }
            bxxk bxxk = f146224i;
            if (bxxk == null) {
                synchronized (bsnc.class) {
                    bxxk = f146224i;
                    if (bxxk == null) {
                        bxxk = new bxve(f146223g);
                        f146224i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
