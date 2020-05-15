package p000;

/* renamed from: bgoq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgoq extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bgoq f116946f;

    /* renamed from: g */
    private static volatile bxxk f116947g;

    /* renamed from: a */
    public int f116948a;

    /* renamed from: b */
    public bxwc f116949b = bxxn.f165040b;

    /* renamed from: c */
    public long f116950c;

    /* renamed from: d */
    public long f116951d;

    /* renamed from: e */
    public bxwc f116952e = bxxn.f165040b;

    static {
        bgoq bgoq = new bgoq();
        f116946f = bgoq;
        bxvk.m124024a(bgoq.class, bgoq);
    }

    private bgoq() {
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
            return bxvk.m124022a(f116946f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u001b\u0002ဂ\u0000\u0003ဂ\u0001\u0004\u001b", new Object[]{"a", "b", bgov.class, "c", "d", "e", bgos.class});
        } else if (i2 == 3) {
            return new bgoq();
        } else {
            if (i2 == 4) {
                return new bgop();
            }
            if (i2 == 5) {
                return f116946f;
            }
            bxxk bxxk = f116947g;
            if (bxxk == null) {
                synchronized (bgoq.class) {
                    bxxk = f116947g;
                    if (bxxk == null) {
                        bxxk = new bxve(f116946f);
                        f116947g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
