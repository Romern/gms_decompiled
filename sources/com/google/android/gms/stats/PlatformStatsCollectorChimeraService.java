package com.google.android.gms.stats;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PlatformStatsCollectorChimeraService extends aeah {

    /* renamed from: a */
    public static final Map f108280a;

    /* renamed from: b */
    private ConcurrentHashMap f108281b;

    /* renamed from: c */
    private qws f108282c;

    /* renamed from: d */
    private qxq f108283d;

    static {
        HashMap hashMap = new HashMap();
        m92983a(hashMap, new asfc());
        m92983a(hashMap, new asgk());
        m92983a(hashMap, new asgm());
        m92983a(hashMap, new asfy());
        m92983a(hashMap, new asgq());
        m92983a(hashMap, new asfl("Dropbox"));
        m92983a(hashMap, asfl.m73964h());
        m92983a(hashMap, new asgl());
        m92983a(hashMap, new asgp());
        m92983a(hashMap, new asgh());
        m92983a(hashMap, new aset());
        m92983a(hashMap, new asfx());
        m92983a(hashMap, new asgs());
        m92983a(hashMap, new asgt());
        m92983a(hashMap, new asgu());
        m92983a(hashMap, new asgv());
        m92983a(hashMap, new asgn());
        m92983a(hashMap, new asgo());
        f108280a = Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    public static void m92981a(Context context) {
        if (ashd.m74118a()) {
            long nextInt = (long) new Random().nextInt((int) TimeUnit.DAYS.toSeconds(1));
            HashMap hashMap = new HashMap();
            hashMap.putAll(f108280a);
            hashMap.putAll(m92984b(context));
            for (asem asem : hashMap.values()) {
                if (asem.mo49096e()) {
                    aeat a = aeat.m51532a(context);
                    aebi aebi = new aebi();
                    aebi.mo34004a(nextInt, 60 + nextInt);
                    aebi.f63097i = "com.google.android.gms.stats.PlatformStatsCollectorService";
                    aebi.mo34023a(2);
                    aebi.mo34024a(asem.mo49098g() ? 1 : 0, asem.mo49098g() ? 1 : 0);
                    aebi.mo34027b(1);
                    aebi.f63102n = true;
                    aebi.f63099k = asem.f88779a;
                    a.mo33984a(aebi.mo33974b());
                    SharedPreferences.Editor edit = context.getSharedPreferences(asem.f88779a, 0).edit();
                    edit.putLong(":recordIntervalSecs", -1);
                    edit.apply();
                }
            }
        }
    }

    /* renamed from: b */
    static ConcurrentHashMap m92984b(Context context) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.metrics", 0);
        new HashMap();
        try {
            for (String str : sharedPreferences.getAll().keySet()) {
                if (str != null && str.endsWith("_collection_config")) {
                    String substring = str.substring(0, str.indexOf("_collection_config"));
                    if (!substring.isEmpty()) {
                        String string = sharedPreferences.getString(str, "");
                        if (!string.isEmpty()) {
                            try {
                                aset aset = new aset(substring, (calk) bxvk.m124016a(calk.f175135l, Base64.decode(string, 0), bxus.m123744c()));
                                if (aset.f88787h != 0) {
                                    concurrentHashMap.put(substring, aset);
                                }
                            } catch (bxwf | IllegalArgumentException e) {
                                Log.e("PlatformStatsCollectorS", "Fail to de-serialize proto", e);
                            }
                        }
                    }
                }
            }
            return concurrentHashMap;
        } catch (NullPointerException e2) {
            Log.e("PlatformStatsCollectorS", "Fail to get shared preferences map", e2);
            return concurrentHashMap;
        }
    }

    /* renamed from: aZ */
    public final void mo7135aZ() {
        m92981a(getBaseContext());
    }

    public final void onCreate() {
        super.onCreate();
        this.f108282c = new qws(this, null, null);
        this.f108283d = new qxq(this.f108282c, "PLATFORM_STATS_COUNTERS", 1024);
        this.f108281b = m92984b(getBaseContext());
    }

    /* renamed from: a */
    private final void m92982a(asem asem) {
        long c = asem.mo49094c();
        if (c == 0) {
            String valueOf = String.valueOf(asem.f88779a);
            Log.e("PlatformStatsCollectorS", valueOf.length() == 0 ? new String("Task scheduled with period of 0 for task: ") : "Task scheduled with period of 0 for task: ".concat(valueOf));
            qxq qxq = this.f108283d;
            String valueOf2 = String.valueOf(asem.f88779a);
            qxq.mo24383c(valueOf2.length() == 0 ? new String("PeriodicTaskInvalidPeriod") : "PeriodicTaskInvalidPeriod".concat(valueOf2)).mo24359a();
            this.f108283d.mo24388e();
            return;
        }
        aebl aebl = new aebl();
        double d = (double) c;
        Double.isNaN(d);
        aebl.mo34008a(c, (long) (d * 0.1d), aebu.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS);
        aebl.f63097i = "com.google.android.gms.stats.PlatformStatsCollectorService";
        aebl.mo34023a(2);
        aebl.mo34024a(asem.mo49098g() ? 1 : 0, asem.mo49098g() ? 1 : 0);
        aebl.mo34027b(1);
        aebl.f63102n = true;
        aebl.f63099k = asem.f88779a;
        rpr b = rpr.m34216b();
        aeat.m51532a(b).mo33984a(aebl.mo33974b());
        qxq qxq2 = this.f108283d;
        String valueOf3 = String.valueOf(asem.f88779a);
        qxq2.mo24383c(valueOf3.length() == 0 ? new String("PeriodicTaskScheduledFor") : "PeriodicTaskScheduledFor".concat(valueOf3)).mo24359a();
        SharedPreferences.Editor edit = b.getSharedPreferences(asem.f88779a, 0).edit();
        edit.putLong(":recordIntervalSecs", c);
        edit.putBoolean(":requiresCharging", asem.mo49098g());
        edit.apply();
    }

    /* renamed from: a */
    private static void m92983a(Map map, asem asem) {
        map.put(asem.f88779a, asem);
    }

    /* renamed from: a */
    public final int mo6269a(aecc aecc) {
        Object obj;
        int i;
        String substring;
        String str = aecc.f63128a;
        qxq qxq = this.f108283d;
        String valueOf = String.valueOf(str);
        qxq.mo24383c(valueOf.length() == 0 ? new String("PeriodicOnRunTaskCountFor") : "PeriodicOnRunTaskCountFor".concat(valueOf)).mo24359a();
        if (!f108280a.containsKey(str)) {
            obj = this.f108281b.get(str);
        } else {
            obj = f108280a.get(str);
        }
        asem asem = (asem) obj;
        if (asem != null) {
            int i2 = 0;
            SharedPreferences sharedPreferences = getSharedPreferences(str, 0);
            long c = asem.mo49094c();
            boolean g = asem.mo49098g();
            if (!(c == sharedPreferences.getLong(":recordIntervalSecs", -1) && g == sharedPreferences.getBoolean(":requiresCharging", true))) {
                m92982a(asem);
            }
            if (!ashd.m74118a()) {
                qxq qxq2 = this.f108283d;
                String valueOf2 = String.valueOf(str);
                qxq2.mo24383c(valueOf2.length() == 0 ? new String("CancellNonDeviceOwnerTasksFor") : "CancellNonDeviceOwnerTasksFor".concat(valueOf2)).mo24359a();
                this.f108283d.mo24388e();
                return 0;
            }
            try {
                if (str.equals("UnifiedDumpsysTask")) {
                    SharedPreferences sharedPreferences2 = getSharedPreferences("com.google.android.metrics", 0);
                    new HashMap();
                    try {
                        for (String str2 : sharedPreferences2.getAll().keySet()) {
                            if (str2 == null) {
                                i2 = 0;
                            } else if (str2.endsWith("_collection_config")) {
                                substring = str2.substring(i2, str2.indexOf("_collection_config"));
                                if (!substring.isEmpty()) {
                                    SharedPreferences sharedPreferences3 = getSharedPreferences(substring, i2);
                                    SharedPreferences.Editor edit = sharedPreferences3.edit();
                                    String string = sharedPreferences2.getString(str2, "");
                                    if (string.isEmpty()) {
                                        aeat.m51532a(rpr.m34216b()).mo33986a(substring, "com.google.android.gms.stats.PlatformStatsCollectorService");
                                        edit.putString(":unifiedTaskConfig", string);
                                        edit.apply();
                                        this.f108281b.remove(substring);
                                    } else if (!sharedPreferences3.getString(":unifiedTaskConfig", "").equals(string)) {
                                        calk calk = (calk) bxvk.m124016a(calk.f175135l, Base64.decode(string, i2), bxus.m123744c());
                                        qxq qxq3 = this.f108283d;
                                        String valueOf3 = String.valueOf(substring);
                                        qxq3.mo24383c(valueOf3.length() == 0 ? new String("CollectionConfigParseEnablePostV16") : "CollectionConfigParseEnablePostV16".concat(valueOf3)).mo24359a();
                                        aset aset = new aset(substring, calk);
                                        m92982a(aset);
                                        this.f108281b.put(substring, aset);
                                        edit.putString(":unifiedTaskConfig", string);
                                        edit.apply();
                                        i2 = 0;
                                    } else {
                                        i2 = 0;
                                    }
                                } else {
                                    i2 = 0;
                                }
                            } else {
                                i2 = 0;
                            }
                        }
                        i = 0;
                    } catch (NullPointerException e) {
                        Log.e("PlatformStatsCollectorS", "Fail to get shared preferences map", e);
                        i = 0;
                    }
                } else {
                    i = ashd.m74114a(str, asem, this);
                }
                if (i == 0) {
                    qxq qxq4 = this.f108283d;
                    String valueOf4 = String.valueOf(str);
                    qxq4.mo24383c(valueOf4.length() == 0 ? new String("UploadSingleTaskSuccess") : "UploadSingleTaskSuccess".concat(valueOf4)).mo24359a();
                } else if (i != 2) {
                    qxq qxq5 = this.f108283d;
                    String valueOf5 = String.valueOf(str);
                    qxq5.mo24383c(valueOf5.length() == 0 ? new String("UploadSingleTaskOther") : "UploadSingleTaskOther".concat(valueOf5)).mo24359a();
                } else {
                    qxq qxq6 = this.f108283d;
                    String valueOf6 = String.valueOf(str);
                    qxq6.mo24383c(valueOf6.length() == 0 ? new String("UploadSingleTaskFailure") : "UploadSingleTaskFailure".concat(valueOf6)).mo24359a();
                }
                qxq qxq7 = this.f108283d;
                if (qxq7 != null) {
                    qxq7.mo24388e();
                }
                this.f108282c.mo24336a(10, TimeUnit.SECONDS);
                return i;
            } catch (bxwf | IllegalArgumentException e2) {
                qxq qxq8 = this.f108283d;
                String valueOf7 = String.valueOf(substring);
                qxq8.mo24383c(valueOf7.length() == 0 ? new String("UnifiedTaskConfigDeserializationException") : "UnifiedTaskConfigDeserializationException".concat(valueOf7)).mo24359a();
                Log.e("PlatformStatsCollectorS", "Fail to de-serialize proto", e2);
                i2 = 0;
            } catch (Throwable th) {
                qxq qxq9 = this.f108283d;
                String valueOf8 = String.valueOf(str);
                qxq9.mo24383c(valueOf8.length() == 0 ? new String("UploadSingleTaskSuccess") : "UploadSingleTaskSuccess".concat(valueOf8)).mo24359a();
                qxq qxq10 = this.f108283d;
                if (qxq10 != null) {
                    qxq10.mo24388e();
                }
                this.f108282c.mo24336a(10, TimeUnit.SECONDS);
                throw th;
            }
        } else {
            qxq qxq11 = this.f108283d;
            String valueOf9 = String.valueOf(str);
            qxq11.mo24383c(valueOf9.length() == 0 ? new String("FailedToGetTaskFor") : "FailedToGetTaskFor".concat(valueOf9)).mo24359a();
            this.f108283d.mo24388e();
            return 2;
        }
    }
}
