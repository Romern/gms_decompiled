package p000;

/* renamed from: bums */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bums extends bxvk implements bxxd {

    /* renamed from: i */
    public static final bums f154262i;

    /* renamed from: j */
    private static volatile bxxk f154263j;

    /* renamed from: a */
    public int f154264a;

    /* renamed from: b */
    public int f154265b;

    /* renamed from: c */
    public int f154266c;

    /* renamed from: d */
    public int f154267d;

    /* renamed from: e */
    public int f154268e;

    /* renamed from: f */
    public int f154269f;

    /* renamed from: g */
    public int f154270g;

    /* renamed from: h */
    public int f154271h;

    static {
        bums bums = new bums();
        f154262i = bums;
        bxvk.m124024a(bums.class, bums);
    }

    private bums() {
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
            return bxvk.m124022a(f154262i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new bums();
        } else {
            if (i2 == 4) {
                return new bxvd(f154262i);
            }
            if (i2 == 5) {
                return f154262i;
            }
            bxxk bxxk = f154263j;
            if (bxxk == null) {
                synchronized (bums.class) {
                    bxxk = f154263j;
                    if (bxxk == null) {
                        bxxk = new bxve(f154262i);
                        f154263j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
