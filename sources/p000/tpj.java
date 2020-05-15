package p000;

import java.util.List;

/* renamed from: tpj */
final /* synthetic */ class tpj implements C0038ax {

    /* renamed from: a */
    private final tpm f46445a;

    public tpj(tpm tpm) {
        this.f46445a = tpm;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        tpm tpm = this.f46445a;
        tql tql = (tql) obj;
        if (tql != null) {
            int c = tql.mo26737c();
            if (c == 0) {
                throw null;
            } else if (c == 1) {
                tpm.f46452a = (List) tql.mo26735a();
                tpm.mo171aJ();
            }
        }
    }
}
