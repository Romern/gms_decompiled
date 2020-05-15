package p000;

/* renamed from: mru */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mru extends bxvk implements bxxd {

    /* renamed from: c */
    public static final mru f34488c;

    /* renamed from: d */
    private static volatile bxxk f34489d;

    /* renamed from: a */
    public int f34490a;

    /* renamed from: b */
    public int f34491b;

    static {
        mru mru = new mru();
        f34488c = mru;
        bxvk.m124024a(mru.class, mru);
    }

    private mru() {
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
            return bxvk.m124022a(f34488c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", mrt.f34487a});
        } else if (i2 == 3) {
            return new mru();
        } else {
            if (i2 == 4) {
                return new bxvd(f34488c);
            }
            if (i2 == 5) {
                return f34488c;
            }
            bxxk bxxk = f34489d;
            if (bxxk == null) {
                synchronized (mru.class) {
                    bxxk = f34489d;
                    if (bxxk == null) {
                        bxxk = new bxve(f34488c);
                        f34489d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
