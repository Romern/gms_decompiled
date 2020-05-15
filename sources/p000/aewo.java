package p000;

import android.content.DialogInterface;
import com.google.android.gms.locationsharing.updateshares.UpdateSharesChimeraActivity;

/* renamed from: aewo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aewo implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    final /* synthetic */ UpdateSharesChimeraActivity f63953a;

    public aewo(UpdateSharesChimeraActivity updateSharesChimeraActivity) {
        this.f63953a = updateSharesChimeraActivity;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f63953a.f79763n = null;
    }
}
