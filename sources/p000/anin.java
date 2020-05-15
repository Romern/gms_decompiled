package p000;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.phenotype.sync.HeterodyneSyncTaskChimeraService;
import com.google.android.gms.phenotype.sync.PackageUpdateTaskChimeraService;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: anin */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anin extends aniu {

    /* renamed from: b */
    public static final /* synthetic */ int f76949b = 0;

    /* renamed from: a */
    final /* synthetic */ HeterodyneSyncTaskChimeraService f76950a;

    /* JADX WARNING: Illegal instructions before constructor call */
    public anin(HeterodyneSyncTaskChimeraService heterodyneSyncTaskChimeraService) {
        super(r2, r3, r4, r5, r6, 2, anim.f76948a);
        this.f76950a = heterodyneSyncTaskChimeraService;
        srn srn = HeterodyneSyncTaskChimeraService.f82139a;
        Context context = heterodyneSyncTaskChimeraService.f82141b;
        anfg anfg = heterodyneSyncTaskChimeraService.f82142c;
        anfg anfg2 = heterodyneSyncTaskChimeraService.f82143d;
        aniz aniz = heterodyneSyncTaskChimeraService.f82148j;
        bdza bdza = heterodyneSyncTaskChimeraService.f82146h;
        context.getSharedPreferences("HeterodyneSyncerPrefs", 0);
    }

    /* renamed from: a */
    private final void m64489a(String str, String str2, String str3, int i) {
        bxvd da = cahe.f174537e.mo74144da();
        bxvd da2 = cahd.f174532d.mo74144da();
        long a = qxq.m33053a(str);
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        cahd cahd = (cahd) da2.f164949b;
        cahd.f174534a = 1;
        cahd.f174535b = Long.valueOf(a);
        bxvd da3 = cahc.f174527d.mo74144da();
        long j = (long) i;
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        cahc cahc = (cahc) da3.f164949b;
        int i2 = 1 | cahc.f174529a;
        cahc.f174529a = i2;
        cahc.f174530b = j;
        cahc.f174529a = i2 | 2;
        cahc.f174531c = 1;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        cahd cahd2 = (cahd) da2.f164949b;
        cahc cahc2 = (cahc) da3.mo74062i();
        cahc2.getClass();
        cahd2.mo74642c();
        cahd2.f174536c.add(cahc2);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cahe cahe = (cahe) da.f164949b;
        cahd cahd3 = (cahd) da2.mo74062i();
        cahd3.getClass();
        cahe.mo74643c();
        cahe.f174541c.add(cahd3);
        HeterodyneSyncTaskChimeraService heterodyneSyncTaskChimeraService = this.f76950a;
        srn srn = HeterodyneSyncTaskChimeraService.f82139a;
        qwo a2 = heterodyneSyncTaskChimeraService.f82144e.mo24335a(((cahe) da.mo74062i()).mo73642k());
        a2.f42320d = "CLEARCUT_LOG_LOSS";
        a2.f42322f = cagz.DEFAULT;
        a2.mo24327b();
        this.f76950a.f82145g.mo24385d(str2).mo24367a(i);
        qxq qxq = new qxq(this.f76950a.f82144e, "CLEARCUT_LOG_LOSS", 1024);
        qxq.mo24385d(str3).mo24367a(i);
        qxq.mo24388e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo25228b() {
        return (String) ange.f76801b.mo58455c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: bp */
    public final void mo41844bp() {
        shr.m35316b(4611);
        m64489a("LogLossTracking_HeterodyneServerRequest", "LogLossTracking_Counter_HeterodyneServerRequest", "LogLossTracking_ImmediateCounter_HeterodyneServerRequest", 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final cafx mo25230c() {
        HeterodyneSyncTaskChimeraService heterodyneSyncTaskChimeraService = this.f76950a;
        srn srn = HeterodyneSyncTaskChimeraService.f82139a;
        return anii.m64473a(heterodyneSyncTaskChimeraService.f82141b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo25229b(String str) {
        try {
            HeterodyneSyncTaskChimeraService heterodyneSyncTaskChimeraService = this.f76950a;
            srn srn = HeterodyneSyncTaskChimeraService.f82139a;
            gie.m13196b(heterodyneSyncTaskChimeraService.f82141b, str);
        } catch (gid | IOException e) {
            bnsl bnsl = (bnsl) HeterodyneSyncTaskChimeraService.f82139a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("anin", "b", 478, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Problem clearing auth token");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo25224a(String str) {
        if (str == null) {
            bnsl bnsl = (bnsl) HeterodyneSyncTaskChimeraService.f82139a.mo68388c();
            bnsl.mo68432a("anin", "a", 457, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("No account for auth token provided");
            return null;
        }
        try {
            HeterodyneSyncTaskChimeraService heterodyneSyncTaskChimeraService = this.f76950a;
            srn srn = HeterodyneSyncTaskChimeraService.f82139a;
            return gie.m13195b(heterodyneSyncTaskChimeraService.f82141b, str, cgec.m144827b());
        } catch (IOException e) {
            bnsl bnsl2 = (bnsl) HeterodyneSyncTaskChimeraService.f82139a.mo68387b();
            bnsl2.mo68437a(e);
            bnsl2.mo68432a("anin", "a", 464, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("IOException on getting auth token");
            throw new anfy(29504, "Failed getting auth token due to a transient error.");
        } catch (gid e2) {
            bnsl bnsl3 = (bnsl) HeterodyneSyncTaskChimeraService.f82139a.mo68387b();
            bnsl3.mo68437a(e2);
            bnsl3.mo68432a("anin", "a", 468, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("Failed getting auth token");
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Set mo41841a(Set set) {
        List<ActivityManager.RunningAppProcessInfo> list;
        if (set.isEmpty()) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet();
        HeterodyneSyncTaskChimeraService heterodyneSyncTaskChimeraService = this.f76950a;
        srn srn = HeterodyneSyncTaskChimeraService.f82139a;
        ActivityManager activityManager = (ActivityManager) heterodyneSyncTaskChimeraService.f82141b.getSystemService("activity");
        if (activityManager != null) {
            list = activityManager.getRunningAppProcesses();
        } else {
            bnsl bnsl = (bnsl) HeterodyneSyncTaskChimeraService.f82139a.mo68387b();
            bnsl.mo68432a("anin", "a", 645, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("activityManager is null.");
            list = null;
        }
        if (list != null) {
            hashSet = bnpf.m110048a(list.size());
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : list) {
                Collections.addAll(hashSet, runningAppProcessInfo.pkgList);
            }
        }
        hashSet.retainAll(set);
        return hashSet;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25225a(int i) {
        HeterodyneSyncTaskChimeraService heterodyneSyncTaskChimeraService = this.f76950a;
        srn srn = HeterodyneSyncTaskChimeraService.f82139a;
        anij.m64482b(heterodyneSyncTaskChimeraService.f82141b, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo41842a(int i, Set set) {
        HashSet<String> hashSet;
        Set set2;
        HeterodyneSyncTaskChimeraService heterodyneSyncTaskChimeraService = this.f76950a;
        srn srn = HeterodyneSyncTaskChimeraService.f82139a;
        Map a = anfu.m64169a(heterodyneSyncTaskChimeraService.f82142c.getWritableDatabase(), set);
        boolean a2 = cgdy.f186626a.mo6606a().mo83513a();
        List<ActivityManager.RunningAppProcessInfo> list = null;
        if (!a2) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
            Intent registerReceiver = this.f76950a.f82141b.registerReceiver(null, intentFilter);
            if (!(registerReceiver == null || registerReceiver.getIntExtra("plugged", 0) == 0)) {
                PackageUpdateTaskChimeraService.m68263a(this.f76950a.f82141b, set, a, i);
                HeterodyneSyncTaskChimeraService heterodyneSyncTaskChimeraService2 = this.f76950a;
                Context context = heterodyneSyncTaskChimeraService2.f82141b;
                SQLiteDatabase writableDatabase = heterodyneSyncTaskChimeraService2.f82142c.getWritableDatabase();
                long a3 = this.f76950a.f82150l.mo20505a() / 1000;
                if (cgem.m144895j() >= 0) {
                    SharedPreferences sharedPreferences = context.getSharedPreferences("HeterodyneSyncerPrefs", 0);
                    if (a3 - sharedPreferences.getLong("lastNotifyAllUncommittedTimestamp", 0) >= cgem.m144895j()) {
                        PackageUpdateTaskChimeraService.m68262a(context, set, writableDatabase);
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        edit.putLong("lastNotifyAllUncommittedTimestamp", a3);
                        edit.apply();
                        return;
                    }
                    return;
                }
                return;
            }
        }
        Set keySet = a.keySet();
        if (keySet.isEmpty()) {
            hashSet = new HashSet();
        } else {
            HashSet hashSet2 = new HashSet();
            ActivityManager activityManager = (ActivityManager) this.f76950a.f82141b.getSystemService("activity");
            if (activityManager != null) {
                list = activityManager.getRunningAppProcesses();
            } else {
                bnsl bnsl = (bnsl) HeterodyneSyncTaskChimeraService.f82139a.mo68387b();
                bnsl.mo68432a("anin", "a", 645, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("activityManager is null.");
            }
            if (list != null) {
                HashSet a4 = bnpf.m110048a(list.size());
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : list) {
                    Collections.addAll(a4, runningAppProcessInfo.pkgList);
                }
                hashSet = a4;
            } else {
                hashSet = hashSet2;
            }
            hashSet.retainAll(keySet);
        }
        hashSet.addAll(cgdy.f186626a.mo6606a().mo83518f().f165797a);
        if (!hashSet.isEmpty()) {
            set2 = new HashSet();
            for (String str : hashSet) {
                List list2 = (List) a.get(str);
                if (list2 != null) {
                    set2.addAll(list2);
                }
            }
        } else {
            set2 = Collections.emptySet();
        }
        PackageUpdateTaskChimeraService.m68263a(this.f76950a.f82141b, set2, a, i);
        set.removeAll(set2);
        if (!set.isEmpty()) {
            PackageUpdateTaskChimeraService.m68264a(this.f76950a.f82141b, a2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25226a(long j) {
        HeterodyneSyncTaskChimeraService heterodyneSyncTaskChimeraService = this.f76950a;
        srn srn = HeterodyneSyncTaskChimeraService.f82139a;
        bxvd a = anfd.m64145a(heterodyneSyncTaskChimeraService.f82141b);
        caho caho = (caho) cahp.f174572m.mo74144da();
        if (caho.f164950c) {
            caho.mo74035c();
            caho.f164950c = false;
        }
        cahp cahp = (cahp) caho.f164949b;
        cahp.f174574a |= 16;
        cahp.f174581h = j;
        cahp cahp2 = (cahp) caho.mo74062i();
        if (a.f164950c) {
            a.mo74035c();
            a.f164950c = false;
        }
        caig caig = (caig) a.f164949b;
        caig caig2 = caig.f174681k;
        cahp2.getClass();
        caig.f174685c = cahp2;
        caig.f174683a |= 2;
        qwo a2 = this.f76950a.f82144e.mo24335a(((caig) a.mo74062i()).mo73642k());
        a2.mo24328b(16);
        a2.mo24327b();
        anij.m64485e(this.f76950a.f82141b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo41843a(aniy aniy) {
        shr.m35312a();
        if (aniy != null) {
            m64489a("LogLossTracking_HeterodyneServerResponse", "LogLossTracking_Counter_HeterodyneServerResponse", "LogLossTracking_ImmediateCounter_HeterodyneServerResponse", aniy.f76986d);
        }
    }

    /* renamed from: a */
    public final String[] mo25227a() {
        HeterodyneSyncTaskChimeraService heterodyneSyncTaskChimeraService = this.f76950a;
        srn srn = HeterodyneSyncTaskChimeraService.f82139a;
        return angd.m64197a(heterodyneSyncTaskChimeraService.f82141b);
    }
}
