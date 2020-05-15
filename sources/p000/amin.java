package p000;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.DialogFragment;

/* renamed from: amin */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amin extends DialogFragment {
    public final Dialog onCreateDialog(Bundle bundle) {
        ProgressDialog progressDialog = new ProgressDialog(new ContextThemeWrapper(getActivity(), 2132018565));
        progressDialog.setMessage(getString(C0126R.string.people_avatar_progress_message));
        progressDialog.setIndeterminate(true);
        progressDialog.setCancelable(true);
        progressDialog.setCanceledOnTouchOutside(false);
        progressDialog.setOnKeyListener(new amim());
        return progressDialog;
    }
}
