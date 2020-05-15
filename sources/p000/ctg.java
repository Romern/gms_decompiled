package p000;

/* renamed from: ctg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ctg {

    /* renamed from: a */
    public final byte[] f12012a;

    /* renamed from: b */
    private cze f12013b;

    public ctg(ctn ctn) {
        boolean z;
        if (ctn != null) {
            z = true;
        } else {
            z = false;
        }
        czl.m8003a(z, "credential cannot be null for a session to be created");
        this.f12012a = ctn.f12028a.mo8273d();
        this.f12013b = new czj(ctn);
    }

    /* renamed from: a */
    private final Object m7540a(czf czf) {
        cze cze = czf.f12435a;
        if (cze != null) {
            this.f12013b = cze;
        }
        return czf.f12436b;
    }

    /* renamed from: b */
    public final boolean mo8259b() {
        return ((Boolean) m7540a(this.f12013b.mo8457a())).booleanValue();
    }

    /* renamed from: a */
    public final void mo8257a() {
        m7540a(this.f12013b.mo8459b());
    }

    /* renamed from: a */
    public final byte[] mo8258a(byte[] bArr) {
        boolean z = false;
        if (bArr != null && bArr.length > 0) {
            z = true;
        }
        czl.m8003a(z, "cannot handle null or empty command APDUs");
        try {
            return ((csr) m7540a(this.f12013b.mo8458a(bArr))).mo8228a();
        } catch (ctu e) {
            return new csr(e.f12041a).mo8228a();
        }
    }
}
