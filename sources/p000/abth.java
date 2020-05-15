package p000;

/* renamed from: abth */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abth extends bxvk implements bxxd {

    /* renamed from: i */
    public static final abth f58225i;

    /* renamed from: j */
    private static volatile bxxk f58226j;

    /* renamed from: a */
    public int f58227a;

    /* renamed from: b */
    public bxwc f58228b = bxxn.f165040b;

    /* renamed from: c */
    public boolean f58229c;

    /* renamed from: d */
    public int f58230d;

    /* renamed from: e */
    public boolean f58231e;

    /* renamed from: f */
    public boolean f58232f;

    /* renamed from: g */
    public boolean f58233g;

    /* renamed from: h */
    public boolean f58234h;

    static {
        abth abth = new abth();
        f58225i = abth;
        bxvk.m124024a(abth.class, abth);
    }

    private abth() {
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
            return bxvk.m124022a(f58225i, "\u0001\u0007\u0000\u0001\u0003\n\u0007\u0000\u0001\u0000\u0003\u001a\u0005ဇ\u0000\u0006င\u0001\u0007ဇ\u0002\bဇ\u0003\tဇ\u0004\nဇ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new abth();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][]) null, (int[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f58225i;
            }
            bxxk bxxk = f58226j;
            if (bxxk == null) {
                synchronized (abth.class) {
                    bxxk = f58226j;
                    if (bxxk == null) {
                        bxxk = new bxve(f58225i);
                        f58226j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
