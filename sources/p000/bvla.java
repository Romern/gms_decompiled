package p000;

/* renamed from: bvla */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvla extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bvla f156499e;

    /* renamed from: f */
    private static volatile bxxk f156500f;

    /* renamed from: a */
    public int f156501a;

    /* renamed from: b */
    public boolean f156502b;

    /* renamed from: c */
    public bxwc f156503c = bxxn.f165040b;

    /* renamed from: d */
    public String f156504d = "";

    static {
        bvla bvla = new bvla();
        f156499e = bvla;
        GeneratedMessageLite.m124024a(bvla.class, bvla);
    }

    private bvla() {
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
            return GeneratedMessageLite.m124022a(f156499e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဇ\u0000\u0002\u001a\u0003ဈ\u0001", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bvla();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][]) null);
            }
            if (i2 == 5) {
                return f156499e;
            }
            bxxk bxxk = f156500f;
            if (bxxk == null) {
                synchronized (bvla.class) {
                    bxxk = f156500f;
                    if (bxxk == null) {
                        bxxk = new bxve(f156499e);
                        f156500f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
