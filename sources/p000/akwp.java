package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.fido.u2f.api.common.ErrorCode;

/* renamed from: akwp */
final /* synthetic */ class akwp implements aubq {

    /* renamed from: a */
    private final akwu f73013a;

    public akwp(akwu akwu) {
        this.f73013a = akwu;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        akwu akwu = this.f73013a;
        if (!aucb.mo50384b() || !((Status) aucb.mo50386d()).mo17710c()) {
            akwu.mo39937a(ErrorCode.OTHER_ERROR);
        }
    }
}
