package p000;

/* renamed from: bmge */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmge extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bmge f129225f;

    /* renamed from: h */
    private static volatile bxxk f129226h;

    /* renamed from: a */
    public int f129227a;

    /* renamed from: b */
    public bmdn f129228b;

    /* renamed from: c */
    public bmbr f129229c;

    /* renamed from: d */
    public bmie f129230d;

    /* renamed from: e */
    public bmfu f129231e;

    /* renamed from: g */
    private byte f129232g = 2;

    static {
        bmge bmge = new bmge();
        f129225f = bmge;
        bxvk.m124024a(bmge.class, bmge);
    }

    private bmge() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f129232g);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f129232g = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f129225f, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0001\u0002ဉ\u0002\u0003ဉ\u0003\u0004ᐉ\u0004\u0005ဉ\u0000", new Object[]{"a", "c", "d", "e", "b"});
        } else if (i2 == 3) {
            return new bmge();
        } else {
            if (i2 == 4) {
                return new bxvd(f129225f);
            }
            if (i2 == 5) {
                return f129225f;
            }
            bxxk bxxk = f129226h;
            if (bxxk == null) {
                synchronized (bmge.class) {
                    bxxk = f129226h;
                    if (bxxk == null) {
                        bxxk = new bxve(f129225f);
                        f129226h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
