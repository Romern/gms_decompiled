package p000;

import android.app.usage.UsageEvents;
import android.app.usage.UsageStatsManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.appdatasearch.DocumentId;
import com.google.android.gms.appdatasearch.UsageInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: admy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class admy {

    /* renamed from: a */
    public static final /* synthetic */ int f62190a = 0;

    /* renamed from: b */
    private static final long f62191b = TimeUnit.DAYS.toMillis(7);

    /* renamed from: a */
    public static void m50834a(Context context) {
        Context context2 = context;
        ArrayList arrayList = new ArrayList();
        if (ceqm.m137872c()) {
            int i = Build.VERSION.SDK_INT;
            long currentTimeMillis = System.currentTimeMillis();
            SharedPreferences sharedPreferences = context2.getSharedPreferences("usage_stats_manager_prefs", 0);
            long j = sharedPreferences.getLong("usage_stats_timestamp", 0);
            sharedPreferences.edit().putLong("usage_stats_timestamp", currentTimeMillis).commit();
            try {
                UsageEvents queryEvents = ((UsageStatsManager) context2.getSystemService("usagestats")).queryEvents(Math.max(j, currentTimeMillis - f62191b), currentTimeMillis);
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                HashSet hashSet = new HashSet();
                String a = adne.m50846a(context.getPackageManager());
                if (a != null) {
                    hashSet.add(a);
                }
                UsageEvents.Event event = new UsageEvents.Event();
                String str = null;
                while (queryEvents.getNextEvent(event)) {
                    if (event.getEventType() == 1 && !TextUtils.isEmpty(event.getPackageName()) && !event.getPackageName().equals(str) && !hashSet.contains(event.getPackageName())) {
                        str = event.getPackageName();
                        List<String> list = (List) hashMap2.get(str);
                        if (list == null) {
                            list = adne.m50847a(adne.m50851b(context.getPackageManager(), str));
                            if (list.isEmpty()) {
                                hashSet.add(str);
                            } else {
                                hashMap2.put(str, list);
                            }
                        }
                        for (String str2 : list) {
                            String str3 = (String) hashMap.get(str2);
                            if (str3 == null) {
                                str3 = adne.m50845a(ComponentName.unflattenFromString(str2));
                                hashMap.put(str2, str3);
                            }
                            long timeStamp = event.getTimeStamp();
                            DocumentId documentId = new DocumentId("com.google.android.gms", "internal.3p:MobileApplication", str3);
                            ftb ftb = new ftb();
                            ftb.f17212a = documentId;
                            ftb.f17213b = timeStamp;
                            ftb.f17214c = 0;
                            ftb.f17216e = true;
                            arrayList.add(ftb.mo11301a());
                        }
                    }
                }
            } catch (RuntimeException e) {
                adnt.m50874c("b/62250956. Bad implementation of UsageStatsManager.queryEvents onLeEco devices");
                adns.m50862a().mo33690a(35);
            }
        }
        if (!arrayList.isEmpty()) {
            bxvd da = boly.f133593k.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((boly) da.f164949b).f133595a = bolx.m111324a(7);
            int size = arrayList.size();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((boly) da.f164949b).f133600f = size;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            rjx a2 = fqj.m12175a(context);
            roz b = rpa.m34196b();
            b.f43472a = new ftm((UsageInfo[]) arrayList.toArray(new UsageInfo[arrayList.size()]));
            aucb a3 = a2.mo24701a(b.mo24977a());
            a3.mo50373a(new admv(da, arrayList));
            a3.mo50372a(new admw(da));
            a3.mo50371a(new admx(da, elapsedRealtime));
        }
    }
}
