package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.cast.JGCastService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.internal.firstparty.ShowNotificationSettingsRequest;
import com.google.android.gms.tapandpay.settings.NotificationSettingsChimeraActivity;

/* renamed from: atkb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atkb extends atki {
    public atkb(ShowNotificationSettingsRequest showNotificationSettingsRequest, String str, aswm aswm) {
        super("ShowNotificationSettings", showNotificationSettingsRequest, str, aswm);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f90414d.mo49607a(status, Bundle.EMPTY);
    }

    /* renamed from: b */
    public final void mo50005b(Context context) {
        AccountInfo b = asix.m74201b(context, askc.m74272b());
        if (b == null) {
            this.f90414d.mo49607a(new Status(5), Bundle.EMPTY);
            return;
        }
        Intent a = NotificationSettingsChimeraActivity.m93113a(context, b.f108326b, b.f108325a);
        a.setClassName("com.google.android.gms", "com.google.android.gms.tapandpay.settings.NotificationSettingsActivity");
        a.addFlags(603979776);
        this.f90414d.mo49607a(new Status(6, null, spn.m35844a(context, a, (int) JGCastService.FLAG_PRIVATE_DISPLAY)), Bundle.EMPTY);
    }
}
