package p000;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;

/* renamed from: azls */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azls extends azlc {

    /* renamed from: a */
    public azlr f99593a;

    /* renamed from: a */
    private final String m85817a() {
        return getArguments().getString("appName");
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.f99593a = (azlr) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(String.valueOf(activity.toString()).concat(" must implement MuteAppConfirmationListener"));
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        int i = Build.VERSION.SDK_INT;
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity(), 2132019837);
        builder.setTitle(getString(C0126R.string.ms_confirm, getString(C0126R.string.mute_app_item, m85817a())));
        if (!getArguments().getBoolean("removeSubtext")) {
            builder.setMessage(getString(C0126R.string.confirm_mute_text, m85817a()));
        }
        builder.setPositiveButton(17039370, new azlq(this)).setNegativeButton(17039360, new azlp());
        return builder.create();
    }

    public final void onDetach() {
        super.onDetach();
        this.f99593a = null;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        azlr azlr = this.f99593a;
        if (azlr != null) {
            azlr.mo55029n();
        }
    }
}
