package p000;

/* renamed from: cta */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class cta {

    /* renamed from: a */
    protected final csz f12003a;

    /* renamed from: b */
    public final Object f12004b;

    protected cta(csz csz, Object obj) {
        czl.m8003a(csz != null, "tlv tag cannot be empty");
        this.f12003a = csz;
        this.f12004b = obj;
    }

    /* renamed from: a */
    public abstract byte[] mo8237a();

    /* renamed from: b */
    public int mo8251b() {
        return mo8237a().length;
    }

    /* renamed from: c */
    public byte[] mo8252c() {
        byte[] a = czm.m8016a(mo8237a());
        int length = a.length;
        if (length <= 127) {
            return czm.m8021b(a);
        } else if (length > 255) {
            byte[] a2 = czm.m8016a(a);
            int length2 = a2.length;
            return czm.m8022b(czm.m8012a("82"), czm.m8022b(new byte[]{czm.m8023c(length2), czm.m8018b(length2)}, a2));
        } else {
            return czm.m8022b(czm.m8012a("81"), czm.m8021b(a));
        }
    }

    /* renamed from: d */
    public final byte[] mo8253d() {
        return czm.m8022b(this.f12003a.mo8234a(), mo8252c());
    }

    /* renamed from: e */
    public csz mo8254e() {
        return this.f12003a;
    }
}
