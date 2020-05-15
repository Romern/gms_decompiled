package p000;

import android.location.Location;
import android.os.Build;
import android.os.Looper;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.internal.LocationRequestInternal;

/* renamed from: biof */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class biof implements aubq {

    /* renamed from: a */
    final /* synthetic */ aehz f121041a;

    /* renamed from: b */
    final /* synthetic */ long f121042b;

    /* renamed from: c */
    final /* synthetic */ rjx f121043c;

    public biof(aehz aehz, rjx rjx, long j) {
        this.f121041a = aehz;
        this.f121043c = rjx;
        this.f121042b = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0028, code lost:
        if ((android.os.SystemClock.elapsedRealtimeNanos() - r9.getElapsedRealtimeNanos()) <= p000.cggp.f186889a.mo6606a().mo83754f()) goto L_0x002c;
     */
    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        Location location = null;
        Location location2 = aucb.mo50384b() ? (Location) aucb.mo50386d() : null;
        if (location2 != null) {
            int i = Build.VERSION.SDK_INT;
        }
        location = location2;
        if (location == null) {
            rjx rjx = this.f121043c;
            aehz aehz = this.f121041a;
            long j = this.f121042b;
            LocationRequest a = LocationRequest.m66854a();
            a.mo43553c(102);
            a.mo43549a(j);
            a.mo43554c(bioh.f121046a);
            a.mo43552b(10L);
            a.mo43551b(1);
            rjx.mo24685a(LocationRequestInternal.m66889a("places_get_current_place", a), aehz, Looper.getMainLooper());
            return;
        }
        this.f121041a.mo7032a(location);
    }
}
