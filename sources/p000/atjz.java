package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.internal.firstparty.SetReceivesTransactionNotificationsRequest;

/* renamed from: atjz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atjz extends atki {
    public atjz(SetReceivesTransactionNotificationsRequest setReceivesTransactionNotificationsRequest, String str, aswm aswm) {
        super("SetReceivesTransactionNotifications", setReceivesTransactionNotificationsRequest, str, aswm);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f90414d.mo49631h(status);
    }

    /* renamed from: b */
    public final void mo50005b(Context context) {
        askf a = askg.m74278a(context, this.f90413c);
        asiv.m74192b(a, ((SetReceivesTransactionNotificationsRequest) this.f90410b).f108555a);
        atbd.m75357a(a, ((SetReceivesTransactionNotificationsRequest) this.f90410b).f108555a);
        this.f90414d.mo49631h(Status.f30107a);
    }
}
