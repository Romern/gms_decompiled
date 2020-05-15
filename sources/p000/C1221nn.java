package p000;

import android.os.Build;
import android.text.TextUtils;
import java.util.Locale;

/* renamed from: nn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1221nn {
    static {
        new Locale("", "");
    }

    /* renamed from: a */
    public static int m19678a(Locale locale) {
        int i = Build.VERSION.SDK_INT;
        return TextUtils.getLayoutDirectionFromLocale(locale);
    }
}
