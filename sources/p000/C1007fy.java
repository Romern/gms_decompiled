package p000;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: fy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1007fy implements DialogInterface.OnDismissListener {

    /* renamed from: a */
    final /* synthetic */ C1010ga f17577a;

    public C1007fy(C1010ga gaVar) {
        this.f17577a = gaVar;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C1010ga gaVar = this.f17577a;
        Dialog dialog = gaVar.f17771c;
        if (dialog != null) {
            gaVar.onDismiss(dialog);
        }
    }
}
