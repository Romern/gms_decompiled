package p000;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.yolo.p023ui.AutoSignInSnackbarChimeraService;

/* renamed from: hsp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hsp extends View.AccessibilityDelegate {

    /* renamed from: a */
    final /* synthetic */ Credential f20375a;

    /* renamed from: b */
    final /* synthetic */ AutoSignInSnackbarChimeraService f20376b;

    public hsp(AutoSignInSnackbarChimeraService autoSignInSnackbarChimeraService, Credential credential) {
        this.f20376b = autoSignInSnackbarChimeraService;
        this.f20375a = credential;
    }

    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if (accessibilityEvent.getEventType() == 32) {
            String format = String.format(this.f20376b.getResources().getString(C0126R.string.credentials_a11y_auto_signin), this.f20375a.f10092a);
            accessibilityEvent.getText().clear();
            accessibilityEvent.getText().add(format);
        }
    }
}
