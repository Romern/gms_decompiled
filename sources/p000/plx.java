package p000;

import android.content.IntentFilter;
import android.util.Pair;
import com.google.android.gms.cast.CastDevice;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: plx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class plx extends plz {

    /* renamed from: a */
    static final boolean f39635a = ccxv.f180201a.mo6606a().mo77020f();

    /* renamed from: c */
    private static final long f39636c = cczx.m132362c();

    /* renamed from: b */
    public final qav f39637b = new qav("DatabaseProcessor");

    /* renamed from: d */
    private final pmx f39638d;

    /* renamed from: e */
    private final qat f39639e;

    public plx(pma pma, pmx pmx, qat qat) {
        super(pma);
        this.f39638d = pmx;
        this.f39639e = qat;
    }

    /* renamed from: a */
    static final Set m30796a(Set set, Set set2) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (set2.contains(str)) {
                hashSet.add(str);
            }
        }
        return hashSet;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo23392c() {
        mo23391a(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo23393d() {
        return !ccyz.m132249b() ? this.f39646g.f39652f != null : this.f39646g.mo23398a();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0060 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0162  */
    /* renamed from: a */
    public final pnt mo23390a(pnm pnm, pnt pnt) {
        boolean z;
        List list;
        boolean z2;
        int i;
        int i2;
        double d;
        pnm pnm2 = pnm;
        pnt pnt2 = pnt;
        if (!pnm2.f39844a.mo17500e()) {
            pnq pnq = pnm2.f39847d;
            if (pnq != null) {
                if (!pnq.f39869e) {
                    Iterator it = pnq.f39866b.entrySet().iterator();
                    while (it.hasNext()) {
                        if (System.currentTimeMillis() - ((Long) ((Pair) ((Map.Entry) it.next()).getValue()).second).longValue() > ccxg.m132000c()) {
                            it.remove();
                        }
                    }
                    if (!pnm2.f39847d.f39866b.isEmpty()) {
                        z = true;
                        list = null;
                        if (pnt2 == null && !z) {
                            this.f39637b.mo23858a("buildPublishedDeviceEntry: failed to build the published entry for device %s. isDeviceOnline(%b). activeDeviceEntry (%s)", pnm2.f39844a, false, null);
                            return null;
                        }
                        pes pes = pes.f38974a;
                        pnm2.f39850g = System.currentTimeMillis();
                        if (pnt2 != null) {
                            list = pnt2.f39882e;
                        }
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(plv.f39628a);
                        z2 = false;
                        for (Map.Entry entry : this.f39646g.f39649c.entrySet()) {
                            String str = (String) entry.getKey();
                            Set set = (Set) entry.getValue();
                            if (!ccxv.f180201a.mo6606a().mo77021g() && pnm2.f39844a.mo17498c() && (!f39635a || !pwc.m31500b(str))) {
                                this.f39637b.mo23675c("No control filters for %s because category does not allow Ipv6", pnm2.f39844a);
                            } else if (pwc.m31498a(str, "android.media.intent.category.REMOTE_PLAYBACK")) {
                                if (pnm2.mo23501a(set)) {
                                    z2 = true;
                                }
                            } else if (pwc.m31498a(str, "com.google.android.gms.cast.CATEGORY_CAST_REMOTE_PLAYBACK")) {
                                if (set.isEmpty() || pnm2.mo23501a(set)) {
                                    if (!set.isEmpty()) {
                                        IntentFilter intentFilter = new IntentFilter();
                                        intentFilter.addCategory(str);
                                        arrayList.add(intentFilter);
                                    }
                                    z2 = true;
                                }
                            } else if (pnm2.mo23501a(set)) {
                                IntentFilter intentFilter2 = new IntentFilter();
                                intentFilter2.addCategory(str);
                                arrayList.add(intentFilter2);
                            }
                        }
                        if (z2) {
                            arrayList.addAll(plv.f39629b);
                        }
                        if (list != null) {
                            int size = list.size();
                            for (int i3 = 0; i3 < size; i3++) {
                                IntentFilter intentFilter3 = (IntentFilter) list.get(i3);
                                if (!qay.m31784a(arrayList, intentFilter3)) {
                                    arrayList.add(intentFilter3);
                                }
                            }
                        }
                        if (pnt2 != null) {
                            i = pnt2.f39886i;
                        } else {
                            i = -1;
                        }
                        if (pnt2 != null) {
                            i2 = pnt2.f39884g;
                        } else {
                            i2 = 0;
                        }
                        if (pnt2 != null) {
                            d = pnt2.f39885h;
                        } else {
                            d = 0.0d;
                        }
                        return new pnt(pnm2.f39844a, m30796a(pnm2.f39845b, this.f39646g.f39652f), m30796a(pnm2.f39851h, this.f39646g.f39652f), arrayList, pnm2.f39853j, i, i2, d, pnm2.f39852i);
                    }
                }
            }
            z = false;
            list = null;
            if (pnt2 == null) {
                this.f39637b.mo23858a("buildPublishedDeviceEntry: failed to build the published entry for device %s. isDeviceOnline(%b). activeDeviceEntry (%s)", pnm2.f39844a, false, null);
                return null;
            }
            pes pes2 = pes.f38974a;
            pnm2.f39850g = System.currentTimeMillis();
            if (pnt2 != null) {
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(plv.f39628a);
            z2 = false;
            while (r3.hasNext()) {
            }
            if (z2) {
            }
            if (list != null) {
            }
            if (pnt2 != null) {
            }
            if (pnt2 != null) {
            }
            if (pnt2 != null) {
            }
            return new pnt(pnm2.f39844a, m30796a(pnm2.f39845b, this.f39646g.f39652f), m30796a(pnm2.f39851h, this.f39646g.f39652f), arrayList2, pnm2.f39853j, i, i2, d, pnm2.f39852i);
        }
        z = true;
        list = null;
        if (pnt2 == null) {
        }
        pes pes22 = pes.f38974a;
        pnm2.f39850g = System.currentTimeMillis();
        if (pnt2 != null) {
        }
        ArrayList arrayList22 = new ArrayList();
        arrayList22.add(plv.f39628a);
        z2 = false;
        while (r3.hasNext()) {
        }
        if (z2) {
        }
        if (list != null) {
        }
        if (pnt2 != null) {
        }
        if (pnt2 != null) {
        }
        if (pnt2 != null) {
        }
        return new pnt(pnm2.f39844a, m30796a(pnm2.f39845b, this.f39646g.f39652f), m30796a(pnm2.f39851h, this.f39646g.f39652f), arrayList22, pnm2.f39853j, i, i2, d, pnm2.f39852i);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: pnh.a(pnm, bpfn, boolean, boolean):void
     arg types: [pnm, bpfn, int, boolean]
     candidates:
      pnh.a(java.net.InetSocketAddress, bpfn, boolean, boolean):void
      pnh.a(pnm, bpfn, boolean, boolean):void */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008d, code lost:
        if (r10 != false) goto L_0x008f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0032 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0032 A[SYNTHETIC] */
    /* renamed from: a */
    public final void mo23391a(boolean z) {
        boolean z2;
        pnt a;
        HashMap hashMap = new HashMap();
        synchronized (this.f39646g.f39648b) {
            Map a2 = this.f39638d.mo23452a();
            if (mo23393d()) {
                String a3 = this.f39639e.mo23848a();
                poe a4 = this.f39646g.f39648b.mo23484a(a3);
                if (a4 != null) {
                    for (pnm pnm : a4.mo23516a()) {
                        String a5 = pnm.f39844a.mo17494a();
                        pnn pnn = pnm.f39846c;
                        if (pnn == null || pnn.f39856a) {
                            pes pes = pes.f38974a;
                            boolean a6 = pnm.mo23500a(System.currentTimeMillis(), f39636c);
                            if (pze.f40729a) {
                                bsib bsib = pnm.f39855l;
                                if (bsib != null) {
                                    long a7 = pnm.m30923a(bsib);
                                    long currentTimeMillis = System.currentTimeMillis();
                                    if (currentTimeMillis >= a7) {
                                        if (currentTimeMillis - a7 > cdbh.f180420a.mo6606a().mo77199b()) {
                                            z2 = true;
                                            if (a6) {
                                            }
                                            this.f39646g.f39651e.mo23477a(pnm, bpfn.TCP_PROBER_DEVICE_EXPIRED, false, z2);
                                            if (a6) {
                                            }
                                            a = mo23390a(pnm, (pnt) a2.get(a5));
                                            if (a != null) {
                                                hashMap.put(a5, a);
                                            }
                                        }
                                    }
                                }
                                z2 = true;
                                if (a6) {
                                }
                                this.f39646g.f39651e.mo23477a(pnm, bpfn.TCP_PROBER_DEVICE_EXPIRED, false, z2);
                                if (a6) {
                                }
                                a = mo23390a(pnm, (pnt) a2.get(a5));
                                if (a != null) {
                                }
                            }
                            z2 = false;
                            if (a6) {
                            }
                            this.f39646g.f39651e.mo23477a(pnm, bpfn.TCP_PROBER_DEVICE_EXPIRED, false, z2);
                            if (a6) {
                            }
                            a = mo23390a(pnm, (pnt) a2.get(a5));
                            if (a != null) {
                            }
                        } else {
                            this.f39637b.mo23856a("processLocalDevices: Device %s is marked offline by mDNS.", pnm.f39844a);
                        }
                    }
                } else {
                    this.f39637b.mo23675c("processLocalDevices: failed to get the network info with %s bssid.", a3 != null ? "non-null" : "null");
                }
            }
            if (hashMap.isEmpty()) {
                if (mo23393d()) {
                    pnr e = this.f39646g.f39648b.mo23495e();
                    pes pes2 = pes.f38974a;
                    long currentTimeMillis2 = System.currentTimeMillis();
                    HashSet hashSet = new HashSet();
                    Iterator it = e.f39874c.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        pnp pnp = (pnp) entry.getValue();
                        if (currentTimeMillis2 - pnp.f39864c > pnr.f39872a) {
                            it.remove();
                        } else if (pnp.f39863b) {
                            hashSet.add((String) entry.getKey());
                        }
                    }
                    Set a8 = m30796a(hashSet, this.f39646g.f39652f);
                    pnm pnm2 = e.f39873b;
                    if (pnm2 != null) {
                        pnm2.mo23498a(a8, Collections.emptySet());
                        CastDevice castDevice = pnm2.f39844a;
                        pnt a9 = mo23390a(pnm2, (pnt) a2.get(castDevice.mo17494a()));
                        if (a9 != null) {
                            hashMap.put(castDevice.mo17494a(), a9);
                            this.f39637b.mo23856a("Found unknown guest mode device %s to publish", castDevice.mo17494a());
                        }
                    }
                    for (pnm pnm3 : e.mo23505a()) {
                        pnm3.mo23498a(a8, Collections.emptySet());
                        CastDevice castDevice2 = pnm3.f39844a;
                        pnt a10 = mo23390a(pnm3, (pnt) a2.get(castDevice2.mo17494a()));
                        if (a10 != null) {
                            hashMap.put(pnm3.f39844a.mo17494a(), a10);
                            this.f39637b.mo23856a("Found paired guest mode device %s to publish", castDevice2.mo17494a());
                        }
                    }
                }
            }
            for (Map.Entry entry2 : a2.entrySet()) {
                if (!hashMap.containsKey(entry2.getKey())) {
                    hashMap.put((String) entry2.getKey(), (pnt) entry2.getValue());
                }
            }
            this.f39638d.mo23458a(hashMap, z);
        }
    }
}
