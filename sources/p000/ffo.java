package p000;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;

/* renamed from: ffo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ffo extends DialogFragment {
    public final Dialog onCreateDialog(Bundle bundle) {
        super.onCreateDialog(bundle);
        return new AlertDialog.Builder(getActivity()).setTitle((int) C0126R.string.common_asm_google_account_title).setMessage((int) C0126R.string.accountsettings_not_available).setNeutralButton(17039370, ffn.f16472a).setCancelable(true).create();
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        Activity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }
}
