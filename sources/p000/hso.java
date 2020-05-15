package p000;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.auth.api.credentials.yolo.p023ui.AutoSaveSnackbarChimeraService;

/* renamed from: hso */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hso extends View.AccessibilityDelegate {

    /* renamed from: a */
    final /* synthetic */ AutoSaveSnackbarChimeraService f20374a;

    public hso(AutoSaveSnackbarChimeraService autoSaveSnackbarChimeraService) {
        this.f20374a = autoSaveSnackbarChimeraService;
    }

    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if (accessibilityEvent.getEventType() == 32) {
            String string = this.f20374a.getResources().getString(C0126R.string.credentials_a11y_auto_save);
            accessibilityEvent.getText().clear();
            accessibilityEvent.getText().add(string);
        }
    }
}
