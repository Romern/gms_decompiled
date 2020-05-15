package p000;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;

/* renamed from: apvv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apvv extends DialogFragment {
    public final Dialog onCreateDialog(Bundle bundle) {
        apvu apvu;
        apvt apvt;
        Activity activity = getActivity();
        bmxy.m108581a(activity);
        if (activity instanceof apvu) {
            apvu = (apvu) activity;
        } else {
            apvu = null;
        }
        AlertDialog.Builder message = new AlertDialog.Builder(activity).setTitle((int) C0126R.string.mdm_account_title).setMessage((int) C0126R.string.mdm_account_description);
        if (apvu != null) {
            apvt = new apvt(apvu);
        } else {
            apvt = null;
        }
        return message.setPositiveButton((int) C0126R.string.common_add, apvt).setNegativeButton((int) C0126R.string.common_cancel, (DialogInterface.OnClickListener) null).create();
    }
}
