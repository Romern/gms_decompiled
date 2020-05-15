package p000;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.DialogFragment;

/* renamed from: aetr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aetr extends DialogFragment {
    public final Dialog onCreateDialog(Bundle bundle) {
        return new AlertDialog.Builder(getActivity()).setTitle((int) C0126R.string.location_sharing_no_name_title).setMessage((int) C0126R.string.location_sharing_no_name_message).setPositiveButton((int) C0126R.string.common_permissions_open_settings, new aetq(this)).create();
    }
}
