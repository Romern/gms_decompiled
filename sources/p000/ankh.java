package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.chimera.config.ModuleManager;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: ankh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ankh {

    /* renamed from: a */
    private static aney f77009a = null;

    /* renamed from: b */
    private static ankl f77010b = null;

    /* renamed from: c */
    private static final srn f77011c = srn.m36127a(sgj.PLATFORM_CONFIGURATOR);

    /* renamed from: a */
    public static aney m64637a(Context context) {
        if (f77009a == null) {
            f77009a = anef.m64089a(context);
        }
        return f77009a;
    }

    /* renamed from: b */
    private static int m64641b(String str, Context context) {
        PackageManager packageManager = context.getPackageManager();
        try {
            if (!cghk.f186943a.mo6606a().mo83804i()) {
                return packageManager.getPackageInfo(str, 128).versionCode;
            }
            return packageManager.getPackageInfo(str, 1073741952).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            bnsl bnsl = (bnsl) f77011c.mo68388c();
            bnsl.mo68432a("ankh", "b", 117, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Package %s name not found! Using module version.", str);
            return m64644c(context);
        }
    }

    /* renamed from: c */
    private static int m64644c(Context context) {
        try {
            return ModuleManager.get(context).getCurrentModule().moduleVersion;
        } catch (Exception e) {
            bnsl bnsl = (bnsl) f77011c.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("ankh", "c", 96, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Problem fetching module version!");
            return 1;
        }
    }

    /* renamed from: a */
    public static String m64638a(String str) {
        return ankk.m64652a(str.split(":", -1)[0]);
    }

    /* renamed from: a */
    public static boolean m64639a(String str, Context context) {
        return m64640a(str, null, context);
    }

    /* renamed from: a */
    public static boolean m64640a(String str, String str2, Context context) {
        int i;
        if (bmxx.m108577a(str2)) {
            i = m64644c(context);
        } else {
            int i2 = Build.VERSION.SDK_INT;
            PackageManager packageManager = context.getPackageManager();
            try {
                if (!cghk.f186943a.mo6606a().mo83804i()) {
                    i = packageManager.getPackageInfo(str2, 128).versionCode;
                } else {
                    i = packageManager.getPackageInfo(str2, 1073741952).versionCode;
                }
            } catch (PackageManager.NameNotFoundException e) {
                bnsl bnsl = (bnsl) f77011c.mo68388c();
                bnsl.mo68432a("ankh", "b", 117, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("Package %s name not found! Using module version.", str2);
                i = m64644c(context);
            }
        }
        try {
            aucu.m76783a(m64637a(context).mo25235a(str, i, new String[]{"PHENOTYPE"}, new int[0]), 2000, TimeUnit.MILLISECONDS);
            return true;
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            bnsl bnsl2 = (bnsl) f77011c.mo68388c();
            bnsl2.mo68437a(e2);
            bnsl2.mo68432a("ankh", "a", 83, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("Phenotype platform registration failed for %s", str);
            return false;
        }
    }

    /* renamed from: b */
    public static ankl m64642b(Context context) {
        if (f77010b == null) {
            f77010b = new ankl(m64637a(context), context, new anko(context));
        }
        return f77010b;
    }

    /* renamed from: b */
    public static String m64643b(String str) {
        if (cghk.m145453e()) {
            String[] split = str.split(":", -1);
            if (split.length >= 2) {
                return split[1];
            }
        }
        return null;
    }
}
