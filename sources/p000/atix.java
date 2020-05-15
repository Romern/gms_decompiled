package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.firstparty.GetFelicaTosAcceptanceResponse;
import com.google.android.gms.tapandpay.service.TapAndPayChimeraService;

/* renamed from: atix */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atix extends atkk {
    public atix(String str, aswm aswm) {
        super("GetFelicaTosAcceptance", str, aswm);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f90414d.mo49247a(status, (GetFelicaTosAcceptanceResponse) null);
    }

    /* renamed from: b */
    public final void mo50005b(Context context) {
        try {
            boolean a = atgf.m75807a(context).mo49941a(askg.m74277a(context).f89124b);
            GetFelicaTosAcceptanceResponse getFelicaTosAcceptanceResponse = new asns().f89279a;
            getFelicaTosAcceptanceResponse.f108375a = a;
            this.f90414d.mo49247a(Status.f30107a, getFelicaTosAcceptanceResponse);
        } catch (asks e) {
            bnsl bnsl = (bnsl) TapAndPayChimeraService.f108661a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("atix", "b", 2156, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Error retrieving account");
            throw new aaaj(13, "Error retrieving account", null);
        }
    }
}
