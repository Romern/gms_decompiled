package com.google.android.gms.googlehelp.metrics;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.android.volley.ServerError;
import com.android.volley.VolleyError;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ReportBatchedMetricsChimeraGcmTaskService extends aeah {

    /* renamed from: a */
    public abcr f78992a;

    /* renamed from: b */
    private bqgj f78993b;

    /* renamed from: c */
    private aaxx f78994c;

    /* renamed from: a */
    static final List m66598a(List list) {
        String str;
        int size = list.size();
        if (size < 2) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list);
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < size; i3++) {
            abeh abeh = (abeh) list.get(i3);
            bxvd bxvd = (bxvd) abeh.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) abeh);
            if (!TextUtils.equals(((abeh) bxvd.f164949b).f57214i, "UNKNOWN_SESSION_ID")) {
                i2 = i3;
            } else {
                if (i < i3) {
                    i = i3 + 1;
                    while (i < size && TextUtils.equals(((abeh) list.get(i)).f57214i, "UNKNOWN_SESSION_ID")) {
                        i++;
                    }
                }
                if (i2 >= 0) {
                    if (i < size) {
                        abeh abeh2 = (abeh) list.get(i2);
                        abeh abeh3 = (abeh) list.get(i);
                        if (Math.abs(((abeh) bxvd.f164949b).f57225t - abeh2.f57225t) >= Math.abs(abeh3.f57225t - ((abeh) bxvd.f164949b).f57225t)) {
                            str = abeh3.f57214i;
                        } else {
                            str = abeh2.f57214i;
                        }
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        abeh abeh4 = (abeh) bxvd.f164949b;
                        abeh abeh5 = abeh.f57196I;
                        str.getClass();
                        abeh4.f57206a |= 64;
                        abeh4.f57214i = str;
                    } else {
                        String str2 = ((abeh) list.get(i2)).f57214i;
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        abeh abeh6 = (abeh) bxvd.f164949b;
                        abeh abeh7 = abeh.f57196I;
                        str2.getClass();
                        abeh6.f57206a |= 64;
                        abeh6.f57214i = str2;
                    }
                } else if (i < size) {
                    String str3 = ((abeh) list.get(i)).f57214i;
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    abeh abeh8 = (abeh) bxvd.f164949b;
                    abeh abeh9 = abeh.f57196I;
                    str3.getClass();
                    abeh8.f57206a |= 64;
                    abeh8.f57214i = str3;
                }
                arrayList.set(i3, (abeh) bxvd.mo74062i());
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static final boolean m66603a(int i) {
        return i == 202 || i == 200;
    }

    /* renamed from: b */
    private final int m66604b(HelpConfig helpConfig, Map map, aast aast) {
        int i;
        ArrayList arrayList = new ArrayList();
        int o = (int) ceeg.m136410o();
        Iterator it = aast.entrySet().iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            Account account = (Account) map.get(entry.getKey());
            List list = (List) entry.getValue();
            List a = m66598a(list);
            int size = list.size();
            while (i < size) {
                int i2 = i + o;
                List subList = a.subList(i, Math.min(size, i2));
                arrayList.add(abdb.m47538a(this, helpConfig, account, subList, new abcz(this, subList)));
                i = i2;
            }
        }
        int size2 = arrayList.size();
        int i3 = 0;
        while (i < size2) {
            try {
                if (!m66603a(((Integer) ((Future) arrayList.get(i)).get(ceeg.m136412q(), TimeUnit.SECONDS)).intValue())) {
                    i3 = 1;
                }
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                Log.e("gH_RBatchedMetricsSrv", "Sending batched metrics failed. Will retry ...", e);
                i3 = 1;
            }
            i++;
        }
        return i3;
    }

    public final void onCreate() {
        super.onCreate();
        this.f78993b = snp.m35702a(10);
        this.f78992a = new abcr(this);
        this.f78994c = new aaxx(this);
    }

    public final void onDestroy() {
        abcr abcr = this.f78992a;
        if (abcr != null) {
            abcr.close();
        }
        this.f78994c.close();
        super.onDestroy();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo43371b(aecc aecc) {
        if (!cefk.m136719b()) {
            return 0;
        }
        Bundle bundle = new Bundle(aecc.f63129b);
        bundle.putInt("prefetch_offline_content_retries_left_key", bundle.getInt("prefetch_offline_content_retries_left_key") - 1);
        try {
            new abgz(this, this.f78994c, this.f78992a).mo32093a();
            m66600a(this, bundle, 2);
            return 0;
        } catch (TimeoutException e) {
            mo43370a((VolleyError) null, bundle);
            return 2;
        } catch (VolleyError e2) {
            mo43370a(e2, bundle);
            return 2;
        }
    }

    /* renamed from: a */
    public static void m66599a(Context context, int i, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putInt("number_of_retries_left", i);
        aebi aebi = new aebi();
        aebi.mo34024a(1, 1);
        aebi.mo34023a(2);
        aebi.mo34004a(ceeg.f182447a.mo6606a().mo79027v(), ceeg.f182447a.mo6606a().mo79026u());
        aebi.f63099k = "action_clear_expired_help_content";
        aebi.f63097i = "com.google.android.gms.googlehelp.metrics.ReportBatchedMetricsGcmTaskService";
        aebi.f63102n = true;
        aebi.mo34029b(z);
        aebi.f63107s = bundle;
        aeat.m51532a(context).mo33984a(aebi.mo33974b());
    }

    /* renamed from: a */
    public static void m66600a(Context context, Bundle bundle, int i) {
        long j;
        int i2 = bundle.getInt("prefetch_offline_content_retries_left_key");
        if (i2 <= 0) {
            i = 2;
        }
        if (i == 2) {
            i2 = (int) ceeg.m136416u();
        }
        bundle.putInt("prefetch_offline_content_retries_left_key", i2);
        if (i == 0) {
            j = ceeg.f182447a.mo6606a().mo79001au();
        } else if (i == 1) {
            j = ceeg.f182447a.mo6606a().mo78997aq();
        } else if (i != 3) {
            j = ceeg.m136417v();
        } else {
            j = Math.abs(new Random().nextLong()) % ceeg.m136417v();
        }
        long at = ceeg.f182447a.mo6606a().mo79000at();
        aebi aebi = new aebi();
        aebi.f63099k = "action_prefetch_offline_help_content";
        aebi.f63097i = "com.google.android.gms.googlehelp.metrics.ReportBatchedMetricsGcmTaskService";
        aebi.mo34004a(j, at + j);
        aebi.f63102n = true;
        aebi.mo34023a(1);
        aebi.mo34024a(1, 1);
        aebi.f63107s = bundle;
        aebi.mo34027b(1);
        aeat.m51532a(context).mo33984a(aebi.mo33974b());
    }

    /* renamed from: a */
    public static void m66601a(Context context, HelpConfig helpConfig) {
        String str;
        String str2 = helpConfig.f78827b;
        if (TextUtils.isEmpty(str2)) {
            Log.e("gH_RBatchedMetricsSrv", "Application package name is empty, overriding with default package name: com.google.android.gms.googlehelp");
            str2 = "com.google.android.gms.googlehelp";
        }
        if (str2.length() > 75) {
            str = str2.substring(str2.length() - 75);
        } else {
            str = str2;
        }
        aebi aebi = new aebi();
        aebi.f63097i = "com.google.android.gms.googlehelp.metrics.ReportBatchedMetricsGcmTaskService";
        aebi.mo34004a(ceeg.f182447a.mo6606a().mo78981aa(), ceeg.f182447a.mo6606a().mo78958Z());
        aebi.f63099k = str;
        aebi.f63102n = true;
        aebi.mo34027b(1);
        Bundle b = helpConfig.mo43222b(context);
        Bundle bundle = null;
        if (!TextUtils.isEmpty(helpConfig.f78812L)) {
            bundle = new Bundle();
            bundle.putString("genie-eng:app_pkg_name", helpConfig.f78812L);
        } else if (b != null && !TextUtils.isEmpty(b.getString("genie-eng:app_pkg_name"))) {
            bundle = new Bundle();
            bundle.putString("genie-eng:app_pkg_name", b.getString("genie-eng:app_pkg_name"));
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putString("app_pkg_name_extra", str2);
        aebi.f63107s = bundle;
        aeat.m51532a(context).mo33984a(aebi.mo33974b());
    }

    /* renamed from: a */
    public static void m66602a(Context context, String str) {
        aeat.m51532a(context).mo33986a(str, "com.google.android.gms.googlehelp.metrics.ReportBatchedMetricsGcmTaskService");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.googlehelp.metrics.ReportBatchedMetricsChimeraGcmTaskService.a(android.content.Context, int, boolean):void
     arg types: [com.google.android.gms.googlehelp.metrics.ReportBatchedMetricsChimeraGcmTaskService, int, int]
     candidates:
      com.google.android.gms.googlehelp.metrics.ReportBatchedMetricsChimeraGcmTaskService.a(android.content.Context, android.os.Bundle, int):void
      com.google.android.gms.googlehelp.metrics.ReportBatchedMetricsChimeraGcmTaskService.a(com.google.android.gms.googlehelp.common.HelpConfig, java.util.Map, aast):int
      com.google.android.gms.googlehelp.metrics.ReportBatchedMetricsChimeraGcmTaskService.a(android.content.Context, int, boolean):void */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ff  */
    /* renamed from: a */
    public final int mo6269a(aecc aecc) {
        char c;
        String str;
        String str2 = aecc.f63128a;
        int hashCode = str2.hashCode();
        if (hashCode != 1878650544) {
            if (hashCode == 2080265046 && str2.equals("action_prefetch_offline_help_content")) {
                c = 1;
                if (c == 0) {
                    if (ceeg.m136420y()) {
                        aaxx aaxx = this.f78994c;
                        aaxx.mo31886a(ceeg.f182447a.mo6606a().mo78949Q());
                        int i = aecc.f63129b.getInt("number_of_retries_left") - 1;
                        if (i > 0 && !aaxx.mo31896d()) {
                            m66599a((Context) this, i, true);
                        }
                        aaxx.close();
                    }
                    return 0;
                } else if (c == 1) {
                    return mo43371b(aecc);
                } else {
                    Bundle bundle = aecc.f63129b;
                    if (bundle == null || TextUtils.isEmpty(bundle.getString("app_pkg_name_extra"))) {
                        str = "";
                    } else {
                        str = aecc.f63129b.getString("app_pkg_name_extra");
                    }
                    this.f78992a.mo32045c(str);
                    HelpConfig helpConfig = new HelpConfig();
                    helpConfig.f78827b = str;
                    long currentTimeMillis = System.currentTimeMillis();
                    StringBuilder sb = new StringBuilder(20);
                    sb.append(currentTimeMillis);
                    helpConfig.f78830e = sb.toString();
                    Bundle bundle2 = aecc.f63129b;
                    if (bundle2 != null && !TextUtils.isEmpty(bundle2.getString("genie-eng:app_pkg_name"))) {
                        Bundle bundle3 = new Bundle();
                        bundle3.putString("genie-eng:app_pkg_name", aecc.f63129b.getString("genie-eng:app_pkg_name"));
                        Bundle bundle4 = helpConfig.f78831f;
                        if (bundle4 == null || bundle4.isEmpty()) {
                            if (aaya.m47229b(ceib.m136899d())) {
                                helpConfig.f78831f = aayh.m47234a(bundle3);
                            } else {
                                helpConfig.f78831f = bundle3;
                            }
                        }
                        helpConfig.f78812L = aecc.f63129b.getString("genie-eng:app_pkg_name");
                    }
                    C1223np npVar = new C1223np();
                    Account[] b = adyd.m51363a(this).mo33922b();
                    for (Account account : b) {
                        npVar.put(wzg.m42517a(account), account);
                    }
                    List a = this.f78992a.mo32040a(str);
                    aast aast = new aast();
                    for (int i2 = 0; i2 < a.size(); i2++) {
                        abeh abeh = (abeh) a.get(i2);
                        aast.mo31751a(abeh.f57210e, abeh);
                    }
                    if (aaya.m47228a(cehd.m136826b())) {
                        return mo43369a(helpConfig, npVar, aast);
                    }
                    return m66604b(helpConfig, npVar, aast);
                }
            }
        } else if (str2.equals("action_clear_expired_help_content")) {
            c = 0;
            if (c == 0) {
            }
        }
        c = 65535;
        if (c == 0) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo43369a(HelpConfig helpConfig, Map map, aast aast) {
        int i;
        ArrayList arrayList = new ArrayList();
        int o = (int) ceeg.m136410o();
        Iterator it = aast.entrySet().iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            Account account = (Account) map.get(entry.getKey());
            List list = (List) entry.getValue();
            List a = m66598a(list);
            int size = list.size();
            while (i < size) {
                int i2 = i + o;
                List subList = a.subList(i, Math.min(size, i2));
                bqgg a2 = abda.m47534a(this, helpConfig, account, this.f78993b, subList);
                if (a2 != null) {
                    arrayList.add(a2);
                    bqga.m112781a(a2, new abcy(this, subList), this.f78993b);
                }
                i = i2;
            }
        }
        int size2 = arrayList.size();
        int i3 = 0;
        while (i < size2) {
            try {
                if (!m66603a(((aays) ((Future) arrayList.get(i)).get(ceeg.m136412q(), TimeUnit.SECONDS)).f56842a)) {
                    i3 = 1;
                }
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                Log.e("gH_RBatchedMetricsSrv", "Sending batched metrics failed through Cronet. Will retry ...", e);
                i3 = 1;
            }
            i++;
        }
        return i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo43370a(VolleyError volleyError, Bundle bundle) {
        int i = 0;
        if (volleyError != null && (volleyError instanceof ServerError)) {
            i = 1;
        }
        m66600a(this, bundle, i);
    }
}
