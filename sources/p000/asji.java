package p000;

import android.content.Intent;
import android.view.View;
import com.google.android.gms.tapandpay.admin.DeviceAdminPromptChimeraActivity;

/* renamed from: asji */
public final /* synthetic */ class asji implements View.OnClickListener {

    /* renamed from: a */
    private final DeviceAdminPromptChimeraActivity f89068a;

    public asji(DeviceAdminPromptChimeraActivity deviceAdminPromptChimeraActivity) {
        this.f89068a = deviceAdminPromptChimeraActivity;
    }

    public void onClick(View view) {
        DeviceAdminPromptChimeraActivity deviceAdminPromptChimeraActivity = this.f89068a;
        deviceAdminPromptChimeraActivity.f108316b.mo49736a();
        deviceAdminPromptChimeraActivity.startActivity(new Intent("android.settings.SECURITY_SETTINGS"));
    }
}
