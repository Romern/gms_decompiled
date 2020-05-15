package p000;

import android.app.PendingIntent;
import com.google.android.gms.location.ActivityRecognitionRequest;
import com.google.android.location.internal.server.GoogleLocationChimeraService;

/* renamed from: bgdj */
public final /* synthetic */ class bgdj implements Runnable {

    /* renamed from: a */
    private final bgdo f116121a;

    /* renamed from: b */
    private final PendingIntent f116122b;

    /* renamed from: c */
    private final ActivityRecognitionRequest f116123c;

    /* renamed from: d */
    private final boolean f116124d;

    public bgdj(bgdo bgdo, PendingIntent pendingIntent, ActivityRecognitionRequest activityRecognitionRequest, boolean z) {
        this.f116121a = bgdo;
        this.f116122b = pendingIntent;
        this.f116123c = activityRecognitionRequest;
        this.f116124d = z;
    }

    public final void run() {
        boolean z;
        GoogleLocationChimeraService googleLocationChimeraService;
        bgbg bgbg;
        bgdo bgdo = this.f116121a;
        PendingIntent pendingIntent = this.f116122b;
        ActivityRecognitionRequest activityRecognitionRequest = this.f116123c;
        boolean z2 = this.f116124d;
        synchronized (bgdo.f116149e) {
            if (cese.m138157f()) {
                z = bgdo.f116164u.mo25946a(bhcq.m100641b(pendingIntent));
            } else {
                z = true;
            }
            bgbg bgbg2 = bgdo.f116157n;
            GoogleLocationChimeraService googleLocationChimeraService2 = bgdo.f116145a;
            bgns d = bgdo.mo62683d();
            if (!bero.m95592a()) {
                googleLocationChimeraService = googleLocationChimeraService2;
                bgbg = bgbg2;
            } else {
                if (!cesb.m138148d()) {
                    if (!bero.m95595b(googleLocationChimeraService2, bhcq.m100641b(pendingIntent), bhcq.m100640a(pendingIntent))) {
                        googleLocationChimeraService = googleLocationChimeraService2;
                        bgbg = bgbg2;
                    }
                }
                googleLocationChimeraService = googleLocationChimeraService2;
                bgbg = bgbg2;
                bgbg.mo25985a(pendingIntent, new beue(googleLocationChimeraService2, bhcq.m100641b(pendingIntent), bhcq.m100640a(pendingIntent), z2, z, pendingIntent, activityRecognitionRequest, null, d));
            }
            bgbg.mo62602a(googleLocationChimeraService, d, pendingIntent, activityRecognitionRequest, z2, z);
            bgdo.mo62680b(activityRecognitionRequest.f79293b);
            if (!bgdo.f116148d && cese.m138158g()) {
                bgdo.f116164u.mo25945a(bgdo);
                bgdo.f116148d = true;
            }
        }
    }
}
