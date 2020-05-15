package p000;

import android.view.KeyEvent;
import android.widget.TextView;
import androidx.slice.widget.RemoteInputView;

/* renamed from: aqw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqw implements TextView.OnEditorActionListener {

    /* renamed from: a */
    final /* synthetic */ RemoteInputView f2032a;

    public aqw(RemoteInputView remoteInputView) {
        this.f2032a = remoteInputView;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0014  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0035 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0042  */
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        boolean z;
        boolean z2;
        int keyCode;
        if (keyEvent == null) {
            if (i == 6 || i == 5) {
                z = true;
                if (keyEvent == null && (((keyCode = keyEvent.getKeyCode()) == 23 || keyCode == 62 || keyCode == 66 || keyCode == 160) && keyEvent.getAction() == 0)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z && !z2) {
                    return false;
                }
                if (this.f2032a.f1679a.length() > 0) {
                    RemoteInputView.m1650a();
                }
                return true;
            } else if (i == 4) {
                z = true;
                if (keyEvent == null) {
                }
                z2 = false;
                if (!z) {
                    return false;
                }
                if (this.f2032a.f1679a.length() > 0) {
                }
                return true;
            }
        }
        z = false;
        if (keyEvent == null) {
        }
        z2 = false;
        if (!z) {
        }
        if (this.f2032a.f1679a.length() > 0) {
        }
        return true;
    }
}
