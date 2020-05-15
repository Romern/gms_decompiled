package p000;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.DialogFragment;

/* renamed from: auuq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auuq extends DialogFragment {
    public final Dialog onCreateDialog(Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle((int) C0126R.string.auth_trust_agent_pref_face_unlock_reset_dialog_title);
        builder.setMessage((int) C0126R.string.auth_trust_agent_pref_face_unlock_reset_dialog_message);
        builder.setPositiveButton((int) C0126R.string.common_remove, new auuo(this));
        builder.setNegativeButton((int) C0126R.string.common_cancel, new auup());
        return builder.create();
    }
}
