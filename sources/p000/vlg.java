package p000;

import android.os.Bundle;
import com.google.android.chimera.DialogFragment;

/* renamed from: vlg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class vlg extends DialogFragment {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, 2132019717);
    }

    public final void onDestroyView() {
        if (getDialog() != null && getRetainInstance()) {
            getDialog().setDismissMessage(null);
        }
        super.onDestroyView();
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("BaseIsRestart", true);
        super.onSaveInstanceState(bundle);
    }
}
