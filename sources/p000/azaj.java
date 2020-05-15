package p000;

import android.view.View;
import com.google.android.chimera.DialogFragment;

/* renamed from: azaj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azaj {
    /* renamed from: a */
    public static View m85134a(DialogFragment dialogFragment) {
        boolean z;
        if (dialogFragment.getDialog() != null) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108589a(z, "Wrap OnShowListener with SyntheticDialogs#whileDialogExists");
        return dialogFragment.getDialog().getWindow().findViewById(16908290);
    }
}
