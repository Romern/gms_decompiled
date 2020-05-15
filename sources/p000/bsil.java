package p000;

/* renamed from: bsil */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsil extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bsil f144727c;

    /* renamed from: f */
    private static volatile bxxk f144728f;

    /* renamed from: a */
    public bxwc f144729a = bxxn.f165040b;

    /* renamed from: b */
    public bxwc f144730b = bxxn.f165040b;

    /* renamed from: d */
    private bxww f144731d = bxww.f165013b;

    /* renamed from: e */
    private byte f144732e = 2;

    static {
        bsil bsil = new bsil();
        f144727c = bsil;
        GeneratedMessageLite.m124024a(bsil.class, bsil);
    }

    private bsil() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f144732e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f144732e = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f144727c, "\u0000\u0003\u0000\u0000\u0002\u000b\u0003\u0001\u0002\u0001\u0002Л\u0003\u001b\u000b2", new Object[]{"a", bsio.class, "b", bsif.class, "d", bsik.f144726a});
        } else if (i2 == 3) {
            return new bsil();
        } else {
            if (i2 == 4) {
                return new bxvd(f144727c);
            }
            if (i2 == 5) {
                return f144727c;
            }
            bxxk bxxk = f144728f;
            if (bxxk == null) {
                synchronized (bsil.class) {
                    bxxk = f144728f;
                    if (bxxk == null) {
                        bxxk = new bxve(f144727c);
                        f144728f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
