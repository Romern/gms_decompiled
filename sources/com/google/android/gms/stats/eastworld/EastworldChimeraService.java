package com.google.android.gms.stats.eastworld;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.util.Pair;
import com.google.android.chimera.Service;
import com.google.android.gms.appusage.AppUsageResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class EastworldChimeraService extends Service {

    /* renamed from: a */
    asfn f108289a;

    /* renamed from: b */
    private BroadcastReceiver f108290b;

    /* renamed from: c */
    private PackageUpdateBroadcastReceiver f108291c;

    /* renamed from: d */
    private AppUsageOrderedBroadcastReceiver f108292d;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    class AppUsageOrderedBroadcastReceiver extends aacn {
        public AppUsageOrderedBroadcastReceiver() {
            super("stats");
        }

        /* renamed from: a */
        public final void mo6253a(Context context, Intent intent) {
            long j;
            long longExtra = intent.getLongExtra("appUsage_startTime", -1);
            long longExtra2 = intent.getLongExtra("appUsage_endTime", -1);
            if (longExtra >= 0 && longExtra2 >= 0) {
                List a = asgy.m74106a(longExtra, longExtra2, intent.getStringArrayListExtra("appUsage_packageNames"));
                Bundle resultExtras = getResultExtras(true);
                ArrayList a2 = sef.m35070a(resultExtras, "appUageResult", AppUsageResult.CREATOR);
                if (a2 == null) {
                    sef.m35073a(new ArrayList(a), resultExtras, "appUageResult");
                } else {
                    a2.addAll(a);
                    HashMap hashMap = new HashMap();
                    int size = a2.size();
                    for (int i = 0; i < size; i++) {
                        AppUsageResult appUsageResult = (AppUsageResult) a2.get(i);
                        Pair create = Pair.create(appUsageResult.f9822a, Integer.valueOf(appUsageResult.f9823b));
                        if (hashMap.containsKey(create)) {
                            j = ((Long) hashMap.get(create)).longValue();
                        } else {
                            j = 0;
                        }
                        hashMap.put(create, Long.valueOf(j + appUsageResult.f9824c));
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Pair pair : hashMap.keySet()) {
                        arrayList.add(new AppUsageResult((String) pair.first, ((Integer) pair.second).intValue(), ((Long) hashMap.get(pair)).longValue()));
                    }
                    sef.m35073a(arrayList, resultExtras, "appUageResult");
                }
                setResultExtras(resultExtras);
                return;
            }
            StringBuilder sb = new StringBuilder(126);
            sb.append("Didn't get correct time range parameters from app usage broadcast, startTime:");
            sb.append(longExtra);
            sb.append(" endTime:");
            sb.append(longExtra2);
            Log.e("EastworldChimeraService", sb.toString());
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    class EastworldBroadcastReceiver extends aacn {
        public EastworldBroadcastReceiver() {
            super("stats");
        }

        /* renamed from: a */
        public final void mo6253a(Context context, Intent intent) {
            EastworldChimeraService.this.f108289a.mo49132a(intent);
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    class PackageUpdateBroadcastReceiver extends aacn {
        public PackageUpdateBroadcastReceiver() {
            super("stats");
        }

        /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
         method: ClspMth{java.lang.StringBuilder.insert(int, java.lang.CharSequence):java.lang.StringBuilder}
         arg types: [int, java.lang.StringBuilder]
         candidates:
          ClspMth{java.lang.StringBuilder.insert(int, char):java.lang.StringBuilder}
          ClspMth{java.lang.StringBuilder.insert(int, java.lang.Object):java.lang.StringBuilder}
          ClspMth{java.lang.StringBuilder.insert(int, float):java.lang.StringBuilder}
          ClspMth{java.lang.StringBuilder.insert(int, java.lang.String):java.lang.StringBuilder}
          ClspMth{java.lang.StringBuilder.insert(int, long):java.lang.StringBuilder}
          ClspMth{java.lang.StringBuilder.insert(int, char[]):java.lang.StringBuilder}
          ClspMth{java.lang.StringBuilder.insert(int, int):java.lang.StringBuilder}
          ClspMth{java.lang.StringBuilder.insert(int, boolean):java.lang.StringBuilder}
          ClspMth{java.lang.StringBuilder.insert(int, double):java.lang.StringBuilder}
          ClspMth{java.lang.StringBuilder.insert(int, java.lang.CharSequence):java.lang.StringBuilder} */
        /* renamed from: a */
        public final void mo6253a(Context context, Intent intent) {
            if (intent.getAction().equals("android.intent.action.PACKAGE_ADDED")) {
                if (intent.getBooleanExtra("android.intent.extra.REPLACING", false)) {
                    return;
                }
            }
            String schemeSpecificPart = intent.getData().getSchemeSpecificPart();
            long currentTimeMillis = System.currentTimeMillis();
            synchronized (asgy.m74105a()) {
                if (currentTimeMillis - asgy.f88955a > TimeUnit.DAYS.toMillis(1)) {
                    Map<String, ?> all = asgy.m74105a().getAll();
                    SharedPreferences.Editor edit = asgy.m74105a().edit();
                    for (String str : all.keySet()) {
                        List a = asgy.m74107a(str);
                        StringBuilder sb = new StringBuilder();
                        Iterator it = a.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Pair pair = (Pair) it.next();
                            if (currentTimeMillis - ((Long) pair.second).longValue() < TimeUnit.DAYS.toMillis(30)) {
                                sb.append(pair.first);
                                sb.append(",");
                                sb.append(pair.second);
                                sb.append("|");
                            } else if (!sb.toString().isEmpty()) {
                                edit.putString(str, sb.toString());
                            } else {
                                edit.remove(str);
                            }
                        }
                    }
                    edit.apply();
                    asgy.f88955a = currentTimeMillis;
                }
                try {
                    int i = rpr.m34216b().getPackageManager().getPackageInfo(schemeSpecificPart, 0).versionCode;
                    StringBuilder sb2 = new StringBuilder(asgy.m74105a().getString(schemeSpecificPart, ""));
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i);
                    sb3.append(",");
                    sb3.append(currentTimeMillis);
                    sb3.append("|");
                    sb2.insert(0, (CharSequence) sb3);
                    SharedPreferences.Editor edit2 = asgy.m74105a().edit();
                    edit2.putString(schemeSpecificPart, sb2.toString());
                    edit2.apply();
                } catch (PackageManager.NameNotFoundException e) {
                    String valueOf = String.valueOf(schemeSpecificPart);
                    Log.e("AppUsageUtil", valueOf.length() == 0 ? new String("Cannot get updated packageInfo of ") : "Cannot get updated packageInfo of ".concat(valueOf));
                }
            }
        }
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        if (ashd.m74118a()) {
            this.f108290b = new EastworldBroadcastReceiver();
            IntentFilter intentFilter = new IntentFilter();
            if (cgtd.f187715a.mo6606a().mo84479h()) {
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
                intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
            }
            if (cgtd.f187715a.mo6606a().mo84480i()) {
                intentFilter.addAction("android.intent.action.DROPBOX_ENTRY_ADDED");
            }
            registerReceiver(this.f108290b, intentFilter);
        }
        if (cgsa.m146806b()) {
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction("android.intent.action.PACKAGE_REPLACED");
            intentFilter2.addAction("android.intent.action.PACKAGE_ADDED");
            intentFilter2.addDataScheme("package");
            PackageUpdateBroadcastReceiver packageUpdateBroadcastReceiver = new PackageUpdateBroadcastReceiver();
            this.f108291c = packageUpdateBroadcastReceiver;
            registerReceiver(packageUpdateBroadcastReceiver, intentFilter2);
            IntentFilter intentFilter3 = new IntentFilter();
            intentFilter3.addAction("com.google.android.gms.appusage.report_app_usage.ACTION");
            AppUsageOrderedBroadcastReceiver appUsageOrderedBroadcastReceiver = new AppUsageOrderedBroadcastReceiver();
            this.f108292d = appUsageOrderedBroadcastReceiver;
            registerReceiver(appUsageOrderedBroadcastReceiver, intentFilter3);
        }
        this.f108289a = asfn.m73971a();
    }

    public final void onDestroy() {
        if (ashd.m74118a()) {
            unregisterReceiver(this.f108290b);
        }
        if (cgsa.m146806b()) {
            unregisterReceiver(this.f108291c);
            unregisterReceiver(this.f108292d);
        }
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        return 1;
    }
}
