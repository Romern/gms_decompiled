package p000;

import android.content.Context;
import android.util.Log;
import java.util.List;

/* renamed from: aphy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aphy {

    /* renamed from: a */
    private final Context f84411a;

    public aphy(Context context) {
        this.f84411a = context;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sfc.a(android.content.Context, boolean):sfb
     arg types: [android.content.Context, int]
     candidates:
      sfc.a(android.content.Context, java.lang.String):java.util.List
      sfb.a(android.content.Context, java.lang.String):java.util.List
      sfc.a(android.content.Context, boolean):sfb */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo47241a(aaps aaps) {
        sfb sfb;
        if (cdnk.f181321a.mo6606a().mo77972f()) {
            sfb = sfc.m35144a(this.f84411a, true, true);
        } else {
            sfb = sfc.m35143a(this.f84411a, true);
        }
        if (sfb.mo25464b()) {
            List a = sfb.mo25462a(this.f84411a, "GMSCORE_SCHEDULER_EVENT");
            if (a.size() <= 0) {
                Log.e("NetworkScheduler.Stats", "Unable to log scheduler event because OptInLoggerCreator did not return any functional loggers.");
            } else if (cdnk.f181321a.mo6606a().mo77968b()) {
                qwo a2 = ((qws) a.get(0)).mo24335a(aaps.mo73642k());
                a2.f42322f = cagz.UNMETERED_OR_DAILY;
                a2.mo24327b();
            } else {
                qwo a3 = ((qws) a.get(0)).mo24335a(aaps.mo73642k());
                a3.f42322f = cagz.UNMETERED_ONLY;
                a3.mo24327b();
            }
        }
    }
}
