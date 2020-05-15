package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.userlocation.UserLocationNearbyAlertFilter;
import com.google.android.gms.userlocation.UserLocationNearbyAlertRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: bhxl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhxl implements biae, bhxo, bhzq {

    /* renamed from: a */
    public final biaf f119822a;

    /* renamed from: b */
    public final bhyd f119823b;

    /* renamed from: c */
    public final bhxk f119824c;

    /* renamed from: d */
    public volatile boolean f119825d = false;

    /* renamed from: e */
    public final Map f119826e;

    /* renamed from: f */
    public int f119827f;

    /* renamed from: g */
    private final bhpt f119828g;

    public bhxl(Context context, Handler handler, bigx bigx, bhwm bhwm, biam biam, bibq bibq, biak biak, bhqg bhqg, bhyi bhyi, bhpt bhpt) {
        bhyd bhyd = new bhyd(biam, bibq, biak, handler, bhqg, bhyi, bhpt);
        biaa biaa = new biaa(bigx, bhpt, spn.m35897i(context, "com.google.android.gms"));
        biaf biaf = new biaf(handler, bigx, biaa, bhwm, bhpt);
        bhxk bhxk = new bhxk(bigx, biaa);
        this.f119828g = bhpt;
        this.f119823b = bhyd;
        bhyd.f119878i = this;
        this.f119822a = biaf;
        biaf.f120033b = this;
        this.f119824c = bhxk;
        bhxk.f119816a = this;
        this.f119826e = new HashMap();
    }

    /* renamed from: a */
    private static final Bundle m101713a(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null && bundle.keySet().contains("nearby_alert_module_name")) {
            bundle2.putStringArray("nearby_alert_module_names", new String[]{bundle.getString("nearby_alert_module_name")});
        }
        return bundle2;
    }

    /* renamed from: a */
    private static final boolean m101716a(bhxn bhxn) {
        return (bhxn.f119830b.f109592a & 8) == 8;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo64391b(int i, bhzp bhzp, Bundle bundle) {
        if (!this.f119825d) {
            return;
        }
        if (i != 0) {
            for (bhxn bhxn : this.f119826e.keySet()) {
                m101715a(0, i, null, bhxn, bundle);
            }
            return;
        }
        Set set = bhzp.f119978a;
        if (set != null) {
            for (bhxn bhxn2 : this.f119826e.keySet()) {
                ArrayList arrayList = new ArrayList(set.size());
                for (bhye bhye : (List) this.f119826e.get(bhxn2)) {
                    if (set.contains(bhye.f119880a)) {
                        arrayList.add(bhye.f119880a);
                    }
                }
                if (!arrayList.isEmpty()) {
                    m101714a(bhzp.f119979b, bhzp.f119980c, bhzp.f119982e, bhzp.f119983f, arrayList, bhxn2, bundle);
                }
            }
        } else if (Log.isLoggable("Places", 5)) {
            bioi.m102662c("Places", "Ignoring unexpected nearby alert callback with successful statuscode but no triggered places.");
        }
    }

    /* renamed from: a */
    private final void m101714a(int i, int i2, String str, boolean z, List list, bhxn bhxn, Bundle bundle) {
        ArrayList arrayList = new ArrayList();
        UserLocationNearbyAlertRequest userLocationNearbyAlertRequest = bhxn.f119830b;
        if ((userLocationNearbyAlertRequest.f109592a & i) == i && userLocationNearbyAlertRequest.f109596e == i2) {
            UserLocationNearbyAlertFilter userLocationNearbyAlertFilter = userLocationNearbyAlertRequest.f109594c;
            if ((!userLocationNearbyAlertFilter.f109591d || z) && sdg.m34949a(userLocationNearbyAlertFilter.f109590c, str)) {
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    bhzs bhzs = (bhzs) list.get(i3);
                    UserLocationNearbyAlertFilter userLocationNearbyAlertFilter2 = bhxn.f119830b.f109594c;
                    if (userLocationNearbyAlertFilter2.f109588a.isEmpty() || userLocationNearbyAlertFilter2.f109588a.contains(bhzs.f119985a)) {
                        List list2 = userLocationNearbyAlertFilter2.f109589b;
                        if (!list2.isEmpty()) {
                            List list3 = bhzs.f119989e;
                            int size2 = list3.size();
                            int i4 = 0;
                            while (true) {
                                if (i4 >= size2) {
                                    break;
                                }
                                int i5 = i4 + 1;
                                if (list2.contains((Integer) list3.get(i4))) {
                                    break;
                                }
                                i4 = i5;
                            }
                        }
                        arrayList.add(bhzs);
                    }
                }
                arrayList.isEmpty();
            }
        }
        if (!arrayList.isEmpty()) {
            m101715a(i, 0, arrayList, bhxn, !bhxn.f119829a ? null : bundle);
        }
    }

    /* renamed from: a */
    private final void m101715a(int i, int i2, List list, bhxn bhxn, Bundle bundle) {
        int i3 = 3;
        if (!cgfr.f186745a.mo6606a().mo83643r()) {
            bhxn.f119831c.mo62994a(i, i2, list, bundle);
        } else if (Log.isLoggable("Places", 5)) {
            Log.w("Places", String.format(Locale.US, "Due to flag, forgoing Nearby Alert for %d places, with transition: %d and status: %d.", Integer.valueOf(list.size()), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        UserLocationNearbyAlertRequest userLocationNearbyAlertRequest = bhxn.f119830b;
        String str = userLocationNearbyAlertRequest.f109594c.f109590c;
        bpqk c = bhqq.m101365c(8, bhxn.mo64392a());
        bxvd bxvd = (bxvd) c.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) c);
        bxvd da = bpqv.f138790h.mo74144da();
        if (i == 1) {
            i3 = 2;
        } else if (i != 2) {
            i3 = i != 4 ? 1 : 5;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpqv bpqv = (bpqv) da.f164949b;
        bpqv.f138793b = i3 - 1;
        int i4 = bpqv.f138792a | 1;
        bpqv.f138792a = i4;
        int i5 = i4 | 2;
        bpqv.f138792a = i5;
        bpqv.f138794c = i2;
        int i6 = userLocationNearbyAlertRequest.f109593b;
        int i7 = 8 | i5;
        bpqv.f138792a = i7;
        bpqv.f138796e = (long) i6;
        UserLocationNearbyAlertFilter userLocationNearbyAlertFilter = userLocationNearbyAlertRequest.f109594c;
        if (userLocationNearbyAlertFilter != null) {
            boolean z = userLocationNearbyAlertFilter.f109591d;
            i7 |= 32;
            bpqv.f138792a = i7;
            bpqv.f138798g = z;
        }
        if (str != null) {
            str.getClass();
            bpqv.f138792a = i7 | 16;
            bpqv.f138797f = str;
        }
        int a = bhqq.m101344a(userLocationNearbyAlertRequest.f109596e);
        if (a != 0) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpqv bpqv2 = (bpqv) da.f164949b;
            bpqv2.f138795d = a - 1;
            bpqv2.f138792a |= 4;
        }
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpqk bpqk = (bpqk) bxvd.f164949b;
        bpqv bpqv3 = (bpqv) da.mo74062i();
        bpqk bpqk2 = bpqk.f138732w;
        bpqv3.getClass();
        bpqk.f138748o = bpqv3;
        bpqk.f138734a |= 4096;
        this.f119828g.mo64139a(bhqq.m101346a((bpqk) bxvd.mo74062i()));
    }

    /* renamed from: a */
    private static final boolean m101717a(bhxn bhxn, bhye bhye, biac biac) {
        if (!bhye.f119880a.f119985a.equals(biac.f120025a.f119985a)) {
            return false;
        }
        UserLocationNearbyAlertRequest userLocationNearbyAlertRequest = bhxn.f119830b;
        if (userLocationNearbyAlertRequest.f109596e != biac.f120027c) {
            return false;
        }
        UserLocationNearbyAlertFilter userLocationNearbyAlertFilter = userLocationNearbyAlertRequest.f109594c;
        return userLocationNearbyAlertFilter.f109591d == biac.f120029e && userLocationNearbyAlertRequest.f109593b == biac.f120026b && sdg.m34949a(userLocationNearbyAlertFilter.f109590c, biac.f120028d) && sdg.m34949a(bhye.f119880a.f119989e, biac.mo64479a());
    }

    /* renamed from: a */
    public final void mo64389a(int i, bhzp bhzp, Bundle bundle) {
        HashSet hashSet;
        int i2;
        int i3 = i;
        bhzp bhzp2 = bhzp;
        if (i3 == 0) {
            if (bhzp2.f119978a.isEmpty()) {
                hashSet = Collections.emptySet();
            } else {
                int i4 = bhzp2.f119979b;
                if (i4 == 1) {
                    HashSet hashSet2 = new HashSet();
                    for (bhzs bhzs : bhzp2.f119978a) {
                        biac biac = new biac(bhzs, bhzp2.f119981d, bhzp2.f119980c, bhzp2.f119982e, bhzp2.f119983f);
                        for (bhxn bhxn : this.f119826e.keySet()) {
                            for (bhye bhye : (List) this.f119826e.get(bhxn)) {
                                if (m101717a(bhxn, bhye, biac)) {
                                    int i5 = bhye.f119881b;
                                    if (i5 == 0 || i5 == 2) {
                                        hashSet2.add(bhzs);
                                        bhye.mo64414a(1);
                                        bhye.mo64415b(1);
                                    } else if (i5 == 4) {
                                        bhye.mo64414a(1);
                                        int i6 = bhye.f119882c;
                                        if (i6 == 0 || i6 == 2) {
                                            hashSet2.add(bhzs);
                                            bhye.mo64415b(1);
                                        } else if (m101716a(bhxn)) {
                                            hashSet2.add(bhzs);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    hashSet = hashSet2;
                } else if (i4 == 2) {
                    HashSet hashSet3 = new HashSet();
                    for (bhzs bhzs2 : bhzp2.f119978a) {
                        biac biac2 = new biac(bhzs2, bhzp2.f119981d, bhzp2.f119980c, bhzp2.f119982e, bhzp2.f119983f);
                        for (bhxn bhxn2 : this.f119826e.keySet()) {
                            for (bhye bhye2 : (List) this.f119826e.get(bhxn2)) {
                                if (m101717a(bhxn2, bhye2, biac2)) {
                                    int i7 = bhye2.f119881b;
                                    if (i7 == 1 || i7 == 3) {
                                        hashSet3.add(bhzs2);
                                        bhye2.mo64414a(2);
                                        bhye2.mo64415b(2);
                                    } else if (i7 == 0) {
                                        bhye2.mo64414a(2);
                                        bhye2.mo64415b(2);
                                    } else if (i7 == 4) {
                                        bhye2.mo64414a(2);
                                        int i8 = bhye2.f119882c;
                                        if (i8 == 1 || i8 == 3) {
                                            hashSet3.add(bhzs2);
                                            bhye2.mo64415b(2);
                                        } else if (m101716a(bhxn2)) {
                                            hashSet3.add(bhzs2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    hashSet = hashSet3;
                } else if (i4 == 4) {
                    HashSet hashSet4 = new HashSet();
                    for (bhzs bhzs3 : bhzp2.f119978a) {
                        biac biac3 = new biac(bhzs3, bhzp2.f119981d, bhzp2.f119980c, bhzp2.f119982e, bhzp2.f119983f);
                        for (bhxn bhxn3 : this.f119826e.keySet()) {
                            for (bhye bhye3 : (List) this.f119826e.get(bhxn3)) {
                                if (m101717a(bhxn3, bhye3, biac3) && bhye3.f119881b == 1) {
                                    hashSet4.add(bhzs3);
                                    bhye3.mo64414a(3);
                                    bhye3.mo64415b(3);
                                }
                            }
                        }
                    }
                    hashSet = hashSet4;
                } else if (i4 != 8) {
                    hashSet = Collections.emptySet();
                } else {
                    HashSet hashSet5 = new HashSet();
                    for (bhzs bhzs4 : bhzp2.f119978a) {
                        biac biac4 = new biac(bhzs4, bhzp2.f119981d, bhzp2.f119980c, bhzp2.f119982e, bhzp2.f119983f);
                        for (bhxn bhxn4 : this.f119826e.keySet()) {
                            for (bhye bhye4 : (List) this.f119826e.get(bhxn4)) {
                                if (m101717a(bhxn4, bhye4, biac4) && ((i2 = bhye4.f119881b) == 1 || i2 == 2 || i2 == 3)) {
                                    bhye4.mo64414a(4);
                                    if (m101716a(bhxn4)) {
                                        hashSet5.add(bhzs4);
                                    }
                                }
                            }
                        }
                    }
                    hashSet = hashSet5;
                }
            }
            HashSet hashSet6 = new HashSet();
            if (cgfr.m145050e() && bhzp2.f119979b == 1) {
                hashSet6 = new HashSet();
                for (bhzs bhzs5 : bhzp2.f119978a) {
                    biac biac5 = new biac(bhzs5, bhzp2.f119981d, bhzp2.f119980c, bhzp2.f119982e, bhzp2.f119983f);
                    for (bhxn bhxn5 : this.f119826e.keySet()) {
                        for (bhye bhye5 : (List) this.f119826e.get(bhxn5)) {
                            if (m101717a(bhxn5, bhye5, biac5) && bhye5.f119881b == 1 && SystemClock.elapsedRealtime() - bhye5.f119883d >= ((long) bhzp2.f119981d)) {
                                hashSet6.add(bhzs5);
                                bhye5.mo64414a(3);
                                bhye5.mo64415b(3);
                            }
                        }
                    }
                }
            }
            if (!hashSet.isEmpty()) {
                mo64391b(0, new bhzp(hashSet, bhzp2.f119979b, bhzp2.f119980c, bhzp2.f119981d, bhzp2.f119982e, bhzp2.f119983f), m101713a(bundle));
            }
            if (cgfr.m145050e() && !hashSet6.isEmpty()) {
                mo64391b(0, new bhzp(hashSet6, 4, bhzp2.f119980c, bhzp2.f119981d, bhzp2.f119982e, bhzp2.f119983f), m101713a(bundle));
                return;
            }
            return;
        }
        if (i3 == 9102) {
            this.f119826e.clear();
        }
        mo64391b(i3, bhzp2, m101713a(bundle));
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0181  */
    /* renamed from: a */
    public final void mo64390a(bhxn bhxn, List list) {
        char c;
        bhxn bhxn2 = bhxn;
        if (!this.f119826e.containsKey(bhxn2)) {
            if (Log.isLoggable("Places", 5)) {
                bioi.m102662c("Places", "NearbyAlert subscription was canceled after NearbyAlertData was retrieved");
            }
            this.f119823b.mo64411a(bhxn2);
            return;
        }
        ArrayList arrayList = new ArrayList(new HashSet(list));
        ArrayList arrayList2 = new ArrayList(((List) this.f119826e.get(bhxn2)).size());
        HashSet hashSet = new HashSet();
        hashSet.addAll(arrayList);
        for (bhye bhye : (List) this.f119826e.get(bhxn2)) {
            if (arrayList.contains(bhye.f119880a)) {
                hashSet.remove(bhye.f119880a);
            } else {
                arrayList2.add(bhye);
            }
        }
        if (!arrayList2.isEmpty()) {
            HashSet hashSet2 = new HashSet();
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                hashSet2.add(((bhye) arrayList2.get(i)).f119880a);
            }
            UserLocationNearbyAlertRequest userLocationNearbyAlertRequest = bhxn2.f119830b;
            int i2 = userLocationNearbyAlertRequest.f109592a;
            int i3 = userLocationNearbyAlertRequest.f109596e;
            int i4 = userLocationNearbyAlertRequest.f109593b;
            UserLocationNearbyAlertFilter userLocationNearbyAlertFilter = userLocationNearbyAlertRequest.f109594c;
            this.f119824c.mo64388a(bhxn2.f119830b.f109597f, new bhzp(hashSet2, i2, i3, i4, userLocationNearbyAlertFilter.f109590c, userLocationNearbyAlertFilter.f109591d));
        }
        Map map = this.f119826e;
        ArrayList arrayList3 = new ArrayList();
        int size2 = arrayList.size();
        for (int i5 = 0; i5 < size2; i5++) {
            arrayList3.add(new bhye((bhzs) arrayList.get(i5)));
        }
        map.put(bhxn2, arrayList3);
        if (!hashSet.isEmpty()) {
            UserLocationNearbyAlertRequest userLocationNearbyAlertRequest2 = bhxn2.f119830b;
            int i6 = userLocationNearbyAlertRequest2.f109592a;
            int i7 = userLocationNearbyAlertRequest2.f109596e;
            int i8 = userLocationNearbyAlertRequest2.f109593b;
            UserLocationNearbyAlertFilter userLocationNearbyAlertFilter2 = userLocationNearbyAlertRequest2.f109594c;
            bhzp bhzp = new bhzp(hashSet, i6, i7, i8, userLocationNearbyAlertFilter2.f109590c, userLocationNearbyAlertFilter2.f109591d);
            bhxk bhxk = this.f119824c;
            List<String> a = bhxk.mo64387a(bhxn2.f119830b.f109597f);
            if (a != null && !a.isEmpty()) {
                for (String str : a) {
                    if (!bhxk.f119819d.containsKey(str)) {
                        bhzq bhzq = bhxk.f119816a;
                        bhzr bhzr = null;
                        if (bhzq != null) {
                            int hashCode = str.hashCode();
                            if (hashCode != 273835101) {
                                if (hashCode == 353103893 && str.equals("Distance")) {
                                    c = 1;
                                    if (c == 0) {
                                        bhzr = new bhzo(bhzq, bhxk.f119818c);
                                    } else if (c == 1) {
                                        bhzr = new bhzn(bhzq, bhxk.f119817b);
                                    } else if (Log.isLoggable("Places", 6)) {
                                        String valueOf = String.valueOf(str);
                                        bioi.m102658a("Places", valueOf.length() == 0 ? new String("The NearbyAlertModule is not implemented for: ") : "The NearbyAlertModule is not implemented for: ".concat(valueOf));
                                    }
                                }
                            } else if (str.equals("Geofencing")) {
                                c = 0;
                                if (c == 0) {
                                }
                            }
                            c = 65535;
                            if (c == 0) {
                            }
                        } else if (Log.isLoggable("Places", 6)) {
                            bioi.m102658a("Places", "NearbyAlertModuleCallback is null");
                        }
                        if (bhzr != null) {
                            bhxk.f119819d.put(str, bhzr);
                            bhzr.mo64454a();
                        }
                    }
                    ((bhzr) bhxk.f119819d.get(str)).mo64459a(bhzp);
                }
            }
        }
        UserLocationNearbyAlertRequest userLocationNearbyAlertRequest3 = bhxn2.f119830b;
        String str2 = userLocationNearbyAlertRequest3.f109594c.f109590c;
        int i9 = userLocationNearbyAlertRequest3.f109596e;
        HashSet hashSet3 = new HashSet();
        for (Map.Entry entry : this.f119826e.entrySet()) {
            if (!((bhxn) entry.getKey()).equals(bhxn2) && sdg.m34949a(str2, ((bhxn) entry.getKey()).f119830b.f109594c.f109590c) && i9 == ((bhxn) entry.getKey()).f119830b.f109596e) {
                for (bhye bhye2 : (List) entry.getValue()) {
                    int i10 = bhye2.f119881b;
                    if (i10 == 1 || i10 == 3) {
                        hashSet3.add(bhye2.f119880a);
                    }
                }
            }
        }
        for (bhye bhye3 : (List) this.f119826e.get(bhxn2)) {
            if (hashSet3.contains(bhye3.f119880a)) {
                bhye3.mo64414a(1);
                bhye3.mo64415b(1);
            }
        }
        if (!hashSet3.isEmpty()) {
            UserLocationNearbyAlertRequest userLocationNearbyAlertRequest4 = bhxn2.f119830b;
            bhzp bhzp2 = new bhzp(hashSet3, 1, i9, userLocationNearbyAlertRequest4.f109593b, str2, userLocationNearbyAlertRequest4.f109594c.f109591d);
            Bundle bundle = new Bundle();
            bundle.putStringArray("nearby_alert_module_names", new String[]{getClass().getSimpleName()});
            if (bhzp2.f119978a != null) {
                ArrayList arrayList4 = new ArrayList();
                Set set = bhzp2.f119978a;
                for (bhye bhye4 : (List) this.f119826e.get(bhxn2)) {
                    bhzs bhzs = bhye4.f119880a;
                    if (set.contains(bhzs)) {
                        arrayList4.add(bhzs);
                    }
                }
                if (!arrayList4.isEmpty()) {
                    m101714a(bhzp2.f119979b, bhzp2.f119980c, bhzp2.f119982e, bhzp2.f119983f, arrayList4, bhxn, bundle);
                }
            } else if (Log.isLoggable("Places", 5)) {
                bioi.m102662c("Places", "Ignoring unexpected nearby alert callback with successful statuscode but no triggered places.");
            }
        }
        this.f119823b.mo64411a(bhxn2);
    }
}
