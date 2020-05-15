package p000;

import android.app.Dialog;
import android.view.View;
import android.view.Window;

/* renamed from: vlu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class vlu implements View.OnFocusChangeListener {

    /* renamed from: a */
    final /* synthetic */ Dialog f49474a;

    public vlu(Dialog dialog) {
        this.f49474a = dialog;
    }

    public final void onFocusChange(View view, boolean z) {
        Window window = this.f49474a.getWindow();
        if (window != null) {
            window.setSoftInputMode(5);
        }
    }
}
