package p000;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* renamed from: ttc */
final /* synthetic */ class ttc implements View.OnFocusChangeListener {

    /* renamed from: a */
    private final ttp f46628a;

    public ttc(ttp ttp) {
        this.f46628a = ttp;
    }

    public final void onFocusChange(View view, boolean z) {
        InputMethodManager inputMethodManager = (InputMethodManager) this.f46628a.getActivity().getSystemService("input_method");
        if (z && inputMethodManager != null) {
            inputMethodManager.showSoftInput(view.findFocus(), 1);
        }
    }
}
