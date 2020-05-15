package p000;

import android.app.Dialog;
import android.os.Bundle;
import android.webkit.WebView;
import com.google.android.chimera.DialogFragment;

/* renamed from: aqkd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqkd extends DialogFragment {
    public final Dialog onCreateDialog(Bundle bundle) {
        return new aqkc(getActivity(), aqka.m71750a(getArguments().getString("policy")), bundle);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        WebView a = ((aqkc) getDialog()).f86269a.mo47932a();
        if (a != null) {
            bundle.putBoolean("savedWebView", true);
            a.saveState(bundle);
        }
        super.onSaveInstanceState(bundle);
    }
}
