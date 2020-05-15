package p000;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.TextView;

/* renamed from: vli */
final /* synthetic */ class vli implements TextView.OnEditorActionListener {

    /* renamed from: a */
    private final Dialog f49438a;

    public vli(Dialog dialog) {
        this.f49438a = dialog;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        Dialog dialog = this.f49438a;
        DialogInterface.OnKeyListener onKeyListener = vlk.f49440a;
        if ((i != 0 || keyEvent.getAction() != 0) && i != 6 && i != 5) {
            return i == 0 && keyEvent.getAction() == 1;
        }
        ((Button) dialog.findViewById(16908313)).performClick();
        return true;
    }
}
