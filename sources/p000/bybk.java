package p000;

/* renamed from: bybk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bybk extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bybk f165510f;

    /* renamed from: g */
    private static volatile bxxk f165511g;

    /* renamed from: a */
    public int f165512a;

    /* renamed from: b */
    public float f165513b;

    /* renamed from: c */
    public int f165514c;

    /* renamed from: d */
    public float f165515d;

    /* renamed from: e */
    public bxvt f165516e = bxvm.f164965b;

    static {
        bybk bybk = new bybk();
        f165510f = bybk;
        bxvk.m124024a(bybk.class, bybk);
    }

    private bybk() {
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
            return bxvk.m124022a(f165510f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ခ\u0000\u0002င\u0001\u0003ခ\u0002\u0004\u0016", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bybk();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f165510f;
            }
            bxxk bxxk = f165511g;
            if (bxxk == null) {
                synchronized (bybk.class) {
                    bxxk = f165511g;
                    if (bxxk == null) {
                        bxxk = new bxve(f165510f);
                        f165511g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
