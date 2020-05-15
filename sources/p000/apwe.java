package p000;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;

/* renamed from: apwe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apwe extends DialogFragment {
    public final Dialog onCreateDialog(Bundle bundle) {
        apwd apwd;
        apwc apwc;
        Activity activity = getActivity();
        bmxy.m108581a(activity);
        if (activity instanceof apwd) {
            apwd = (apwd) activity;
        } else {
            apwd = null;
        }
        AlertDialog.Builder message = new AlertDialog.Builder(activity).setMessage((int) C0126R.string.mdm_location_description);
        if (apwd != null) {
            apwc = new apwc(apwd);
        } else {
            apwc = null;
        }
        return message.setPositiveButton((int) C0126R.string.common_turn_on, apwc).setNegativeButton((int) C0126R.string.common_cancel, (DialogInterface.OnClickListener) null).create();
    }
}
