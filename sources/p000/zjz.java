package p000;

import android.location.Location;
import com.google.android.gms.location.LocationResult;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: zjz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class zjz {

    /* renamed from: a */
    public final List f55266a;

    /* renamed from: b */
    public final List f55267b;

    /* renamed from: c */
    public final List f55268c;

    /* renamed from: d */
    final /* synthetic */ zka f55269d;

    /* JADX WARNING: Removed duplicated region for block: B:31:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0112  */
    public zjz(zka zka, LocationResult locationResult) {
        Location location;
        float f;
        this.f55269d = zka;
        int size = locationResult.f79358b.size();
        this.f55266a = new ArrayList(size);
        this.f55267b = new ArrayList(size);
        this.f55268c = new ArrayList(size);
        List list = locationResult.f79358b;
        zka zka2 = this.f55269d;
        srn srn = zka.f55270a;
        Location a = zka2.f55272b.mo31179a();
        bnre i = zka.m45634a(zka.f55271c.mo67378a(list)).listIterator();
        while (i.hasNext()) {
            Location location2 = (Location) i.next();
            if (a != null && zkb.m45638a(a) - zkb.m45638a(location2) >= cdzd.f182003a.mo6606a().mo78567ag()) {
                bnsl bnsl = (bnsl) zka.f55270a.mo68388c();
                bnsl.mo68432a("zjz", "a", 141, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68417a("Location time not later than previous one: %d %d. Ignoring.", zkb.m45638a(location2), zkb.m45638a(a));
            } else if (zkb.m45638a(location2) == 0) {
                bnsl bnsl2 = (bnsl) zka.f55270a.mo68388c();
                bnsl2.mo68432a("zjz", "a", 147, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68415a("Received invalid location with time %d. Ignoring.", zkb.m45638a(location2));
            } else {
                if (a != null) {
                    float distanceTo = location2.distanceTo(a);
                    int j = aeim.m51906j(location2);
                    if (j == 0) {
                        zkb.m45638a(location2);
                        f = (float) (location2.hasAltitude() ? cdzd.m135491t() : cdzd.m135492u());
                    } else {
                        f = (float) (j != 1 ? cdzd.m135492u() : cdzd.m135491t());
                    }
                    if (distanceTo >= f) {
                        m45632a(location2);
                        this.f55267b.add(yyk.m45011a(this.f55269d.f55272b.mo31185b(bzzn.f172069I), zkb.m45638a(a), zkb.m45638a(location2), TimeUnit.MILLISECONDS, yyp.m45046a((double) distanceTo)));
                    } else {
                        zkb.m45638a(location2);
                        if (location2.hasSpeed()) {
                            zkb.m45638a(location2);
                        } else {
                            double speed = (double) location2.getSpeed();
                            if (speed >= cdzd.f182003a.mo6606a().mo78565ae()) {
                                this.f55268c.add(yyk.m45012a(this.f55269d.f55272b.mo31185b(bzzn.f172098ak), zkb.m45638a(location2), TimeUnit.MILLISECONDS, speed));
                            }
                        }
                    }
                } else {
                    m45632a(location2);
                }
                a = location2;
                if (location2.hasSpeed()) {
                }
            }
        }
        if (!a.equals(this.f55269d.f55272b.mo31179a())) {
            zjv zjv = this.f55269d.f55272b;
            do {
                location = (Location) zjv.f55253c.get();
                if (location != null && zkb.m45638a(location) > zkb.m45638a(a)) {
                    bnsl bnsl3 = (bnsl) zjv.f55250a.mo68388c();
                    bnsl3.mo68432a("zjv", "a", 170, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl3.mo68424a("Out of order location: %s is before %s", a, location);
                    return;
                }
            } while (!zjv.f55253c.compareAndSet(location, a));
        }
    }

    /* renamed from: a */
    private final void m45632a(Location location) {
        List list = this.f55266a;
        zka zka = this.f55269d;
        srn srn = zka.f55270a;
        list.add(zka.m45635a(zka.f55272b.mo31185b(bzzn.f172085Y), location));
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00f0  */
    /* renamed from: a */
    private final void m45633a(List list) {
        Location location;
        float f;
        zka zka = this.f55269d;
        srn srn = zka.f55270a;
        Location a = zka.f55272b.mo31179a();
        bnre i = zka.m45634a(zka.f55271c.mo67378a(list)).listIterator();
        while (i.hasNext()) {
            Location location2 = (Location) i.next();
            if (a != null && zkb.m45638a(a) - zkb.m45638a(location2) >= cdzd.f182003a.mo6606a().mo78567ag()) {
                bnsl bnsl = (bnsl) zka.f55270a.mo68388c();
                bnsl.mo68432a("zjz", "a", 141, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68417a("Location time not later than previous one: %d %d. Ignoring.", zkb.m45638a(location2), zkb.m45638a(a));
            } else if (zkb.m45638a(location2) == 0) {
                bnsl bnsl2 = (bnsl) zka.f55270a.mo68388c();
                bnsl2.mo68432a("zjz", "a", 147, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68415a("Received invalid location with time %d. Ignoring.", zkb.m45638a(location2));
            } else {
                if (a != null) {
                    float distanceTo = location2.distanceTo(a);
                    int j = aeim.m51906j(location2);
                    if (j == 0) {
                        zkb.m45638a(location2);
                        f = (float) (location2.hasAltitude() ? cdzd.m135491t() : cdzd.m135492u());
                    } else {
                        f = (float) (j != 1 ? cdzd.m135492u() : cdzd.m135491t());
                    }
                    if (distanceTo >= f) {
                        m45632a(location2);
                        this.f55267b.add(yyk.m45011a(this.f55269d.f55272b.mo31185b(bzzn.f172069I), zkb.m45638a(a), zkb.m45638a(location2), TimeUnit.MILLISECONDS, yyp.m45046a((double) distanceTo)));
                    } else {
                        zkb.m45638a(location2);
                        if (location2.hasSpeed()) {
                            zkb.m45638a(location2);
                        } else {
                            double speed = (double) location2.getSpeed();
                            if (speed >= cdzd.f182003a.mo6606a().mo78565ae()) {
                                this.f55268c.add(yyk.m45012a(this.f55269d.f55272b.mo31185b(bzzn.f172098ak), zkb.m45638a(location2), TimeUnit.MILLISECONDS, speed));
                            }
                        }
                    }
                } else {
                    m45632a(location2);
                }
                a = location2;
                if (location2.hasSpeed()) {
                }
            }
        }
        if (!a.equals(this.f55269d.f55272b.mo31179a())) {
            zjv zjv = this.f55269d.f55272b;
            do {
                location = (Location) zjv.f55253c.get();
                if (location != null && zkb.m45638a(location) > zkb.m45638a(a)) {
                    bnsl bnsl3 = (bnsl) zjv.f55250a.mo68388c();
                    bnsl3.mo68432a("zjv", "a", 170, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl3.mo68424a("Out of order location: %s is before %s", a, location);
                    return;
                }
            } while (!zjv.f55253c.compareAndSet(location, a));
        }
    }
}
