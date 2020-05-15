package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.TypedValue;
import com.felicanetworks.mfc.C0126R;

/* renamed from: thh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class thh {
    /* renamed from: a */
    public static int m36964a(Context context) {
        return m36965a(context, 16842801);
    }

    /* renamed from: b */
    public static int m36966b(Context context) {
        return m36965a(context, 16843829);
    }

    /* renamed from: c */
    public static int m36967c(Context context) {
        return m36965a(context, C0126R.attr.snackBarBackgroundColor);
    }

    /* renamed from: d */
    public static int m36968d(Context context) {
        return m36965a(context, C0126R.attr.snackBarButtonColor);
    }

    /* renamed from: e */
    public static int m36969e(Context context) {
        return m36965a(context, C0126R.attr.snackBarTextColor);
    }

    /* renamed from: f */
    public static int m36970f(Context context) {
        return m36965a(context, C0126R.attr.colorAccent);
    }

    /* renamed from: g */
    public static int m36971g(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843534, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: a */
    public static int m36965a(Context context, int i) {
        int color;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i});
        try {
            if (!cgnn.f187369a.mo6606a().mo84163a()) {
                color = obtainStyledAttributes.getColor(0, 0);
            } else {
                color = obtainStyledAttributes.getColor(0, 0);
            }
            return color;
        } catch (UnsupportedOperationException e) {
            Log.e("ThemeUtil", "Default color value is returned for unresolved TypedArray content", e);
            return 0;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
