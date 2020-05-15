package p000;

import android.content.SharedPreferences;
import android.os.SystemClock;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.stats.PlatformStatsCollectorChimeraService;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* renamed from: asfv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asfv extends asft {

    /* renamed from: a */
    static final bmyx f88864a = bmyx.m108640a(',').mo66917a();

    /* renamed from: f */
    static final Map f88865f = new HashMap(PlatformStatsCollectorChimeraService.f108280a);

    /* renamed from: g */
    public static asfv f88866g = null;

    /* renamed from: a */
    public final void mo49140a(int i, boolean z, boolean z2, bxvd bxvd) {
        String str;
        String str2;
        int i2;
        String str3;
        if (!cgts.f187754a.mo6606a().mo84494b()) {
            f88860c.mo24383c("DisabledEastworldProcessorEastworldTrigger").mo24359a();
            f88860c.mo24388e();
            return;
        }
        boolean z3 = true;
        if (i == 1) {
            long currentTimeMillis = System.currentTimeMillis();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            bnic a = bnic.m109495a((Collection) f88864a.mo66925c((CharSequence) cgts.m147048b()));
            bngs j = bngx.m109377j();
            for (String str4 : f88865f.keySet()) {
                if (a.contains(str4)) {
                    j.mo67668c((asem) f88865f.get(str4));
                }
            }
            bngx a2 = j.mo67664a();
            SharedPreferences.Editor edit = f88861d.edit();
            int size = a2.size();
            int i3 = 0;
            while (true) {
                str = ":taskLastRunElapsedTime";
                if (i3 >= size) {
                    break;
                }
                String str5 = ((asem) a2.get(i3)).f88779a;
                String concat = String.valueOf(str5).concat(":taskLastRunWallClockTime");
                String concat2 = String.valueOf(str5).concat(str);
                if (!f88861d.contains(concat) || !f88861d.contains(concat2)) {
                    long nextInt = (long) new Random().nextInt((int) TimeUnit.DAYS.toMillis(1));
                    edit.putLong(concat, currentTimeMillis - nextInt);
                    edit.putLong(concat2, elapsedRealtime - nextInt);
                }
                i3++;
            }
            edit.apply();
            int i4 = f88861d.getInt(":eastworldTriggerProcessorBootCount", 0);
            int a3 = asfq.m73984a(f88860c);
            if (i4 != a3) {
                if (a3 >= 0) {
                    SharedPreferences.Editor edit2 = f88861d.edit();
                    edit2.putInt(":eastworldTriggerProcessorBootCount", a3);
                    edit2.apply();
                }
                z3 = false;
            }
            bngs j2 = bngx.m109377j();
            int size2 = a2.size();
            int i5 = 0;
            int i6 = 0;
            while (true) {
                if (i5 >= size2) {
                    str2 = str;
                    break;
                }
                asem asem = (asem) a2.get(i5);
                if (asem != null) {
                    String concat3 = String.valueOf(asem.f88779a).concat(":taskLastRunWallClockTime");
                    String concat4 = String.valueOf(asem.f88779a).concat(str);
                    i2 = i5;
                    str2 = str;
                    long j3 = f88861d.getLong(concat3, -1);
                    long j4 = f88861d.getLong(concat4, -1);
                    if (z3) {
                        if (elapsedRealtime - j4 < asem.mo49094c() * 1000) {
                            str3 = str2;
                        }
                    } else if (currentTimeMillis - j3 < asem.mo49094c() * 1000) {
                        str3 = str2;
                    }
                    j2.mo67668c(asem);
                    i6++;
                    if (i6 >= ((int) cgtd.f187715a.mo6606a().mo84481j())) {
                        break;
                    }
                    str3 = str2;
                } else {
                    i2 = i5;
                    str3 = str;
                }
                str = str3;
                i5 = i2 + 1;
            }
            bngx a4 = j2.mo67664a();
            rpr b = rpr.m34216b();
            bnre i7 = a4.listIterator();
            while (i7.hasNext()) {
                asem asem2 = (asem) i7.next();
                if (asem2 != null) {
                    String str6 = asem2.f88779a;
                    if (!str6.equals("UnifiedDumpsysTask")) {
                        ashd.m74122b(str6, asem2, b);
                    } else {
                        SharedPreferences sharedPreferences = rpr.m34216b().getSharedPreferences("com.google.android.metrics", 0);
                        for (String str7 : bmyx.m108640a(',').mo66917a().mo66925c((CharSequence) cgts.m147048b())) {
                            if (str7.endsWith("PH")) {
                                String string = sharedPreferences.getString(String.valueOf(str7).concat("_collection_config"), "");
                                if (string.length() >= 5) {
                                    try {
                                        calk calk = (calk) GeneratedMessageLite.m124016a(calk.f175135l, Base64.decode(string, 0), bxus.m123744c());
                                        qxq qxq = f88860c;
                                        String valueOf = String.valueOf(str7);
                                        qxq.mo24383c(valueOf.length() == 0 ? new String("CollectionConfigParseEnablePostV16") : "CollectionConfigParseEnablePostV16".concat(valueOf)).mo24359a();
                                        aset aset = new aset(str7, calk);
                                        if (aset.f88787h != 0) {
                                            f88865f.put(str7, aset);
                                        } else {
                                            f88865f.remove(str7);
                                        }
                                    } catch (bxwf | IllegalArgumentException e) {
                                        qxq qxq2 = f88860c;
                                        String valueOf2 = String.valueOf(str7);
                                        qxq2.mo24383c(valueOf2.length() == 0 ? new String("UnifiedTaskConfigDeserializationException") : "UnifiedTaskConfigDeserializationException".concat(valueOf2)).mo24359a();
                                        Log.e("EastworldTrigger", "Fail to de-serialize proto", e);
                                    }
                                } else {
                                    f88865f.remove(str7);
                                }
                            }
                        }
                    }
                    SharedPreferences.Editor edit3 = f88861d.edit();
                    String concat5 = String.valueOf(str6).concat(":taskLastRunWallClockTime");
                    String concat6 = String.valueOf(str6).concat(str2);
                    edit3.putLong(concat5, currentTimeMillis);
                    edit3.putLong(concat6, elapsedRealtime);
                    edit3.apply();
                }
            }
        }
    }
}
