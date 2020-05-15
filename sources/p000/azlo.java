package p000;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;

/* renamed from: azlo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azlo extends DialogFragment {

    /* renamed from: a */
    public boolean f99590a = false;

    /* renamed from: b */
    public azln f99591b;

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof azln) {
            this.f99591b = (azln) activity;
            return;
        }
        azoj.m85933c("MuteRprtSpamConfirm", "%s must implement Listener", activity);
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        int i = Build.VERSION.SDK_INT;
        return new AlertDialog.Builder(getActivity(), 2132019837).setTitle(getString(C0126R.string.confirm_share_message_title)).setPositiveButton(17039370, new azll(this)).setNegativeButton((int) C0126R.string.common_no_thanks, azlm.f99589a).create();
    }

    public final void onDetach() {
        super.onDetach();
        this.f99591b = null;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        azln azln = this.f99591b;
        if (azln != null) {
            if (!this.f99590a) {
                azln.mo55024i();
            }
            this.f99591b.mo55023h();
        }
    }
}
