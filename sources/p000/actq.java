package p000;

import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.os.Build;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.search.global.GetGlobalSearchSourcesCall$GlobalSearchSource;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: actq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class actq extends AsyncTask {

    /* renamed from: a */
    final /* synthetic */ actx f60763a;

    public actq(actx actx) {
        this.f60763a = actx;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final actp mo33080a() {
        apqb a = aplx.m70648a(this.f60763a.f60772a);
        roz b = rpa.m34196b();
        b.f43472a = new apqr();
        aucb a2 = ((rjx) a).mo24701a(b.mo24977a());
        actp actp = new actp();
        try {
            GetGlobalSearchSourcesCall$GlobalSearchSource[] getGlobalSearchSourcesCall$GlobalSearchSourceArr = (GetGlobalSearchSourcesCall$GlobalSearchSource[]) aucu.m76783a(a2, 15, TimeUnit.SECONDS);
            actp.f60761a = 0;
            ArrayList arrayList = new ArrayList();
            actr actr = null;
            for (GetGlobalSearchSourcesCall$GlobalSearchSource getGlobalSearchSourcesCall$GlobalSearchSource : getGlobalSearchSourcesCall$GlobalSearchSourceArr) {
                if (!getGlobalSearchSourcesCall$GlobalSearchSource.f107416a.equals("com.google.android.gms")) {
                    actr actr2 = new actr(this.f60763a.f60772a);
                    try {
                        actr2.mo26085a(this.f60763a.f60774c.getApplicationLabel(this.f60763a.f60774c.getApplicationInfo(getGlobalSearchSourcesCall$GlobalSearchSource.f107416a, 0)).toString());
                        actr2.mo26101a(this.f60763a.f60774c.getApplicationIcon(getGlobalSearchSourcesCall$GlobalSearchSource.f107416a));
                        actr2.f60764c = getGlobalSearchSourcesCall$GlobalSearchSource.f107416a;
                        actr2.mo26105b(getGlobalSearchSourcesCall$GlobalSearchSource.f107417b);
                        actr2.setChecked(getGlobalSearchSourcesCall$GlobalSearchSource.f107425j);
                        actr2.mo26102a(this.f60763a.f60779h);
                        actr2.mo26086b(Integer.MIN_VALUE);
                        arrayList.add(actr2);
                        if (actr == null || ((String) actr2.f45211f).compareTo((String) actr.f45211f) > 0) {
                            actr = actr2;
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        String valueOf = String.valueOf(getGlobalSearchSourcesCall$GlobalSearchSource.f107416a);
                        absg.m48184a(valueOf.length() == 0 ? new String("Application not found in PackageManager: ") : "Application not found in PackageManager: ".concat(valueOf));
                    }
                }
            }
            if (actr != null) {
                actr.f60765l = true;
            }
            actt actt = new actt(this.f60763a.f60772a);
            actt.mo26085a("");
            actt.mo26107d(C0126R.string.on_device_sharing_ui_description);
            int i = Build.VERSION.SDK_INT;
            actt.mo26101a(actt.f45233g.getDrawable(C0126R.C0127drawable.quantum_ic_info_outline_grey600_24));
            actt.mo26086b(Integer.MAX_VALUE);
            arrayList.add(actt);
            actp.f60762b = arrayList;
            return actp;
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            if (e2.getCause() instanceof rjp) {
                actp.f60761a = ((rjp) e2.getCause()).mo24655a();
            } else {
                actp.f60761a = 8;
            }
            return actp;
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        return mo33080a();
    }

    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        actp actp = (actp) obj;
        actx actx = this.f60763a;
        if (actx.f60773b) {
            actx.f60776e.mo60482b();
            if (actp.f60761a == 0) {
                if (actp.f60762b.size() != 1 || !(actp.f60762b.get(0) instanceof actt)) {
                    List list = actp.f60762b;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        this.f60763a.f60780i.mo26149a((sui) list.get(i));
                    }
                } else {
                    this.f60763a.f60777f.setVisibility(0);
                    actx actx2 = this.f60763a;
                    actx2.f60775d.mo26097a(actx2.f60780i);
                }
                this.f60763a.f60781j;
                return;
            }
            this.f60763a.f60778g.setVisibility(0);
            this.f60763a.f60781j;
        }
    }

    public final void onPreExecute() {
        actx actx = this.f60763a;
        if (actx.f60773b) {
            actx.f60781j;
            this.f60763a.f60777f.setVisibility(8);
            this.f60763a.f60778g.setVisibility(8);
            this.f60763a.f60776e.mo60481a();
        }
    }
}
