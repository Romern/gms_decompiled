package p000;

import android.os.Build;
import android.os.LocaleList;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: bute */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bute {
    /* renamed from: a */
    public static String m120426a() {
        Locale b = m120428b();
        int i = Build.VERSION.SDK_INT;
        return b.toLanguageTag();
    }

    /* renamed from: b */
    public static Locale m120428b() {
        int i = Build.VERSION.SDK_INT;
        return LocaleList.getDefault().get(0);
    }

    /* renamed from: c */
    public static List m120429c() {
        ArrayList arrayList = new ArrayList();
        int i = Build.VERSION.SDK_INT;
        LocaleList localeList = LocaleList.getDefault();
        for (int i2 = 0; i2 < localeList.size(); i2++) {
            arrayList.add(localeList.get(i2));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static String m120427a(String str) {
        String str2 = "?";
        if (str.contains(str2)) {
            str2 = "&";
        }
        return str.concat(str2).concat("hl=").concat(m120426a());
    }
}
