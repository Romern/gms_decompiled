package p000;

import android.content.Context;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.globalactions.GetGlobalActionCardsRequest;
import com.google.android.gms.tapandpay.globalactions.GetGlobalActionCardsResponse;
import com.google.android.gms.tapandpay.service.TapAndPayChimeraService;

/* renamed from: atiy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atiy extends atki {
    public atiy(GetGlobalActionCardsRequest getGlobalActionCardsRequest, String str, aswm aswm) {
        super("GetGlobalActionCards", getGlobalActionCardsRequest, str, aswm);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f90414d.mo49616a(status, (GetGlobalActionCardsResponse) null);
    }

    /* renamed from: b */
    public final void mo50005b(Context context) {
        asqc asqc = new asqc(context);
        try {
            askf b = askg.m74283b(context, this.f90413c);
            GetGlobalActionCardsRequest getGlobalActionCardsRequest = (GetGlobalActionCardsRequest) this.f90410b;
            this.f90414d.mo49616a(Status.f30107a, asqc.mo49358a(b, getGlobalActionCardsRequest.f108502b, getGlobalActionCardsRequest.f108503c, asqc.f89376b.getResources().getDimensionPixelSize(C0126R.dimen.tp_global_actions_icon_size), getGlobalActionCardsRequest.f108501a));
        } catch (asks | RuntimeException e) {
            bnsl bnsl = (bnsl) TapAndPayChimeraService.f108661a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("atiy", "b", 2262, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("GetGlobalActionCards failed");
            this.f90414d.mo49616a(new Status(8888, asqc.mo49363f()), (GetGlobalActionCardsResponse) null);
        }
    }
}
