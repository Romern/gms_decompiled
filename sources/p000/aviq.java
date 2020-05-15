package p000;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.chimera.DialogFragment;

/* renamed from: aviq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aviq extends DialogFragment {

    /* renamed from: a */
    public DialogInterface.OnCancelListener f93245a = null;

    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        DialogInterface.OnCancelListener onCancelListener = this.f93245a;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public final void onCreate(Bundle bundle) {
        setRetainInstance(true);
        super.onCreate(bundle);
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        String string = getArguments().getString("ProgressDialogMessage");
        ProgressDialog progressDialog = new ProgressDialog(getActivity());
        if (!TextUtils.isEmpty(string)) {
            progressDialog.setMessage(string);
        }
        progressDialog.setIndeterminate(true);
        progressDialog.setCanceledOnTouchOutside(false);
        return progressDialog;
    }

    public final void onDestroyView() {
        if (getDialog() != null && getRetainInstance()) {
            getDialog().setDismissMessage(null);
        }
        super.onDestroyView();
    }
}
