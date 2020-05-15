package p000;

/* renamed from: bydm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bydm extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bydm f165803a;

    /* renamed from: f */
    private static volatile bxxk f165804f;

    /* renamed from: b */
    private int f165805b;

    /* renamed from: c */
    private bydt f165806c;

    /* renamed from: d */
    private bydl f165807d;

    /* renamed from: e */
    private byte f165808e = 2;

    static {
        bydm bydm = new bydm();
        f165803a = bydm;
        GeneratedMessageLite.m124024a(bydm.class, bydm);
    }

    private bydm() {
        ByteString bxtx = bxtx.f164797b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f165808e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f165808e = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f165803a, "\u0001\u0002\u0000\u0001\u0006\u0007\u0002\u0000\u0000\u0002\u0006ᐉ\u0005\u0007ᐉ\u0006", new Object[]{"b", "c", "d"});
        } else if (i2 == 3) {
            return new bydm();
        } else {
            if (i2 == 4) {
                return new bxvd(f165803a);
            }
            if (i2 == 5) {
                return f165803a;
            }
            bxxk bxxk = f165804f;
            if (bxxk == null) {
                synchronized (bydm.class) {
                    bxxk = f165804f;
                    if (bxxk == null) {
                        bxxk = new bxve(f165803a);
                        f165804f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
