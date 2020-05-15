package p000;

import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.gms.auth.uiflows.removeaccount.ConfirmAccountDeletionChimeraActivity;

/* renamed from: kai */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kai implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ ConfirmAccountDeletionChimeraActivity f23656a;

    public kai(ConfirmAccountDeletionChimeraActivity confirmAccountDeletionChimeraActivity) {
        this.f23656a = confirmAccountDeletionChimeraActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.cancel();
        this.f23656a.mo7874a(0, (Intent) null);
    }
}
