package p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import com.google.android.gms.search.administration.GetStorageStatsCall$PackageStats;
import com.google.android.gms.search.administration.GetStorageStatsCall$Response;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: actj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class actj extends AsyncTask {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Context mo33070a();

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        ApplicationInfo applicationInfo;
        String str;
        Drawable drawable;
        CharSequence loadLabel;
        Void[] voidArr = (Void[]) objArr;
        aucb a = aplx.m70650b(mo33070a()).mo47443a();
        acti acti = new acti();
        try {
            rkj rkj = (rkj) aucu.m76782a(a);
            int i = 0;
            acti.f60744a = 0;
            acti.f60745b = new ArrayList(rkj.mo24819m().length);
            acti.f60746c = 0;
            GetStorageStatsCall$PackageStats[] m = rkj.mo24819m();
            int length = m.length;
            int i2 = 0;
            while (i2 < length) {
                GetStorageStatsCall$PackageStats getStorageStatsCall$PackageStats = m[i2];
                List list = acti.f60745b;
                PackageManager packageManager = mo33070a().getPackageManager();
                String str2 = getStorageStatsCall$PackageStats.f107373a;
                try {
                    applicationInfo = packageManager.getApplicationInfo(str2, i);
                } catch (PackageManager.NameNotFoundException e) {
                    absg.m48193b("Application not found: %s. Cause: %s", str2, e.getMessage());
                    applicationInfo = null;
                }
                if (applicationInfo == null || (loadLabel = applicationInfo.loadLabel(packageManager)) == null) {
                    str = str2;
                } else {
                    str = loadLabel.toString();
                }
                String str3 = getStorageStatsCall$PackageStats.f107373a;
                try {
                    drawable = packageManager.getApplicationIcon(str3);
                } catch (PackageManager.NameNotFoundException e2) {
                    absg.m48193b("Application not found: %s. Cause: %s", str3, e2.getMessage());
                    drawable = null;
                }
                long j = getStorageStatsCall$PackageStats.f107374b;
                long j2 = getStorageStatsCall$PackageStats.f107376d;
                list.add(new acto(str2, str, drawable, j));
                acti.f60746c += getStorageStatsCall$PackageStats.f107376d;
                i2++;
                m = m;
                i = 0;
            }
            acti.f60746c += ((GetStorageStatsCall$Response) rkj.f43190a).f107379c;
            acti.f60747d = rkj.mo24820n();
            rkj.mo24821o();
        } catch (InterruptedException | ExecutionException e3) {
            if (e3.getCause() instanceof rjp) {
                acti.f60744a = ((rjp) e3.getCause()).mo24655a();
            } else {
                acti.f60744a = 8;
            }
        }
        return acti;
    }
}
