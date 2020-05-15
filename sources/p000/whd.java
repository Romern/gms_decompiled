package p000;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.text.TextUtils;
import java.util.Locale;

/* renamed from: whd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class whd extends shl {
    public whd(Context context, String str, int i) {
        super(context, str, i, -1, 6656);
        String str2;
        mo25556a("X-Device-ID", Long.toHexString(spn.getAndroidId(context)));
        mo25556a("User-Agent", sic.m35342a(context, "Family/1.0"));
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = Build.VERSION.SDK_INT;
        Locale locale = configuration.getLocales().get(0);
        if (locale != null && !TextUtils.isEmpty(locale.toString())) {
            int i3 = Build.VERSION.SDK_INT;
            str2 = locale.toLanguageTag();
        } else {
            str2 = "";
        }
        if (!TextUtils.isEmpty(str2)) {
            mo25556a("Accept-Language", str2);
        }
    }
}
