package p000;

/* renamed from: blyo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blyo extends bxvk implements bxxd {

    /* renamed from: e */
    public static final blyo f128277e;

    /* renamed from: f */
    private static volatile bxxk f128278f;

    /* renamed from: a */
    public int f128279a;

    /* renamed from: b */
    public bmaj f128280b;

    /* renamed from: c */
    public blyn f128281c;

    /* renamed from: d */
    public bmaf f128282d;

    static {
        blyo blyo = new blyo();
        f128277e = blyo;
        bxvk.m124024a(blyo.class, blyo);
    }

    private blyo() {
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
            return bxvk.m124022a(f128277e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new blyo();
        } else {
            if (i2 == 4) {
                return new bxvd(f128277e);
            }
            if (i2 == 5) {
                return f128277e;
            }
            bxxk bxxk = f128278f;
            if (bxxk == null) {
                synchronized (blyo.class) {
                    bxxk = f128278f;
                    if (bxxk == null) {
                        bxxk = new bxve(f128277e);
                        f128278f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
