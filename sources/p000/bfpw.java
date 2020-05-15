package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.location.internal.LocationRequestInternal;

/* renamed from: bfpw */
final /* synthetic */ class bfpw implements Runnable {

    /* renamed from: a */
    private final bfqm f114816a;

    /* renamed from: b */
    private final LocationRequestInternal f114817b;

    /* renamed from: c */
    private final PendingIntent f114818c;

    /* renamed from: d */
    private final boolean f114819d;

    /* renamed from: e */
    private final int f114820e;

    /* renamed from: f */
    private final String f114821f;

    /* renamed from: g */
    private final boolean f114822g;

    public bfpw(bfqm bfqm, LocationRequestInternal locationRequestInternal, PendingIntent pendingIntent, boolean z, int i, String str, boolean z2) {
        this.f114816a = bfqm;
        this.f114817b = locationRequestInternal;
        this.f114818c = pendingIntent;
        this.f114819d = z;
        this.f114820e = i;
        this.f114821f = str;
        this.f114822g = z2;
    }

    public final void run() {
        bfqm bfqm = this.f114816a;
        LocationRequestInternal locationRequestInternal = this.f114817b;
        PendingIntent pendingIntent = this.f114818c;
        boolean z = this.f114819d;
        int i = this.f114820e;
        String str = this.f114821f;
        boolean z2 = this.f114822g;
        if (locationRequestInternal != null) {
            Context context = bfqm.f114879f;
            bfpt bfpt = new bfpt(bfqm, pendingIntent);
            int i2 = bfph.f114761p;
            bfqm.mo62137a(pendingIntent, new bfpg(context, i, str, locationRequestInternal, z, z2, bfpt, pendingIntent));
            if (!"com.google.android.gms".equals(str)) {
                bfqm.f114891r.mo25062a(bfqm.m97525a(locationRequestInternal.f79420b, pendingIntent));
                return;
            }
            return;
        }
        Log.e("GCoreFlp", "Not request location updates because of incomplete request.");
    }
}
