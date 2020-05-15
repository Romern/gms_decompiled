package p000;

import android.app.UiModeManager;
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
import com.google.android.gms.appdatasearch.QuerySpecification;
import com.google.android.gms.appdatasearch.SearchResults;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: adne */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adne {

    /* renamed from: a */
    private static final QuerySpecification f62205a;

    static {
        frv frv = new frv();
        frv.mo11221b();
        frv.mo11223d();
        f62205a = frv.mo11219a();
    }

    /* renamed from: a */
    private static Uri m50843a(PackageManager packageManager, ApplicationInfo applicationInfo, int i) {
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
            adnt.m50875c("Resources not found for %s", applicationInfo.packageName);
            return null;
        } catch (Resources.NotFoundException e2) {
            adnt.m50875c("Resource not found: %s in %s", Integer.valueOf(i), applicationInfo.packageName);
            return null;
        }
    }

    /* renamed from: b */
    public static bngx m50850b(PackageManager packageManager) {
        return m50851b(packageManager, null);
    }

    /* renamed from: b */
    public static bngx m50851b(PackageManager packageManager, String str) {
        admu admu;
        PackageInfo packageInfo;
        String str2;
        Uri a;
        Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
        intent.addCategory(m50844a());
        intent.setPackage(str);
        try {
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
            try {
                List<PackageInfo> installedPackages = packageManager.getInstalledPackages(0);
                bngs bngs = new bngs();
                for (ResolveInfo resolveInfo : queryIntentActivities) {
                    ComponentName componentName = new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name);
                    Intent intent2 = new Intent("android.intent.action.MAIN", (Uri) null);
                    intent2.addCategory(m50844a());
                    intent2.setComponent(componentName);
                    try {
                        List<ResolveInfo> queryIntentActivities2 = packageManager.queryIntentActivities(intent2, 0);
                        if (!queryIntentActivities2.isEmpty()) {
                            ResolveInfo resolveInfo2 = queryIntentActivities2.get(0);
                            Iterator<PackageInfo> it = installedPackages.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    packageInfo = null;
                                    break;
                                }
                                packageInfo = it.next();
                                if (packageInfo.packageName.equals(componentName.getPackageName())) {
                                    break;
                                }
                            }
                            if (packageInfo != null) {
                                String charSequence = resolveInfo2.loadLabel(packageManager).toString();
                                if (TextUtils.isEmpty(charSequence)) {
                                    charSequence = componentName.getClassName();
                                }
                                admt admt = new admt();
                                admt.f62174a = charSequence;
                                admt.f62176c = componentName;
                                ActivityInfo activityInfo = resolveInfo2.activityInfo;
                                int iconResource = activityInfo.getIconResource();
                                if (iconResource == 0 || (a = m50843a(packageManager, activityInfo.applicationInfo, iconResource)) == null) {
                                    str2 = null;
                                } else {
                                    str2 = a.toString();
                                }
                                admt.f62175b = bmxx.m108578b(str2);
                                admt.f62177d = m50845a(componentName);
                                long j = packageInfo.firstInstallTime;
                                admt.f62178e = Long.valueOf(packageInfo.lastUpdateTime);
                                admu = new admu(admt);
                                if (admu != null && admu.mo33668a()) {
                                    bngs.mo67668c(admu);
                                }
                            }
                        }
                        admu = null;
                    } catch (Exception e) {
                        adnt.m50872b("PackageManager.queryIntentActivities threw an exception %s for intent %s", bmxx.m108578b(e.getMessage()), intent2);
                        admu = null;
                    }
                    bngs.mo67668c(admu);
                }
                return bngs.mo67664a();
            } catch (RuntimeException e2) {
                adnt.m50873b(e2, "PackageManager.queryIntentActivities threw an exception", new Object[0]);
                adns.m50862a().mo33690a(30);
                return null;
            }
        } catch (RuntimeException e3) {
            adnt.m50873b(e3, "PackageManager.queryIntentActivities threw an exception", new Object[0]);
            adns.m50862a().mo33690a(30);
            return null;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    static String m50844a() {
        String str;
        String str2;
        int i = Build.VERSION.SDK_INT;
        int aa = (int) ceqm.f183265a.mo6606a().mo79615aa();
        synchronized (adng.f62208a) {
            if (adng.f62209b != aa) {
                if (aa == 1) {
                    adng.f62210c = false;
                } else if (aa == 2) {
                    adng.f62210c = ((UiModeManager) rpr.m34216b().getSystemService("uimode")).getCurrentModeType() == 4;
                } else if (aa == 3) {
                    try {
                        rpr.m34216b().getPackageManager().getPackageInfo("com.google.android.katniss", 0);
                        adng.f62210c = true;
                    } catch (PackageManager.NameNotFoundException e) {
                        adng.f62210c = false;
                    }
                } else if (aa != 4) {
                    try {
                        adng.f62210c = false;
                    } catch (Exception e2) {
                        try {
                            adng.f62210c = false;
                            adnt.m50873b(e2, "Failure resolving TV device", new Object[0]);
                            adng.f62209b = aa;
                            Object[] objArr = new Object[2];
                            if (!adng.f62210c) {
                                str2 = "regular";
                            } else {
                                str2 = "TV";
                            }
                            objArr[0] = str2;
                            objArr[1] = Integer.valueOf(adng.f62209b);
                            adnt.m50869a("Using %s flags by method %d", objArr);
                        } catch (Throwable th) {
                            adng.f62209b = aa;
                            Object[] objArr2 = new Object[2];
                            objArr2[0] = !adng.f62210c ? "regular" : "TV";
                            objArr2[1] = Integer.valueOf(adng.f62209b);
                            adnt.m50869a("Using %s flags by method %d", objArr2);
                            throw th;
                        }
                    }
                } else {
                    PackageManager packageManager = rpr.m34216b().getPackageManager();
                    adng.f62210c = packageManager.hasSystemFeature("com.google.android.tv") || packageManager.hasSystemFeature("android.hardware.type.television") || packageManager.hasSystemFeature("android.software.leanback");
                }
                adng.f62209b = aa;
                Object[] objArr3 = new Object[2];
                if (!adng.f62210c) {
                    str = "regular";
                } else {
                    str = "TV";
                }
                objArr3[0] = str;
                objArr3[1] = Integer.valueOf(adng.f62209b);
                adnt.m50869a("Using %s flags by method %d", objArr3);
            }
        }
        return !adng.f62210c ? "android.intent.category.LAUNCHER" : "android.intent.category.LEANBACK_LAUNCHER";
    }

    /* renamed from: a */
    public static String m50845a(ComponentName componentName) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.setComponent(componentName);
        intent.setPackage(componentName.getPackageName());
        intent.addCategory(m50844a());
        if (ceqm.f183265a.mo6606a().mo79616ab()) {
            return intent.toUri(1);
        }
        String uri = intent.toUri(2);
        if (uri.startsWith("android-app")) {
            return uri;
        }
        return String.format("android-app://%s#Intent;category=%s;launchFlags=0x10000000;component=%s;end", componentName.getPackageName(), m50844a(), componentName.flattenToShortString());
    }

    /* renamed from: a */
    public static String m50846a(PackageManager packageManager) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        try {
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE);
            if (resolveActivity == null || resolveActivity.activityInfo == null) {
                return null;
            }
            return resolveActivity.activityInfo.packageName;
        } catch (SecurityException e) {
            adnt.m50872b("Failed to get default launcher package name. Exception: %s", e.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    public static List m50847a(bngx bngx) {
        ArrayList arrayList = new ArrayList();
        if (bngx != null) {
            bnre i = bngx.listIterator();
            while (i.hasNext()) {
                admu admu = (admu) i.next();
                if (admu.mo33669b()) {
                    arrayList.add(admu.f62181c.flattenToString());
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static Set m50848a(apsn apsn) {
        String str = "";
        HashSet a = bnpf.m110048a(100);
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                SearchResults searchResults = (SearchResults) aucu.m76783a(apsn.mo47578a("", "com.google.android.gms", new String[]{"internal.3p:MobileApplication"}, i, 100, f62205a), ceqm.f183265a.mo6606a().mo79637v(), TimeUnit.SECONDS);
                if (searchResults == null || searchResults.mo7231a()) {
                    adns.m50862a().mo33690a(28);
                    new Object[1][0] = searchResults != null ? searchResults.f9664a : str;
                    return null;
                }
                fsn b = searchResults.iterator();
                while (b.hasNext()) {
                    a.add(b.next().mo11252a());
                }
                z = searchResults.f9670g < 100;
                i += 100;
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                if (e.getCause() instanceof rjp) {
                    Object[] objArr = new Object[1];
                    if (e.getCause().getMessage() != null) {
                        str = e.getCause().getMessage();
                    }
                    objArr[0] = str;
                    adnt.m50875c("Query failed: %s", objArr);
                }
                adns.m50862a().mo33690a(50);
                return null;
            }
        }
        return a;
    }

    /* renamed from: a */
    public static boolean m50849a(PackageManager packageManager, String str) {
        if (str == null) {
            return false;
        }
        try {
            return packageManager.getApplicationInfo(str, 0).enabled;
        } catch (PackageManager.NameNotFoundException e) {
            adnt.m50873b(e, str.length() == 0 ? new String("Could not get app info for ") : "Could not get app info for ".concat(str), new Object[0]);
            return false;
        }
    }
}
