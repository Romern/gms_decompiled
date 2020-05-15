package p000;

import android.accounts.Account;
import android.content.Context;
import android.util.SparseArray;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.firstparty.GetAllCardsResponse;
import com.google.android.gms.tapandpay.internal.firstparty.GetAllCardsRequest;

/* renamed from: atiu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atiu extends atki {
    public atiu(GetAllCardsRequest getAllCardsRequest, String str, aswm aswm) {
        super("GetAllCards", getAllCardsRequest, str, aswm);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f90414d.mo49246a(status, new GetAllCardsResponse(null, null, null, null, new SparseArray(0)));
    }

    /* renamed from: b */
    public final void mo50005b(Context context) {
        Account account = ((GetAllCardsRequest) this.f90410b).f108540b;
        atds a = atds.m75666a(account == null ? askg.m74278a(context, this.f90413c) : askg.m74284b(account.name, context, this.f90413c));
        GetAllCardsResponse a2 = a.mo49845a();
        if (!a.mo49849a(2)) {
            a.mo49848a(((GetAllCardsRequest) this.f90410b).f108539a);
        }
        this.f90414d.mo49246a(Status.f30107a, a2);
    }
}
