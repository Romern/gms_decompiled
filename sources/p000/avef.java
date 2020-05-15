package p000;

import android.content.Context;
import android.os.Build;
import java.util.Locale;

/* renamed from: avef */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avef {
    /* renamed from: a */
    public static String m78366a(Context context) {
        Locale locale = context.getResources().getConfiguration().locale;
        int i = Build.VERSION.SDK_INT;
        return locale.toLanguageTag();
    }
}
