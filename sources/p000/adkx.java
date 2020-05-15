package p000;

import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import java.util.ArrayList;
import java.util.List;

/* renamed from: adkx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adkx {
    /* renamed from: a */
    public static List m50779a(Context context) {
        ArrayList arrayList = new ArrayList();
        int i = Build.VERSION.SDK_INT;
        LocaleList locales = context.getResources().getConfiguration().getLocales();
        for (int i2 = 0; i2 < locales.size(); i2++) {
            arrayList.add(locales.get(i2).toLanguageTag());
        }
        return arrayList;
    }
}
