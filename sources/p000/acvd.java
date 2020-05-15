package p000;

import android.os.AsyncTask;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.appdatasearch.STSortSpec;
import com.google.android.gms.appdatasearch.SearchResults;
import com.google.android.gms.appdatasearch.Section;
import java.util.Collections;
import java.util.concurrent.ExecutionException;

/* renamed from: acvd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acvd extends AsyncTask {

    /* renamed from: a */
    final /* synthetic */ acve f60866a;

    public acvd(acve acve) {
        this.f60866a = acve;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo33127a() {
        return this.f60866a.isAdded();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        boolean z;
        acvb[] acvbArr = (acvb[]) objArr;
        if (acvbArr.length == 1) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34974b(z);
        apsn a = aplx.m70649a(this.f60866a.getActivity(), null);
        acvc acvc = new acvc();
        acvb acvb = acvbArr[0];
        acvc.f60862c = acvb.f60856a;
        acvc.f60863d = acvb.f60857b;
        acvc.f60864e = acvb.f60858c;
        acvc.f60865f = acvb.f60859d;
        try {
            String str = acvc.f60862c;
            String str2 = acvc.f60863d;
            String str3 = acvc.f60865f;
            frv frv = new frv();
            frv.mo11220a(new Section("name"));
            frv.mo11222c();
            frv.f17159a = new STSortSpec("(MAX _CREATED_TIMESTAMP _LAST_USED_TIMESTAMP)");
            frv.mo11223d();
            if (str3 != null) {
                if (str3.length() >= 4) {
                    frv.mo11221b();
                }
            }
            acvc.f60861b = (SearchResults) aucu.m76782a(a.mo47578a(str3, str, new String[]{str2}, 0, 100, frv.mo11219a()));
            acvc.f60860a = 0;
        } catch (InterruptedException | ExecutionException e) {
            acvc.f60860a = e.getCause() instanceof rjp ? ((rjp) e.getCause()).mo24655a() : 8;
        }
        return acvc;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        long j;
        long j2;
        acvc acvc = (acvc) obj;
        if (mo33127a()) {
            this.f60866a.f60870d.setVisibility(8);
            this.f60866a.f60874h.mo2090a(false);
            if (acvc.f60860a != 0) {
                acua.m49854a(this.f60866a.getContext(), "Indexables", this.f60866a.getContext().getString(C0126R.string.failed_retrieve_indexables, "Indexables"), Integer.valueOf(acvc.f60860a));
                return;
            }
            this.f60866a.f60869c.setVisibility(0);
            this.f60866a.f60867a.f60849a.clear();
            fsn b = acvc.f60861b.iterator();
            while (b.hasNext()) {
                C1001fsm a = b.next();
                String b2 = a.mo11253b("name");
                String a2 = a.mo11252a();
                SearchResults searchResults = a.f17194b;
                long[] jArr = searchResults.f9677n;
                if (jArr != null) {
                    j = jArr[a.f17193a];
                } else {
                    j = 0;
                }
                long[] jArr2 = searchResults.f9678o;
                if (jArr2 != null) {
                    j2 = jArr2[a.f17193a];
                } else {
                    j2 = 0;
                }
                this.f60866a.f60867a.f60849a.add(new acut(b2, a2, j, j2, acvc.f60862c, acvc.f60863d, acvc.f60864e));
            }
            Collections.sort(this.f60866a.f60867a.f60849a, new acus());
            this.f60866a.f60867a.notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: protected */
    public final void onPreExecute() {
        if (mo33127a()) {
            this.f60866a.f60869c.setVisibility(8);
            this.f60866a.f60870d.setVisibility(0);
        }
    }
}
