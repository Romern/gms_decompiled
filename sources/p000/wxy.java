package p000;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;

/* renamed from: wxy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wxy extends DialogFragment {
    public final Dialog onCreateDialog(Bundle bundle) {
        ProgressDialog progressDialog;
        int i;
        Activity activity = getActivity();
        if (aayi.m47270b()) {
            if (!aayi.m47271b(activity, C0126R.attr.gf_isInDarkMode)) {
                i = C0126R.style.gf_LightProgressDialogStyle;
            } else {
                i = C0126R.style.gf_DarkProgressDialogStyle;
            }
            progressDialog = new ProgressDialog(activity, i);
        } else {
            progressDialog = new ProgressDialog(activity);
        }
        progressDialog.setMessage(getString(C0126R.string.common_sending));
        progressDialog.setIndeterminate(true);
        progressDialog.setCancelable(false);
        return progressDialog;
    }
}
