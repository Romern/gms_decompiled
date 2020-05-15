package p000;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;

/* renamed from: ric */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ric {
    /* renamed from: a */
    public static int m33628a(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        Resources.Theme theme = context.getTheme();
        return (theme == null || !theme.resolveAttribute(i, typedValue, true)) ? i2 : typedValue.resourceId;
    }
}
