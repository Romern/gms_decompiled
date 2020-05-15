package p000;

/* renamed from: bshw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bshw extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bshw f144636c;

    /* renamed from: d */
    private static volatile bxxk f144637d;

    /* renamed from: a */
    public bltz f144638a;

    /* renamed from: b */
    public int f144639b;

    static {
        bshw bshw = new bshw();
        f144636c = bshw;
        bxvk.m124024a(bshw.class, bshw);
    }

    private bshw() {
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
            return bxvk.m124022a(f144636c, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\t\u0003\f", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bshw();
        } else {
            if (i2 == 4) {
                return new bxvd(f144636c);
            }
            if (i2 == 5) {
                return f144636c;
            }
            bxxk bxxk = f144637d;
            if (bxxk == null) {
                synchronized (bshw.class) {
                    bxxk = f144637d;
                    if (bxxk == null) {
                        bxxk = new bxve(f144636c);
                        f144637d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
