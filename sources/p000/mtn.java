package p000;

/* renamed from: mtn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mtn extends bxvk implements bxxd {

    /* renamed from: i */
    public static final mtn f34677i;

    /* renamed from: j */
    private static volatile bxxk f34678j;

    /* renamed from: a */
    public int f34679a;

    /* renamed from: b */
    public int f34680b;

    /* renamed from: c */
    public long f34681c;

    /* renamed from: d */
    public bxwc f34682d = bxxn.f165040b;

    /* renamed from: e */
    public int f34683e;

    /* renamed from: f */
    public int f34684f;

    /* renamed from: g */
    public mti f34685g;

    /* renamed from: h */
    public long f34686h;

    static {
        mtn mtn = new mtn();
        f34677i = mtn;
        bxvk.m124024a(mtn.class, mtn);
    }

    private mtn() {
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
            return bxvk.m124022a(f34677i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003\u001b\u0004င\u0002\u0005င\u0003\u0006ဉ\u0004\u0007ဂ\u0005", new Object[]{"a", "b", mtl.f34676a, "c", "d", mth.class, "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new mtn();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][]) null, (byte[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f34677i;
            }
            bxxk bxxk = f34678j;
            if (bxxk == null) {
                synchronized (mtn.class) {
                    bxxk = f34678j;
                    if (bxxk == null) {
                        bxxk = new bxve(f34677i);
                        f34678j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
