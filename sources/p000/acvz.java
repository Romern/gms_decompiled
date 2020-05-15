package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.view.View;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.search.administration.GetAppIndexingPackagesCall$Response;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.ExecutionException;

/* renamed from: acvz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class acvz extends AsyncTask {

    /* renamed from: a */
    final /* synthetic */ acwa f60931a;

    protected acvz(acwa acwa) {
        this.f60931a = acwa;
    }

    /* renamed from: a */
    private final void m49894a(Context context, String str, boolean z) {
        PackageManager packageManager = context.getPackageManager();
        try {
            this.f60931a.f60932a.f60922a.add(new acvq(packageManager.getApplicationInfo(str, 0).loadLabel(packageManager).toString(), str, packageManager.getApplicationIcon(str), z));
        } catch (PackageManager.NameNotFoundException e) {
            absg.m48193b("Application %s not found because: %s", str, e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        acvy acvy = new acvy();
        Context context = this.f60931a.getContext();
        if (context == null) {
            acvy.f60928a = 8;
        } else {
            apne b = aplx.m70650b(context);
            roz b2 = rpa.m34196b();
            b2.f43472a = apnu.f84750a;
            try {
                acvy.f60930c = (rkj) aucu.m76782a(((rjx) b).mo24701a(b2.mo24977a()));
                acvy.f60928a = 0;
            } catch (InterruptedException | ExecutionException e) {
                if (e.getCause() instanceof rjp) {
                    acvy.f60928a = Integer.valueOf(((rjp) e.getCause()).mo24655a());
                } else {
                    acvy.f60928a = 8;
                }
            }
            if (((Boolean) abzt.f58903ar.mo58455c()).booleanValue()) {
                acvy.f60929b = new rtj(context, "3pErrorCachePreferences", true).getBoolean("LoggingEnabled", false);
            }
        }
        return acvy;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Context context;
        acvy acvy = (acvy) obj;
        if (this.f60931a.isAdded() && (context = this.f60931a.getContext()) != null) {
            this.f60931a.f60935d.setVisibility(8);
            this.f60931a.f60938g.mo2090a(false);
            if (acvy.f60928a.intValue() != 0) {
                acua.m49854a(context, context.getString(C0126R.string.packages_title), context.getString(C0126R.string.failed_retrieve_packages), acvy.f60928a);
                return;
            }
            this.f60931a.f60934c.setVisibility(0);
            if (((Boolean) abzt.f58903ar.mo58455c()).booleanValue()) {
                this.f60931a.f60936e.setVisibility(0);
                this.f60931a.f60937f.setChecked(acvy.f60929b);
                this.f60931a.mo33162a(acvy.f60929b);
            }
            this.f60931a.f60932a.f60922a.clear();
            HashSet<String> hashSet = new HashSet(Arrays.asList(((GetAppIndexingPackagesCall$Response) acvy.f60930c.f43190a).f107371b));
            HashSet<String> hashSet2 = new HashSet(Arrays.asList(((GetAppIndexingPackagesCall$Response) acvy.f60930c.f43190a).f107372c));
            for (String str : hashSet2) {
                m49894a(context, str, true);
            }
            hashSet.removeAll(hashSet2);
            for (String str2 : hashSet) {
                m49894a(context, str2, false);
            }
            Collections.sort(this.f60931a.f60932a.f60922a, new acvr());
            this.f60931a.f60932a.notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: protected */
    public final void onPreExecute() {
        if (this.f60931a.isAdded()) {
            this.f60931a.f60934c.setVisibility(8);
            this.f60931a.f60935d.setVisibility(0);
            View view = this.f60931a.f60936e;
            if (view != null) {
                view.setVisibility(8);
            }
        }
    }
}
