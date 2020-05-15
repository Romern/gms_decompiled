package p000;

/* renamed from: blsk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blsk extends bxvk implements bxxd {

    /* renamed from: e */
    public static final blsk f127596e;

    /* renamed from: g */
    private static volatile bxxk f127597g;

    /* renamed from: a */
    public int f127598a;

    /* renamed from: b */
    public blsf f127599b;

    /* renamed from: c */
    public blsj f127600c;

    /* renamed from: d */
    public blsi f127601d;

    /* renamed from: f */
    private byte f127602f = 2;

    static {
        blsk blsk = new blsk();
        f127596e = blsk;
        bxvk.m124024a(blsk.class, blsk);
    }

    private blsk() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f127602f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f127602f = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f127596e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ဉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new blsk();
        } else {
            if (i2 == 4) {
                return new bxvd(f127596e);
            }
            if (i2 == 5) {
                return f127596e;
            }
            bxxk bxxk = f127597g;
            if (bxxk == null) {
                synchronized (blsk.class) {
                    bxxk = f127597g;
                    if (bxxk == null) {
                        bxxk = new bxve(f127596e);
                        f127597g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
