package p000;

import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/* renamed from: rfd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rfd extends DialogFragment {

    /* renamed from: a */
    public Dialog f42862a;

    /* renamed from: b */
    public DialogInterface.OnCancelListener f42863b;

    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f42863b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        if (this.f42862a == null) {
            setShowsDialog(false);
        }
        return this.f42862a;
    }
}
