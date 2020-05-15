package p000;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;

/* renamed from: afyw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afyw extends afyx {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo35068a(Activity activity) {
        afzq.m53770g(activity);
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Activity activity = getActivity();
        bmxy.m108581a(activity);
        return new AlertDialog.Builder(activity).setTitle((int) C0126R.string.common_mdm_feature_name).setMessage((int) C0126R.string.mdm_activate_device_admin_dialog_message).setPositiveButton((int) C0126R.string.mdm_activate_device_admin_dialog_positive, this).setNegativeButton((int) C0126R.string.common_not_now, (DialogInterface.OnClickListener) null).create();
    }
}
