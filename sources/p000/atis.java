package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.firstparty.GetActiveCardsForAccountResponse;
import com.google.android.gms.tapandpay.internal.firstparty.GetActiveCardsForAccountRequest;
import java.util.ArrayList;

/* renamed from: atis */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atis extends atki {
    public atis(GetActiveCardsForAccountRequest getActiveCardsForAccountRequest, String str, aswm aswm) {
        super("GetActiveCardsForAccount", getActiveCardsForAccountRequest, str, aswm);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f90414d.mo49608a(status, (GetActiveCardsForAccountResponse) null);
    }

    /* renamed from: b */
    public final void mo50005b(Context context) {
        if (!asko.m74295b(context)) {
            this.f90414d.mo49608a(Status.f30107a, new GetActiveCardsForAccountResponse(new CardInfo[0]));
            return;
        }
        atdz atdz = atds.m75666a(askg.m74284b(((GetActiveCardsForAccountRequest) this.f90410b).f108537a, context, this.f90413c)).f90151a;
        ArrayList arrayList = new ArrayList();
        for (atdt atdt : atdz.mo49870a(atdz.mo49886d())) {
            if (atdt.mo49864b() == 5) {
                arrayList.add(atdt.mo49865c());
            }
        }
        this.f90414d.mo49608a(Status.f30107a, new GetActiveCardsForAccountResponse((CardInfo[]) arrayList.toArray(new CardInfo[0])));
    }
}
