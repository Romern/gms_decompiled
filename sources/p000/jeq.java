package p000;

import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputMethodManager;
import com.google.android.gms.auth.login.CustomWebView;

/* renamed from: jeq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jeq extends InputConnectionWrapper {

    /* renamed from: a */
    final /* synthetic */ CustomWebView f22300a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jeq(CustomWebView customWebView, InputConnection inputConnection) {
        super(inputConnection, true);
        this.f22300a = customWebView;
    }

    public final boolean performEditorAction(int i) {
        if (i != 1) {
            return super.performEditorAction(i);
        }
        CustomWebView customWebView = this.f22300a;
        int i2 = CustomWebView.f10994c;
        InputMethodManager inputMethodManager = (InputMethodManager) customWebView.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(customWebView.getWindowToken(), 0);
        }
        return true;
    }
}
