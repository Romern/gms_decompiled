package p000;

import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;

/* renamed from: bkfp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bkfp implements Runnable {

    /* renamed from: a */
    final /* synthetic */ InputMethodManager f124156a;

    /* renamed from: b */
    final /* synthetic */ TextView f124157b;

    public bkfp(InputMethodManager inputMethodManager, TextView textView) {
        this.f124156a = inputMethodManager;
        this.f124157b = textView;
    }

    public final void run() {
        this.f124156a.showSoftInput(this.f124157b, 1);
    }
}
