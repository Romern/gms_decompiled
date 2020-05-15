package p000;

import android.os.Build;
import java.util.Locale;

/* renamed from: aasw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aasw {
    /* renamed from: a */
    public static String m46952a() {
        Locale locale = Locale.getDefault();
        int i = Build.VERSION.SDK_INT;
        return locale.toLanguageTag();
    }
}
