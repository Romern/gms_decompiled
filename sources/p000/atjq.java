package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.globalactions.SelectGlobalActionCardRequest;

/* renamed from: atjq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atjq extends atki {
    public atjq(SelectGlobalActionCardRequest selectGlobalActionCardRequest, String str, aswm aswm) {
        super("SelectGlobalActionCard", selectGlobalActionCardRequest, str, aswm);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f90414d.mo49629f(status);
    }

    /* renamed from: b */
    public final void mo50005b(Context context) {
        this.f90414d.mo49629f(new asqc(context).mo49357a(askg.m74283b(context, this.f90413c), (SelectGlobalActionCardRequest) this.f90410b));
    }
}
