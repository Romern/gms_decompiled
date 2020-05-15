package p000;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.internal.firstparty.SetFelicaTosAcceptanceRequest;
import com.google.android.gms.tapandpay.service.TapAndPayChimeraService;

/* renamed from: atjw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atjw extends atki {
    public atjw(SetFelicaTosAcceptanceRequest setFelicaTosAcceptanceRequest, String str, aswm aswm) {
        super("SetFelicaTosAcceptance", setFelicaTosAcceptanceRequest, str, aswm);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f90414d.mo49245b(status);
    }

    /* renamed from: b */
    public final void mo50005b(Context context) {
        try {
            askf a = askg.m74277a(context);
            atgf a2 = atgf.m75807a(context);
            boolean z = ((SetFelicaTosAcceptanceRequest) this.f90410b).f108553a;
            String str = a.f89124b;
            SharedPreferences sharedPreferences = a2.f90288g.getSharedPreferences("com.google.android.gms.tapandpay.secard.api.FelicaApi", 0);
            String valueOf = String.valueOf(str);
            String str2 = valueOf.length() == 0 ? new String("felica_tos_accepted") : "felica_tos_accepted".concat(valueOf);
            if (((Boolean) askd.f89119k.mo58455c()).booleanValue()) {
                String valueOf2 = String.valueOf(str);
                str2 = valueOf2.length() == 0 ? new String("fake_felica_tos_accepted") : "fake_felica_tos_accepted".concat(valueOf2);
            }
            if (sharedPreferences.edit().putBoolean(str2, z).commit()) {
                this.f90414d.mo49245b(Status.f30107a);
                return;
            }
            throw new aaaj(8, "Could not set felica ToS acceptance");
        } catch (asks e) {
            bnsl bnsl = (bnsl) TapAndPayChimeraService.f108661a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("atjw", "b", 2126, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Error retrieving account");
            throw new aaaj(13, "Error retrieving account", null);
        }
    }
}
