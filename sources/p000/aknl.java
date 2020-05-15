package p000;

import android.content.Context;
import android.os.Build;

/* renamed from: aknl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aknl {
    /* renamed from: a */
    public static String m60090a(Context context) {
        int i = Build.VERSION.SDK_INT;
        return context.getResources().getConfiguration().getLocales().get(0).toLanguageTag();
    }
}
