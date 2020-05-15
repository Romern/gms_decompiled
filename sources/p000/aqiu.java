package p000;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.DialogFragment;
import com.google.android.chimera.FragmentManager;

/* renamed from: aqiu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqiu extends DialogFragment {
    public final Dialog onCreateDialog(Bundle bundle) {
        return new AlertDialog.Builder(getActivity()).setMessage(getArguments().getCharSequence("message")).setNegativeButton((int) C0126R.string.close_button_label, aqit.f86179a).create();
    }

    public final void onResume() {
        TextView textView;
        super.onResume();
        if (getDialog() != null && (textView = (TextView) getDialog().findViewById(16908299)) != null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    public final void show(FragmentManager fragmentManager, String str) {
        if (fragmentManager.findFragmentByTag(str) == null) {
            super.show(fragmentManager, str);
        }
    }
}
