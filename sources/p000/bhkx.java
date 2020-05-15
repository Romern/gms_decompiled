package p000;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;

/* renamed from: bhkx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhkx {
    /* renamed from: a */
    public static int m101072a(Context context, int i, String str) {
        TypedValue a = m101074a(context, i);
        if (a != null) {
            return a.data;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    /* renamed from: a */
    public static int m101073a(View view, int i) {
        return m101072a(view.getContext(), i, view.getClass().getCanonicalName());
    }

    /* renamed from: a */
    public static TypedValue m101074a(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        return typedValue;
    }

    /* renamed from: a */
    public static boolean m101075a(Context context, int i, boolean z) {
        TypedValue a = m101074a(context, i);
        if (a == null || a.type != 18) {
            return z;
        }
        return a.data != 0;
    }
}
