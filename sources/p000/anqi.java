package p000;

import android.content.DialogInterface;
import com.google.android.gms.plus.audience.CircleCreationChimeraActivity;

/* renamed from: anqi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anqi extends aong {
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        CircleCreationChimeraActivity circleCreationChimeraActivity = (CircleCreationChimeraActivity) getActivity();
        getArguments();
        if (circleCreationChimeraActivity != null) {
            circleCreationChimeraActivity.finish();
        }
    }
}
