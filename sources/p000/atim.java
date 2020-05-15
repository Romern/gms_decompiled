package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.internal.firstparty.DeleteTokenRequest;

/* renamed from: atim */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atim extends atki {
    public atim(DeleteTokenRequest deleteTokenRequest, String str, aswm aswm) {
        super("DeleteToken", deleteTokenRequest, str, aswm);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f90414d.mo49250d(status);
    }

    /* renamed from: b */
    public final void mo50005b(Context context) {
        atds.m75666a(askg.m74278a(context, this.f90413c)).mo49855b(((DeleteTokenRequest) this.f90410b).f108524a, 3);
        this.f90414d.mo49250d(Status.f30107a);
    }
}
