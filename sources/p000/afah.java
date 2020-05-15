package p000;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.Html;
import com.felicanetworks.mfc.C0126R;

/* renamed from: afah */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afah extends afce {
    public final Dialog onCreateDialog(Bundle bundle) {
        Bundle arguments = getArguments();
        return new AlertDialog.Builder(getActivity()).setTitle(arguments.getString("dialog_title")).setMessage(Html.fromHtml(arguments.getString("dialog_message"))).setNegativeButton((int) C0126R.string.common_cancel, (DialogInterface.OnClickListener) null).setPositiveButton((int) C0126R.string.common_continue, new afag(this, (ResultReceiver) arguments.getParcelable("dialog_result_receiver"))).create();
    }
}
