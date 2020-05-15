package p000;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;

/* renamed from: anmz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anmz extends DialogFragment implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private anmy f77176a;

    /* renamed from: b */
    private CharSequence f77177b;

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof anmy) {
            this.f77176a = (anmy) activity;
        }
    }

    public final void onCancel(DialogInterface dialogInterface) {
        anmy anmy = this.f77176a;
        if (anmy != null) {
            anmy.mo41974a();
        }
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        anmy anmy;
        if (i == -1 && (anmy = this.f77176a) != null) {
            anmy.mo41974a();
        }
        dismiss();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f77177b = getArguments().getCharSequence("message");
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        AlertDialog.Builder positiveButton = new AlertDialog.Builder(getActivity()).setIcon(0).setPositiveButton(17039370, this);
        View inflate = getActivity().getLayoutInflater().inflate((int) C0126R.C0128layout.plus_delete_moment_dialog_contents, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(C0126R.C0129id.message);
        textView.setText(this.f77177b);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        return positiveButton.setView(inflate).setInverseBackgroundForced(true).create();
    }

    public final void onDetach() {
        super.onDetach();
        this.f77176a = null;
    }
}
