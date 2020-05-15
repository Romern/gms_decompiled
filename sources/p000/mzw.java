package p000;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.TrafficStats;
import android.os.Build;
import android.text.TextUtils;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: mzw */
final /* synthetic */ class mzw implements Callable {

    /* renamed from: a */
    private final nab f35066a;

    /* renamed from: b */
    private final long f35067b;

    /* renamed from: c */
    private final PackageInfo[] f35068c;

    public mzw(nab nab, long j, PackageInfo[] packageInfoArr) {
        this.f35066a = nab;
        this.f35067b = j;
        this.f35068c = packageInfoArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:88:0x02cc, code lost:
        if (r3.f35110q.getPackageManager().getPackageInfo("com.android.vending", 0).versionCode >= 80694100) goto L_0x02ef;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x031b  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0346  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x035d  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x036c  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x02fc  */
    public final Object call() {
        boolean z;
        String[] a;
        int i;
        String str;
        bxvd bxvd;
        nab nab = this.f35066a;
        long j = this.f35067b;
        PackageInfo[] packageInfoArr = this.f35068c;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (PackageInfo packageInfo : packageInfoArr) {
            arrayList.add(packageInfo.packageName);
        }
        boolean z2 = true;
        if (arrayList.size() > 2) {
            z = true;
        } else {
            z = false;
        }
        nab.f35084I = z;
        mbx mbx = nab.f35117x;
        bxvd a2 = lyu.m24685a();
        bxvd da = mss.f34585e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        mss mss = (mss) da.f164949b;
        mss.f34587a |= 1;
        mss.f34588b = j;
        if (!mss.f34589c.mo73666a()) {
            mss.f34589c = GeneratedMessageLite.m124021a(mss.f34589c);
        }
        bxsy.m123078a(arrayList, mss.f34589c);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        mss mss2 = (mss) da.f164949b;
        mss2.f34587a |= 2;
        mss2.f34590d = z;
        if (a2.f164950c) {
            a2.mo74035c();
            a2.f164950c = false;
        }
        mqk mqk = (mqk) a2.f164949b;
        mss mss3 = (mss) da.mo74062i();
        mqk mqk2 = mqk.f34276G;
        mss3.getClass();
        mqk.f34297n = mss3;
        mqk.f34284a |= 2048;
        mbx.f33382b = mbx.mo19820a();
        mbx.mo19833a(a2, mqj.RESTORE_START, mbx.f33382b);
        if (nau.m25857b(nab.f35110q)) {
            nab.f35081F.clear();
            if (ccnl.f179542a.mo6606a().mo76463f()) {
                for (ResolveInfo resolveInfo : nab.f35110q.getPackageManager().queryIntentActivities(new Intent("android.intent.action.MAIN").addCategory("android.intent.category.HOME"), AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE)) {
                    if (resolveInfo.priority >= 0) {
                        nab.f35075a.mo25409a("Found launcher: %s", resolveInfo.activityInfo.packageName);
                        nab.f35081F.add(resolveInfo.activityInfo.packageName);
                    }
                }
            }
            String d = ccnl.f179542a.mo6606a().mo76461d();
            if (!TextUtils.isEmpty(d)) {
                nab.f35075a.logVerbose("Whitelisted launchers: %s", d);
                nab.f35081F.addAll(bmyx.m108640a(',').mo66925c((CharSequence) d));
            }
        }
        if (nab.f35098e == null && nab.f35107n == null) {
            a = mcg.m24868a(packageInfoArr, nab.f35117x, nab.f35108o);
            Logger Logger = nab.f35075a;
            int length = a.length;
            StringBuilder sb = new StringBuilder(37);
            sb.append("New restore session, ");
            sb.append(length);
            sb.append(" apps");
            Logger.mo25414c(sb.toString(), new Object[0]);
            SharedPreferences.Editor edit = nab.f35108o.edit();
            edit.clear();
            edit.commit();
            nab.f35099f = ccmw.m130709b() ? new ndi(nab.f35082G) : null;
            nab.f35107n = nab.m25824a(nab.f35110q, nab.f35117x);
            myr myr = nab.f35107n;
            myr.mo20328a();
            ArrayList arrayList2 = new ArrayList();
            for (String str2 : a) {
                if (myr.f34967f.mo19847b(str2).exists()) {
                    arrayList2.add(str2);
                    lvn lvn = myr.f34962a;
                    String valueOf = String.valueOf(str2);
                    lvn.mo25412b(valueOf.length() == 0 ? new String("found data for ") : "found data for ".concat(valueOf), new Object[0]);
                } else {
                    lvn lvn2 = myr.f34962a;
                    String valueOf2 = String.valueOf(str2);
                    lvn2.mo25412b(valueOf2.length() == 0 ? new String("not found data for ") : "not found data for ".concat(valueOf2), new Object[0]);
                }
            }
            if (arrayList2.size() > 1) {
                myr.f34965d = bngx.m109368a((Collection) arrayList2);
                myr.f34966e = -1;
                for (String str3 : a) {
                    if (!myr.f34967f.mo19847b(str3).exists()) {
                        myr.f34964c.mo19839b(4, str3);
                    }
                }
                nab.f35075a.logVerbose("Restoring from d2d data.", new Object[0]);
                nab.f35117x.mo19837b(2);
                if (nab.f35099f != null) {
                    List list = nab.f35107n.f34965d;
                    sdo.m34959a(list);
                    if (list.size() <= 1) {
                        z2 = false;
                    }
                    sdo.m34974b(z2);
                    ndi.f35336a.mo25414c("Attaching GetAppKeyBlacklistInfo request to restore request.", new Object[0]);
                    bxvd = lth.f32914q.mo74144da();
                    bxvd da2 = ltd.f32894b.mo74144da();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    ltd ltd = (ltd) da2.f164949b;
                    ltd.mo19597a();
                    bxsy.m123078a(list, ltd.f32896a);
                    ltd ltd2 = (ltd) da2.mo74062i();
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    lth lth = (lth) bxvd.f164949b;
                    ltd2.getClass();
                    lth.f32931p = ltd2;
                    lth.f32916a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
                } else {
                    bxvd = null;
                }
                if (bxvd != null) {
                    try {
                        nab.f35099f.mo20490a(nab.f35087L.mo20407a(msk.GET_APP_KEY_BLACKLIST_INFO, bxvd));
                    } catch (mbd e) {
                        nab.f35075a.mo25417e("Exception on getting blacklisted application info.", e, new Object[0]);
                        nab.f35117x.mo19829a(e.mo19816b(), msk.GET_APP_KEY_BLACKLIST_INFO, 2);
                    }
                }
            } else {
                if (nab.f35077B.mo19657c(nab.f35110q) && !mce.m24863c(nab.f35110q)) {
                    try {
                    } catch (PackageManager.NameNotFoundException e2) {
                        nab.f35075a.mo25418e("Could not find package %s: %s", "com.android.vending", e2);
                    }
                }
                nab.f35107n = null;
                nab.f35100g = null;
                nab.f35101h = null;
                i = 0;
                int i3 = 0;
                for (PackageInfo packageInfo2 : packageInfoArr) {
                    if (!packageInfo2.packageName.equals("@pm@") && packageInfo2.applicationInfo != null) {
                        i3 = packageInfo2.applicationInfo.uid;
                        i++;
                    }
                }
                if (i != 1) {
                    i3 = 1000;
                }
                int i4 = Build.VERSION.SDK_INT;
                TrafficStats.setThreadStatsTagRestore();
                TrafficStats.setThreadStatsUid(i3);
                nab.f35106m = new ndv(j, nab.f35117x.f33382b);
                long currentRestoreSet = nab.getCurrentRestoreSet();
                String str4 = nab.f35106m.f35368c;
                if (!cclp.f179364a.mo6606a().mo76311n()) {
                    str = (String) bmxv.m108567c(nab.f35109p.f33100c.getString("ancestral_secondary_key_version", null)).mo66815c();
                } else {
                    str = null;
                }
                nab.f35098e = new ndo(j, currentRestoreSet, a, str4, str);
                if (!nab.mo20383f()) {
                    nab.f35075a.mo25418e("Error getting restore data from server", new Object[0]);
                    nab.f35117x.mo19838b(4, 4);
                    nab.f35085J = false;
                    i2 = -1000;
                }
            }
        } else {
            nab.f35075a.mo25418e("Attempt a restore session while one is in progress.", new Object[0]);
            nab.f35117x.mo19838b(2, 4);
            nab.f35085J = false;
            i2 = -1000;
        }
        return Integer.valueOf(i2);
        nab.f35117x.mo19837b(3);
        nab.f35077B.mo19650a(nab.f35110q, ccnf.m130740i());
        nab.f35107n = null;
        nab.f35100g = null;
        nab.f35101h = null;
        i = 0;
        int i32 = 0;
        while (r2 < r0) {
        }
        if (i != 1) {
        }
        int i42 = Build.VERSION.SDK_INT;
        TrafficStats.setThreadStatsTagRestore();
        TrafficStats.setThreadStatsUid(i32);
        nab.f35106m = new ndv(j, nab.f35117x.f33382b);
        long currentRestoreSet2 = nab.getCurrentRestoreSet();
        String str42 = nab.f35106m.f35368c;
        if (!cclp.f179364a.mo6606a().mo76311n()) {
        }
        nab.f35098e = new ndo(j, currentRestoreSet2, a, str42, str);
        if (!nab.mo20383f()) {
        }
        return Integer.valueOf(i2);
    }
}
