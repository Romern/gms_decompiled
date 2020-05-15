package p000;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* renamed from: tsx */
public final /* synthetic */ class tsx implements View.OnFocusChangeListener {

    /* renamed from: a */
    private final InputMethodManager f46617a;

    public tsx(InputMethodManager inputMethodManager) {
        this.f46617a = inputMethodManager;
    }

    public final void onFocusChange(View view, boolean z) {
        InputMethodManager inputMethodManager = this.f46617a;
        if (!z) {
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        } else if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(view.findFocus(), 1);
        }
    }
}
