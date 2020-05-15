package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.chimera.Activity;
import java.lang.ref.WeakReference;

/* renamed from: wgp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wgp {

    /* renamed from: a */
    static WeakReference f50627a;

    /* renamed from: a */
    public static int m41930a(Intent intent) {
        int a = m41931a(false, intent);
        if (a == 0) {
            return 2132018600;
        }
        return a;
    }

    /* renamed from: b */
    public static int m41933b(Intent intent) {
        String stringExtra = intent.getStringExtra("predefinedTheme");
        if (TextUtils.isEmpty(stringExtra)) {
            return 2132018599;
        }
        if (stringExtra.equals("play")) {
            return 2132018704;
        }
        if (stringExtra.equals("music")) {
            return 2132018708;
        }
        if (stringExtra.equals("youtube")) {
            return 2132018756;
        }
        if (stringExtra.equals("g1")) {
            return 2132018604;
        }
        if (stringExtra.equals("assistant")) {
            return 2132018578;
        }
        if (stringExtra.equals("playpass")) {
            return 2132018714;
        }
        return 2132018599;
    }

    /* renamed from: a */
    static int m41931a(boolean z, Intent intent) {
        String stringExtra = intent.getStringExtra("predefinedTheme");
        if (TextUtils.isEmpty(stringExtra)) {
            return 0;
        }
        if (z) {
            return stringExtra.equals("playpass") ? 2132018710 : 2132018596;
        }
        if (stringExtra.equals("play")) {
            return 2132018702;
        }
        if (stringExtra.equals("music")) {
            return 2132018706;
        }
        if (stringExtra.equals("youtube")) {
            return 2132018754;
        }
        if (stringExtra.equals("g1")) {
            return 2132018602;
        }
        if (stringExtra.equals("assistant")) {
            return 2132018576;
        }
        if (stringExtra.equals("playpass")) {
            return 2132018709;
        }
        return 0;
    }

    /* renamed from: a */
    public static void m41932a(Activity activity, Intent intent, String str) {
        boolean z;
        Context context;
        if (cdsq.m134846b()) {
            z = (activity.getResources().getConfiguration().uiMode & 48) == 32;
        } else {
            z = false;
        }
        int a = m41931a(z, intent);
        if (a == 0) {
            int intExtra = intent.getIntExtra("customTheme", 0);
            if (intExtra != 0) {
                int i = Build.VERSION.SDK_INT;
                WeakReference weakReference = f50627a;
                if (weakReference != null) {
                    context = (Context) weakReference.get();
                } else {
                    context = null;
                }
                if (context == null || !context.getPackageName().equals(str)) {
                    try {
                        context = activity.createPackageContext(str, 0);
                        f50627a = new WeakReference(context);
                    } catch (PackageManager.NameNotFoundException e) {
                        throw new IllegalArgumentException("Calling package of families could not be found", e);
                    }
                }
                if (context != null) {
                    Resources.Theme newTheme = context.getResources().newTheme();
                    newTheme.applyStyle(intExtra, true);
                    activity.getTheme().setTo(newTheme);
                    activity.getTheme().applyStyle(2132018601, false);
                    return;
                }
                return;
            }
            return;
        }
        activity.getTheme().applyStyle(a, true);
    }
}
