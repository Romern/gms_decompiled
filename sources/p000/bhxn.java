package p000;

import android.location.Location;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.userlocation.UserLocationNearbyAlertFilter;
import com.google.android.gms.userlocation.UserLocationNearbyAlertRequest;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: bhxn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhxn implements sqt, bhqe {

    /* renamed from: a */
    public final boolean f119829a;

    /* renamed from: b */
    public final UserLocationNearbyAlertRequest f119830b;

    /* renamed from: c */
    public final bhxm f119831c;

    /* renamed from: d */
    private final bhxl f119832d;

    /* renamed from: e */
    private final int f119833e;

    /* renamed from: f */
    private final String f119834f;

    /* renamed from: g */
    private final String[] f119835g = {"android:monitor_location"};

    public bhxn(bhxl bhxl, int i, String str, bhxm bhxm, UserLocationNearbyAlertRequest userLocationNearbyAlertRequest, boolean z) {
        this.f119832d = bhxl;
        this.f119833e = i;
        this.f119834f = str;
        this.f119831c = bhxm;
        this.f119830b = userLocationNearbyAlertRequest;
        this.f119829a = z;
    }

    /* renamed from: a */
    public final PlacesParams mo64392a() {
        return this.f119831c.mo62993a();
    }

    /* renamed from: b */
    public final void mo64158b() {
        bhxl bhxl = this.f119832d;
        if (!bhxl.f119826e.containsKey(this)) {
            bhxl.f119826e.put(this, new ArrayList());
        }
        if (bhxl.f119826e.size() == 1) {
            biaf biaf = bhxl.f119822a;
            biaa biaa = biaf.f120032a;
            biaa.f120009e = biaf;
            if (!biaa.f120010f) {
                biaa.f120005a.mo64603a(biaa);
                biaa.f120005a.mo64602a(0, (long) ((int) cgfr.f186745a.mo6606a().mo83621I()), biaa.f120007c);
                biaa.f120010f = true;
            }
            biaf.mo64486a((Location) null);
        } else {
            LatLngBounds latLngBounds = bhxl.f119822a.f120036e;
            if (latLngBounds != null) {
                bhxl.f119823b.mo64412a(this, latLngBounds);
            }
        }
        if (bhxl.f119827f < mo64393d()) {
            bhxl.f119827f = mo64393d();
            bhxl.f119822a.mo64484a(mo64393d());
        }
    }

    /* renamed from: c */
    public final void mo64159c() {
        bhxl bhxl = this.f119832d;
        if (bhxl.f119826e.containsKey(this)) {
            bhxl.f119826e.remove(this);
            int i = -1;
            for (bhxn bhxn : bhxl.f119826e.keySet()) {
                i = Math.max(i, bhxn.mo64393d());
            }
            if (i != bhxl.f119827f) {
                bhxl.f119827f = i;
                bhxl.f119822a.mo64484a(i);
            }
            bhxk bhxk = bhxl.f119824c;
            int i2 = this.f119830b.f109597f;
            HashSet hashSet = new HashSet();
            if (bhxl.f119826e.containsKey(this)) {
                for (bhye bhye : (List) bhxl.f119826e.get(this)) {
                    hashSet.add(bhye.f119880a);
                }
            }
            UserLocationNearbyAlertRequest userLocationNearbyAlertRequest = this.f119830b;
            int i3 = userLocationNearbyAlertRequest.f109592a;
            int i4 = userLocationNearbyAlertRequest.f109596e;
            int i5 = userLocationNearbyAlertRequest.f109593b;
            UserLocationNearbyAlertFilter userLocationNearbyAlertFilter = userLocationNearbyAlertRequest.f109594c;
            bhxk.mo64388a(i2, new bhzp(hashSet, i3, i4, i5, userLocationNearbyAlertFilter.f109590c, userLocationNearbyAlertFilter.f109591d));
            if (bhxl.f119826e.size() == 0) {
                bhxl.f119822a.mo64483a();
            }
            bhxl.f119823b.mo64411a(this);
        }
    }

    /* renamed from: d */
    public final int mo64393d() {
        return this.f119830b.f109597f;
    }

    /* renamed from: j */
    public final int mo9757j() {
        return this.f119833e;
    }

    /* renamed from: k */
    public final String mo9758k() {
        return this.f119834f;
    }

    /* renamed from: l */
    public final String mo9759l() {
        return null;
    }

    /* renamed from: m */
    public final String[] mo9760m() {
        return this.f119835g;
    }

    /* renamed from: n */
    public final boolean mo9761n() {
        return false;
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("nearbyAlertRequest", this.f119830b);
        return a.toString();
    }
}
