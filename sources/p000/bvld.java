package p000;

/* renamed from: bvld */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvld extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final bvld f156506h;

    /* renamed from: i */
    private static volatile bxxk f156507i;

    /* renamed from: a */
    public int f156508a;

    /* renamed from: b */
    public String f156509b = "";

    /* renamed from: c */
    public String f156510c = "";

    /* renamed from: d */
    public bxwc f156511d = bxxn.f165040b;

    /* renamed from: e */
    public bxwc f156512e = bxxn.f165040b;

    /* renamed from: f */
    public bvpg f156513f;

    /* renamed from: g */
    public int f156514g;

    static {
        bvld bvld = new bvld();
        f156506h = bvld;
        GeneratedMessageLite.m124024a(bvld.class, bvld);
    }

    private bvld() {
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
            return GeneratedMessageLite.m124022a(f156506h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001a\u0004\u001b\u0005ဉ\u0002\u0006ဌ\u0003", new Object[]{"a", "b", "c", "d", "e", bvph.class, "f", "g", bvlb.f156505a});
        } else if (i2 == 3) {
            return new bvld();
        } else {
            if (i2 == 4) {
                return new bxvd(f156506h);
            }
            if (i2 == 5) {
                return f156506h;
            }
            bxxk bxxk = f156507i;
            if (bxxk == null) {
                synchronized (bvld.class) {
                    bxxk = f156507i;
                    if (bxxk == null) {
                        bxxk = new bxve(f156506h);
                        f156507i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
