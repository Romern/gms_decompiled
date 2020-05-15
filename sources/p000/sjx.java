package p000;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.feedback.ThemeSettings;

/* renamed from: sjx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sjx {
    /* renamed from: a */
    public static ThemeSettings m35499a(Context context) {
        int i = Build.VERSION.SDK_INT;
        int i2 = Build.VERSION.SDK_INT;
        int a = ThemeSettings.m23411a(context, "android:colorAccent");
        ThemeSettings themeSettings = new ThemeSettings();
        themeSettings.f31623a = 0;
        themeSettings.f31624b = a;
        return themeSettings;
    }
}
