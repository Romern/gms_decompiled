package p000;

import android.app.Dialog;
import android.os.Bundle;
import com.google.android.chimera.DialogFragment;

/* renamed from: dev */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class dev extends DialogFragment {
    public Dialog onCreateDialog(Bundle bundle) {
        return new C1374te(getContext(), getTheme());
    }

    public final void setupDialog(Dialog dialog, int i) {
        if (dialog instanceof C1374te) {
            C1374te teVar = (C1374te) dialog;
            if (!(i == 1 || i == 2)) {
                if (i == 3) {
                    dialog.getWindow().addFlags(24);
                } else {
                    return;
                }
            }
            teVar.mo16006c();
            return;
        }
        super.setupDialog(dialog, i);
    }
}
