package p000;

/* renamed from: cxe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cxe implements asry {

    /* renamed from: a */
    private cyz f12363a;

    public cxe(cys cys, cwg cwg) {
        cvx.m7697a(true, "credential cannot be null for a session to be created");
        cys.f12408a.mo3395a();
        this.f12363a = new czc(cys, cwg, null);
    }

    /* renamed from: a */
    private final Object m7817a(cvv cvv) {
        cvu cvu = cvv.f12206a;
        if (cvu != null) {
            this.f12363a = (cyz) cvu;
        }
        return cvv.f12207b;
    }

    /* renamed from: a */
    public final assf mo3391a() {
        return (assf) m7817a(this.f12363a.mo8342a());
    }

    /* renamed from: a */
    public final byte[] mo3393a(byte[] bArr) {
        boolean z = false;
        if (bArr != null && bArr.length > 0) {
            z = true;
        }
        cvx.m7697a(z, "cannot handle null or empty command APDUs");
        try {
            return ((cut) m7817a(this.f12363a.mo8343a(bArr))).mo8314a();
        } catch (cvl e) {
            bqye.m113758a(e);
            this.f12363a = this.f12363a.mo8452a(e.f12199b);
            return new cut(e.f12198a).mo8314a();
        }
    }
}
