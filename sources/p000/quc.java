package p000;

/* renamed from: quc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class quc extends qty {

    /* renamed from: c */
    private final bxxk f42134c;

    public quc(bxxk bxxk, String str) {
        super(str, bmvz.f131120a);
        sdo.m34959a(bxxk);
        this.f42134c = bxxk;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bmxv mo24278a(Object obj) {
        bmxv bmxv = (bmxv) obj;
        return bmxv.mo66813a() ? bmxv.m108566b(((bxxc) bmxv.mo66814b()).mo73642k()) : bmvz.f131120a;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo24279a(byte[] bArr) {
        try {
            return bmxv.m108566b((bxxc) this.f42134c.mo73662b(bArr, bxus.m123744c()));
        } catch (bxwf e) {
            throw new qrp(769, "Failed to parse the proto.", e);
        }
    }
}
