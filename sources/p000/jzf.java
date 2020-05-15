package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;

/* renamed from: jzf */
final /* synthetic */ class jzf implements aubq {

    /* renamed from: a */
    private final kaa f23564a;

    public jzf(kaa kaa) {
        this.f23564a = kaa;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        kaa kaa = this.f23564a;
        if (!cbxi.f178510a.mo6606a().mo75573a() || aucb.mo50384b()) {
            Status status = (Status) aucb.mo50386d();
            if (status.mo17710c()) {
                return;
            }
            if (status.f30115i != 17) {
                kaa.mo14273a(ErrorCode.UNKNOWN_ERR);
            } else {
                kaa.mo14273a(ErrorCode.NOT_SUPPORTED_ERR);
            }
        } else {
            kaa.f23599d.mo25418e("Unable to fido2 headless sign", aucb.mo50387e().getMessage());
        }
    }
}
