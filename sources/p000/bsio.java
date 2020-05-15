package p000;

/* renamed from: bsio */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsio extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bsio f144738b;

    /* renamed from: e */
    private static volatile bxxk f144739e;

    /* renamed from: a */
    public bxwc f144740a;

    /* renamed from: c */
    private bsiq f144741c;

    /* renamed from: d */
    private byte f144742d = 2;

    static {
        bsio bsio = new bsio();
        f144738b = bsio;
        GeneratedMessageLite.m124024a(bsio.class, bsio);
    }

    private bsio() {
        bxxn bxxn = bxxn.f165040b;
        this.f144740a = bxxn.f165040b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f144742d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f144742d = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f144738b, "\u0000\u0002\u0000\u0000\u0007\u000f\u0002\u0000\u0001\u0001\u0007\u001b\u000fЉ", new Object[]{"a", bsif.class, "c"});
        } else if (i2 == 3) {
            return new bsio();
        } else {
            if (i2 == 4) {
                return new bxvd(f144738b);
            }
            if (i2 == 5) {
                return f144738b;
            }
            bxxk bxxk = f144739e;
            if (bxxk == null) {
                synchronized (bsio.class) {
                    bxxk = f144739e;
                    if (bxxk == null) {
                        bxxk = new bxve(f144738b);
                        f144739e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
