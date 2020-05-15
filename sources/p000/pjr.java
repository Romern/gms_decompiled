package p000;

import com.google.android.gms.cast.MediaStatus;

/* renamed from: pjr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class pjr extends psl {

    /* renamed from: a */
    final /* synthetic */ pjs f39372a;

    public pjr(pjs pjs) {
        this.f39372a = pjs;
    }

    /* renamed from: a */
    public final void mo23277a() {
        pjs.f39373a.mo23861b("RemoteMediaClient onStatusUpdated");
        pjs pjs = this.f39372a;
        MediaStatus b = pjs.f39379g.mo23619b();
        boolean z = true;
        boolean z2 = false;
        if (b == null) {
            z = false;
        } else if (b.f29809a != null) {
            int i = b.f29813e;
            if (i == 1 && b.f29814f != 1) {
                z = false;
            } else if (i == 1 && b.f29814f == 1) {
                long j = cday.f180398a.mo6606a().mo77188j();
                pjs.f39373a.mo23673b("Media finished. Will remove the notification in %d ms.", Long.valueOf(j));
                Runnable runnable = pjs.f39378f;
                if (runnable != null) {
                    pjs.f39377e.removeCallbacks(runnable);
                } else {
                    pjs.f39378f = new pjo(pjs);
                }
                pjs.f39377e.postDelayed(pjs.f39378f, j);
            } else {
                if (i == 2) {
                    z2 = true;
                }
                pjs.f39377e.removeCallbacks(pjs.f39378f);
            }
        } else {
            z = false;
        }
        if (pjs.f39385m != z || pjs.f39386n != z2) {
            pjs.f39385m = z;
            pjs.f39386n = z2;
            pjs.mo23281c();
        }
    }
}
