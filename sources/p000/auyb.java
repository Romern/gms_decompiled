package p000;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.DialogFragment;

/* renamed from: auyb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auyb extends DialogFragment {
    public final Dialog onCreateDialog(Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setMessage(getString(C0126R.string.auth_trust_agent_trusted_places_note_radius, 80));
        builder.setPositiveButton(getString(C0126R.string.common_ok), new auya(this));
        return builder.create();
    }
}
