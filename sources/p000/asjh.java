package p000;

import android.content.Intent;
import android.view.View;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.tapandpay.admin.DeviceAdminPromptChimeraActivity;

/* renamed from: asjh */
public final /* synthetic */ class asjh implements View.OnClickListener {

    /* renamed from: a */
    private final DeviceAdminPromptChimeraActivity f89067a;

    public asjh(DeviceAdminPromptChimeraActivity deviceAdminPromptChimeraActivity) {
        this.f89067a = deviceAdminPromptChimeraActivity;
    }

    public void onClick(View view) {
        DeviceAdminPromptChimeraActivity deviceAdminPromptChimeraActivity = this.f89067a;
        atam atam = deviceAdminPromptChimeraActivity.f108316b;
        atam.mo49741a(atam.mo49734a(40));
        asjk.m74234h(deviceAdminPromptChimeraActivity);
        Intent intent = new Intent("android.app.action.ADD_DEVICE_ADMIN");
        intent.putExtra("android.app.extra.DEVICE_ADMIN", asjk.m74226a(deviceAdminPromptChimeraActivity));
        intent.putExtra("android.app.extra.ADD_EXPLANATION", deviceAdminPromptChimeraActivity.getString(C0126R.string.tp_device_admin_desc));
        deviceAdminPromptChimeraActivity.startActivityForResult(intent, 0);
    }
}
