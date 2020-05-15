package p000;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.gms.auth.uiflows.removeaccount.ConfirmAccountDeletionChimeraActivity;

/* renamed from: kaj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kaj implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ ConfirmAccountDeletionChimeraActivity f23657a;

    public kaj(ConfirmAccountDeletionChimeraActivity confirmAccountDeletionChimeraActivity) {
        this.f23657a = confirmAccountDeletionChimeraActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        try {
            this.f23657a.startActivityForResult(new Intent("android.app.action.CONFIRM_DEVICE_CREDENTIAL"), 0);
        } catch (ActivityNotFoundException e) {
            ConfirmAccountDeletionChimeraActivity.f11566a.mo25418e("Cannot find the Activity for the challenge.", new Object[0]);
            this.f23657a.mo7874a(0, (Intent) null);
        }
    }
}
