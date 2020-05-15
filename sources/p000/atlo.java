package p000;

import android.app.Dialog;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;

/* renamed from: atlo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atlo extends atln {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9306a() {
        Activity activity = getActivity();
        if (activity != null) {
            ComponentName componentName = new ComponentName(getActivity(), "com.google.android.gms.mdm.receivers.MdmDeviceAdminReceiver");
            Intent intent = new Intent("android.app.action.ADD_DEVICE_ADMIN");
            intent.putExtra("android.app.extra.DEVICE_ADMIN", componentName);
            activity.startActivity(intent);
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        super.onCreateDialog(bundle);
        this.f90449b = bpan.ENABLE_ADM;
        return mo50032a(getResources().getString(C0126R.string.tp_settings_enable_adm_dialog_title), getResources().getString(C0126R.string.tp_settings_enable_adm_dialog_message), getResources().getString(C0126R.string.tp_settings_enable_adm_dialog_settings_button), getResources().getString(C0126R.string.common_no_thanks));
    }
}
