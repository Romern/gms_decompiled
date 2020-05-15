package p000;

import android.os.Bundle;
import android.util.Log;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.maps.model.LatLng;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: bhzo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhzo extends bhzr implements bhzw {

    /* renamed from: b */
    private final biaa f119972b;

    /* renamed from: c */
    private final Bundle f119973c;

    /* renamed from: d */
    private final bhzp f119974d = new bhzp(Collections.emptySet(), 0, 0, 0, null, false);

    /* renamed from: e */
    private final Map f119975e;

    /* renamed from: f */
    private final Map f119976f;

    /* renamed from: g */
    private boolean f119977g;

    public bhzo(bhzq bhzq, biaa biaa) {
        super(bhzq);
        this.f119972b = biaa;
        biaa.f120008d = this;
        this.f119975e = new HashMap();
        this.f119976f = new HashMap();
        Bundle bundle = new Bundle();
        this.f119973c = bundle;
        bundle.putString("nearby_alert_module_name", "Geofencing");
    }

    /* renamed from: a */
    public final void mo64454a() {
        this.f119977g = true;
    }

    /* renamed from: b */
    public final void mo64461b() {
        this.f119977g = false;
        HashSet hashSet = new HashSet();
        for (List list : this.f119975e.values()) {
            hashSet.addAll(list);
        }
        this.f119972b.mo64476a(hashSet, Collections.EMPTY_SET);
        this.f119972b.f120008d = null;
        this.f119975e.clear();
        this.f119976f.clear();
    }

    /* JADX WARN: Type inference failed for: r22v0, types: [java.util.List, java.util.Collection], assign insn: null */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public final void mo64463a(int i, int i2, Collection r22) {
        String str;
        int i3 = i;
        int i4 = i2;
        List list = r22;
        if (!this.f119977g) {
            return;
        }
        if (i3 != 0) {
            this.f119984a.mo64389a(i3, this.f119974d, this.f119973c);
        } else if (list != null && !r22.isEmpty()) {
            int i5 = 8;
            if (i4 == 1) {
                i5 = 1;
            } else if (i4 == 2) {
                i5 = 2;
            } else if (i4 == 4) {
                i5 = 4;
            } else if (i4 != 8) {
                i5 = 0;
            }
            if (i5 != 0) {
                int size = r22.size();
                for (int i6 = 0; i6 < size; i6++) {
                    bhzt bhzt = (bhzt) list.get(i6);
                    Iterator it = this.f119975e.keySet().iterator();
                    String str2 = null;
                    while (true) {
                        if (!it.hasNext()) {
                            str = str2;
                            break;
                        }
                        String str3 = (String) it.next();
                        Iterator it2 = ((List) this.f119975e.get(str3)).iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (((bhzt) it2.next()).equals(bhzt)) {
                                    str2 = str3;
                                    continue;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        if (str2 != null) {
                            str = str2;
                            break;
                        }
                    }
                    if (str != null) {
                        LatLng latLng = bhzt.f119991b;
                        bhzs bhzs = new bhzs(str, latLng.f79894a, latLng.f79895b, bhzt.f119992c, bhzt.f119993d);
                        HashSet hashSet = new HashSet();
                        hashSet.add(bhzs);
                        this.f119984a.mo64389a(0, new bhzp(hashSet, i5, bhzt.f119995f, bhzt.f119994e, bhzt.f119996g, bhzt.f119997h), this.f119973c);
                    } else if (Log.isLoggable("Places", 5)) {
                        Log.w("Places", "Ignoring PlaceGeofence, no matching place found for alert");
                    }
                }
            } else if (Log.isLoggable("Places", 5)) {
                StringBuilder sb = new StringBuilder(56);
                sb.append("Ignoring geofence alert, unknown event type: ");
                sb.append(i4);
                Log.w("Places", sb.toString());
            }
        }
    }

    /* renamed from: b */
    public final void mo64462b(bhzp bhzp) {
        bhzt bhzt;
        Set<bhzs> set = bhzp.f119978a;
        if (set != null && !set.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (bhzs bhzs : set) {
                arrayList.add(bhzs.f119985a);
            }
            ArrayList arrayList2 = new ArrayList();
            HashSet hashSet = new HashSet();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                String str = (String) arrayList.get(i);
                if (this.f119975e.containsKey(str)) {
                    Iterator it = ((List) this.f119975e.get(str)).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            bhzt = null;
                            break;
                        }
                        bhzt = (bhzt) it.next();
                        if (bhzt.f119994e == bhzp.f119981d && bhzt.f119995f == bhzp.f119980c && sdg.m34949a(bhzt.f119996g, bhzp.f119982e)) {
                            break;
                        }
                    }
                    if (bhzt != null) {
                        arrayList2.add(bhzt);
                        List list = (List) this.f119975e.get(str);
                        if (list.size() > 1) {
                            list.remove(bhzt);
                            this.f119975e.put(str, new ArrayList(list));
                        } else {
                            this.f119975e.remove(str);
                        }
                    }
                }
            }
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                bhzt bhzt2 = (bhzt) arrayList2.get(i2);
                if (this.f119976f.containsKey(bhzt2)) {
                    if (((Integer) this.f119976f.get(bhzt2)).intValue() == 1) {
                        this.f119976f.remove(bhzt2);
                        hashSet.add(bhzt2);
                    } else {
                        Map map = this.f119976f;
                        map.put(bhzt2, Integer.valueOf(((Integer) map.get(bhzt2)).intValue() - 1));
                    }
                }
            }
            if (!hashSet.isEmpty()) {
                this.f119972b.mo64476a(hashSet, Collections.emptySet());
            }
        }
    }

    /* renamed from: a */
    public final void mo64459a(bhzp bhzp) {
        Set<bhzs> set = bhzp.f119978a;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (bhzs bhzs : set) {
            bhzt bhzt = new bhzt(new LatLng(bhzs.f119986b, bhzs.f119987c), bhzs.f119988d, bhzp.f119981d, bhzp.f119980c, bhzp.f119982e, bhzp.f119983f, bhzs.f119989e);
            arrayList.add(bhzt);
            if (this.f119975e.containsKey(bhzs.f119985a)) {
                ((List) this.f119975e.get(bhzs.f119985a)).add(bhzt);
            } else {
                this.f119975e.put(bhzs.f119985a, new ArrayList(Collections.singletonList(bhzt)));
            }
            if (this.f119976f.containsKey(bhzt)) {
                Map map = this.f119976f;
                map.put(bhzt, Integer.valueOf(((Integer) map.get(bhzt)).intValue() + 1));
            } else {
                this.f119976f.put(bhzt, 1);
                hashSet.add(bhzt);
            }
        }
        if (!hashSet.isEmpty()) {
            this.f119972b.mo64476a(Collections.emptySet(), hashSet);
        }
    }

    /* renamed from: a */
    public final void mo64460a(PrintWriter printWriter) {
        Map map = this.f119975e;
        if (map != null) {
            int size = map.size();
            StringBuilder sb = new StringBuilder((int) ErrorInfo.TYPE_SDU_MEMORY_FULL);
            sb.append("\nGeofenceNearbyAlertModule: tracking ");
            sb.append(size);
            sb.append(" places.\n (place ID -> number of tracked place geofences)");
            printWriter.println(sb.toString());
            for (String str : this.f119975e.keySet()) {
                printWriter.printf(String.format(Locale.US, "  %s -> %d\n", str, Integer.valueOf(((List) this.f119975e.get(str)).size())), new Object[0]);
            }
        }
        biaa biaa = this.f119972b;
        if (biaa != null) {
            printWriter.println("\nPlaceGeofencer:");
            int size2 = biaa.f120006b.size();
            StringBuilder sb2 = new StringBuilder(39);
            sb2.append("  Tracking ");
            sb2.append(size2);
            sb2.append(" PlaceGeofences: ");
            printWriter.println(sb2.toString());
            for (bhzt bhzt : biaa.f120006b) {
                printWriter.print("   ");
                printWriter.println(bhzt);
            }
        }
    }
}
