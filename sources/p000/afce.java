package p000;

import android.content.DialogInterface;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;

/* renamed from: afce */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class afce extends DialogFragment {
    public void onDismiss(DialogInterface dialogInterface) {
        Activity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
        super.onDismiss(dialogInterface);
    }
}
