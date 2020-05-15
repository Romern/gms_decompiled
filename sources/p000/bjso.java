package p000;

import android.content.DialogInterface;
import android.util.Log;

/* renamed from: bjso */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bjso implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ bjsq f123242a;

    public bjso(bjsq bjsq) {
        this.f123242a = bjsq;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (!this.f123242a.mo9306a()) {
            DialogInterface.OnClickListener onClickListener = this.f123242a.f123245c;
            if (onClickListener == null) {
                Log.w("FingerprintDialogFrag", "No suitable negative button listener.");
            } else {
                onClickListener.onClick(dialogInterface, i);
            }
        } else {
            throw null;
        }
    }
}
