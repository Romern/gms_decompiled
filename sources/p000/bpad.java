package p000;

/* renamed from: bpad */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpad extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bpad f135472e;

    /* renamed from: f */
    private static volatile bxxk f135473f;

    /* renamed from: a */
    public int f135474a;

    /* renamed from: b */
    public int f135475b;

    /* renamed from: c */
    public int f135476c;

    /* renamed from: d */
    public int f135477d;

    static {
        bpad bpad = new bpad();
        f135472e = bpad;
        bxvk.m124024a(bpad.class, bpad);
    }

    private bpad() {
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
            return bxvk.m124022a(f135472e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", bpac.f135471a, "c", bpaa.f135469a, "d", bpab.f135470a});
        } else if (i2 == 3) {
            return new bpad();
        } else {
            if (i2 == 4) {
                return new bxvd(f135472e);
            }
            if (i2 == 5) {
                return f135472e;
            }
            bxxk bxxk = f135473f;
            if (bxxk == null) {
                synchronized (bpad.class) {
                    bxxk = f135473f;
                    if (bxxk == null) {
                        bxxk = new bxve(f135472e);
                        f135473f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
