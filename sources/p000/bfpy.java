package p000;

import android.app.PendingIntent;
import com.google.android.gms.location.LocationRequest;

/* renamed from: bfpy */
final /* synthetic */ class bfpy implements Runnable {

    /* renamed from: a */
    private final bfqm f114825a;

    /* renamed from: b */
    private final PendingIntent f114826b;

    public bfpy(bfqm bfqm, PendingIntent pendingIntent) {
        this.f114825a = bfqm;
        this.f114826b = pendingIntent;
    }

    public final void run() {
        bfqm bfqm = this.f114825a;
        PendingIntent pendingIntent = this.f114826b;
        bfqm.mo62136a((Object) pendingIntent);
        bfqm.f114891r.mo25067b(bfqm.m97525a((LocationRequest) null, pendingIntent));
    }
}
