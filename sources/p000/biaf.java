package p000;

import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.userlocation.UserLocationNearbyAlertFilter;
import com.google.android.gms.userlocation.UserLocationNearbyAlertRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* renamed from: biaf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biaf implements bhzx, bigv {

    /* renamed from: a */
    public final biaa f120032a;

    /* renamed from: b */
    public biae f120033b;

    /* renamed from: c */
    public int f120034c = -1;

    /* renamed from: d */
    public bhzt f120035d;

    /* renamed from: e */
    public LatLngBounds f120036e;

    /* renamed from: f */
    private final Handler f120037f;

    /* renamed from: g */
    private final bigx f120038g;

    /* renamed from: h */
    private final bhpt f120039h;

    /* renamed from: i */
    private float f120040i;

    /* renamed from: j */
    private Runnable f120041j;

    /* renamed from: k */
    private boolean f120042k;

    /* renamed from: l */
    private final bhwm f120043l;

    public biaf(Handler handler, bigx bigx, biaa biaa, bhwm bhwm, bhpt bhpt) {
        this.f120037f = handler;
        this.f120038g = bigx;
        this.f120032a = biaa;
        this.f120043l = bhwm;
        this.f120039h = bhpt;
    }

    /* renamed from: b */
    private final void m101841b() {
        if (this.f120035d != null && this.f120034c == 110) {
            this.f120032a.mo64473a();
        }
        this.f120035d = null;
        this.f120036e = null;
    }

    /* renamed from: a */
    public final void mo64483a() {
        this.f120037f.removeCallbacks(this.f120041j);
        m101841b();
        this.f120042k = false;
        this.f120032a.f120009e = null;
        this.f120038g.mo64605b(this);
    }

    /* renamed from: a */
    public final void mo64455a(aehl aehl) {
    }

    /* renamed from: a */
    public final void mo64458a(bhtu bhtu) {
    }

    /* renamed from: a */
    public final void mo64484a(int i) {
        bhzt bhzt;
        int i2 = this.f120034c;
        if (i != i2) {
            if (i2 == 100) {
                this.f120038g.mo64605b(this);
            } else if (i2 == 110 && this.f120035d != null) {
                this.f120032a.mo64473a();
            }
            this.f120034c = i;
            if (i == 100) {
                this.f120038g.mo64603a(this);
            } else if (i == 110 && (bhzt = this.f120035d) != null) {
                this.f120032a.mo64474a(bhzt);
            }
        }
    }

    /* renamed from: a */
    public final void mo64472a(int i, Location location, boolean z) {
        if (this.f120035d == null) {
            if (Log.isLoggable("Places", 5)) {
                bioi.m102662c("Places", "Ignoring RefreshPlaceGeofenceEvent: no refresh geofence is set.");
            }
        } else if (i == 0) {
            if (!cgfr.f186745a.mo6606a().mo83651z() || !z) {
                if (Log.isLoggable("Places", 4)) {
                    bioi.m102660b("Places", "NearbyAlerts refresh bounds exited, updating bounds now.");
                }
                mo64486a(location);
                if (cgfl.m145006b()) {
                    this.f120039h.mo64139a(bhqq.m101346a(bhqq.m101363b(2, PlacesParams.f79571a)));
                }
            } else if (Log.isLoggable("Places", 5)) {
                bioi.m102662c("Places", "Ignoring RefreshPlaceGeofenceEvent: flagged off.");
            }
        } else if (i == 9101) {
            this.f120032a.mo64473a();
            mo64486a((Location) null);
        } else if (Log.isLoggable("Places", 5)) {
            StringBuilder sb = new StringBuilder(59);
            sb.append("Ignoring RefreshPlaceGeofenceEvent with status: ");
            sb.append(i);
            bioi.m102662c("Places", sb.toString());
        }
    }

    /* renamed from: a */
    public final void mo64485a(long j, Location location) {
        String str;
        String str2;
        String str3;
        ArrayList arrayList;
        String str4;
        long j2 = j;
        if (this.f120036e == null) {
            Location a = location == null ? this.f120038g.mo64601a() : location;
            if (a != null) {
                LatLng latLng = new LatLng(a.getLatitude(), a.getLongitude());
                float q = (float) cgfr.f186745a.mo6606a().mo83642q();
                this.f120040i = q;
                this.f120036e = aepo.m52351a(latLng, (double) q);
                bhzt bhzt = new bhzt(latLng, this.f120040i);
                this.f120035d = bhzt;
                if (this.f120034c == 110) {
                    this.f120032a.mo64474a(bhzt);
                }
                biae biae = this.f120033b;
                if (biae != null) {
                    LatLngBounds latLngBounds = this.f120036e;
                    bhxl bhxl = (bhxl) biae;
                    ArrayList arrayList2 = new ArrayList(bhxl.f119826e.size());
                    ArrayList arrayList3 = new ArrayList(bhxl.f119826e.size());
                    for (bhxn bhxn : bhxl.f119826e.keySet()) {
                        UserLocationNearbyAlertFilter userLocationNearbyAlertFilter = bhxn.f119830b.f109594c;
                        if (!userLocationNearbyAlertFilter.f109588a.isEmpty()) {
                            bhxl.f119823b.mo64412a(bhxn, bhxl.f119822a.f120036e);
                        } else if (!userLocationNearbyAlertFilter.f109591d) {
                            if (userLocationNearbyAlertFilter.f109589b.isEmpty()) {
                                if (cgfr.f186745a.mo6606a().mo83649x()) {
                                    arrayList3.add(bhxn);
                                } else {
                                    arrayList2.add(bhxn);
                                }
                            } else if (!cgfr.f186745a.mo6606a().mo83636k()) {
                                bhxl.f119823b.mo64412a(bhxn, bhxl.f119822a.f120036e);
                            } else {
                                arrayList3.add(bhxn);
                            }
                        } else if (!cgfr.f186745a.mo6606a().mo83635j()) {
                            bhxl.f119823b.mo64412a(bhxn, bhxl.f119822a.f120036e);
                        } else {
                            arrayList3.add(bhxn);
                        }
                    }
                    String str5 = "";
                    if (!arrayList2.isEmpty()) {
                        bhyd bhyd = bhxl.f119823b;
                        LatLngBounds latLngBounds2 = bhxl.f119822a.f120036e;
                        C1245ok okVar = new C1245ok();
                        ArrayList arrayList4 = new ArrayList(arrayList2.size());
                        int size = arrayList2.size();
                        int i = 0;
                        while (i < size) {
                            bhxn bhxn2 = (bhxn) arrayList2.get(i);
                            if (bhyd.f119870a.add(bhxn2)) {
                                if (!TextUtils.isEmpty(bhxn2.mo64392a().f79574d)) {
                                    str4 = bhxn2.mo64392a().f79574d;
                                } else {
                                    str4 = str5;
                                }
                                if (okVar.containsKey(str4)) {
                                    ((List) okVar.get(str4)).add(bhxn2);
                                    arrayList = arrayList2;
                                    str3 = str5;
                                } else {
                                    arrayList = arrayList2;
                                    str3 = str5;
                                    okVar.put(str4, new ArrayList(Arrays.asList(bhxn2)));
                                }
                                arrayList4.add(bhxn2);
                            } else {
                                arrayList = arrayList2;
                                str3 = str5;
                            }
                            i++;
                            arrayList2 = arrayList;
                            str5 = str3;
                        }
                        str = str5;
                        if (!cgga.m145169b()) {
                            new bhxt(bhyd, "", arrayList4, latLngBounds2, cgfr.m145054i()).mo64401b();
                        } else {
                            int i2 = 0;
                            while (i2 < okVar.f26809h) {
                                new bhxt(bhyd, (String) okVar.mo15620b(i2), (List) okVar.mo15621c(i2), latLngBounds2, cgfr.m145054i()).mo64401b();
                                i2++;
                                latLngBounds2 = latLngBounds2;
                                okVar = okVar;
                            }
                        }
                    } else {
                        str = str5;
                    }
                    if (!arrayList3.isEmpty()) {
                        bhyd bhyd2 = bhxl.f119823b;
                        LatLngBounds latLngBounds3 = bhxl.f119822a.f120036e;
                        C1245ok okVar2 = new C1245ok();
                        ArrayList arrayList5 = new ArrayList(arrayList3.size());
                        int size2 = arrayList3.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            bhxn bhxn3 = (bhxn) arrayList3.get(i3);
                            if (bhyd2.f119870a.add(bhxn3)) {
                                if (!TextUtils.isEmpty(bhxn3.mo64392a().f79574d)) {
                                    str2 = bhxn3.mo64392a().f79574d;
                                } else {
                                    str2 = str;
                                }
                                if (okVar2.containsKey(str2)) {
                                    ((List) okVar2.get(str2)).add(bhxn3);
                                } else {
                                    okVar2.put(str2, new ArrayList(Arrays.asList(bhxn3)));
                                }
                                arrayList5.add(bhxn3);
                            }
                        }
                        if (!cgga.m145169b()) {
                            new bhxw(bhyd2, "", arrayList5, latLngBounds3, cgfr.m145054i()).mo64405b();
                        } else {
                            for (int i4 = 0; i4 < okVar2.f26809h; i4++) {
                                new bhxw(bhyd2, (String) okVar2.mo15620b(i4), (List) okVar2.mo15621c(i4), latLngBounds3, cgfr.m145054i()).mo64405b();
                            }
                        }
                    }
                    if (cgfr.f186745a.mo6606a().mo83623K()) {
                        ArrayList arrayList6 = new ArrayList();
                        for (bhxn bhxn4 : bhxl.f119826e.keySet()) {
                            for (bhye bhye : (List) bhxl.f119826e.get(bhxn4)) {
                                bhzs bhzs = bhye.f119880a;
                                if (!latLngBounds.mo43871a(new LatLng(bhzs.f119986b, bhzs.f119987c))) {
                                    HashSet hashSet = new HashSet();
                                    hashSet.add(bhye.f119880a);
                                    UserLocationNearbyAlertRequest userLocationNearbyAlertRequest = bhxn4.f119830b;
                                    int i5 = userLocationNearbyAlertRequest.f109596e;
                                    int i6 = userLocationNearbyAlertRequest.f109593b;
                                    UserLocationNearbyAlertFilter userLocationNearbyAlertFilter2 = userLocationNearbyAlertRequest.f109594c;
                                    arrayList6.add(new bhzp(hashSet, 2, i5, i6, userLocationNearbyAlertFilter2.f109590c, userLocationNearbyAlertFilter2.f109591d));
                                }
                            }
                        }
                        int size3 = arrayList6.size();
                        for (int i7 = 0; i7 < size3; i7++) {
                            bhxl.mo64389a(0, (bhzp) arrayList6.get(i7), (Bundle) null);
                        }
                    }
                }
                this.f120042k = false;
                return;
            }
            biad biad = new biad(this, Math.min(cgfr.m145056k() * j2, cgfr.m145055j()));
            this.f120041j = biad;
            this.f120037f.postDelayed(biad, j2);
        }
    }

    /* renamed from: a */
    public final void mo64486a(Location location) {
        if (!this.f120042k) {
            this.f120042k = true;
            m101841b();
            mo64485a(cgfr.m145054i(), location);
        }
    }

    /* renamed from: a */
    public final void mo64457a(Location location, bhwr bhwr, boolean z, bhtr bhtr) {
        float f;
        String str;
        String str2;
        if (cgfr.f186745a.mo6606a().mo83646u()) {
            long time = location.getTime();
            int latitude = (int) (location.getLatitude() * 1.0E7d);
            int longitude = (int) (location.getLongitude() * 1.0E7d);
            double accuracy = (double) location.getAccuracy();
            Double.isNaN(accuracy);
            int i = (int) (accuracy * 1000.0d);
            if (location.hasAltitude()) {
                f = (float) location.getAltitude();
            } else {
                f = Float.NaN;
            }
            Bundle extras = location.getExtras();
            if (extras == null) {
                str = "unknown";
            } else {
                int i2 = extras.getInt("locationType", 0);
                if (i2 == 1) {
                    str2 = "gps";
                } else if (i2 == 2) {
                    str2 = "cell";
                } else if (i2 != 3) {
                    str = "unknown";
                } else {
                    str2 = "wifi";
                }
                str = str2;
            }
            if (((double) this.f120043l.mo64357a(new bhtx(new bhub(latitude, longitude, i, f, str, time, location.hasSpeed() ? location.getSpeed() : -1.0f), bhwr, null, bhtr, z, false)).f119601a) > cgfr.f186745a.mo6606a().mo83638m()) {
                return;
            }
        }
        if (this.f120036e == null) {
            if (this.f120042k) {
                this.f120042k = false;
            }
            mo64486a(location);
            if (cgfl.m145006b()) {
                this.f120039h.mo64139a(bhqq.m101346a(bhqq.m101363b(3, PlacesParams.f79571a)));
            }
        } else if (this.f120034c == 100 && Double.valueOf(aepo.m52350a(new LatLng(location.getLatitude(), location.getLongitude()), this.f120036e.mo43870a())).doubleValue() > ((double) this.f120040i)) {
            mo64486a(location);
            if (cgfl.m145006b()) {
                this.f120039h.mo64139a(bhqq.m101346a(bhqq.m101363b(5, PlacesParams.f79571a)));
            }
        }
    }
}
