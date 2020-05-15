package p000;

/* renamed from: cvc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class cvc {

    /* renamed from: a */
    protected final cvb f12180a;

    /* renamed from: b */
    public final Object f12181b;

    protected cvc(cvb cvb, Object obj) {
        cvx.m7697a(cvb != null, "tlv tag cannot be empty");
        this.f12180a = cvb;
        this.f12181b = obj;
    }

    /* renamed from: a */
    public abstract byte[] mo8323a();

    /* renamed from: b */
    public int mo8329b() {
        return mo8323a().length;
    }

    /* renamed from: c */
    public byte[] mo8330c() {
        byte[] b = cvz.m7722b(mo8323a());
        int length = b.length;
        if (length <= 127) {
            return cvz.m7726c(b);
        } else if (length > 255) {
            byte[] b2 = cvz.m7722b(b);
            int length2 = b2.length;
            return cvz.m7723b(cvz.m7720b("82"), cvz.m7723b(new byte[]{cvz.m7717b(length2), cvz.m7700a(length2)}, b2));
        } else {
            return cvz.m7723b(cvz.m7720b("81"), cvz.m7726c(b));
        }
    }

    /* renamed from: d */
    public final byte[] mo8331d() {
        return cvz.m7723b(this.f12180a.mo8320a(), mo8330c());
    }

    /* renamed from: e */
    public cvb mo8332e() {
        return this.f12180a;
    }
}
