package p000;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.location.places.fencing.PlaceIdCollection;
import com.google.android.gms.location.places.fencing.PlacefencingFilter;
import com.google.android.gms.location.places.fencing.PlacefencingRequest;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.userlocation.UserLocationNearbyAlertFilter;
import com.google.android.gms.userlocation.UserLocationNearbyAlertRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: bico */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bico implements bhqe, bhxm, bhqx {

    /* renamed from: e */
    private static final String[] f120223e = {"android:monitor_location"};

    /* renamed from: a */
    public final bhpw f120224a;

    /* renamed from: b */
    public final int f120225b;

    /* renamed from: c */
    public final String f120226c;

    /* renamed from: d */
    public final PlacefencingRequest f120227d;

    /* renamed from: f */
    private final bicn f120228f;

    /* renamed from: g */
    private final HashSet f120229g = new HashSet();

    /* renamed from: h */
    private final HashSet f120230h = new HashSet();

    /* renamed from: i */
    private final HashSet f120231i = new HashSet();

    /* renamed from: j */
    private final HashSet f120232j = new HashSet();

    public bico(bhpw bhpw, int i, String str, bicn bicn, PlacefencingRequest placefencingRequest) {
        this.f120224a = bhpw;
        this.f120225b = i;
        this.f120226c = str;
        this.f120228f = bicn;
        this.f120227d = placefencingRequest;
    }

    /* renamed from: a */
    public final bhxn mo64522a(bhxm bhxm, UserLocationNearbyAlertRequest userLocationNearbyAlertRequest) {
        return new bhxn(this.f120224a.f119279a, this.f120225b, this.f120226c, bhxm, userLocationNearbyAlertRequest, userLocationNearbyAlertRequest.f109595d);
    }

    /* renamed from: a */
    public final PlacesParams mo62993a() {
        return ((bicp) this.f120228f).f120235c.f151359b;
    }

    /* renamed from: b */
    public final void mo64158b() {
        List<bhxn> list;
        bicm bicm = this.f120224a.f119281c;
        if (!bicm.f120221a.containsKey(this)) {
            PlacefencingRequest placefencingRequest = this.f120227d;
            PlacefencingFilter placefencingFilter = placefencingRequest.f79511b;
            int i = placefencingRequest.f79515f;
            int i2 = i + i;
            int i3 = (placefencingRequest.f79512c & 12) == 0 ? 3 : 7;
            if (!placefencingFilter.f79509c.isEmpty()) {
                list = new ArrayList(placefencingFilter.f79509c.size());
                for (String str : placefencingFilter.f79509c) {
                    if (!TextUtils.isEmpty(str)) {
                        list.add(mo64522a(this, UserLocationNearbyAlertRequest.m93775a(i3, new UserLocationNearbyAlertFilter(null, null, str, false), i2, false, 0, 110)));
                    } else {
                        throw new IllegalArgumentException("Filter must contain a non empty chain name to match results with.");
                    }
                }
            } else if (!placefencingFilter.f79507a.isEmpty()) {
                list = new ArrayList(1);
                HashSet<String> hashSet = new HashSet();
                for (PlaceIdCollection placeIdCollection : placefencingFilter.f79507a) {
                    hashSet.addAll(placeIdCollection.f79506a);
                }
                ArrayList arrayList = new ArrayList(hashSet.size());
                for (String str2 : hashSet) {
                    if (!TextUtils.isEmpty(str2)) {
                        arrayList.add(str2);
                    }
                }
                if (!arrayList.isEmpty()) {
                    list.add(mo64522a(this, UserLocationNearbyAlertRequest.m93775a(i3, new UserLocationNearbyAlertFilter(arrayList, null, null, false), i2, false, 0, 110)));
                } else {
                    throw new IllegalArgumentException("Filter must contain at least one place ID to match results with.");
                }
            } else if (!placefencingFilter.f79508b.isEmpty()) {
                list = new ArrayList(1);
                list.add(mo64522a(this, UserLocationNearbyAlertRequest.m93775a(i3, UserLocationNearbyAlertFilter.m93774a(placefencingFilter.f79508b), i2, false, 0, 110)));
            } else {
                if (Log.isLoggable("Places", 5)) {
                    bioi.m102662c("Places", "Unknown placefencing request type. Failed to create nearby alert request");
                }
                list = Collections.emptyList();
            }
            bicm.f120221a.put(this, list);
            for (bhxn bhxn : list) {
                bhxn.mo64158b();
            }
        }
    }

    /* renamed from: c */
    public final void mo64159c() {
        bicm bicm = this.f120224a.f119281c;
        bicm.mo64520b(this);
        List<bhxn> list = (List) bicm.f120221a.remove(this);
        if (list != null) {
            for (bhxn bhxn : list) {
                bhxn.mo64159c();
            }
        }
    }

    /* renamed from: j */
    public final int mo9757j() {
        return this.f120225b;
    }

    /* renamed from: k */
    public final String mo9758k() {
        return this.f120226c;
    }

    /* renamed from: l */
    public final String mo9759l() {
        return null;
    }

    /* renamed from: m */
    public final String[] mo9760m() {
        return f120223e;
    }

    /* renamed from: n */
    public final boolean mo9761n() {
        return false;
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("client", this.f120226c);
        a.mo25396a("requestId", this.f120227d.f79510a);
        a.mo25396a("confidence", Integer.valueOf(this.f120227d.f79514e));
        if (!this.f120229g.isEmpty()) {
            a.mo25396a("nearbyEntered", this.f120229g);
        }
        if (!this.f120230h.isEmpty()) {
            a.mo25396a("nearbyDwelled", this.f120230h);
        }
        if (!this.f120231i.isEmpty()) {
            a.mo25396a("puEntered", this.f120231i);
        }
        if (!this.f120232j.isEmpty()) {
            a.mo25396a("puDwelled", this.f120232j);
        }
        return a.toString();
    }

    /* renamed from: a */
    public final void mo62994a(int i, int i2, List list, Bundle bundle) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (i2 != 0) {
            arrayList.addAll(this.f120229g);
            this.f120229g.clear();
            this.f120230h.clear();
            i = 2;
        } else if (i == 1) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                String str = ((bhzs) list.get(i3)).f119985a;
                if (this.f120229g.add(str)) {
                    arrayList.add(str);
                }
            }
        } else if (i == 4) {
            int size2 = list.size();
            for (int i4 = 0; i4 < size2; i4++) {
                String str2 = ((bhzs) list.get(i4)).f119985a;
                if (this.f120230h.add(str2)) {
                    arrayList.add(str2);
                }
            }
        } else if (i == 2) {
            int size3 = list.size();
            for (int i5 = 0; i5 < size3; i5++) {
                String str3 = ((bhzs) list.get(i5)).f119985a;
                if (this.f120229g.remove(str3)) {
                    arrayList.add(str3);
                }
                if (this.f120230h.remove(str3)) {
                    arrayList2.add(str3);
                }
            }
        }
        if (this.f120227d.f79514e == 0) {
            if (!arrayList2.isEmpty() && this.f120227d.mo43668a(8)) {
                this.f120228f.mo64521a(i2, 8, this.f120227d.f79510a, arrayList2);
            }
            if (!arrayList.isEmpty() && this.f120227d.mo43668a(i)) {
                this.f120228f.mo64521a(i2, i, this.f120227d.f79510a, arrayList);
            }
        }
        if (!arrayList.isEmpty() && this.f120227d.f79514e > 0 && i == 2) {
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            int size4 = arrayList.size();
            for (int i6 = 0; i6 < size4; i6++) {
                String str4 = (String) arrayList.get(i6);
                if (this.f120231i.remove(str4)) {
                    arrayList3.add(str4);
                }
                if (this.f120232j.remove(str4)) {
                    arrayList4.add(str4);
                }
            }
            if (!arrayList4.isEmpty() && this.f120227d.mo43668a(8)) {
                this.f120228f.mo64521a(i2, 8, this.f120227d.f79510a, arrayList4);
            }
            if (!arrayList3.isEmpty() && this.f120227d.mo43668a(2)) {
                this.f120228f.mo64521a(i2, 2, this.f120227d.f79510a, arrayList3);
            }
        }
        if (!arrayList.isEmpty() && this.f120227d.f79514e > 0 && i == 4) {
            ArrayList arrayList5 = new ArrayList();
            int size5 = arrayList.size();
            for (int i7 = 0; i7 < size5; i7++) {
                String str5 = (String) arrayList.get(i7);
                if (this.f120231i.contains(str5) && this.f120232j.add(str5)) {
                    arrayList5.add(str5);
                }
            }
            if (!arrayList5.isEmpty() && this.f120227d.mo43668a(4)) {
                this.f120228f.mo64521a(i2, 4, this.f120227d.f79510a, arrayList5);
            }
        }
        if (this.f120227d.f79514e > 0 && !arrayList.isEmpty()) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 4) {
                        this.f120224a.f119281c.mo64519a(this);
                    }
                } else if (this.f120229g.isEmpty() || (this.f120230h.isEmpty() && this.f120227d.mo43667a())) {
                    this.f120224a.f119281c.mo64520b(this);
                }
            } else if (!this.f120227d.mo43667a()) {
                this.f120224a.f119281c.mo64519a(this);
            }
        }
    }

    /* renamed from: a */
    public final void mo64174a(bhqz bhqz) {
        double d;
        int i;
        int i2 = bhqz.f119365g;
        List<bhqh> list = bhqz.f119361c.f119318b;
        if (i2 == 0 && list != null && !list.isEmpty()) {
            int i3 = this.f120227d.f79514e;
            if (i3 == 1) {
                i = (int) cgga.f186804a.mo6606a().mo83673e();
                d = cgga.f186804a.mo6606a().mo83677i();
            } else if (i3 == 2) {
                i = (int) cgga.f186804a.mo6606a().mo83671c();
                d = cgga.f186804a.mo6606a().mo83675g();
            } else if (i3 == 3) {
                i = (int) cgga.f186804a.mo6606a().mo83672d();
                d = cgga.f186804a.mo6606a().mo83676h();
            } else if (i3 == 4) {
                i = (int) cgga.f186804a.mo6606a().mo83674f();
                d = cgga.f186804a.mo6606a().mo83678j();
            } else {
                return;
            }
            HashSet<String> hashSet = new HashSet();
            int i4 = 0;
            for (bhqh bhqh : list) {
                i4++;
                if (i4 > i) {
                    break;
                } else if (this.f120229g.contains(bhqh.f119308b) && ((double) bhqh.f119311e) > d) {
                    hashSet.add(bhqh.f119308b);
                }
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            Iterator it = this.f120231i.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!hashSet.contains(str)) {
                    arrayList.add(str);
                }
            }
            this.f120231i.removeAll(arrayList);
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                String str2 = (String) arrayList.get(i5);
                if (this.f120232j.remove(str2)) {
                    arrayList4.add(str2);
                }
            }
            for (String str3 : hashSet) {
                if (this.f120229g.contains(str3) && this.f120231i.add(str3)) {
                    arrayList2.add(str3);
                }
                if (this.f120230h.contains(str3) && this.f120232j.add(str3)) {
                    arrayList3.add(str3);
                }
            }
            if (!arrayList2.isEmpty() && this.f120227d.mo43668a(1)) {
                this.f120228f.mo64521a(0, 1, this.f120227d.f79510a, arrayList2);
            }
            if (!arrayList3.isEmpty() && this.f120227d.mo43668a(4)) {
                this.f120228f.mo64521a(0, 4, this.f120227d.f79510a, arrayList3);
            }
            if (!arrayList4.isEmpty() && this.f120227d.mo43668a(8)) {
                this.f120228f.mo64521a(0, 8, this.f120227d.f79510a, arrayList4);
            }
            if (!arrayList.isEmpty() && this.f120227d.mo43668a(2)) {
                this.f120228f.mo64521a(0, 2, this.f120227d.f79510a, arrayList);
            }
        }
    }
}
