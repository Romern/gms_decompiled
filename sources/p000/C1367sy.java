package p000;

import android.content.IntentFilter;
import android.location.Location;
import android.util.Log;
import java.util.Calendar;

/* renamed from: sy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1367sy extends C1366sx {

    /* renamed from: a */
    final /* synthetic */ C1372tc f27045a;

    /* renamed from: c */
    private final C1384to f27046c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1367sy(C1372tc tcVar, C1384to toVar) {
        super(tcVar);
        this.f27045a = tcVar;
        this.f27046c = toVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f3 A[RETURN] */
    /* renamed from: a */
    public final int mo15974a() {
        long j;
        C1384to toVar = this.f27046c;
        C1383tn tnVar = toVar.f27151c;
        if (tnVar.f27148b <= System.currentTimeMillis()) {
            Location location = null;
            Location a = C1145kt.m18540a(toVar.f27150b, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? toVar.mo16021a("network") : null;
            if (C1145kt.m18540a(toVar.f27150b, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                location = toVar.mo16021a("gps");
            }
            if (location == null || a == null ? location != null : location.getTime() > a.getTime()) {
                a = location;
            }
            if (a == null) {
                Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                int i = Calendar.getInstance().get(11);
                if (i < 6 || i >= 22) {
                    return 2;
                }
                return 1;
            }
            C1383tn tnVar2 = toVar.f27151c;
            long currentTimeMillis = System.currentTimeMillis();
            if (C1382tm.f27143a == null) {
                C1382tm.f27143a = new C1382tm();
            }
            C1382tm tmVar = C1382tm.f27143a;
            tmVar.mo16020a(currentTimeMillis - 86400000, a.getLatitude(), a.getLongitude());
            long j2 = tmVar.f27144b;
            tmVar.mo16020a(currentTimeMillis, a.getLatitude(), a.getLongitude());
            int i2 = tmVar.f27146d;
            long j3 = tmVar.f27145c;
            long j4 = tmVar.f27144b;
            long j5 = j3;
            tmVar.mo16020a(currentTimeMillis + 86400000, a.getLatitude(), a.getLongitude());
            long j6 = tmVar.f27145c;
            if (j5 == -1 || j4 == -1) {
                j = currentTimeMillis + 43200000;
            } else {
                if (currentTimeMillis <= j4) {
                    j6 = currentTimeMillis > j5 ? j4 : j5;
                }
                j = j6 + 60000;
            }
            tnVar2.f27147a = i2 != 0;
            tnVar2.f27148b = j;
        }
        if (tnVar.f27147a) {
            return 2;
        }
    }

    /* renamed from: b */
    public final void mo15975b() {
        this.f27045a.mo15951j();
    }

    /* renamed from: c */
    public final IntentFilter mo15976c() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIME_SET");
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        intentFilter.addAction("android.intent.action.TIME_TICK");
        return intentFilter;
    }
}
