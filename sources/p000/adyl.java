package p000;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import com.google.android.chimera.Activity;
import com.google.android.gms.chimera.GoogleSettingsItem;
import com.google.android.gms.googlehelp.GoogleHelp;

/* renamed from: adyl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adyl {

    /* renamed from: a */
    private static final Object f62904a = new Object();

    /* renamed from: b */
    private static adyl f62905b;

    private adyl() {
    }

    /* renamed from: a */
    public static void m51422a() {
        synchronized (f62904a) {
            if (f62905b == null) {
                f62905b = new adyl();
            }
        }
    }

    /* renamed from: b */
    public static final boolean m51426b(Context context) {
        Account[] accountArr;
        adyd a = adyd.m51363a(context);
        int i = Build.VERSION.SDK_INT;
        if (context == null || context.getPackageName() == null) {
            accountArr = a.mo33916a("com.google");
        } else {
            accountArr = a.mo33917a("com.google", context.getPackageName());
        }
        return accountArr.length > 0;
    }

    /* renamed from: c */
    public static final void m51427c(Context context) {
        context.startActivity(new Intent().setClassName(context, "com.google.android.gms.app.settings.OpenSourceLicensesActivity"));
    }

    /* renamed from: d */
    public static final void m51428d(Context context) {
        context.startActivity(new Intent("com.google.android.gms.usagereporting.GOOGLE_SETTINGS").setPackage(context.getPackageName()).addCategory("android.intent.category.DEFAULT"));
    }

    /* renamed from: e */
    public static final boolean m51429e(Context context) {
        return !sre.m36085e(context);
    }

    /* renamed from: a */
    public static final void m51423a(Uri uri, Activity activity) {
        GoogleHelp a = GoogleHelp.m66336a("android_main");
        a.mo43195a(activity);
        a.f78776s = sjx.m35499a(activity);
        a.f78774q = uri;
        wwu wwu = new wwu();
        wwu.mo29491a(wwr.m42392a(activity.getContainerActivity()));
        a.mo43196a(wwu.mo29490a(), activity.getCacheDir());
        new aarh(activity).mo31646a(a.mo43194a());
    }

    /* renamed from: a */
    public static final boolean m51424a(Context context) {
        return context.getSharedPreferences("googlesettings", 0).getBoolean("ShowDebug", false);
    }

    /* renamed from: a */
    public static final boolean m51425a(GoogleSettingsItem googleSettingsItem, Context context, boolean z) {
        boolean b = m51426b(context);
        boolean c = soz.m35800c(context);
        if (googleSettingsItem.f29960f && !b && !googleSettingsItem.f29962h) {
            return false;
        }
        if (googleSettingsItem.f29961g && !c && !googleSettingsItem.f29962h) {
            return false;
        }
        int i = googleSettingsItem.f29957c;
        if (i != 2) {
            if (i != 3) {
                return true;
            }
            ContentResolver contentResolver = context.getContentResolver();
            int i2 = Build.VERSION.SDK_INT;
            if (Settings.Global.getInt(contentResolver, "development_settings_enabled", 0) != 0) {
                return true;
            }
            return false;
        } else if (!z || m51424a(context)) {
            return true;
        } else {
            return false;
        }
    }
}
