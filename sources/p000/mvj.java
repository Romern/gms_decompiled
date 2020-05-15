package p000;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.google.android.chimera.Activity;
import com.google.android.gms.backup.ApplicationBackupStats;
import com.google.android.gms.backup.BackupStatsRequestConfig;
import com.google.android.gms.backup.settings.p033ui.AppsBackupFragment;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: mvj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mvj implements mvt {

    /* renamed from: a */
    final /* synthetic */ Activity f34805a;

    /* renamed from: b */
    final /* synthetic */ List f34806b;

    /* renamed from: c */
    final /* synthetic */ AppsBackupFragment f34807c;

    public mvj(AppsBackupFragment appsBackupFragment, Activity activity, List list) {
        this.f34807c = appsBackupFragment;
        this.f34805a = activity;
        this.f34806b = list;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo20271a() {
        mty mty = new mty(this.f34805a);
        ArrayList arrayList = new ArrayList();
        ApplicationBackupStats[] a = mty.f34730b.mo19601a(new BackupStatsRequestConfig(true, true));
        if (a == null) {
            mty.f34729a.mo25416d("Failed to get backup data stats for current device.", new Object[0]);
        } else {
            for (ApplicationBackupStats applicationBackupStats : a) {
                String str = applicationBackupStats.f28974a;
                mtw mtw = null;
                if (!"android".equals(str) && !"com.android.calllogbackup".equals(str) && !"com.android.providers.settings".equals(str) && !"com.android.providers.telephony".equals(str) && !"com.google.android.gms".equals(str)) {
                    try {
                        ApplicationInfo applicationInfo = mty.f34731c.getApplicationInfo(str, 0);
                        mtw = new mtw(mty.f34731c.getApplicationLabel(applicationInfo).toString(), applicationBackupStats.f28977d, (long) (applicationBackupStats.f28976c + applicationBackupStats.f28975b), mty.f34731c.getApplicationIcon(applicationInfo));
                    } catch (PackageManager.NameNotFoundException e) {
                        mty.f34729a.mo25411b(String.format("Name not found for package %s", str), e, new Object[0]);
                    }
                }
                if (mtw != null) {
                    arrayList.add(mtw);
                }
            }
        }
        Collator instance = Collator.getInstance();
        instance.setStrength(1);
        Collections.sort(arrayList, new mtx(instance));
        return arrayList;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo20272a(Object obj) {
        List list = (List) obj;
        this.f34807c.f29101g = false;
        if (!list.equals(this.f34806b)) {
            AppsBackupFragment appsBackupFragment = this.f34807c;
            appsBackupFragment.f29100f.f34820a = list;
            appsBackupFragment.mo17247a(list);
        }
    }
}
