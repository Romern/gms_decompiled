package p000;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* renamed from: fav */
final /* synthetic */ class fav implements View.OnFocusChangeListener {

    /* renamed from: a */
    private final fbh f16180a;

    public fav(fbh fbh) {
        this.f16180a = fbh;
    }

    public final void onFocusChange(View view, boolean z) {
        fbh fbh = this.f16180a;
        if (z) {
            InputMethodManager inputMethodManager = fbh.f16197e;
            if (inputMethodManager != null) {
                inputMethodManager.showSoftInput(view.findFocus(), 1);
                return;
            }
            return;
        }
        fbh.f16196d.setFocusable(false);
        fbh.f16197e.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
}
