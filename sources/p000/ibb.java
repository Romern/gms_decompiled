package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import android.view.autofill.AutofillManager;

/* renamed from: ibb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ibb {

    /* renamed from: a */
    private static final srn f20668a = srn.m36124a();

    /* renamed from: a */
    public static boolean m15152a(Context context) {
        bmxy.m108581a(context);
        int i = Build.VERSION.SDK_INT;
        AutofillManager autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class);
        if (autofillManager != null) {
            return autofillManager.isAutofillSupported();
        }
        return false;
    }

    /* renamed from: b */
    private static String m15155b(Context context, String str) {
        try {
            return spn.m35867b(context, str, "SHA-256");
        } catch (PackageManager.NameNotFoundException e) {
            ((bnsl) f20668a.mo68390d()).mo68405a("Cannot find the package info for given package name.");
            return null;
        }
    }

    /* renamed from: c */
    public static String m15157c(Context context) {
        bmxy.m108581a(context);
        if (!m15152a(context) || !m15156b(context)) {
            ((bnsl) f20668a.mo68390d()).mo68405a("Ignore getting hash since autofill is not supported or enabled.");
            return null;
        }
        String d = m15158d(context);
        if (d != null) {
            return m15155b(context, d);
        }
        ((bnsl) f20668a.mo68390d()).mo68405a("Autofill service package name is null. Ignore getting certificate.");
        return null;
    }

    /* renamed from: d */
    public static String m15158d(Context context) {
        bmxy.m108581a(context);
        if (!m15152a(context) || !m15156b(context)) {
            ((bnsl) f20668a.mo68390d()).mo68405a("Ignore getting package name since autofill is not supported or enabled.");
            return null;
        }
        ComponentName autofillServiceComponentName = ((AutofillManager) context.getSystemService(AutofillManager.class)).getAutofillServiceComponentName();
        if (autofillServiceComponentName != null) {
            return autofillServiceComponentName.getPackageName();
        }
        ((bnsl) f20668a.mo68390d()).mo68405a("autofill componentName is null.");
        return null;
    }

    /* renamed from: b */
    public static boolean m15156b(Context context) {
        bmxy.m108581a(context);
        int i = Build.VERSION.SDK_INT;
        AutofillManager autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class);
        if (autofillManager == null || autofillManager.getAutofillServiceComponentName() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m15153a(Context context, String str) {
        bmxy.m108581a(context);
        bmxy.m108581a(str);
        if (!m15152a(context) || !m15156b(context)) {
            return false;
        }
        String d = m15158d(context);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(d)) {
            ((bnsl) f20668a.mo68390d()).mo68405a("The package name of given package or autofill service is invalid. Ignore the checking.");
            return false;
        } else if (!bmwb.m108443a(str, d)) {
            return false;
        } else {
            String b = m15155b(context, str);
            String c = m15157c(context);
            if (!TextUtils.isEmpty(b) && !TextUtils.isEmpty(c)) {
                return bmwb.m108443a(b, c);
            }
            ((bnsl) f20668a.mo68390d()).mo68405a("The certificate of given package or autofill service is invalid. Ignore the checking.");
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m15154a(String str) {
        bmxy.m108581a(str);
        if (!new sbe(str).mo25331a()) {
            return false;
        }
        if (cceb.f178815a.mo6606a().mo75818b()) {
            return cceb.f178815a.mo6606a().mo75817a().f165797a.contains(str);
        }
        return true;
    }
}
