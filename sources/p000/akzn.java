package p000;

import android.content.res.Configuration;
import android.os.Build;
import java.util.Locale;

/* renamed from: akzn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akzn {
    /* renamed from: a */
    public static Locale m60713a() {
        Configuration configuration = rpr.m34216b().getResources().getConfiguration();
        int i = Build.VERSION.SDK_INT;
        return configuration.getLocales().get(0);
    }
}
