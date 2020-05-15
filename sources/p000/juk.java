package p000;

import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.auth.setup.d2d.SourceChimeraActivity;

/* renamed from: juk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class juk extends DialogFragment {
    public final Dialog onCreateDialog(Bundle bundle) {
        return rfi.f42868a.mo24579a(getActivity(), getArguments().getInt("error_dialog_code"), 1001);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        ((SourceChimeraActivity) getActivity()).f11273h = false;
    }
}
