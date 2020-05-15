package p000;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;

/* renamed from: ivj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ivj extends C1010ga {

    /* renamed from: Y */
    public String f21867Y;

    public final Dialog onCreateDialog(Bundle bundle) {
        return new AlertDialog.Builder(getActivity()).setMessage(this.f21867Y).setNegativeButton((int) C0126R.string.close_button_label, (DialogInterface.OnClickListener) null).create();
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C1021gj activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
        super.onDismiss(dialogInterface);
    }
}
