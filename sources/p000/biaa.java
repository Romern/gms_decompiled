package p000;

import android.app.PendingIntent;
import android.location.Location;
import android.util.Log;
import com.felicanetworks.sdu.ErrorInfoFactory;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.location.RemoveGeofencingRequest;
import com.google.android.gms.location.internal.ParcelableGeofence;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.maps.model.LatLng;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: biaa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biaa implements bigv {

    /* renamed from: a */
    public final bigx f120005a;

    /* renamed from: b */
    public final Set f120006b = new HashSet();

    /* renamed from: c */
    public final ClientIdentity f120007c;

    /* renamed from: d */
    public bhzw f120008d;

    /* renamed from: e */
    public bhzx f120009e;

    /* renamed from: f */
    public boolean f120010f;

    /* renamed from: g */
    private final bhpt f120011g;

    /* renamed from: h */
    private final Set f120012h = new HashSet();

    /* renamed from: i */
    private final ArrayDeque f120013i = new ArrayDeque();

    /* renamed from: j */
    private bhzt f120014j;

    /* renamed from: k */
    private bhzt f120015k;

    /* renamed from: l */
    private biab f120016l;

    public biaa(bigx bigx, bhpt bhpt, int i) {
        this.f120005a = bigx;
        this.f120011g = bhpt;
        this.f120007c = new ClientIdentity(i, "com.google.android.gms");
        this.f120010f = false;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(float, float):float}
     arg types: [float, int]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(long, long):long}
      ClspMth{java.lang.Math.max(float, float):float} */
    /* renamed from: a */
    private final Set m101824a(Set set) {
        LatLng latLng;
        HashSet hashSet;
        Location a = this.f120005a.mo64601a();
        if (a != null) {
            latLng = new LatLng(a.getLatitude(), a.getLongitude());
        } else {
            latLng = null;
        }
        int C = (int) (cgfr.f186745a.mo6606a().mo83615C() - 1);
        if (set.size() <= C) {
            this.f120014j = null;
            hashSet = new HashSet(set);
        } else {
            if (latLng == null) {
                bhzt bhzt = this.f120015k;
                if (bhzt == null) {
                    return this.f120006b;
                }
                latLng = bhzt.f119991b;
            }
            ArrayList arrayList = new ArrayList(set);
            Collections.sort(arrayList, new bhzv(latLng));
            int i = C - 1;
            HashSet hashSet2 = new HashSet(arrayList.subList(0, i));
            bhzt bhzt2 = (bhzt) arrayList.get(i);
            float[] fArr = new float[1];
            double d = latLng.f79894a;
            double d2 = latLng.f79895b;
            LatLng latLng2 = bhzt2.f119991b;
            Location.distanceBetween(d, d2, latLng2.f79894a, latLng2.f79895b, fArr);
            bhzt bhzt3 = new bhzt(latLng, Math.max(fArr[0] - bhzt2.f119992c, 100.0f));
            this.f120014j = bhzt3;
            hashSet2.add(bhzt3);
            hashSet = hashSet2;
        }
        bhzt bhzt4 = this.f120015k;
        if (bhzt4 != null) {
            hashSet.add(bhzt4);
        }
        return hashSet;
    }

    /* renamed from: b */
    private final void m101828b() {
        this.f120016l = null;
        if (!this.f120013i.isEmpty()) {
            biab biab = (biab) this.f120013i.poll();
            this.f120016l = biab;
            m101829d(biab);
        }
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [java.util.List, java.util.Collection], assign insn: 0x00c1: IGET  (r13v1 ? I:java.util.Collection) = (r13v0 biab) biab.g java.util.Collection */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.Object, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.Object, java.lang.Object):void */
    /* renamed from: d */
    private final void m101829d(biab biab) {
        bhzw bhzw;
        if (biab == null) {
            return;
        }
        if (biab.f120017a) {
            bhzy bhzy = new bhzy(this, biab);
            bigx bigx = this.f120005a;
            PendingIntent pendingIntent = bigx.f120560j;
            sdo.checkIfNull(pendingIntent, "PendingIntent can not be null.");
            sdo.checkIfNull((Object) "places", (Object) "tag can not be null");
            sdo.m34975b(true, "tag can not be empty string");
            RemoveGeofencingRequest removeGeofencingRequest = new RemoveGeofencingRequest(null, pendingIntent, "places");
            rkb rkb = bigx.f120561k;
            rkb.mo24790a((rjz) new bigr(bigx, rkb, removeGeofencingRequest, bhzy));
            return;
        }
        Collection collection = biab.f120018b;
        if (!(collection == null || collection.isEmpty() || (bhzw = this.f120008d) == null)) {
            bhzw.mo64463a(0, 2, new ArrayList(biab.f120018b));
        }
        this.f120012h.removeAll(biab.f120018b);
        this.f120012h.addAll(biab.f120019c);
        Set<bhzt> a = m101824a(this.f120012h);
        ArrayList arrayList = new ArrayList();
        for (bhzt bhzt : this.f120006b) {
            if (!a.contains(bhzt)) {
                arrayList.add(bhzt);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (bhzt bhzt2 : a) {
            if (!this.f120006b.contains(bhzt2)) {
                arrayList2.add(bhzt2);
            }
        }
        biab.f120022f = a;
        biab.f120023g = arrayList;
        biab.f120024h = arrayList2;
        if (!biab.f120023g.isEmpty()) {
            bhzz bhzz = new bhzz(this, biab);
            ArrayList arrayList3 = new ArrayList(biab.f120023g.size());
            ? r13 = biab.f120023g;
            int size = r13.size();
            for (int i = 0; i < size; i++) {
                arrayList3.add(((bhzt) r13.get(i)).f119990a);
            }
            String[] strArr = (String[]) arrayList3.toArray(new String[arrayList3.size()]);
            bigx bigx2 = this.f120005a;
            List asList = Arrays.asList(strArr);
            sdo.checkIfNull(asList, "geofence can't be null.");
            sdo.m34975b(!asList.isEmpty(), "Geofences must contains at least one id.");
            sdo.checkIfNull((Object) "places", (Object) "tag can not be null");
            sdo.m34975b(true, "tag can not be empty string");
            RemoveGeofencingRequest removeGeofencingRequest2 = new RemoveGeofencingRequest(asList, null, "places");
            rkb rkb2 = bigx2.f120561k;
            int length = strArr.length;
            StringBuilder sb = new StringBuilder(28);
            sb.append("Remove ");
            sb.append(length);
            sb.append(" geofences");
            sb.toString();
            rkb2.mo24790a((rjz) new bigp(bigx2, rkb2, removeGeofencingRequest2, bhzz));
            return;
        }
        mo64475a(biab);
    }

    /* renamed from: a */
    public final void mo64458a(bhtu bhtu) {
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: biaa.a(biab, boolean):void
     arg types: [biab, int]
     candidates:
      biaa.a(java.util.Collection, java.util.Collection):void
      biaa.a(biab, boolean):void */
    /* renamed from: c */
    public final void mo64478c(biab biab) {
        m101827a(biab, false);
        switch (biab.f120020d.f30115i) {
            case 1000:
                this.f120006b.clear();
                m101825a(9102);
                m101828b();
                return;
            case 1001:
                if (!biab.f120017a && ((long) biab.f120021e) < cgfr.f186745a.mo6606a().mo83616D()) {
                    biab biab2 = new biab(true, null, null);
                    biab a = biab.m101839a(Collections.emptyList(), m101824a(this.f120012h));
                    a.f120021e = biab.f120021e + 1;
                    this.f120013i.addFirst(a);
                    this.f120013i.addFirst(biab2);
                }
                m101828b();
                return;
            case 1002:
                m101825a(9102);
                m101828b();
                return;
            default:
                m101828b();
                return;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: biaa.a(biab, boolean):void
     arg types: [biab, int]
     candidates:
      biaa.a(java.util.Collection, java.util.Collection):void
      biaa.a(biab, boolean):void */
    /* renamed from: b */
    public final void mo64477b(biab biab) {
        m101827a(biab, true);
        m101828b();
    }

    /* renamed from: a */
    private final void m101825a(int i) {
        bhzw bhzw = this.f120008d;
        if (bhzw != null) {
            bhzw.mo64463a(i, 0, null);
        }
        bhzx bhzx = this.f120009e;
        if (bhzx != null) {
            bhzx.mo64472a(i, null, true);
        }
    }

    /* renamed from: a */
    private final void m101826a(int i, List list, Location location) {
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            ParcelableGeofence parcelableGeofence = (ParcelableGeofence) list.get(i2);
            for (bhzt bhzt : this.f120012h) {
                if (bhzt.f119990a.equals(parcelableGeofence.f79438a)) {
                    arrayList.add(bhzt);
                }
            }
            bhzt bhzt2 = this.f120014j;
            if (bhzt2 != null && bhzt2.f119990a.equals(parcelableGeofence.f79438a)) {
                z = true;
            }
            bhzt bhzt3 = this.f120015k;
            if (bhzt3 != null && bhzt3.f119990a.equals(parcelableGeofence.f79438a)) {
                z2 = true;
            }
        }
        if (this.f120008d == null) {
            if (Log.isLoggable("Places", 6)) {
                bioi.m102658a("Places", "No PlaceGeofenceEventListener is registered to PlaceGeofencer.");
            }
        } else if (!arrayList.isEmpty()) {
            this.f120008d.mo64463a(0, i, arrayList);
        } else if ((z || z2) && Log.isLoggable("Places", 4)) {
            StringBuilder sb = new StringBuilder(106);
            sb.append("Skipping call to PlaceGeofenceEventListener. Update fence triggered: ");
            sb.append(z);
            sb.append(", Refresh fence triggered: ");
            sb.append(z2);
            bioi.m102660b("Places", sb.toString());
        } else if (Log.isLoggable("Places", 5)) {
            bioi.m102662c("Places", "Geofences did not trigger any PlaceGeofences.");
        }
        if (z && i == 2) {
            mo64476a(Collections.emptyList(), Collections.emptyList());
        }
        if (z2 && i == 2) {
            bhzx bhzx = this.f120009e;
            if (bhzx != null) {
                bhzx.mo64472a(0, location, true);
            } else if (Log.isLoggable("Places", 6)) {
                bioi.m102658a("Places", "No RefreshPlaceGeofenceEventListener is registered to PlaceGeofencer.");
            }
        }
    }

    /* renamed from: a */
    private final void m101827a(biab biab, boolean z) {
        int i;
        int i2;
        int size = this.f120006b.size();
        if (z) {
            this.f120006b.clear();
            if (!biab.f120017a) {
                this.f120006b.addAll(biab.f120022f);
            }
        }
        if (!biab.f120017a) {
            i = biab.f120018b.size();
            i2 = biab.f120019c.size();
        } else {
            i = size;
            i2 = 0;
        }
        if (cgfr.f186745a.mo6606a().mo83644s()) {
            PlacesParams placesParams = PlacesParams.f79571a;
            int size2 = this.f120006b.size();
            int i3 = biab.f120020d.f30115i;
            bpqk c = bhqq.m101365c(11, placesParams);
            bxvd bxvd = (bxvd) c.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) c);
            bxvd da = bpql.f138757g.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpql bpql = (bpql) da.f164949b;
            int i4 = 1;
            int i5 = bpql.f138759a | 1;
            bpql.f138759a = i5;
            bpql.f138760b = size;
            int i6 = i5 | 2;
            bpql.f138759a = i6;
            bpql.f138761c = i2;
            int i7 = i6 | 4;
            bpql.f138759a = i7;
            bpql.f138762d = i;
            int i8 = i7 | 8;
            bpql.f138759a = i8;
            bpql.f138763e = size2;
            if (i3 != 0) {
                switch (i3) {
                    case 1000:
                        i4 = 1001;
                        break;
                    case 1001:
                        i4 = 1002;
                        break;
                    case 1002:
                        i4 = 1003;
                        break;
                    case 1003:
                        i4 = 1004;
                        break;
                    default:
                        i4 = 0;
                        break;
                }
            }
            if (i4 != 0) {
                bpql.f138764f = i4 - 1;
                bpql.f138759a = i8 | 16;
            }
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bpqk bpqk = (bpqk) bxvd.f164949b;
            bpql bpql2 = (bpql) da.mo74062i();
            bpqk bpqk2 = bpqk.f138732w;
            bpql2.getClass();
            bpqk.f138751r = bpql2;
            bpqk.f138734a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
            this.f120011g.mo64139a(bhqq.m101346a((bpqk) bxvd.mo74062i()));
        }
    }

    /* renamed from: a */
    public final void mo64473a() {
        if (this.f120015k != null) {
            this.f120015k = null;
            mo64476a(Collections.emptyList(), Collections.emptyList());
        }
    }

    /* renamed from: a */
    public final void mo64455a(aehl aehl) {
        if (aehl.mo34148a()) {
            int i = aehl.f63402a;
            if (i == 1000) {
                List list = aehl.f63404c;
                if (list != null) {
                    m101826a(8, list, aehl.f63405d);
                }
                m101825a(9102);
            } else if (i == 1003) {
                List list2 = aehl.f63404c;
                if (list2 != null) {
                    m101826a(8, list2, aehl.f63405d);
                }
                m101825a((int) ErrorInfoFactory.STATUS_CODE_SERVER_OVERCROWDING);
            } else if (Log.isLoggable("Places", 5)) {
                int i2 = aehl.f63402a;
                StringBuilder sb = new StringBuilder(49);
                sb.append("Received unknown error from geofence: ");
                sb.append(i2);
                bioi.m102662c("Places", sb.toString());
            }
        } else {
            List list3 = aehl.f63404c;
            if (list3 != null) {
                m101826a(aehl.f63403b, list3, aehl.f63405d);
            }
        }
    }

    /* renamed from: a */
    public final void mo64457a(Location location, bhwr bhwr, boolean z, bhtr bhtr) {
        if (location != null) {
            LatLng latLng = new LatLng(location.getLatitude(), location.getLongitude());
            if (this.f120015k != null && this.f120009e != null && cgfr.f186745a.mo6606a().mo83647v() && Double.valueOf(aepo.m52350a(latLng, this.f120015k.f119991b)).doubleValue() > cgfr.f186745a.mo6606a().mo83622J()) {
                if (Log.isLoggable("Places", 4)) {
                    Log.i("Places", String.format("Using passive location updates to trigger refresh geofence. Fence was centered at: %s, Location update reported at: %s.", this.f120015k.f119991b, latLng));
                }
                this.f120009e.mo64472a(0, location, false);
                if (cgfl.m145006b()) {
                    this.f120011g.mo64139a(bhqq.m101346a(bhqq.m101363b(4, PlacesParams.f79571a)));
                }
            }
            if (this.f120014j != null && cgfr.f186745a.mo6606a().mo83648w() && Double.valueOf(aepo.m52350a(latLng, this.f120014j.f119991b)).doubleValue() > ((double) this.f120014j.f119992c)) {
                if (Log.isLoggable("Places", 4)) {
                    Log.i("Places", String.format("Using passive location updates to trigger update geofence. Fence was centered at: %s, Location update reported at: %s.", this.f120014j.f119991b, latLng));
                }
                mo64476a(Collections.emptyList(), Collections.emptyList());
            }
        } else if (Log.isLoggable("Places", 5)) {
            Log.w("Places", "PlaceGeofencer ignoring null location from SignalManager.");
        }
    }

    /* renamed from: a */
    public final void mo64474a(bhzt bhzt) {
        sdo.m34959a(bhzt);
        this.f120015k = bhzt;
        mo64476a(Collections.emptyList(), Collections.emptyList());
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [java.util.List, java.util.Collection], assign insn: 0x0019: IGET  (r13v1 ? I:java.util.Collection) = (r13v0 biab) biab.h java.util.Collection */
    /* renamed from: a */
    public final void mo64475a(biab biab) {
        float f;
        int i;
        if (!biab.f120024h.isEmpty()) {
            bhzu bhzu = new bhzu(this, biab);
            ArrayList arrayList = new ArrayList(biab.f120024h.size());
            ? r13 = biab.f120024h;
            int size = r13.size();
            for (int i2 = 0; i2 < size; i2++) {
                bhzt bhzt = (bhzt) r13.get(i2);
                aehf aehf = new aehf();
                LatLng latLng = bhzt.f119991b;
                float f2 = bhzt.f119992c;
                if (f2 <= 0.0f) {
                    f = (float) cgfr.m145051f();
                } else {
                    f = f2;
                }
                aehf.mo34146a(latLng.f79894a, latLng.f79895b, f);
                aehf.f63388a = bhzt.f119990a;
                aehf.mo34147b();
                int i3 = bhzt.f119994e;
                if (i3 > 0) {
                    aehf.f63392e = i3;
                    i = 7;
                } else {
                    i = 3;
                }
                aehf.f63389b = i;
                aehf.f63391d = (int) cgfr.f186745a.mo6606a().mo83640o();
                arrayList.add(aehf.mo34145a());
            }
            bigx bigx = this.f120005a;
            aehm aehm = new aehm();
            aehm.mo34152a(arrayList);
            aehm.mo34153b(5);
            aehm.mo34151a("places");
            rkb rkb = bigx.f120561k;
            int size2 = arrayList.size();
            StringBuilder sb = new StringBuilder(25);
            sb.append("Add ");
            sb.append(size2);
            sb.append(" geofences");
            sb.toString();
            rkb.mo24790a((rjz) new bign(bigx, rkb, aehm, bhzu));
            return;
        }
        biab.f120020d = new Status(0);
        mo64477b(biab);
    }

    /* renamed from: a */
    public final void mo64476a(Collection collection, Collection collection2) {
        biab a = biab.m101839a(collection, collection2);
        if (this.f120016l == null) {
            this.f120016l = a;
            m101829d(a);
            return;
        }
        this.f120013i.add(a);
    }
}
