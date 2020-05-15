package p000;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.DialogFragment;
import com.google.android.chimera.FragmentManager;

/* renamed from: mmx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mmx extends DialogFragment {
    public final Dialog onCreateDialog(Bundle bundle) {
        int i;
        int i2;
        int i3;
        boolean z = getArguments().getBoolean("is_transferring");
        if (!z) {
            i = C0126R.string.cancel_copy_button_text;
        } else {
            i = C0126R.string.stop_copying_dialog_stop_button_during_transfer;
        }
        if (!z) {
            i2 = C0126R.string.stop_copying_dialog_message_before_transfer;
        } else {
            i2 = C0126R.string.stop_copying_dialog_message_during_transfer;
        }
        if (!z) {
            i3 = C0126R.string.stop_copying_dialog_title_before_transfer;
        } else {
            i3 = C0126R.string.stop_copying_dialog_title_during_transfer;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(getActivity().getString(i3));
        builder.setMessage(getActivity().getString(i2));
        builder.setPositiveButton(getActivity().getString(i), new mmu(this));
        builder.setNegativeButton(getActivity().getString(C0126R.string.common_dismiss), mmv.f34025a);
        return builder.create();
    }

    public final void show(FragmentManager fragmentManager, String str) {
        if (fragmentManager.findFragmentByTag(str) == null) {
            super.show(fragmentManager, str);
        }
    }
}
