package p000;

/* renamed from: biud */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biud extends bxvk implements bxxd {

    /* renamed from: c */
    public static final biud f121766c;

    /* renamed from: f */
    private static volatile bxxk f121767f;

    /* renamed from: a */
    public int f121768a;

    /* renamed from: b */
    public int f121769b;

    /* renamed from: d */
    private int f121770d;

    /* renamed from: e */
    private byte f121771e = 2;

    static {
        biud biud = new biud();
        f121766c = biud;
        bxvk.m124024a(biud.class, biud);
    }

    private biud() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121771e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121771e = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f121766c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔄ\u0000\u0002ᔄ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new biud();
        } else {
            if (i2 == 4) {
                return new bxvd(f121766c);
            }
            if (i2 == 5) {
                return f121766c;
            }
            bxxk bxxk = f121767f;
            if (bxxk == null) {
                synchronized (biud.class) {
                    bxxk = f121767f;
                    if (bxxk == null) {
                        bxxk = new bxve(f121766c);
                        f121767f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
