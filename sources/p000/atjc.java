package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.internal.firstparty.GetReceivesTransactionNotificationsRequest;

/* renamed from: atjc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atjc extends atki {
    public atjc(GetReceivesTransactionNotificationsRequest getReceivesTransactionNotificationsRequest, String str, aswm aswm) {
        super("GetReceivesTransactionNotifications", getReceivesTransactionNotificationsRequest, str, aswm);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aswm.b(com.google.android.gms.common.api.Status, boolean):void
     arg types: [com.google.android.gms.common.api.Status, int]
     candidates:
      aswm.b(com.google.android.gms.common.api.Status, java.lang.String):void
      aswm.b(com.google.android.gms.common.api.Status, boolean):void */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f90414d.mo49622b(status, false);
    }

    /* renamed from: b */
    public final void mo50005b(Context context) {
        askf a = askg.m74278a(context, this.f90413c);
        if (((GetReceivesTransactionNotificationsRequest) this.f90410b).f108543a) {
            atbd.m75355a(a);
        }
        this.f90414d.mo49622b(Status.f30107a, asiv.m74193c(a));
    }
}
