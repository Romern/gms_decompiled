package p000;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.appdatasearch.QuerySpecification;
import com.google.android.gms.appdatasearch.SearchResults;
import com.google.android.gms.appdatasearch.Section;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: acls */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1599acls {

    /* renamed from: a */
    private static final QuerySpecification f60114a;

    /* renamed from: b */
    private static final String[] f60115b = {"apps"};

    static {
        frv frv = new frv();
        frv.mo11221b();
        frv.mo11220a(new Section("package_name"));
        frv.mo11220a(new Section("class_name"));
        f60114a = frv.mo11219a();
    }

    /* renamed from: a */
    public static aclq m49396a(PackageManager packageManager, ComponentName componentName) {
        Uri a;
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory(m49399a());
        intent.setComponent(componentName);
        String str = null;
        try {
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
            if (!queryIntentActivities.isEmpty()) {
                ResolveInfo resolveInfo = queryIntentActivities.get(0);
                List<PackageInfo> installedPackages = packageManager.getInstalledPackages(0);
                if (!installedPackages.isEmpty()) {
                    PackageInfo packageInfo = installedPackages.get(0);
                    aclq aclq = new aclq();
                    aclq.f60106a = resolveInfo.loadLabel(packageManager).toString();
                    aclq.f60108c = componentName;
                    if (TextUtils.isEmpty(aclq.f60106a)) {
                        aclq.f60106a = componentName.getClassName();
                    }
                    ActivityInfo activityInfo = resolveInfo.activityInfo;
                    int iconResource = activityInfo.getIconResource();
                    if (!(iconResource == 0 || (a = m49397a(packageManager, activityInfo.applicationInfo, iconResource)) == null)) {
                        str = a.toString();
                    }
                    if (str == null) {
                        str = "android.resource://android/drawable/sym_def_app_icon";
                    }
                    aclq.f60107b = str;
                    aclq.f60109d = packageInfo.firstInstallTime;
                    aclq.f60111f = packageInfo.lastUpdateTime;
                    aclq.f60110e = aclk.m49387a(componentName);
                    return aclq;
                }
            }
            return null;
        } catch (Exception e) {
            if (Log.isLoggable("IcingInternalCorpora", 5)) {
                Log.w("IcingInternalCorpora", acnv.m49540a("PackageManager.queryIntentActivities threw an exception %s for intent %s", e, intent));
            }
            return null;
        }
    }

    /* renamed from: b */
    public static bngx m49403b(PackageManager packageManager, String str) {
        String str2;
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory(m49399a());
        intent.setPackage(str);
        try {
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
            bngs bngs = new bngs();
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                ComponentName componentName = new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name);
                aclq a = m49396a(packageManager, componentName);
                if (!(a == null || (str2 = a.f60106a) == null)) {
                    bngs.mo67668c(new aclr(componentName, str2));
                }
            }
            return bngs.mo67664a();
        } catch (RuntimeException e) {
            acnv.m49544a(e, "PackageManager.queryIntentActivities threw an exception", new Object[0]);
            return bngx.m109376e();
        }
    }

    /* renamed from: b */
    public static String m49404b(PackageManager packageManager) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        try {
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE);
            if (resolveActivity == null || resolveActivity.activityInfo == null) {
                return null;
            }
            return resolveActivity.activityInfo.packageName;
        } catch (SecurityException e) {
            acnv.m49557e("Failed to get default launcher package name. Exception: %s", e);
            return null;
        }
    }

    /* renamed from: a */
    private static Uri m49397a(PackageManager packageManager, ApplicationInfo applicationInfo, int i) {
        try {
            Resources resourcesForApplication = packageManager.getResourcesForApplication(applicationInfo);
            String str = applicationInfo.packageName;
            String resourcePackageName = resourcesForApplication.getResourcePackageName(i);
            String resourceTypeName = resourcesForApplication.getResourceTypeName(i);
            String resourceEntryName = resourcesForApplication.getResourceEntryName(i);
            Uri.Builder builder = new Uri.Builder();
            builder.scheme("android.resource");
            builder.encodedAuthority(str);
            builder.appendEncodedPath(resourceTypeName);
            if (!str.equals(resourcePackageName)) {
                StringBuilder sb = new StringBuilder(String.valueOf(resourcePackageName).length() + 1 + String.valueOf(resourceEntryName).length());
                sb.append(resourcePackageName);
                sb.append(":");
                sb.append(resourceEntryName);
                builder.appendEncodedPath(sb.toString());
            } else {
                builder.appendEncodedPath(resourceEntryName);
            }
            return builder.build();
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(applicationInfo.packageName);
            acnv.m49546b(valueOf.length() == 0 ? new String("Resources not found for ") : "Resources not found for ".concat(valueOf));
            return null;
        } catch (Resources.NotFoundException e2) {
            String str2 = applicationInfo.packageName;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 35);
            sb2.append("Resource not found: ");
            sb2.append(i);
            sb2.append(" in ");
            sb2.append(str2);
            acnv.m49546b(sb2.toString());
            return null;
        }
    }

    /* renamed from: a */
    public static bngx m49398a(PackageManager packageManager) {
        return m49403b(packageManager, null);
    }

    /* renamed from: a */
    static String m49399a() {
        int i = Build.VERSION.SDK_INT;
        return !acwx.m49915a() ? "android.intent.category.LAUNCHER" : "android.intent.category.LEANBACK_LAUNCHER";
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List, java.lang.Iterable], assign insn: null */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public static List m49400a(Iterable r4) {
        ArrayList arrayList = new ArrayList();
        int size = r4.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((aclr) r4.get(i)).f60112a);
        }
        return arrayList;
    }

    /* renamed from: a */
    public static Set m49401a(apsn apsn, abym abym) {
        HashSet hashSet = new HashSet(100);
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                SearchResults searchResults = (SearchResults) aucu.m76783a(apsn.mo47578a("", "com.google.android.gms", f60115b, i, 100, f60114a), 5, TimeUnit.SECONDS);
                fsn b = searchResults.iterator();
                while (b.hasNext()) {
                    C1001fsm a = b.next();
                    hashSet.add(new aclr(new ComponentName(a.mo11253b("package_name"), a.mo11253b("class_name")), a.mo11253b("name")));
                }
                z = searchResults.f9670g < 100;
                i += 100;
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                abym.mo32453b(9002);
                return null;
            }
        }
        return hashSet;
    }

    /* renamed from: a */
    public static boolean m49402a(PackageManager packageManager, String str) {
        if (str == null) {
            return false;
        }
        try {
            return packageManager.getApplicationInfo(str, 0).enabled;
        } catch (PackageManager.NameNotFoundException e) {
            acnv.m49544a(e, "Could not get app info for %s", str);
            return false;
        }
    }
}
