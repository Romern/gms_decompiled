package p000;

import android.content.Context;
import com.google.android.location.internal.server.NanoAppUpdaterChimeraGcmTaskService;
import java.util.Set;

/* renamed from: bgcq */
public final /* synthetic */ class bgcq implements Runnable {

    /* renamed from: a */
    private final bgcz f116062a;

    /* renamed from: b */
    private final Set f116063b;

    /* renamed from: c */
    private final Set f116064c;

    public bgcq(bgcz bgcz, Set set, Set set2) {
        this.f116062a = bgcz;
        this.f116063b = set;
        this.f116064c = set2;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.location.internal.server.NanoAppUpdaterChimeraGcmTaskService.a(android.content.Context, int):void
     arg types: [rpr, int]
     candidates:
      com.google.android.location.internal.server.NanoAppUpdaterChimeraGcmTaskService.a(android.content.Context, long):void
      aeah.a(aecc, aebu):bqgg
      aebd.a(aecc, aebu):bqgg
      com.google.android.location.internal.server.NanoAppUpdaterChimeraGcmTaskService.a(android.content.Context, int):void */
    public final void run() {
        bgcz bgcz = this.f116062a;
        Set<Long> set = this.f116063b;
        Set set2 = this.f116064c;
        new Object[1][0] = "Manager:";
        bgcz.f116088d = false;
        for (Long l : set) {
            bgcz.mo62661b(l.longValue(), 1);
        }
        if (bgcz.m98590c()) {
            NanoAppUpdaterChimeraGcmTaskService.m117275a((Context) rpr.m34216b(), 1);
        } else {
            bgcz.mo62660a(set2);
        }
    }
}
