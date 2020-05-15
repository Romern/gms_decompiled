package p000;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.DialogFragment;
import com.google.android.gms.fitness.data.BleDevice;

/* renamed from: annd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class annd extends DialogFragment {
    public final Dialog onCreateDialog(Bundle bundle) {
        String str = ((BleDevice) getArguments().getParcelable("device")).f31982b;
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle((int) C0126R.string.fitness_settings_disconnect_device_dialog_title);
        builder.setMessage(String.format(getResources().getString(C0126R.string.fitness_settings_connected_device_content), str));
        builder.setPositiveButton(17039370, new annb(this));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        return builder.create();
    }
}
