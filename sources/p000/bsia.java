package p000;

/* renamed from: bsia */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsia extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bsia f144649d;

    /* renamed from: e */
    private static volatile bxxk f144650e;

    /* renamed from: a */
    public int f144651a;

    /* renamed from: b */
    public String f144652b = "";

    /* renamed from: c */
    public bshy f144653c;

    static {
        bsia bsia = new bsia();
        f144649d = bsia;
        bxvk.m124024a(bsia.class, bsia);
    }

    private bsia() {
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
            return bxvk.m124022a(f144649d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bsia();
        } else {
            if (i2 == 4) {
                return new bxvd(f144649d);
            }
            if (i2 == 5) {
                return f144649d;
            }
            bxxk bxxk = f144650e;
            if (bxxk == null) {
                synchronized (bsia.class) {
                    bxxk = f144650e;
                    if (bxxk == null) {
                        bxxk = new bxve(f144649d);
                        f144650e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
