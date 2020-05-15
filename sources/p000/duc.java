package p000;

import com.google.android.contextmanager.fence.PlaceFenceHelper;

/* renamed from: duc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class duc implements Runnable {

    /* renamed from: a */
    final /* synthetic */ dug f14026a;

    /* renamed from: b */
    final /* synthetic */ int f14027b;

    /* renamed from: c */
    final /* synthetic */ PlaceFenceHelper f14028c;

    public duc(PlaceFenceHelper placeFenceHelper, dug dug, int i) {
        this.f14028c = placeFenceHelper;
        this.f14026a = dug;
        this.f14027b = i;
    }

    public final void run() {
        PlaceFenceHelper placeFenceHelper = this.f14028c;
        dug dug = this.f14026a;
        int i = this.f14027b;
        duh duh = (duh) placeFenceHelper.f7706b.get(dug);
        if (duh == null) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68432a("com.google.android.contextmanager.fence.PlaceFenceHelper", "a", 208, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("[PlaceFenceHelper] No record for NearbyAlertKey");
            return;
        }
        long a = dwq.m9665i().mo20505a();
        for (dvd dvd : duh.f14039a.keySet()) {
            int i2 = 0;
            new Object[1][0] = Integer.valueOf(i);
            dwq.m9650G().mo9372a();
            int i3 = dvd.f14162f;
            if (i != 2) {
                i2 = i == 1 ? 1 : i3;
            }
            if (i2 != i3) {
                dvd.f14163g = i3;
                dvd.f14162f = i2;
                dvd.f14164h = a;
                if (i2 != 1 || dvd.mo9700m() <= 0) {
                    dwq.m9648E().mo9558a(dvd.f14077d);
                } else {
                    dwq.m9648E().mo9554a(dvd.mo9700m(), dvd.f14077d);
                }
            }
        }
        if (a - placeFenceHelper.f7710f < 86400000 || placeFenceHelper.f7706b.isEmpty()) {
            placeFenceHelper.f7710f = a;
            return;
        }
        placeFenceHelper.f7710f = a;
        placeFenceHelper.mo6261a();
    }
}
