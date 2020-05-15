package p000;

import android.view.KeyEvent;
import android.widget.TextView;

/* renamed from: jej */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class jej implements TextView.OnEditorActionListener {

    /* renamed from: a */
    final /* synthetic */ jem f22285a;

    public jej(jem jem) {
        this.f22285a = jem;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 6) {
            this.f22285a.f22295l.onClick(textView);
            return true;
        } else if (keyEvent == null) {
            return false;
        } else {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 66 && keyCode != 20) {
                return false;
            }
            this.f22285a.f22295l.onClick(textView);
            return true;
        }
    }
}
