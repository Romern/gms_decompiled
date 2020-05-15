package p000;

import android.content.Context;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import org.apache.http.params.HttpParams;

/* renamed from: rxg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rxg extends rvd {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [long, int]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    public rxg() {
        super("PhenotypeSafebootFix", Math.max(cdng.f181305a.mo6606a().mo77963k(), 60L), TimeUnit.MINUTES.toMillis(3));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo25188a(rvl rvl) {
        return cdng.f181305a.mo6606a().mo77962j();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: abop.<init>(android.content.Context, java.lang.String, boolean, aboq):void
     arg types: [rpr, java.lang.String, int, aboq]
     candidates:
      abop.<init>(android.content.Context, java.lang.String, boolean, boolean):void
      abop.<init>(android.content.Context, java.lang.String, boolean, aboq):void */
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final rvl mo25189b(rvl rvl) {
        int i;
        rpr b = rpr.m34216b();
        int i2 = rxe.f43804b;
        abop abop = new abop((Context) b, anfi.m64157a(b), true, rfy.m33550g(b) ? aboq.PERMIT_ALL : aboq.PERMIT_NONE);
        HttpParams httpParams = abop.f57804b;
        httpParams.setParameter("http.connection.timeout", Integer.valueOf(Math.max((int) cgem.m144887b(), 30000)));
        httpParams.setParameter("http.socket.timeout", Integer.valueOf(Math.max((int) cgem.m144887b(), 30000)));
        rxe rxe = new rxe(b, new rxb(), anfg.m64152a(b), new rxa(abop, aniu.m64525e()));
        rte rte = new rte(b, new rxf(b));
        try {
            rxe.mo41854a(18, "com.google.android.gms", (cahw) cahz.f174610h.mo74144da());
            rte.mo25083a();
            i = 3;
        } catch (anfy e) {
            if (e.f76792a == 29504) {
                Log.e("PhenotypeSafebootFix", e.toString());
                Log.e("PhenotypeSafebootFix", "task failed");
                i = 5;
            } else {
                throw e;
            }
        }
        rvk d = rvl.mo25205d();
        d.mo25199a(this, i);
        return d.mo25198a();
    }
}
