package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.logging.Level;

/* renamed from: agyt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agyt {
    static {
        srn.m36126a("MobileDataPlan", sgj.MOBILE_DATA_PLAN);
    }

    /* renamed from: a */
    public static long m55299a(Context context) {
        Long b;
        if (context == null) {
            return -1;
        }
        String i = agyq.m55288i(context);
        if (TextUtils.isEmpty(i) || (b = agpk.m54726a().mo35839b(i)) == null) {
            return -1;
        }
        return b.longValue();
    }

    /* renamed from: b */
    public static String m55303b(String str) {
        return str.length() > 32 ? str.substring(str.length() - 32) : str;
    }

    /* renamed from: c */
    public static String m55306c(Context context) {
        return m55302a(m55304b(context));
    }

    /* renamed from: b */
    public static Locale m55304b(Context context) {
        int i = Build.VERSION.SDK_INT;
        return context.getResources().getConfiguration().getLocales().get(0);
    }

    /* renamed from: c */
    public static Level m55307c() {
        return !cfmv.f184430a.mo6606a().mo81543L() ? Level.FINEST : Level.WARNING;
    }

    /* renamed from: a */
    public static Bitmap m55300a(String str) {
        try {
            return BitmapFactory.decodeStream((InputStream) new URL(str).getContent());
        } catch (MalformedURLException e) {
            return null;
        } catch (IOException e2) {
            return null;
        }
    }

    /* renamed from: b */
    public static boolean m55305b() {
        if (Build.FINGERPRINT.startsWith("generic") || Build.FINGERPRINT.startsWith("unknown") || Build.MODEL.contains("google_sdk") || Build.MODEL.contains("Emulator") || Build.MODEL.contains("Android SDK built for x86") || Build.MANUFACTURER.contains("Genymotion")) {
            return true;
        }
        return (Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic")) || "google_sdk".equals(Build.PRODUCT);
    }

    /* renamed from: a */
    public static String m55301a() {
        try {
            return Locale.getDefault().getISO3Language();
        } catch (NullPointerException | MissingResourceException e) {
            return stm.m36299a(Locale.getDefault().getLanguage());
        }
    }

    /* renamed from: a */
    public static String m55302a(Locale locale) {
        int i = Build.VERSION.SDK_INT;
        return locale.toLanguageTag();
    }
}
