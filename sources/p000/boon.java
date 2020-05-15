package p000;

/* renamed from: boon */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boon extends bxvk implements bxxd {

    /* renamed from: i */
    public static final boon f133951i;

    /* renamed from: j */
    private static volatile bxxk f133952j;

    /* renamed from: a */
    public int f133953a;

    /* renamed from: b */
    public int f133954b;

    /* renamed from: c */
    public booa f133955c;

    /* renamed from: d */
    public long f133956d;

    /* renamed from: e */
    public long f133957e;

    /* renamed from: f */
    public book f133958f;

    /* renamed from: g */
    public booj f133959g;

    /* renamed from: h */
    public boog f133960h;

    static {
        boon boon = new boon();
        f133951i = boon;
        bxvk.m124024a(boon.class, boon);
    }

    private boon() {
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
            return bxvk.m124022a(f133951i, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\f\u0002\f\u0003\u0002\u0004\u0002\u0005\t\u0006\t\u0007\t\b\t", new Object[]{"a", "b", "d", "e", "f", "g", "c", "h"});
        } else if (i2 == 3) {
            return new boon();
        } else {
            if (i2 == 4) {
                return new bxvd(f133951i);
            }
            if (i2 == 5) {
                return f133951i;
            }
            bxxk bxxk = f133952j;
            if (bxxk == null) {
                synchronized (boon.class) {
                    bxxk = f133952j;
                    if (bxxk == null) {
                        bxxk = new bxve(f133951i);
                        f133952j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
