package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: pnl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pnl {

    /* renamed from: b */
    private static final List f39831b = new ArrayList();

    /* renamed from: c */
    private static final long f39832c = ccxm.f180167a.mo6606a().mo76984a();

    /* renamed from: a */
    final Map f39833a = new HashMap();

    /* renamed from: d */
    private final qav f39834d = new qav("CastDatabase");

    /* renamed from: e */
    private final qat f39835e;

    /* renamed from: f */
    private final poe f39836f;

    /* renamed from: g */
    private final pnr f39837g;

    /* renamed from: h */
    private final CountDownLatch f39838h = new CountDownLatch(1);

    /* renamed from: i */
    private final Map f39839i = new HashMap();

    /* renamed from: j */
    private final Map f39840j = new HashMap();

    /* renamed from: k */
    private final Map f39841k = new HashMap();

    /* renamed from: l */
    private final Map f39842l = new HashMap();

    /* renamed from: m */
    private final pnw f39843m;

    public pnl(pnw pnw, qat qat) {
        this.f39843m = pnw;
        this.f39835e = qat;
        this.f39836f = new poe("unknown_local");
        this.f39837g = new pnr();
    }

    /* renamed from: g */
    private final boolean m30906g() {
        try {
            return this.f39838h.await(f39832c, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            return false;
        }
    }

    /* renamed from: a */
    public final List mo23481a(long j) {
        m30906g();
        ArrayList arrayList = null;
        for (pnm pnm : this.f39833a.values()) {
            pnk pnk = pnm.f39848e;
            if (pnk != null && j - pnk.f39830b <= pnk.f39829a) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(pnm);
            }
        }
        return arrayList == null ? f39831b : arrayList;
    }

    /* renamed from: b */
    public final synchronized pnm mo23487b(String str) {
        return m30906g() ? (pnm) this.f39840j.get(str) : null;
    }

    /* renamed from: c */
    public final synchronized C1240of mo23491c() {
        if (!m30906g()) {
            return null;
        }
        String a = this.f39835e.mo23848a();
        if (!TextUtils.isEmpty(a)) {
            return C1240of.m19758a(a, (poe) this.f39839i.get(a));
        }
        return C1240of.m19758a(null, this.f39836f);
    }

    /* renamed from: d */
    public final synchronized String mo23493d(String str) {
        return (String) this.f39842l.get(str);
    }

    /* renamed from: e */
    public final synchronized pnr mo23495e() {
        m30906g();
        return this.f39837g;
    }

    /* renamed from: f */
    public final synchronized void mo23496f() {
        this.f39834d.mo23861b("Start purging expired records...");
        m30906g();
        for (Map.Entry entry : new HashMap(this.f39840j).entrySet()) {
            pnm pnm = (pnm) entry.getValue();
            if (pnm.mo23500a(System.currentTimeMillis(), ccxm.f180167a.mo6606a().mo76985b())) {
                this.f39834d.mo23856a("Removing %s", pnm);
                ArrayList arrayList = new ArrayList(pnm.f39854k);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    pnm.mo23499a((poe) arrayList.get(i));
                }
                this.f39840j.remove(entry.getKey());
            }
        }
        for (Map.Entry entry2 : new HashMap(this.f39839i).entrySet()) {
            poe poe = (poe) entry2.getValue();
            if (poe.mo23516a().isEmpty()) {
                this.f39834d.mo23856a("Removing network %s", poe.f39903a);
                this.f39839i.remove(entry2.getKey());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
        return false;
     */
    /* renamed from: d */
    public final synchronized boolean mo23494d() {
        String a;
        if (m30906g() && (a = this.f39835e.mo23848a()) != null && mo23484a(a) != null) {
            return true;
        }
    }

    /* renamed from: b */
    public final synchronized pns mo23488b(InetSocketAddress inetSocketAddress) {
        pns pns;
        m30906g();
        pns = new pns(inetSocketAddress);
        this.f39841k.put(inetSocketAddress, pns);
        return pns;
    }

    /* renamed from: b */
    public final synchronized void mo23489b() {
        int i;
        Map map;
        Iterator it;
        synchronized (this) {
            this.f39834d.mo23673b("Saving the database", new Object[0]);
            pnw pnw = this.f39843m;
            Map map2 = this.f39839i;
            Map map3 = this.f39840j;
            Map map4 = this.f39833a;
            Map map5 = this.f39841k;
            pnr pnr = this.f39837g;
            try {
                SQLiteDatabase writableDatabase = pnw.f39893c.getWritableDatabase();
                try {
                    writableDatabase.beginTransaction();
                    writableDatabase.delete("NetworkInfo", null, null);
                    writableDatabase.delete("DeviceInfo", null, null);
                    writableDatabase.delete("NetworkToDevice", null, null);
                    writableDatabase.delete("GuestModeAppInfo", null, null);
                    writableDatabase.delete("GuestModeDiscoveryInfo", null, null);
                    writableDatabase.delete("ProbedSocketAddress", null, null);
                    HashMap hashMap = new HashMap();
                    HashMap hashMap2 = new HashMap();
                    int i2 = 0;
                    for (poe poe : map2.values()) {
                        Map map6 = map2;
                        if (writableDatabase.replace("NetworkInfo", null, pod.m30945a(poe)) == -1) {
                            pnw.f39891a.mo23677d("Unable to insert CastNetworkInfo: %s.", poe.f39903a);
                        } else {
                            i2++;
                        }
                        HashSet hashSet = new HashSet();
                        for (pnm pnm : poe.mo23516a()) {
                            if (pnw.f39892b) {
                                hashSet.add(pnm.f39844a.mo17494a());
                            } else {
                                hashMap.put(poe.f39903a, pnm.f39844a.mo17494a());
                            }
                        }
                        if (pnw.f39892b && !hashSet.isEmpty()) {
                            hashMap2.put(poe.f39903a, hashSet);
                        }
                        map2 = map6;
                    }
                    int i3 = 0;
                    int i4 = 0;
                    for (pnm pnm2 : map3.values()) {
                        if (!pnw.mo23515a(writableDatabase, pnm2)) {
                            i4++;
                        } else {
                            i3++;
                        }
                    }
                    if (!pnw.f39892b) {
                        i = 0;
                        for (Map.Entry entry : hashMap.entrySet()) {
                            if (writableDatabase.replace("NetworkToDevice", null, pod.m30941a((String) entry.getKey(), (String) entry.getValue())) == -1) {
                                pnw.f39891a.mo23677d("Unable to insert networkId %s deviceId %s pair.", entry.getKey(), entry.getValue());
                            } else {
                                i++;
                            }
                        }
                    } else {
                        Iterator it2 = hashMap2.entrySet().iterator();
                        i = 0;
                        while (it2.hasNext()) {
                            Map.Entry entry2 = (Map.Entry) it2.next();
                            String str = (String) entry2.getKey();
                            Iterator it3 = ((Set) entry2.getValue()).iterator();
                            while (it3.hasNext()) {
                                String str2 = (String) it3.next();
                                Iterator it4 = it2;
                                Iterator it5 = it3;
                                if (writableDatabase.replace("NetworkToDevice", null, pod.m30941a(str, str2)) == -1) {
                                    pnw.f39891a.mo23677d("Unable to insert networkId %s deviceId %s pair.", str, str2);
                                } else {
                                    i++;
                                }
                                it2 = it4;
                                it3 = it5;
                            }
                        }
                    }
                    Iterator it6 = pnr.mo23505a().iterator();
                    int i5 = 0;
                    while (it6.hasNext()) {
                        pnm pnm3 = (pnm) it6.next();
                        String a = pnm3.f39844a.mo17494a();
                        pnq a2 = pnm3.mo23497a();
                        Iterator it7 = it6;
                        int i6 = i3;
                        if (writableDatabase.replace("GuestModeDiscoveryInfo", null, pod.m30942a(a, a2)) == -1) {
                            pnw.f39891a.mo23677d("Unable to insert deviceId %s guestModeDiscoveryInfo %s pair.", a, a2);
                        } else {
                            i5++;
                        }
                        it6 = it7;
                        i3 = i6;
                    }
                    int i7 = i3;
                    for (pnm pnm4 : map4.values()) {
                        String a3 = pnm4.f39844a.mo17494a();
                        if (TextUtils.isEmpty(a3) || !map3.containsKey(a3)) {
                            if (!pnw.mo23515a(writableDatabase, pnm4)) {
                                i4++;
                            } else {
                                i7++;
                            }
                        }
                    }
                    Iterator it8 = map5.values().iterator();
                    int i8 = 0;
                    int i9 = 0;
                    while (it8.hasNext()) {
                        pns pns = (pns) it8.next();
                        pnw.f39891a.mo23856a("Saving %s", pns.f39876a);
                        Iterator it9 = pns.f39877b.values().iterator();
                        while (true) {
                            if (!it9.hasNext()) {
                                map = map2;
                                it = it8;
                                i8++;
                                break;
                            }
                            pno pno = (pno) it9.next();
                            map = map2;
                            it = it8;
                            if (writableDatabase.replace("ProbedSocketAddress", null, pod.m30943a(pns.f39876a, pno)) == -1) {
                                pnw.f39891a.mo23677d("Unable to insert probed socket address: %s, %s", pns.f39876a, pno);
                                i9++;
                                break;
                            }
                            map2 = map;
                            it8 = it;
                        }
                        map2 = map;
                        it8 = it;
                    }
                    pnw.f39891a.mo23673b("[CastNetworkInfo] saved: %d, skipped: %d, [CastDeviceInfo]: saved %d, skipped %d, [Paired Guest Mode DeviceInfo] saved: %d, skipped: %d. [ProbedNetworks]: saved %d, skipped: %d, [ProbedSocketAddress]: saved %d, skipped: %d, [Network-Device pairs]: saved: %d", Integer.valueOf(i2), Integer.valueOf(map2.size() - i2), Integer.valueOf(i7), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(pnr.mo23505a().size() - i5), 0, 0, Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i));
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (SQLiteException e) {
                    try {
                        pnw.f39891a.mo23676c(e, "SqliteException when trying to save the database", new Object[0]);
                    } catch (Throwable th) {
                        writableDatabase.close();
                        throw th;
                    }
                }
                writableDatabase.close();
                pnw.f39894d.edit().putInt("com.google.android.gms.cast.discovery.database.FLAG_CONTROLLED_DATABASE_VERSION_KEY", pnw.f39895e).apply();
            } catch (SQLiteException e2) {
            }
        }
    }

    /* renamed from: c */
    public final synchronized pnm mo23492c(String str) {
        return m30906g() ? (pnm) this.f39833a.get(str) : null;
    }

    /* renamed from: a */
    public final synchronized pnm mo23482a(CastDevice castDevice) {
        pnm pnm;
        m30906g();
        pnm = new pnm(castDevice);
        if (!TextUtils.isEmpty(castDevice.mo17494a())) {
            this.f39840j.put(castDevice.mo17494a(), pnm);
        }
        if (!TextUtils.isEmpty(castDevice.f29725m)) {
            this.f39833a.put(castDevice.f29725m, pnm);
        }
        this.f39834d.mo23673b("CastDeviceInfo created: %s", castDevice.mo17494a());
        return pnm;
    }

    /* renamed from: a */
    public final synchronized pns mo23483a(InetSocketAddress inetSocketAddress) {
        return m30906g() ? (pns) this.f39841k.get(inetSocketAddress) : null;
    }

    /* renamed from: a */
    public final synchronized poe mo23484a(String str) {
        return m30906g() ? !TextUtils.isEmpty(str) ? (poe) this.f39839i.get(str) : this.f39836f : null;
    }

    /* renamed from: a */
    public final synchronized poe mo23485a(String str, long j) {
        poe poe;
        m30906g();
        poe = new poe(str);
        poe.f39904b = j;
        this.f39839i.put(str, poe);
        this.f39834d.mo23673b("WifiNetworkInfo created: id = %s", str);
        return poe;
    }

    /* renamed from: a */
    public final synchronized void mo23486a() {
        Cursor query;
        synchronized (this) {
            this.f39834d.mo23673b("Opening the database", new Object[0]);
            pnw pnw = this.f39843m;
            Map map = this.f39839i;
            Map map2 = this.f39840j;
            Map map3 = this.f39833a;
            Map map4 = this.f39841k;
            pnr pnr = this.f39837g;
            try {
                SQLiteDatabase writableDatabase = pnw.f39893c.getWritableDatabase();
                int i = pnw.f39894d.getInt("com.google.android.gms.cast.discovery.database.FLAG_CONTROLLED_DATABASE_VERSION_KEY", 0);
                pnw.f39895e = (int) ccxp.f180175a.mo6606a().mo76991a();
                pnw.f39891a.mo23857a("savedFlagControlledVersion: %d. flagControllerVersion: %d", Integer.valueOf(i), Integer.valueOf(pnw.f39895e));
                if (pnw.f39895e > i) {
                    pnw.f39893c.mo23512c(writableDatabase);
                } else {
                    Cursor query2 = writableDatabase.query("NetworkInfo", null, null, null, null, null, null);
                    Cursor query3 = writableDatabase.query("DeviceInfo", null, null, null, null, null, null);
                    Cursor query4 = writableDatabase.query("NetworkToDevice", null, null, null, null, null, null);
                    Cursor query5 = writableDatabase.query("GuestModeDiscoveryInfo", null, null, null, null, null, null);
                    Cursor query6 = writableDatabase.query("GuestModeAppInfo", null, null, null, null, null, null);
                    if (!(query2 == null || query3 == null || query4 == null)) {
                        while (query2.moveToNext()) {
                            try {
                                poe a = pod.m30947a(query2);
                                map.put(a.f39903a, a);
                            } catch (Throwable th) {
                                th = th;
                                query = null;
                            }
                        }
                        while (query3.moveToNext()) {
                            pnm b = pod.m30949b(query3);
                            if (b != null) {
                                map2.put(b.f39844a.mo17494a(), b);
                            }
                            if (!TextUtils.isEmpty(b.f39844a.f29725m)) {
                                map3.put(b.f39844a.f29725m, b);
                            }
                        }
                        if (pnw.f39892b) {
                            while (query4.moveToNext()) {
                                C1240of c = pod.m30951c(query4);
                                poe poe = (poe) map.get((String) c.f26798a);
                                pnm pnm = (pnm) map2.get((String) c.f26799b);
                                if (!(poe == null || pnm == null)) {
                                    poe.mo23517a(pnm);
                                }
                            }
                        } else {
                            HashMap hashMap = new HashMap();
                            while (query4.moveToNext()) {
                                C1240of c2 = pod.m30951c(query4);
                                hashMap.put((String) c2.f26798a, (String) c2.f26799b);
                            }
                            for (Map.Entry entry : hashMap.entrySet()) {
                                poe poe2 = (poe) map.get(entry.getKey());
                                pnm pnm2 = (pnm) map2.get(entry.getValue());
                                if (!(poe2 == null || pnm2 == null)) {
                                    poe2.mo23517a(pnm2);
                                }
                            }
                        }
                    }
                    while (query6.moveToNext()) {
                        pnr.mo23507a(pod.m30952d(query6));
                    }
                    while (query5.moveToNext()) {
                        C1240of e = pod.m30953e(query5);
                        pnm pnm3 = (pnm) map2.get(e.f26798a);
                        if (pnm3 != null) {
                            pnq pnq = (pnq) e.f26799b;
                            pnm3.f39847d = pnq;
                            pnr.mo23506a(pnq.f39867c, pnm3);
                        }
                    }
                    query = writableDatabase.query("ProbedSocketAddress", null, null, null, null, null, null);
                    while (query.moveToNext()) {
                        try {
                            C1240of f = pod.m30954f(query);
                            if (f != null) {
                                InetSocketAddress inetSocketAddress = (InetSocketAddress) f.f26798a;
                                pns pns = (pns) map4.get(inetSocketAddress);
                                if (pns == null) {
                                    pns = new pns(inetSocketAddress);
                                    map4.put(inetSocketAddress, pns);
                                }
                                pns.mo23509a((pno) f.f26799b);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (query2 != null) {
                                query2.close();
                            }
                            if (query3 != null) {
                                query3.close();
                            }
                            if (query4 != null) {
                                query4.close();
                            }
                            if (query5 != null) {
                                query5.close();
                            }
                            if (query6 != null) {
                                query6.close();
                            }
                            if (query != null) {
                                query.close();
                            }
                            writableDatabase.close();
                            throw th;
                        }
                    }
                    if (query2 != null) {
                        query2.close();
                    }
                    if (query3 != null) {
                        query3.close();
                    }
                    if (query4 != null) {
                        query4.close();
                    }
                    if (query5 != null) {
                        query5.close();
                    }
                    if (query6 != null) {
                        query6.close();
                    }
                    if (query != null) {
                        query.close();
                    }
                    writableDatabase.close();
                    pnw.f39891a.mo23673b("%d CastNetworkInfo instances loaded, %d CastDeviceInfo instances loaded, %d paired guest mode devices loaded.", Integer.valueOf(map.size()), Integer.valueOf(map2.size()), Integer.valueOf(pnr.mo23505a().size()));
                }
            } catch (SQLiteException e2) {
                pnw.f39891a.mo23677d("Failed to open database.", e2);
            }
            for (pnm pnm4 : this.f39840j.values()) {
                String str = pnm4.f39844a.f29725m;
                if (!TextUtils.isEmpty(str)) {
                    this.f39833a.put(str, pnm4);
                }
            }
            if (cczq.m132283b()) {
                for (pnm pnm5 : this.f39840j.values()) {
                    mo23490b(pnm5.f39844a);
                }
            }
            this.f39838h.countDown();
        }
    }

    /* renamed from: b */
    public final synchronized void mo23490b(CastDevice castDevice) {
        if (!TextUtils.isEmpty(castDevice.mo17494a()) && !TextUtils.isEmpty(castDevice.f29727o)) {
            this.f39842l.put(castDevice.f29727o, castDevice.mo17494a());
        }
    }
}
