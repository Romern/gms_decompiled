package p000;

/* renamed from: ayeo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayeo extends bxvk implements bxxd {

    /* renamed from: i */
    public static final ayeo f97339i;

    /* renamed from: k */
    private static volatile bxxk f97340k;

    /* renamed from: a */
    public int f97341a;

    /* renamed from: b */
    public String f97342b = "";

    /* renamed from: c */
    public String f97343c = "";

    /* renamed from: d */
    public long f97344d;

    /* renamed from: e */
    public int f97345e;

    /* renamed from: f */
    public int f97346f;

    /* renamed from: g */
    public int f97347g;

    /* renamed from: h */
    public String f97348h = "";

    /* renamed from: j */
    private byte f97349j = 2;

    static {
        ayeo ayeo = new ayeo();
        f97339i = ayeo;
        bxvk.m124024a(ayeo.class, ayeo);
    }

    private ayeo() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f97349j);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f97349j = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f97339i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᔈ\u0001\u0003ဂ\u0002\u0004င\u0005\u0005င\u0003\u0006င\u0004\u0007ဈ\u0006", new Object[]{"a", "b", "c", "d", "g", "e", "f", "h"});
        } else if (i2 == 3) {
            return new ayeo();
        } else {
            if (i2 == 4) {
                return new bxvd(f97339i);
            }
            if (i2 == 5) {
                return f97339i;
            }
            bxxk bxxk = f97340k;
            if (bxxk == null) {
                synchronized (ayeo.class) {
                    bxxk = f97340k;
                    if (bxxk == null) {
                        bxxk = new bxve(f97339i);
                        f97340k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
