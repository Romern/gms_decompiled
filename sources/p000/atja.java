package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.firstparty.GetNotificationSettingsResponse;
import com.google.android.gms.tapandpay.firstparty.NotificationSettings;
import com.google.android.gms.tapandpay.internal.firstparty.GetNotificationSettingsRequest;

/* renamed from: atja */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atja extends atki {
    public atja(GetNotificationSettingsRequest getNotificationSettingsRequest, String str, aswm aswm) {
        super("GetNotificationSettings", getNotificationSettingsRequest, str, aswm);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f90414d.mo49610a(status, new GetNotificationSettingsResponse(null));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: asiv.a(java.lang.String, askf, boolean):boolean
     arg types: [java.lang.String, askf, int]
     candidates:
      asiv.a(askf, java.lang.String, java.lang.String):void
      asiv.a(java.lang.String, boolean, askf):void
      asiv.a(java.lang.String, askf, boolean):boolean */
    /* renamed from: b */
    public final void mo50005b(Context context) {
        askf a = askg.m74278a(context, this.f90413c);
        if (((GetNotificationSettingsRequest) this.f90410b).f108542a) {
            atbd.m75355a(a);
        }
        this.f90414d.mo49610a(Status.f30107a, new GetNotificationSettingsResponse(new NotificationSettings(asiv.m74193c(a), asiv.m74189a("SELECT receives_plastic_transaction_notifications from Wallets WHERE account_id = ? AND environment = ?;", a, true), !new atkm(context).mo50022h())));
    }
}
