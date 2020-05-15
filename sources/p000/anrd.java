package p000;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.plus.audience.UpdateCirclesChimeraActivity;

/* renamed from: anrd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anrd extends aong {
    /* renamed from: a */
    public static anrd m65041a(String str, Intent intent) {
        Bundle b = aong.m66136b(str);
        b.putInt("resultCode", 7);
        b.putParcelable("dataIntent", intent);
        anrd anrd = new anrd();
        anrd.setArguments(b);
        return anrd;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        UpdateCirclesChimeraActivity updateCirclesChimeraActivity = (UpdateCirclesChimeraActivity) getActivity();
        Bundle arguments = getArguments();
        if (updateCirclesChimeraActivity != null) {
            updateCirclesChimeraActivity.setResult(arguments.getInt("resultCode"), (Intent) arguments.getParcelable("dataIntent"));
            updateCirclesChimeraActivity.mo42071a(arguments.getInt("resultCode"), (Intent) arguments.getParcelable("dataIntent"));
        }
    }
}
