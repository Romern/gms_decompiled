package p000;

import android.os.SystemClock;

/* renamed from: jsx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jsx {

    /* renamed from: a */
    private static long f23159a = 0;

    /* renamed from: b */
    private final wwr f23160b = wvu.m42361a(rpr.m34216b());

    /* renamed from: a */
    public final void mo14033a(Throwable th) {
        if (ccia.f179029a.mo6606a().mo75998c()) {
            synchronized (jsx.class) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime - f23159a >= ccia.f179029a.mo6606a().mo76000e()) {
                    f23159a = elapsedRealtime;
                    wwv wwv = new wwv(th);
                    wwv.f51512j = "com.google.android.gms";
                    wwv.f51499d = "com.google.android.gms.auth.proximity.logging.SILENT_FEEDBACK";
                    wwv.mo29496b();
                    this.f23160b.mo29488b(wwv.mo29490a());
                }
            }
        }
    }
}
