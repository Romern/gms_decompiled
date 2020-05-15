package p000;

import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: blqj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blqj extends bxvk implements bxxd {

    /* renamed from: f */
    public static final blqj f127345f;

    /* renamed from: h */
    private static volatile bxxk f127346h;

    /* renamed from: a */
    public int f127347a;

    /* renamed from: b */
    public blrk f127348b;

    /* renamed from: c */
    public bxwc f127349c = bxxn.f165040b;

    /* renamed from: d */
    public blqy f127350d;

    /* renamed from: e */
    public blpl f127351e;

    /* renamed from: g */
    private boolean f127352g;

    static {
        blqj blqj = new blqj();
        f127345f = blqj;
        bxvk.m124024a(blqj.class, blqj);
    }

    private blqj() {
        bxxn bxxn = bxxn.f165040b;
    }

    /* renamed from: a */
    public static /* synthetic */ void m107471a(blqj blqj) {
        blqj.f127347a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
        blqj.f127352g = true;
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
            return bxvk.m124022a(f127345f, "\u0001\u0005\u0000\u0001\u0001\u000e\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0005ဇ\u000e\f\u001b\rဉ\u0014\u000eဉ\u0017", new Object[]{"a", "b", "g", "c", blou.class, "d", "e"});
        } else if (i2 == 3) {
            return new blqj();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][]) null, (char[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f127345f;
            }
            bxxk bxxk = f127346h;
            if (bxxk == null) {
                synchronized (blqj.class) {
                    bxxk = f127346h;
                    if (bxxk == null) {
                        bxxk = new bxve(f127345f);
                        f127346h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
