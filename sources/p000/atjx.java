package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.internal.firstparty.SetNotificationSettingsRequest;

/* renamed from: atjx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atjx extends atki {
    public atjx(SetNotificationSettingsRequest setNotificationSettingsRequest, String str, aswm aswm) {
        super("SetNotificationSettings", setNotificationSettingsRequest, str, aswm);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f90414d.mo49634k(status);
    }

    /* renamed from: b */
    public final void mo50005b(Context context) {
        askf a = askg.m74278a(context, this.f90413c);
        asiv.m74192b(a, ((SetNotificationSettingsRequest) this.f90410b).f108554a.f108411a);
        atbd.m75357a(a, ((SetNotificationSettingsRequest) this.f90410b).f108554a.f108411a);
        asiv.m74186a("UPDATE Wallets SET receives_plastic_transaction_notifications = ? WHERE account_id = ? AND environment = ?;", ((SetNotificationSettingsRequest) this.f90410b).f108554a.f108412b, a);
        new atkm(context).mo50013a(!((SetNotificationSettingsRequest) this.f90410b).f108554a.f108413c);
        this.f90414d.mo49634k(Status.f30107a);
    }
}
