package p000;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;

/* renamed from: aokq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aokq extends DialogFragment implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private String f78353a;

    /* renamed from: b */
    private String f78354b;

    /* renamed from: c */
    private aokp f78355c;

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof aokp) {
            this.f78355c = (aokp) activity;
            return;
        }
        throw new IllegalStateException("AcceptActionChimeraDialogFragment has to be hosted by an Activity that implements AcceptActionListener.");
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        aokp aokp = this.f78355c;
        if (aokp != null) {
            aokp.mo42924b();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f78353a = arguments.getString("title");
        this.f78354b = arguments.getString("message");
        setCancelable(false);
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        return new AlertDialog.Builder(new ContextThemeWrapper(getActivity(), 2132019651)).setTitle(this.f78353a).setMessage(this.f78354b).setPositiveButton(17039370, this).create();
    }
}
