package p000;

import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.plus.audience.UpdateActionOnlyChimeraActivity;

/* renamed from: anqy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anqy extends aong {
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        UpdateActionOnlyChimeraActivity updateActionOnlyChimeraActivity = (UpdateActionOnlyChimeraActivity) getActivity();
        Bundle arguments = getArguments();
        if (updateActionOnlyChimeraActivity != null) {
            updateActionOnlyChimeraActivity.mo46559a(arguments.getInt("resultCode"), null);
        }
    }
}
