package p000;

import android.app.Dialog;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.chimera.DialogFragment;

/* renamed from: azlc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class azlc extends DialogFragment {
    public final void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (getArguments().getBoolean("custom_enable_dim") && dialog != null && (window = dialog.getWindow()) != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.dimAmount = 0.5f;
            attributes.flags |= 2;
            window.setAttributes(attributes);
        }
    }
}
