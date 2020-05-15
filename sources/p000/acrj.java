package p000;

import android.content.Context;
import com.google.android.gms.appdatasearch.DocumentContents;
import com.google.android.gms.appdatasearch.DocumentId;
import com.google.android.gms.appdatasearch.DocumentSection;
import com.google.android.gms.appdatasearch.UsageInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: acrj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acrj {

    /* renamed from: a */
    private static final Object f60615a = new Object();

    /* renamed from: b */
    private static final Map f60616b = new HashMap();

    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0152, code lost:
        r1 = r2.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x015a, code lost:
        if (r1.hasNext() == false) goto L_0x0185;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x015c, code lost:
        r2 = (java.lang.String) r1.next();
        r4 = new android.content.Intent("com.google.firebase.appindexing.USER_ACTION_NOTIFICATION");
        r4.putExtra("reportingPackageName", r0);
        p000.sef.m35072a(r3, r4, "usageInfoBytes");
        r4.setPackage(r2);
        r16.sendBroadcast(r4);
        p000.absg.m48186a("Sent notification %s to %s.", r4.getAction(), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0187, code lost:
        return p000.bqbh.f140374o;
     */
    /* renamed from: a */
    public static bqbh m49738a(Context context, String str, UsageInfo[] usageInfoArr, rfz rfz) {
        char c;
        DocumentId documentId;
        DocumentContents documentContents;
        DocumentSection documentSection;
        String str2 = str;
        UsageInfo[] usageInfoArr2 = usageInfoArr;
        if (!((Boolean) abzt.f58838F.mo58455c()).booleanValue()) {
            return bqbh.FEATURE_DISABLED;
        }
        if (!abzt.m48727a(str)) {
            return bqbh.CLIENT_NOT_WHITELISTED;
        }
        if (usageInfoArr2 == null || usageInfoArr2.length <= 0) {
            return bqbh.USAGE_INFO_IS_EMPTY;
        }
        HashSet hashSet = new HashSet();
        for (String str3 : abzt.m48725a()) {
            if (rfz.mo24610b(str3)) {
                hashSet.add(str3);
            }
        }
        if (hashSet.isEmpty()) {
            return bqbh.NO_IME_PACKAGES;
        }
        ArrayList arrayList = new ArrayList();
        for (UsageInfo usageInfo : usageInfoArr2) {
            if (!(usageInfo == null || (documentId = usageInfo.f9694a) == null || usageInfo.f9696c != 5)) {
                String str4 = documentId.f9534a;
                String str5 = documentId.f9535b;
                if (!str5.isEmpty()) {
                    arrayList.add(usageInfo);
                } else {
                    String str6 = null;
                    if (!(usageInfo == null || (documentContents = usageInfo.f9698e) == null)) {
                        DocumentSection[] documentSectionArr = documentContents.f9530a;
                        int length = documentSectionArr.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                documentSection = null;
                                break;
                            }
                            documentSection = documentSectionArr[i];
                            if (documentSection.f9544d.f9646a.equals("intent_data")) {
                                break;
                            }
                            i++;
                        }
                        if (documentSection != null) {
                            str6 = documentSection.f9543c;
                        }
                    }
                    if (str6 != null) {
                        ftb ftb = new ftb();
                        ftb.f17212a = new DocumentId(str4, str5, str6);
                        ftb.f17217f = usageInfo.f9701h;
                        ftb.f17216e = usageInfo.f9699f;
                        ftb.f17213b = usageInfo.f9695b;
                        ftb.f17214c = usageInfo.f9696c;
                        ftb.f17218g = usageInfo.f9702i;
                        arrayList.add(ftb.mo11301a());
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return bqbh.NO_FIREBASE_USER_ACTIONS;
        }
        synchronized (f60615a) {
            acre acre = (acre) f60616b.get(str2);
            if (acre == null) {
                acre = new acre();
                f60616b.put(str2, acre);
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - acre.f60593a > TimeUnit.SECONDS.toMillis(1)) {
                absg.m48201d("Per second quota for UserActionNotification gets refreshed.");
                acre.f60594b = ((Long) abzt.f58839G.mo58455c()).longValue();
                acre.f60593a = currentTimeMillis;
            }
            if (currentTimeMillis - acre.f60595c > TimeUnit.DAYS.toMillis(1)) {
                absg.m48201d("Daily quota for UserActionNotification gets refreshed.");
                acre.f60596d = ((Long) abzt.f58840H.mo58455c()).longValue();
                acre.f60595c = currentTimeMillis;
            }
            long j = acre.f60594b;
            if (j != 0) {
                long j2 = acre.f60596d;
                if (j2 != 0) {
                    acre.f60594b = j - 1;
                    acre.f60596d = j2 - 1;
                    c = 0;
                } else {
                    c = 2;
                }
            } else {
                c = 1;
            }
            if (c == 1) {
                bqbh bqbh = bqbh.THROTTLED_DUE_TO_PER_SECOND_QUOTA;
                return bqbh;
            } else if (c == 2) {
                bqbh bqbh2 = bqbh.THROTTLED_DUE_TO_DAILY_QUOTA;
                return bqbh2;
            }
        }
    }
}
