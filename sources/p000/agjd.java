package p000;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.measurement.internal.AppMetadata;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: agjd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agjd implements Runnable {

    /* renamed from: a */
    final /* synthetic */ agkc f65675a;

    /* renamed from: b */
    final /* synthetic */ agje f65676b;

    public agjd(agje agje, agkc agkc) {
        this.f65676b = agje;
        this.f65675a = agkc;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02c0  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x02f5  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0300  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0324  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0335  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0389  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x03b9  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x03dc  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x044a  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x0773  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0234  */
    public final void run() {
        Status status;
        boolean z;
        boolean z2;
        boolean z3;
        agje agje;
        Boolean c;
        agcx agcx;
        List d;
        agje agje2 = this.f65676b;
        agkc agkc = this.f65675a;
        agje2.mo35512p();
        agje2.f65691g.mo35312a();
        agdp agdp = new agdp(agje2);
        agdp.mo35545l();
        agje2.f65700p = agdp;
        aghr aghr = new aghr(agje2, agkc.f65772f);
        aghr.mo35246m();
        agje2.f65701q = aghr;
        aght aght = new aght(agje2);
        aght.mo35246m();
        agje2.f65698n = aght;
        agln agln = new agln(agje2);
        agln.mo35246m();
        agje2.f65699o = agln;
        agje2.f65695k.mo35546m();
        agje2.f65692h.mo35546m();
        agje2.f65702r = new agit(agje2);
        aghr aghr2 = agje2.f65701q;
        if (!aghr2.f65233a) {
            String packageName = aghr2.mo35542z().getPackageName();
            PackageManager packageManager = aghr2.mo35542z().getPackageManager();
            String str = "unknown";
            String str2 = "Unknown";
            String str3 = "Unknown";
            int i = Integer.MIN_VALUE;
            if (packageManager == null) {
                aghr2.mo35497E().f65564c.mo35436a("PackageManager is null, app identity information might be inaccurate. appId", agid.m54288a(packageName));
            } else {
                try {
                    str = packageManager.getInstallerPackageName(packageName);
                } catch (IllegalArgumentException e) {
                    aghr2.mo35497E().f65564c.mo35436a("Error retrieving app installer package name. appId", agid.m54288a(packageName));
                }
                if (str == null) {
                    str = "manual_install";
                } else if ("com.android.vending".equals(str)) {
                    str = "";
                }
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(aghr2.mo35542z().getPackageName(), 0);
                    if (packageInfo != null) {
                        CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                        if (!TextUtils.isEmpty(applicationLabel)) {
                            str3 = applicationLabel.toString();
                        }
                        try {
                            str2 = packageInfo.versionName;
                            i = packageInfo.versionCode;
                        } catch (PackageManager.NameNotFoundException e2) {
                        }
                    }
                } catch (PackageManager.NameNotFoundException e3) {
                    aghr2.mo35497E().f65564c.mo35437a("Error retrieving package info. appId, appName", agid.m54288a(packageName), str3);
                    aghr2.f65529b = packageName;
                    aghr2.f65532e = str;
                    aghr2.f65530c = str2;
                    aghr2.f65531d = i;
                    aghr2.f65533f = 0;
                    if (!aghr2.mo35537u().f65291a) {
                    }
                    if (status == null) {
                    }
                    if (TextUtils.isEmpty(aghr2.f65756y.f65686b)) {
                    }
                    if (!z && !z2) {
                    }
                    aghr2.f65537j = "";
                    aghr2.f65538k = "";
                    aghr2.f65539l = "";
                    if (!aghr2.mo35537u().f65291a) {
                    }
                    aghr2.f65535h = null;
                    d = aghr2.mo35538v().mo35322d("analytics.safelisted_events");
                    if (d != null) {
                    }
                    aghr2.f65535h = d;
                    int i2 = Build.VERSION.SDK_INT;
                    if (packageManager == null) {
                    }
                    aghr2.f65756y.mo35517u();
                    aghr2.f65233a = true;
                    agje2.mo35497E().f65570i.mo35436a("App measurement initialized, version", Long.valueOf(agje2.f65691g.mo35318c()));
                    if (!agje2.f65690f.f65291a) {
                    }
                    if (!agje2.f65690f.f65291a) {
                    }
                    agje2.mo35497E().f65571j.mo35435a("Debug-level message logging enabled");
                    if (agje2.f65706v != agje2.f65707w.get()) {
                    }
                    agje2.f65703s = true;
                    agje = this.f65676b;
                    agje.mo35512p();
                    if (agje.mo35499a().f65619d.mo35458a() == 0) {
                    }
                    if (Long.valueOf(agje.mo35499a().f65624i.mo35458a()).longValue() == 0) {
                    }
                    agcx = agje.mo35501e().f65810d;
                    agcx.f65266a.mo35499a().f65638w.mo35463a(null);
                    if (!agje.mo35518v()) {
                    }
                    agje.mo35499a().f65630o.mo35456a(agje.f65691g.mo35314a(aghn.f65465U));
                    agje.mo35499a().f65631p.mo35456a(agje.f65691g.mo35314a(aghn.f65466V));
                    return;
                }
            }
            aghr2.f65529b = packageName;
            aghr2.f65532e = str;
            aghr2.f65530c = str2;
            aghr2.f65531d = i;
            aghr2.f65533f = 0;
            if (!aghr2.mo35537u().f65291a) {
                sdo.m34966a(aghr2.mo35542z(), "Context must not be null.");
                sdo.m34969a("-", (Object) "App ID must be nonempty.");
                synchronized (rnq.f43412a) {
                    if (rnq.f43413b == null) {
                        rnq.f43413b = new rnq("-");
                        status = rnq.f43413b.f43415d;
                    } else {
                        rnq rnq = rnq.f43413b;
                        String str4 = rnq.f43414c;
                        if (str4 == null || str4.equals("-")) {
                            status = Status.f30107a;
                        } else {
                            String str5 = rnq.f43414c;
                            StringBuilder sb = new StringBuilder(String.valueOf(str5).length() + 97);
                            sb.append("Initialize was called with two different Google App IDs.  Only the first app ID will be used: '");
                            sb.append(str5);
                            sb.append("'.");
                            status = new Status(10, sb.toString());
                        }
                    }
                }
            } else {
                Context z4 = aghr2.mo35542z();
                sdo.m34966a(z4, "Context must not be null.");
                synchronized (rnq.f43412a) {
                    if (rnq.f43413b == null) {
                        rnq.f43413b = new rnq(z4);
                    }
                    status = rnq.f43413b.f43415d;
                }
            }
            z = status == null && status.mo17710c();
            z2 = TextUtils.isEmpty(aghr2.f65756y.f65686b) && "am".equals(aghr2.f65756y.f65687c);
            if (!z && !z2) {
                int r = aghr2.f65756y.mo35514r();
                switch (r) {
                    case 0:
                        aghr2.mo35497E().f65572k.mo35435a("App measurement collection enabled");
                        break;
                    case 1:
                        aghr2.mo35497E().f65570i.mo35435a("App measurement deactivated via the manifest");
                        break;
                    case 2:
                        aghr2.mo35497E().f65572k.mo35435a("App measurement deactivated via the init parameters");
                        break;
                    case 3:
                        aghr2.mo35497E().f65570i.mo35435a("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                        break;
                    case 4:
                        aghr2.mo35497E().f65570i.mo35435a("App measurement disabled via the manifest");
                        break;
                    case 5:
                        aghr2.mo35497E().f65572k.mo35435a("App measurement disabled via the init parameters");
                        break;
                    case 6:
                        aghr2.mo35497E().f65569h.mo35435a("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                        break;
                    default:
                        aghr2.mo35497E().f65570i.mo35435a("App measurement disabled via the global data collection setting");
                        break;
                }
                z3 = r == 0;
            } else if (status != null) {
                aghr2.mo35497E().f65565d.mo35437a("GoogleService failed to initialize, status", Integer.valueOf(status.f30115i), status.f30116j);
                z3 = false;
            } else {
                aghr2.mo35497E().f65565d.mo35435a("GoogleService failed to initialize (no status)");
                z3 = false;
            }
            aghr2.f65537j = "";
            aghr2.f65538k = "";
            aghr2.f65539l = "";
            if (!aghr2.mo35537u().f65291a) {
                if (z2) {
                    aghr2.f65538k = aghr2.f65756y.f65686b;
                }
                try {
                    cflc.f184258a.mo6606a();
                    String str6 = rnq.m34143a("getGoogleAppId").f43414c;
                    aghr2.f65537j = TextUtils.isEmpty(str6) ? "" : str6;
                    cfjt.m139846c();
                    if (!TextUtils.isEmpty(str6)) {
                        aghr2.f65538k = new sdy(aghr2.mo35542z()).mo25405a("admob_app_id");
                    }
                    if (z3) {
                        aghr2.mo35497E().f65572k.mo35437a("App measurement enabled for app package, google app id", aghr2.f65529b, !TextUtils.isEmpty(aghr2.f65537j) ? aghr2.f65537j : aghr2.f65538k);
                    }
                } catch (IllegalStateException e4) {
                    aghr2.mo35497E().f65564c.mo35437a("Fetching Google App Id failed with exception. appId", agid.m54288a(packageName), e4);
                }
            }
            aghr2.f65535h = null;
            if (aghr2.mo35538v().mo35314a(aghn.f65468X) && !aghr2.mo35537u().f65291a) {
                d = aghr2.mo35538v().mo35322d("analytics.safelisted_events");
                if (d != null) {
                    if (d.size() == 0) {
                        aghr2.mo35497E().f65569h.mo35435a("Safelisted event list is empty. Ignoring");
                    } else {
                        Iterator it = d.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (!aghr2.mo35540x().mo35737a("safelisted event", (String) it.next())) {
                                }
                            }
                        }
                    }
                }
                aghr2.f65535h = d;
            }
            int i22 = Build.VERSION.SDK_INT;
            if (packageManager == null) {
                aghr2.f65536i = svp.m36471a(aghr2.mo35542z()) ? 1 : 0;
            } else {
                aghr2.f65536i = 0;
            }
            aghr2.f65756y.mo35517u();
            aghr2.f65233a = true;
            agje2.mo35497E().f65570i.mo35436a("App measurement initialized, version", Long.valueOf(agje2.f65691g.mo35318c()));
            if (!agje2.f65690f.f65291a) {
                agje2.mo35497E().f65570i.mo35435a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
            }
            if (!agje2.f65690f.f65291a) {
                String o = aghr.mo35404o();
                if (agje2.mo35506j()) {
                    if (agje2.mo35502f().mo35753g(o)) {
                        agje2.mo35497E().f65570i.mo35435a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                    } else {
                        agib agib = agje2.mo35497E().f65570i;
                        String valueOf = String.valueOf(o);
                        agib.mo35435a(valueOf.length() == 0 ? new String("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ") : "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(valueOf));
                    }
                }
            }
            agje2.mo35497E().f65571j.mo35435a("Debug-level message logging enabled");
            if (agje2.f65706v != agje2.f65707w.get()) {
                agje2.mo35497E().f65564c.mo35437a("Not all components initialized", Integer.valueOf(agje2.f65706v), Integer.valueOf(agje2.f65707w.get()));
            }
            agje2.f65703s = true;
            agje = this.f65676b;
            agje.mo35512p();
            if (agje.mo35499a().f65619d.mo35458a() == 0) {
                agje.mo35499a().f65619d.mo35459a(System.currentTimeMillis());
            }
            if (Long.valueOf(agje.mo35499a().f65624i.mo35458a()).longValue() == 0) {
                agje.mo35497E().f65572k.mo35436a("Persisting first open", Long.valueOf(agje.f65708x));
                agje.mo35499a().f65624i.mo35459a(agje.f65708x);
            }
            if (agje.f65691g.mo35314a(aghn.f65473aB) && !agje.f65690f.f65291a) {
                agcx = agje.mo35501e().f65810d;
                if (agcx.mo35297a() && agcx.mo35297a() && System.currentTimeMillis() - agcx.f65266a.mo35499a().f65639x.mo35458a() > agcx.f65266a.f65691g.mo35311a((String) null, aghn.f65474aC)) {
                    agcx.f65266a.mo35499a().f65638w.mo35463a(null);
                }
            }
            if (!agje.mo35518v()) {
                if (!agje.f65690f.f65291a && (!TextUtils.isEmpty(agje.mo35510n().mo35405p()) || !TextUtils.isEmpty(agje.mo35510n().mo35406q()))) {
                    agms f = agje.mo35502f();
                    String p = agje.mo35510n().mo35405p();
                    agiq a = agje.mo35499a();
                    a.mo35241h();
                    String string = a.mo35468c().getString("gmp_app_id", null);
                    String q = agje.mo35510n().mo35406q();
                    agiq a2 = agje.mo35499a();
                    a2.mo35241h();
                    if (f.mo35739a(p, string, q, a2.mo35468c().getString("admob_app_id", null))) {
                        agje.mo35497E().f65570i.mo35435a("Rechecking which service to use due to a GMP App Id change");
                        agiq a3 = agje.mo35499a();
                        a3.mo35241h();
                        Boolean d2 = a3.mo35469d();
                        SharedPreferences.Editor edit = a3.mo35468c().edit();
                        edit.clear();
                        edit.apply();
                        if (d2 != null) {
                            boolean booleanValue = d2.booleanValue();
                            a3.mo35241h();
                            SharedPreferences.Editor edit2 = a3.mo35468c().edit();
                            edit2.putBoolean("measurement_enabled", booleanValue);
                            edit2.apply();
                        }
                        aght h = agje.mo35504h();
                        h.mo35242i();
                        h.mo35241h();
                        try {
                            int delete = h.mo35416o().delete("messages", null, null);
                            if (delete > 0) {
                                h.mo35497E().f65572k.mo35436a("Reset local analytics data. records", Integer.valueOf(delete));
                            }
                        } catch (SQLiteException e5) {
                            h.mo35497E().f65564c.mo35436a("Error resetting local analytics data. error", e5);
                        }
                        agje.f65699o.mo35627t();
                        agje.f65699o.mo35625r();
                        agje.mo35499a().f65624i.mo35459a(agje.f65708x);
                        agje.mo35499a().f65626k.mo35463a(null);
                    }
                    agiq a4 = agje.mo35499a();
                    String p2 = agje.mo35510n().mo35405p();
                    a4.mo35241h();
                    SharedPreferences.Editor edit3 = a4.mo35468c().edit();
                    edit3.putString("gmp_app_id", p2);
                    edit3.apply();
                    agiq a5 = agje.mo35499a();
                    String q2 = agje.mo35510n().mo35406q();
                    a5.mo35241h();
                    SharedPreferences.Editor edit4 = a5.mo35468c().edit();
                    edit4.putString("admob_app_id", q2);
                    edit4.apply();
                }
                agje.mo35501e().mo35566a(agje.mo35499a().f65626k.mo35462a());
                if (!agje.f65690f.f65291a) {
                    if (cfit.m139801b() && agje.f65691g.mo35314a(aghn.f65486al)) {
                        try {
                            agje.mo35502f().mo35542z().getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                        } catch (ClassNotFoundException e6) {
                            if (!TextUtils.isEmpty(agje.mo35499a().f65637v.mo35462a())) {
                                agje.mo35497E().f65567f.mo35435a("Remote config removed with active feature rollouts");
                                agje.mo35499a().f65637v.mo35463a(null);
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(agje.mo35510n().mo35405p()) || !TextUtils.isEmpty(agje.mo35510n().mo35406q())) {
                        boolean q3 = agje.mo35513q();
                        if (!agje.mo35499a().f65617b.contains("deferred_analytics_collection") && !agje.f65691g.mo35323e()) {
                            agiq a6 = agje.mo35499a();
                            boolean z5 = !q3;
                            a6.mo35241h();
                            a6.mo35497E().f65572k.mo35436a("App measurement setting deferred collection", Boolean.valueOf(z5));
                            SharedPreferences.Editor edit5 = a6.mo35468c().edit();
                            edit5.putBoolean("deferred_analytics_collection", z5);
                            edit5.apply();
                        }
                        if (q3) {
                            agkm e7 = agje.mo35501e();
                            e7.mo35241h();
                            e7.mo35242i();
                            e7.mo35245l();
                            if (e7.f65756y.mo35518v()) {
                                if (e7.mo35538v().mo35314a(aghn.f65475aa)) {
                                    agdi v = e7.mo35538v();
                                    if (!v.mo35537u().f65291a && (c = v.mo35319c("google_analytics_deferred_deep_link_enabled")) != null && c.booleanValue()) {
                                        e7.mo35497E().f65571j.mo35435a("Deferred Deep Link feature enabled.");
                                        e7.mo35498F().mo35492a(new agkd(e7));
                                    }
                                }
                                agln d3 = e7.mo35237d();
                                d3.mo35241h();
                                d3.mo35245l();
                                AppMetadata a7 = d3.mo35615a(true);
                                d3.mo35235b().mo35415a(3, new byte[0]);
                                d3.mo35621a(new agkz(d3, a7));
                                agiq w = e7.mo35539w();
                                w.mo35241h();
                                String string2 = w.mo35468c().getString("previous_os_version", null);
                                String c2 = w.mo35535B().mo35373c();
                                if (!TextUtils.isEmpty(c2) && !c2.equals(string2)) {
                                    SharedPreferences.Editor edit6 = w.mo35468c().edit();
                                    edit6.putString("previous_os_version", c2);
                                    edit6.apply();
                                }
                                if (!TextUtils.isEmpty(string2) && !string2.equals(e7.mo35535B().mo35373c())) {
                                    Bundle bundle = new Bundle();
                                    bundle.putString("_po", string2);
                                    e7.mo35570a("auto", "_ou", bundle);
                                }
                            }
                        }
                        agma agma = agje.mo35500d().f65920c;
                        agma.f65918a.mo35241h();
                        if (agma.f65918a.mo35539w().mo35466a(agma.f65918a.mo35534A().mo20505a())) {
                            agma.f65918a.mo35539w().f65628m.mo35456a(true);
                            int i3 = Build.VERSION.SDK_INT;
                            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                            ActivityManager.getMyMemoryState(runningAppProcessInfo);
                            if (runningAppProcessInfo.importance == 100) {
                                agma.f65918a.mo35497E().f65572k.mo35435a("Detected application was in foreground");
                                agma.mo35650b(agma.f65918a.mo35534A().mo20505a(), false);
                            }
                        }
                        agln l = agje.mo35508l();
                        AtomicReference atomicReference = new AtomicReference();
                        l.mo35241h();
                        l.mo35245l();
                        l.mo35621a(new agky(l, atomicReference, l.mo35615a(false)));
                    }
                }
            } else if (agje.mo35513q()) {
                if (!agje.mo35502f().mo35752e("android.permission.INTERNET")) {
                    agje.mo35497E().f65564c.mo35435a("App is missing INTERNET permission");
                }
                if (!agje.mo35502f().mo35752e("android.permission.ACCESS_NETWORK_STATE")) {
                    agje.mo35497E().f65564c.mo35435a("App is missing ACCESS_NETWORK_STATE permission");
                }
                if (!agje.f65690f.f65291a && !svr.m36484b(agje.f65685a).mo26173a() && !agje.f65691g.mo35328l()) {
                    if (!agiv.m54326a(agje.f65685a)) {
                        agje.mo35497E().f65564c.mo35435a("AppMeasurementReceiver not registered/enabled");
                    }
                    if (!agms.m54590a(agje.f65685a)) {
                        agje.mo35497E().f65564c.mo35435a("AppMeasurementService not registered/enabled");
                    }
                }
                agje.mo35497E().f65564c.mo35435a("Uploading is not possible. App measurement disabled");
            }
            agje.mo35499a().f65630o.mo35456a(agje.f65691g.mo35314a(aghn.f65465U));
            agje.mo35499a().f65631p.mo35456a(agje.f65691g.mo35314a(aghn.f65466V));
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }
}
