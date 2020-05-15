package p000;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.chimera.DialogFragment;

/* renamed from: rey */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rey extends DialogFragment {

    /* renamed from: a */
    public Dialog f42851a;

    /* renamed from: b */
    public DialogInterface.OnCancelListener f42852b;

    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f42852b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        if (this.f42851a == null) {
            setShowsDialog(false);
        }
        return this.f42851a;
    }
}
