package p000;

/* renamed from: ciqo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ciqo {

    /* renamed from: a */
    static ciqn f191257a;

    /* renamed from: b */
    static long f191258b;

    private ciqo() {
    }

    /* renamed from: a */
    static ciqn m150874a() {
        synchronized (ciqo.class) {
            if (f191257a == null) {
                return new ciqn();
            }
            ciqn ciqn = f191257a;
            f191257a = ciqn.f191255f;
            ciqn.f191255f = null;
            f191258b -= 8192;
            return ciqn;
        }
    }

    /* renamed from: a */
    public static void m150875a(ciqn ciqn) {
        if (ciqn.f191255f != null || ciqn.f191256g != null) {
            throw new IllegalArgumentException();
        } else if (!ciqn.f191253d) {
            synchronized (ciqo.class) {
                if (f191258b + 8192 <= 65536) {
                    f191258b += 8192;
                    ciqn.f191255f = f191257a;
                    ciqn.f191252c = 0;
                    ciqn.f191251b = 0;
                    f191257a = ciqn;
                }
            }
        }
    }
}
