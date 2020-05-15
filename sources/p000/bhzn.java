package p000;

import android.location.Location;
import android.os.Bundle;
import android.util.Pair;
import com.google.android.gms.maps.model.LatLng;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: bhzn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhzn extends bhzr implements bigv {

    /* renamed from: b */
    private final bigx f119969b;

    /* renamed from: c */
    private final Bundle f119970c;

    /* renamed from: d */
    private final Map f119971d = new HashMap();

    public bhzn(bhzq bhzq, bigx bigx) {
        super(bhzq);
        this.f119969b = bigx;
        Bundle bundle = new Bundle();
        this.f119970c = bundle;
        bundle.putString("nearby_alert_module_name", "Distance");
    }

    /* renamed from: a */
    private static final Pair m101799a(bhzs bhzs) {
        return new Pair(bhzs.f119985a, new LatLng(bhzs.f119986b, bhzs.f119987c));
    }

    /* renamed from: a */
    public final void mo64455a(aehl aehl) {
    }

    /* renamed from: a */
    public final void mo64458a(bhtu bhtu) {
    }

    /* renamed from: b */
    public final void mo64461b() {
        this.f119969b.mo64605b(this);
        this.f119971d.clear();
    }

    /* renamed from: a */
    private final void m101800a(String str, LatLng latLng, bhzm bhzm, int i) {
        bhzs bhzs = new bhzs(str, latLng.f79894a, latLng.f79895b, bhzm.f119968g, bhzm.f119966e);
        HashSet hashSet = new HashSet();
        hashSet.add(bhzs);
        this.f119984a.mo64389a(0, new bhzp(hashSet, i, bhzm.f119963b, bhzm.f119967f, bhzm.f119964c, bhzm.f119965d), this.f119970c);
    }

    /* renamed from: b */
    public final void mo64462b(bhzp bhzp) {
        Set<bhzs> set = bhzp.f119978a;
        HashSet hashSet = new HashSet();
        for (bhzs bhzs : set) {
            List list = (List) this.f119971d.get(m101799a(bhzs));
            if (!sqw.m36041a((Collection) list)) {
                list.remove(new bhzm(bhzp.f119979b, bhzp.f119980c, bhzp.f119982e, bhzp.f119983f, bhzs.f119989e, bhzp.f119981d, bhzs.f119988d));
                hashSet.add(bhzs);
                if (list.isEmpty()) {
                    this.f119971d.remove(m101799a(bhzs));
                }
            } else {
                return;
            }
        }
        this.f119984a.mo64389a(0, new bhzp(hashSet, 2, bhzp.f119980c, bhzp.f119981d, bhzp.f119982e, bhzp.f119983f), this.f119970c);
    }

    /* renamed from: a */
    public final void mo64454a() {
        this.f119969b.mo64603a(this);
    }

    /* renamed from: a */
    public final void mo64456a(Location location) {
        LatLng latLng = new LatLng(location.getLatitude(), location.getLongitude());
        for (Pair pair : this.f119971d.keySet()) {
            double a = aepo.m52350a(latLng, (LatLng) pair.second);
            for (bhzm bhzm : (List) this.f119971d.get(pair)) {
                if (a > ((double) bhzm.f119968g)) {
                    m101800a((String) pair.first, (LatLng) pair.second, bhzm, 2);
                } else {
                    m101800a((String) pair.first, (LatLng) pair.second, bhzm, 1);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo64457a(Location location, bhwr bhwr, boolean z, bhtr bhtr) {
        mo64456a(location);
    }

    /* renamed from: a */
    public final void mo64459a(bhzp bhzp) {
        for (bhzs bhzs : bhzp.f119978a) {
            bhzm bhzm = new bhzm(bhzp.f119979b, bhzp.f119980c, bhzp.f119982e, bhzp.f119983f, bhzs.f119989e, bhzp.f119981d, bhzs.f119988d);
            if (this.f119971d.containsKey(m101799a(bhzs))) {
                ((List) this.f119971d.get(m101799a(bhzs))).add(bhzm);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(bhzm);
                this.f119971d.put(m101799a(bhzs), arrayList);
            }
        }
        Location a = this.f119969b.mo64601a();
        if (a != null) {
            mo64456a(a);
        }
    }

    /* renamed from: a */
    public final void mo64460a(PrintWriter printWriter) {
        printWriter.println(String.format(Locale.US, "\n    Total %d places tracked in distance module:\n", Integer.valueOf(this.f119971d.size())));
        printWriter.println("place id --> number of tracked subscriptions:");
        for (Pair pair : this.f119971d.keySet()) {
            String str = (String) pair.first;
            int size = ((List) this.f119971d.get(pair)).size();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 16);
            sb.append(str);
            sb.append(" --> ");
            sb.append(size);
            printWriter.println(sb.toString());
        }
    }
}
