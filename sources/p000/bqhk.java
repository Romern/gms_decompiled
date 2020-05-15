package p000;

/* renamed from: bqhk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqhk extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bqhk f140663c;

    /* renamed from: d */
    private static volatile bxxk f140664d;

    /* renamed from: a */
    public boolean f140665a;

    /* renamed from: b */
    public bxwc f140666b = bxxn.f165040b;

    static {
        bqhk bqhk = new bqhk();
        f140663c = bqhk;
        bxvk.m124024a(bqhk.class, bqhk);
    }

    private bqhk() {
    }

    /* renamed from: a */
    public static bqhk m112842a(byte[] bArr) {
        bxvk a = bxvk.m124015a(f140663c, bArr, 0, bArr.length, bxus.m123743b());
        bxvk.m124027b(a);
        return (bqhk) a;
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
            return bxvk.m124022a(f140663c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0007\u0002Ț", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bqhk();
        } else {
            if (i2 == 4) {
                return new bxvd(f140663c);
            }
            if (i2 == 5) {
                return f140663c;
            }
            bxxk bxxk = f140664d;
            if (bxxk == null) {
                synchronized (bqhk.class) {
                    bxxk = f140664d;
                    if (bxxk == null) {
                        bxxk = new bxve(f140663c);
                        f140664d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
