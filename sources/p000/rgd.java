package p000;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

/* renamed from: rgd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rgd extends C1010ga {

    /* renamed from: Y */
    public Dialog f42910Y;

    /* renamed from: Z */
    public DialogInterface.OnCancelListener f42911Z;

    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f42911Z;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        if (this.f42910Y == null) {
            setShowsDialog(false);
        }
        return this.f42910Y;
    }
}
