package p000;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: ttn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ttn implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ Runnable f46641a;

    public ttn(Runnable runnable) {
        this.f46641a = runnable;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f46641a.run();
    }
}
