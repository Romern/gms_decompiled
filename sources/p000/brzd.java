package p000;

/* renamed from: brzd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brzd extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final brzd f143718f;

    /* renamed from: h */
    private static volatile bxxk f143719h;

    /* renamed from: a */
    public int f143720a;

    /* renamed from: b */
    public brzb f143721b;

    /* renamed from: c */
    public bpwj f143722c;

    /* renamed from: d */
    public ByteString f143723d = ByteString.f164797b;

    /* renamed from: e */
    public bxwc f143724e = bxxn.f165040b;

    /* renamed from: g */
    private byte f143725g = 2;

    static {
        brzd brzd = new brzd();
        f143718f = brzd;
        GeneratedMessageLite.m124024a(brzd.class, brzd);
    }

    private brzd() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f143725g);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f143725g = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f143718f, "\u0001\u0004\u0000\u0001\u0002\t\u0004\u0000\u0001\u0001\u0002ဉ\u0000\u0003ᐉ\u0001\bည\u0003\t\u001b", new Object[]{"a", "b", "c", "d", "e", brzh.class});
        } else if (i2 == 3) {
            return new brzd();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][]) null, (float[]) null);
            }
            if (i2 == 5) {
                return f143718f;
            }
            bxxk bxxk = f143719h;
            if (bxxk == null) {
                synchronized (brzd.class) {
                    bxxk = f143719h;
                    if (bxxk == null) {
                        bxxk = new bxve(f143718f);
                        f143719h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
