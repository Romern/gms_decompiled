package p000;

import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.location.LocationResult;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: zka */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class zka extends aehy {

    /* renamed from: a */
    public static final srn f55270a = zvt.m46581a();

    /* renamed from: c */
    public static final bnny f55271c = bnnt.f131877a.mo68159a(zjy.f55265a);

    /* renamed from: b */
    public final zjv f55272b;

    /* renamed from: d */
    private final ytp f55273d;

    public zka(zjv zjv, ytp ytp) {
        this.f55272b = zjv;
        this.f55273d = ytp;
    }

    /* renamed from: a */
    public static bngx m45634a(List list) {
        bngs b = bngx.m109371b(list.size());
        int i = 0;
        while (i < list.size()) {
            Location location = (Location) list.get(i);
            while (true) {
                i++;
                if (i >= list.size() || zkb.m45638a((Location) list.get(i)) > zkb.m45638a(location)) {
                    b.mo67668c(location);
                } else {
                    Location location2 = (Location) list.get(i);
                    if (zkb.m45638a(location2) < zkb.m45638a(location)) {
                        bnsl bnsl = (bnsl) f55270a.mo68388c();
                        bnsl.mo68432a("zka", "a", 261, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68417a("Location time not in order: %d %d. Ignoring the latter.", zkb.m45638a(location), zkb.m45638a(location2));
                    } else {
                        float f = Float.MAX_VALUE;
                        float accuracy = location2.hasAccuracy() ? location2.getAccuracy() : Float.MAX_VALUE;
                        if (location.hasAccuracy()) {
                            f = location.getAccuracy();
                        }
                        if (accuracy < f) {
                            location = location2;
                        }
                    }
                }
            }
            b.mo67668c(location);
        }
        return b.mo67664a();
    }

    /* renamed from: a */
    public static cadn m45635a(caae caae, Location location) {
        caaw caaw;
        caaw a = yyp.m45046a(location.getLatitude());
        caaw a2 = yyp.m45046a(location.getLongitude());
        caaw a3 = yyp.m45046a((double) location.getAccuracy());
        if (location.hasAltitude()) {
            caaw = yyp.m45046a(location.getAltitude());
        } else {
            caaw = caaw.f172379i;
        }
        return yyk.m45013a(caae, zkb.m45638a(location), TimeUnit.MILLISECONDS, bngx.m109359a(a, a2, a3, caaw));
    }

    /* renamed from: a */
    private static void m45636a(zgg zgg, List list) {
        try {
            zgg.mo30949a(list);
            list.size();
            caae caae = ((cadn) list.get(0)).f172705e;
            if (caae == null) {
                caae = caae.f172323i;
            }
            String str = caae.f172326b;
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) f55270a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("zka", "a", 96, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            caae caae2 = ((cadn) list.get(0)).f172705e;
            if (caae2 == null) {
                caae2 = caae.f172323i;
            }
            bnsl.mo68420a("Couldn't send %s events to listener. Assuming listener is dead.", caae2.f172326b);
        }
    }

    /* renamed from: a */
    public final void mo9910a(LocationResult locationResult) {
        locationResult.f79358b.size();
        zjz zjz = new zjz(this, locationResult);
        this.f55273d.mo30768a(4);
        this.f55273d.mo30770a(bzzn.f172085Y, zjz.f55266a.size());
        this.f55273d.mo30770a(bzzn.f172069I, zjz.f55267b.size());
        this.f55273d.mo30770a(bzzn.f172098ak, zjz.f55268c.size());
        zgg a = this.f55272b.mo31181a(bzzn.f172085Y);
        zgg a2 = this.f55272b.mo31181a(bzzn.f172069I);
        zgg a3 = this.f55272b.mo31181a(bzzn.f172098ak);
        if (a == null && a2 == null && a3 == null) {
            bnsl bnsl = (bnsl) f55270a.mo68388c();
            bnsl.mo68432a("zka", "a", 74, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Received location result with no listeners %s, ignoring", this.f55272b);
            return;
        }
        if (a != null && !zjz.f55266a.isEmpty()) {
            m45636a(a, zjz.f55266a);
        }
        if (a2 != null && !zjz.f55267b.isEmpty()) {
            m45636a(a2, zjz.f55267b);
        }
        if (a3 != null && !zjz.f55268c.isEmpty()) {
            m45636a(a3, zjz.f55268c);
        }
    }
}
