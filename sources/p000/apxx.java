package p000;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;

/* renamed from: apxx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apxx extends DialogFragment {

    /* renamed from: a */
    public apwr f85094a = null;

    public final Dialog onCreateDialog(Bundle bundle) {
        apxw apxw;
        Activity activity = getActivity();
        if (activity instanceof apxw) {
            apxw = (apxw) activity;
        } else {
            apxw = null;
        }
        return new AlertDialog.Builder(activity).setMessage((int) C0126R.string.verify_apps_disable_confirmation_dialog).setPositiveButton((int) C0126R.string.common_ok, new apxv(this, apxw)).setNegativeButton((int) C0126R.string.common_cancel, new apxu(this)).create();
    }
}
