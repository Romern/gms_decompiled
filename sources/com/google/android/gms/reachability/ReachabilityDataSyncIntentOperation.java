package com.google.android.gms.reachability;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Process;
import android.provider.Settings;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.common.internal.ClientContext;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ReachabilityDataSyncIntentOperation extends IntentOperation {

    /* renamed from: a */
    aopg f83471a = aopg.m66269a("ReachabilitySyncOp");

    /* renamed from: b */
    private Context f83472b;

    /* renamed from: c */
    private PackageManager f83473c;

    /* renamed from: d */
    private aopj f83474d;

    /* renamed from: e */
    private aopi f83475e;

    /* renamed from: f */
    private aopk f83476f;

    public final void onHandleIntent(Intent intent) {
        Account[] accountArr;
        btbs btbs;
        if (cghu.f186966a.mo6606a().mo83813a()) {
            long a = this.f83474d.mo43148a();
            long j = 0;
            long j2 = this.f83474d.f78648a.getLong("scheduled_sync_timestamp", 0);
            long currentTimeMillis = j2 - System.currentTimeMillis();
            int i = 1;
            if (j2 == 0 || currentTimeMillis >= TimeUnit.DAYS.toMillis(30)) {
                long currentTimeMillis2 = System.currentTimeMillis() - a;
                long millis = TimeUnit.HOURS.toMillis(cghu.f186966a.mo6606a().mo83815c());
                if (currentTimeMillis2 > 0 && currentTimeMillis2 < millis) {
                    new Object[1][0] = Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(millis));
                    return;
                }
            } else if (currentTimeMillis > 0) {
                new Object[1][0] = Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(currentTimeMillis));
                return;
            }
            ArrayList arrayList = new ArrayList();
            int d = (int) cghu.f186966a.mo6606a().mo83816d();
            for (int i2 = 1; i2 <= d; i2++) {
                SharedPreferences sharedPreferences = this.f83474d.f78648a;
                StringBuilder sb = new StringBuilder(38);
                sb.append("service_to_package_name_map");
                sb.append(i2);
                String string = sharedPreferences.getString(sb.toString(), "");
                if (!string.isEmpty()) {
                    try {
                        this.f83473c.getPackageInfo(string, 1);
                        bxvd da = btbq.f148199c.mo74144da();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        btbq btbq = (btbq) da.f164949b;
                        string.getClass();
                        btbq.f148201a = string;
                        btbq.f148202b = i2;
                        arrayList.add((btbq) da.mo74062i());
                    } catch (PackageManager.NameNotFoundException e) {
                    }
                }
            }
            arrayList.isEmpty();
            Context context = this.f83472b;
            LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
            if (!soz.m35807f(context)) {
                Account[] a2 = adyd.m51363a(context).mo33916a("com.google");
                int length = a2.length;
                ArrayList arrayList2 = new ArrayList(length);
                for (Account account : a2) {
                    if (!"".equals(account.name)) {
                        arrayList2.add(account);
                    }
                }
                accountArr = (Account[]) arrayList2.toArray(new Account[arrayList2.size()]);
            } else {
                accountArr = new Account[0];
            }
            for (Account account2 : accountArr) {
                linkedHashSet.add(account2.name);
            }
            for (String str : linkedHashSet) {
                new Object[i][0] = str;
                Context context2 = this.f83472b;
                int myUid = Process.myUid();
                String packageName = context2.getPackageName();
                ClientContext clientContext = new ClientContext(myUid, str, str, packageName, packageName);
                clientContext.mo17806d("https://www.googleapis.com/auth/myphonenumbers");
                try {
                    bxvd da2 = btbr.f148203c.mo74144da();
                    if (cghu.f186966a.mo6606a().mo83817e()) {
                        String b = bmxx.m108578b(Settings.Secure.getString(rpr.m34216b().getContentResolver(), "android_id"));
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        b.getClass();
                        ((btbr) da2.f164949b).f148206b = b;
                    }
                    if (this.f83474d.mo43148a() == j) {
                        btbs = this.f83476f.mo43149a(clientContext, (btbr) da2.mo74062i());
                    } else {
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        btbr btbr = (btbr) da2.f164949b;
                        if (!btbr.f148205a.mo73666a()) {
                            btbr.f148205a = GeneratedMessageLite.m124021a(btbr.f148205a);
                        }
                        bxsy.m123078a(arrayList, btbr.f148205a);
                        if (!arrayList.isEmpty()) {
                            btbq[] btbqArr = (btbq[]) arrayList.toArray(new btbq[0]);
                            aopi aopi = this.f83475e;
                            bxvd da3 = bpch.f135725c.mo74144da();
                            bpcf bpcf = (bpcf) bpcg.f135720d.mo74144da();
                            if (bpcf.f164950c) {
                                bpcf.mo74035c();
                                bpcf.f164950c = false;
                            }
                            bpcg bpcg = (bpcg) bpcf.f164949b;
                            bpcg.f135723b = i;
                            bpcg.f135722a |= i;
                            bpcf.mo68936a(aopi.m66271b(btbqArr));
                            bpcg bpcg2 = (bpcg) bpcf.mo74062i();
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            bpch bpch = (bpch) da3.f164949b;
                            bpcg2.getClass();
                            bpch.f135728b = bpcg2;
                            bpch.f135727a |= i;
                            aopi.mo43146a((bpch) da3.mo74062i());
                        }
                        btbs = this.f83476f.mo43149a(clientContext, (btbr) da2.mo74062i());
                    }
                } catch (chuw | gid e2) {
                    aopg aopg = this.f83471a;
                    Object[] objArr = new Object[i];
                    objArr[0] = e2;
                    if (Log.isLoggable(aopg.f78642a, 5)) {
                        Log.w(aopg.f78642a, aopg.m66270a("Grpc sent to WPS failed with error: %s", objArr));
                    }
                    btbs = null;
                }
                if (btbs != null) {
                    if (btbs.f148209a.size() != 0) {
                        this.f83475e.mo43147a((btbq[]) btbs.f148209a.toArray(new btbq[0]));
                    }
                    bxwc bxwc = btbs.f148209a;
                    int size = bxwc.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        btbq btbq2 = (btbq) bxwc.get(i3);
                        aopj aopj = this.f83474d;
                        int i4 = btbq2.f148202b;
                        String str2 = btbq2.f148201a;
                        SharedPreferences.Editor edit = aopj.f78648a.edit();
                        StringBuilder sb2 = new StringBuilder(38);
                        sb2.append("service_to_package_name_map");
                        sb2.append(i4);
                        edit.putString(sb2.toString(), str2).commit();
                    }
                    if (btbs.f148210b.size() != 0) {
                        this.f83475e.mo43147a((btbq[]) btbs.f148209a.toArray(new btbq[0]));
                    }
                    aopi aopi2 = this.f83475e;
                    btbq[] btbqArr2 = (btbq[]) btbs.f148210b.toArray(new btbq[0]);
                    bxvd da4 = bpch.f135725c.mo74144da();
                    bpcf bpcf2 = (bpcf) bpcg.f135720d.mo74144da();
                    if (bpcf2.f164950c) {
                        bpcf2.mo74035c();
                        bpcf2.f164950c = false;
                    }
                    bpcg bpcg3 = (bpcg) bpcf2.f164949b;
                    bpcg3.f135723b = 3;
                    bpcg3.f135722a |= 1;
                    bpcf2.mo68936a(aopi.m66271b(btbqArr2));
                    bpcg bpcg4 = (bpcg) bpcf2.mo74062i();
                    if (da4.f164950c) {
                        da4.mo74035c();
                        da4.f164950c = false;
                    }
                    bpch bpch2 = (bpch) da4.f164949b;
                    bpcg4.getClass();
                    bpch2.f135728b = bpcg4;
                    bpch2.f135727a |= 1;
                    aopi2.mo43146a((bpch) da4.mo74062i());
                    bxwc bxwc2 = btbs.f148210b;
                    int size2 = bxwc2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        aopj aopj2 = this.f83474d;
                        int i6 = ((btbq) bxwc2.get(i5)).f148202b;
                        SharedPreferences.Editor edit2 = aopj2.f78648a.edit();
                        StringBuilder sb3 = new StringBuilder(38);
                        sb3.append("service_to_package_name_map");
                        sb3.append(i6);
                        edit2.remove(sb3.toString()).commit();
                    }
                    this.f83474d.f78648a.edit().putLong("scheduled_sync_timestamp", TimeUnit.MICROSECONDS.toMillis(btbs.f148211c)).commit();
                    new Object[1][0] = str;
                    j = 0;
                    i = 1;
                } else {
                    new Object[1][0] = str;
                    j = 0;
                    i = 1;
                }
            }
            this.f83474d.f78648a.edit().putLong("last_sync_timestamp", System.currentTimeMillis()).commit();
        }
    }

    public final void onCreate() {
        Context applicationContext = getApplicationContext();
        this.f83472b = applicationContext;
        this.f83473c = applicationContext.getPackageManager();
        this.f83474d = aopj.m66274a(this.f83472b);
        this.f83476f = new aopk(this.f83472b);
        synchronized (aopi.class) {
            if (aopi.f78645a == null) {
                aopi.f78645a = new aopi();
            }
        }
        this.f83475e = aopi.f78645a;
    }
}
