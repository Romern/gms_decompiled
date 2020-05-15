package p000;

import android.app.Dialog;
import android.os.Bundle;

/* renamed from: bhfr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bhfr extends dev {
    /* renamed from: a */
    private final void m100796a() {
        Dialog dialog = getDialog();
        if (dialog instanceof bhfq) {
            ((bhfq) dialog).mo63666a();
        }
    }

    public final void dismiss() {
        m100796a();
        super.dismiss();
    }

    public final void dismissAllowingStateLoss() {
        m100796a();
        super.dismissAllowingStateLoss();
    }

    public Dialog onCreateDialog(Bundle bundle) {
        return new bhfq(getContext(), getTheme());
    }
}
