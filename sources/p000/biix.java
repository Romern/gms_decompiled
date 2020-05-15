package p000;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* renamed from: biix */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biix {
    /* renamed from: a */
    public static int m102462a(float f, Context context) {
        return (int) (f * context.getResources().getDisplayMetrics().density);
    }

    /* renamed from: a */
    public static void m102463a(Context context, View view) {
        ((InputMethodManager) context.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    /* renamed from: a */
    public static void m102464a(View view, Runnable runnable) {
        view.getViewTreeObserver().addOnGlobalLayoutListener(new biiw(view, runnable));
    }
}
