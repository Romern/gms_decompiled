package p000;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.DialogFragment;

/* renamed from: anyw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anyw extends DialogFragment {
    public final Dialog onCreateDialog(Bundle bundle) {
        int i = Build.VERSION.SDK_INT;
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity(), C0126R.style.plus_oob_Interstitial);
        View inflate = getActivity().getLayoutInflater().inflate((int) C0126R.C0128layout.plus_oob_interstitial, (ViewGroup) null);
        ((TextView) inflate.findViewById(C0126R.C0129id.title)).setText(getArguments().getString("title_text"));
        ((TextView) inflate.findViewById(C0126R.C0129id.verbose_message)).setText(getArguments().getString("body_text"));
        inflate.findViewById(C0126R.C0129id.cancel_button).setVisibility(4);
        builder.setView(inflate);
        return builder.create();
    }
}
