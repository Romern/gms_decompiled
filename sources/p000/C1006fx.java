package p000;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: fx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1006fx implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    final /* synthetic */ C1010ga f17493a;

    public C1006fx(C1010ga gaVar) {
        this.f17493a = gaVar;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        C1010ga gaVar = this.f17493a;
        Dialog dialog = gaVar.f17771c;
        if (dialog != null) {
            gaVar.onCancel(dialog);
        }
    }
}
