package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: mcg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mcg {

    /* renamed from: a */
    public static final lvn f33412a = new lvn("EligibilityFilter");

    /* renamed from: a */
    public static mcf m24865a(Context context, PackageInfo packageInfo) {
        String str;
        String str2 = packageInfo.packageName;
        if (sre.m36080a(context)) {
            str = ccnf.f179489a.mo6606a().mo76425S();
        } else {
            str = ccnf.f179489a.mo6606a().mo76420N();
        }
        if (m24867a(packageInfo, str)) {
            lvn lvn = f33412a;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 45);
            sb.append("Accepting ");
            sb.append(str2);
            sb.append(", whitelisted for key-value backup.");
            lvn.mo25409a(sb.toString(), new Object[0]);
            return mcf.ELIGIBLE;
        } else if (m24867a(packageInfo, ccmk.m130671c())) {
            lvn lvn2 = f33412a;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 45);
            sb2.append("Rejecting ");
            sb2.append(str2);
            sb2.append(", blacklisted for key-value backup.");
            lvn2.mo25409a(sb2.toString(), new Object[0]);
            return mcf.INELIGIBLE_BLACKLISTED;
        } else if (sre.m36080a(context)) {
            return mcf.INELIGIBLE_SIDEWINDER;
        } else {
            return mcf.ELIGIBLE;
        }
    }

    /* renamed from: b */
    public static mcf m24869b(Context context, PackageInfo packageInfo) {
        if (m24866a(context, packageInfo.packageName)) {
            return m24870c(context, packageInfo);
        }
        f33412a.mo25409a("Rejecting %s backup for d2dmigrate.", packageInfo.packageName);
        return mcf.INELIGIBLE_PACKAGE_CONSENT;
    }

    /* renamed from: c */
    public static mcf m24870c(Context context, PackageInfo packageInfo) {
        String str;
        String str2 = packageInfo.packageName;
        if (sre.m36080a(context)) {
            str = ccnf.f179489a.mo6606a().mo76424R();
        } else {
            str = ccnf.f179489a.mo6606a().mo76433e();
        }
        if (m24867a(packageInfo, str)) {
            lvn lvn = f33412a;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 45);
            sb.append("Accepting ");
            sb.append(str2);
            sb.append(", whitelisted for full-data backup.");
            lvn.mo25414c(sb.toString(), new Object[0]);
            return mcf.ELIGIBLE;
        } else if (m24867a(packageInfo, ccmk.m130671c())) {
            lvn lvn2 = f33412a;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 45);
            sb2.append("Rejecting ");
            sb2.append(str2);
            sb2.append(", blacklisted for full-data backup.");
            lvn2.mo25414c(sb2.toString(), new Object[0]);
            return mcf.INELIGIBLE_BLACKLISTED;
        } else if (sre.m36080a(context)) {
            lvn lvn3 = f33412a;
            StringBuilder sb3 = new StringBuilder(String.valueOf(str2).length() + 50);
            sb3.append("Rejecting ");
            sb3.append(str2);
            sb3.append(", current device is a sidewinder device.");
            lvn3.mo25414c(sb3.toString(), new Object[0]);
            return mcf.INELIGIBLE_SIDEWINDER;
        } else if (!ccnf.f179489a.mo6606a().mo76430b() || (!str2.startsWith("com.google.") && !str2.startsWith("com.android."))) {
            int d = (int) ccmk.m130672d();
            if (d == 0 || packageInfo.applicationInfo == null || packageInfo.applicationInfo.targetSdkVersion >= d) {
                if (!ccnf.f179489a.mo6606a().mo76418L()) {
                    PackageManager packageManager = context.getPackageManager();
                    Intent intent = new Intent("com.google.android.c2dm.intent.RECEIVE");
                    intent.setPackage(str2);
                    List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
                    if (queryBroadcastReceivers != null && !queryBroadcastReceivers.isEmpty()) {
                        lvn lvn4 = f33412a;
                        StringBuilder sb4 = new StringBuilder(String.valueOf(str2).length() + 25);
                        sb4.append("Rejecting ");
                        sb4.append(str2);
                        sb4.append(", app uses gcm.");
                        lvn4.mo25409a(sb4.toString(), new Object[0]);
                        return mcf.INELIGIBLE_GCM;
                    }
                }
                return mcf.ELIGIBLE;
            }
            lvn lvn5 = f33412a;
            StringBuilder sb5 = new StringBuilder(String.valueOf(str2).length() + 37);
            sb5.append("Rejecting ");
            sb5.append(str2);
            sb5.append(", targetSdkVersion too low.");
            lvn5.mo25409a(sb5.toString(), new Object[0]);
            return mcf.INELIGIBLE_FULL_MIN_SDK;
        } else {
            lvn lvn6 = f33412a;
            StringBuilder sb6 = new StringBuilder(String.valueOf(str2).length() + 35);
            sb6.append("Rejecting ");
            sb6.append(str2);
            sb6.append(", it's a first party app.");
            lvn6.mo25414c(sb6.toString(), new Object[0]);
            return mcf.INELIGIBLE_FIRST_PARTY;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: lvr.a(android.content.Context, boolean):void
     arg types: [android.content.Context, int]
     candidates:
      lvr.a(android.content.Context, int):void
      lvr.a(android.content.Context, long):void
      lvr.a(android.content.Context, boolean):void */
    /* renamed from: a */
    public static boolean m24866a(Context context, String str) {
        lvr lvr = lvr.f33060a;
        if (!ccnf.f179489a.mo6606a().mo76432d()) {
            return true;
        }
        if (str.equals("com.android.providers.telephony")) {
            if (!lvr.mo19661f(context)) {
                return false;
            }
        } else if (str.equals("com.android.calllogbackup") && !lvr.mo19655b(context)) {
            if (!ccmk.m130670b() || !lvr.mo19660e(context)) {
                return false;
            }
            lvr.mo19651a(context, true);
            return true;
        }
        return true;
    }

    /* renamed from: a */
    static boolean m24867a(PackageInfo packageInfo, String str) {
        return sqw.m36047b(str.split(",")).contains(packageInfo.packageName);
    }

    /* renamed from: a */
    public static String[] m24868a(PackageInfo[] packageInfoArr, mbx mbx, rtj rtj) {
        mcf mcf;
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (PackageInfo packageInfo : packageInfoArr) {
            String str = packageInfo.packageName;
            if (lwa.f33092a.contains(str) && !rtj.getBoolean("call_history", true)) {
                mcf = mcf.INELIGIBLE_UNSELECTED_CLOUD_RESTORE;
            } else if (lwa.f33093b.contains(str) && !rtj.getBoolean("settings", true)) {
                mcf = mcf.INELIGIBLE_UNSELECTED_CLOUD_RESTORE;
            } else if (lwa.f33094c.contains(str) && !rtj.getBoolean("sms", true)) {
                mcf = mcf.INELIGIBLE_UNSELECTED_CLOUD_RESTORE;
            } else if (!m24867a(packageInfo, ccmk.m130671c())) {
                int d = (int) ccmk.m130672d();
                if (!(d == 0 || packageInfo.applicationInfo == null || packageInfo.applicationInfo.targetSdkVersion >= d)) {
                    if (packageInfo.applicationInfo.backupAgentName == null) {
                        mcf = mcf.INELIGIBLE_KV_NO_AGENT;
                    } else if ((packageInfo.applicationInfo.flags & 67108864) != 0) {
                        mcf = mcf.INELIGIBLE_KV_FULL_ONLY;
                    }
                }
                mcf = mcf.ELIGIBLE;
            } else {
                mcf = mcf.INELIGIBLE_BLACKLISTED;
            }
            if (mcf != mcf.ELIGIBLE) {
                f33412a.mo25414c("%s ineligible for restore. Reason: %s", packageInfo.packageName, mcf);
                mbx.mo19835a(mcf, packageInfo.packageName);
            } else if (packageInfo.packageName.equals("com.android.providers.settings")) {
                f33412a.mo25409a("Packages requested for restore contained the settings package, moving it to the end of the list.", new Object[0]);
                z = true;
            } else {
                arrayList.add(packageInfo.packageName);
            }
        }
        if (z) {
            arrayList.add("com.android.providers.settings");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }
}
