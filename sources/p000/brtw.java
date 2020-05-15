package p000;

/* renamed from: brtw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brtw extends bxvk implements bxxd {

    /* renamed from: g */
    public static final brtw f143353g;

    /* renamed from: h */
    private static volatile bxxk f143354h;

    /* renamed from: a */
    public int f143355a;

    /* renamed from: b */
    public String f143356b = "";

    /* renamed from: c */
    public float f143357c;

    /* renamed from: d */
    public int f143358d;

    /* renamed from: e */
    public float f143359e;

    /* renamed from: f */
    public boolean f143360f;

    static {
        brtw brtw = new brtw();
        f143353g = brtw;
        bxvk.m124024a(brtw.class, brtw);
    }

    private brtw() {
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
            return bxvk.m124022a(f143353g, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001\u0003င\u0002\u0004ခ\u0003\u0007ဇ\u0006", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new brtw();
        } else {
            if (i2 == 4) {
                return new bxvd(f143353g);
            }
            if (i2 == 5) {
                return f143353g;
            }
            bxxk bxxk = f143354h;
            if (bxxk == null) {
                synchronized (brtw.class) {
                    bxxk = f143354h;
                    if (bxxk == null) {
                        bxxk = new bxve(f143353g);
                        f143354h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
