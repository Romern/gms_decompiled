package p000;

import android.support.p002v7.widget.SwitchCompat;
import com.google.android.gms.tapandpay.firstparty.GetNotificationSettingsResponse;
import com.google.android.gms.tapandpay.firstparty.NotificationSettings;
import com.google.android.gms.tapandpay.settings.NotificationSettingsChimeraActivity;

/* renamed from: atku */
public final /* synthetic */ class atku implements rkl {

    /* renamed from: a */
    private final NotificationSettingsChimeraActivity f90428a;

    public atku(NotificationSettingsChimeraActivity notificationSettingsChimeraActivity) {
        this.f90428a = notificationSettingsChimeraActivity;
    }

    /* renamed from: a */
    public final void mo9454a(rkk rkk) {
        GetNotificationSettingsResponse getNotificationSettingsResponse;
        boolean z;
        boolean z2;
        boolean z3;
        NotificationSettingsChimeraActivity notificationSettingsChimeraActivity = this.f90428a;
        asxl asxl = (asxl) rkk;
        if (!asxl.f89886a.mo17710c() || (getNotificationSettingsResponse = asxl.f89887b) == null) {
            notificationSettingsChimeraActivity.mo59404a(new IllegalStateException(asxl.f89886a.f30116j));
            return;
        }
        NotificationSettings notificationSettings = getNotificationSettingsResponse.f108378a;
        if (notificationSettingsChimeraActivity.f108666f) {
            z2 = atbf.TRANSACTION_RECEIPTS.mo49776a(notificationSettingsChimeraActivity);
            z = atbf.PROMOTIONS.mo49776a(notificationSettingsChimeraActivity);
        } else {
            z2 = false;
            z = false;
        }
        SwitchCompat switchCompat = notificationSettingsChimeraActivity.f108667g;
        boolean z4 = true;
        if (!notificationSettings.f108411a) {
            z3 = false;
        } else {
            z3 = !z2;
        }
        switchCompat.setChecked(z3);
        notificationSettingsChimeraActivity.f108667g.jumpDrawablesToCurrentState();
        SwitchCompat switchCompat2 = notificationSettingsChimeraActivity.f108668h;
        if (!notificationSettings.f108413c) {
            z4 = false;
        } else if (z) {
            z4 = false;
        }
        switchCompat2.setChecked(z4);
        notificationSettingsChimeraActivity.f108668h.jumpDrawablesToCurrentState();
        if (notificationSettingsChimeraActivity.f108671k && !z && !notificationSettings.f108413c) {
            notificationSettingsChimeraActivity.mo59406g();
            notificationSettingsChimeraActivity.f108671k = false;
        }
        if (notificationSettingsChimeraActivity.f108672l && !z2 && !notificationSettings.f108411a) {
            notificationSettingsChimeraActivity.mo59405e();
            notificationSettingsChimeraActivity.f108672l = false;
        }
    }
}
