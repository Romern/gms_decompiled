package p000;

/* renamed from: bitz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bitz extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bitz f121751c;

    /* renamed from: f */
    private static volatile bxxk f121752f;

    /* renamed from: a */
    public int f121753a;

    /* renamed from: b */
    public bity f121754b;

    /* renamed from: d */
    private int f121755d;

    /* renamed from: e */
    private byte f121756e = 2;

    static {
        bitz bitz = new bitz();
        f121751c = bitz;
        bxvk.m124024a(bitz.class, bitz);
    }

    private bitz() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121756e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121756e = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f121751c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔄ\u0000\u0002ᔉ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new bitz();
        } else {
            if (i2 == 4) {
                return new bxvd(f121751c);
            }
            if (i2 == 5) {
                return f121751c;
            }
            bxxk bxxk = f121752f;
            if (bxxk == null) {
                synchronized (bitz.class) {
                    bxxk = f121752f;
                    if (bxxk == null) {
                        bxxk = new bxve(f121751c);
                        f121752f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
