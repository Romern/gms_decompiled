package p000;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* renamed from: ssc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ssc {
    /* renamed from: a */
    public static InputMethodManager m36196a(Context context) {
        return (InputMethodManager) context.getSystemService("input_method");
    }

    /* renamed from: b */
    public static void m36198b(Context context, View view) {
        InputMethodManager a = m36196a(context);
        if (a != null) {
            a.showSoftInput(view, 0);
        }
    }

    /* renamed from: a */
    public static void m36197a(Context context, View view) {
        InputMethodManager a = m36196a(context);
        if (a != null) {
            a.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }
}
