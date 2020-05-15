package p000;

import android.bluetooth.BluetoothDevice;
import android.os.Build;
import android.os.SystemClock;
import android.os.WorkSource;
import com.google.android.gms.beacon.BleFilter;
import com.google.android.gms.beacon.BleSettings;
import com.google.android.gms.beacon.BleSighting;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: ngu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ngu {

    /* renamed from: e */
    private static final Set f35543e = new HashSet();

    /* renamed from: g */
    private static final Comparator f35544g = new ngt();

    /* renamed from: a */
    public final ngn f35545a;

    /* renamed from: b */
    public final ngw f35546b;

    /* renamed from: c */
    final ngm f35547c = new ngs(this);

    /* renamed from: d */
    public boolean f35548d = false;

    /* renamed from: f */
    private int f35549f;

    /* renamed from: h */
    private final nhd f35550h;

    public ngu(nhd nhd, ngn ngn) {
        this.f35550h = nhd;
        this.f35546b = new ngw();
        this.f35545a = ngn;
        ngn.mo20602a(this.f35547c);
        this.f35549f = (int) ccos.m131057d();
    }

    /* renamed from: a */
    public static Collection m26215a(Collection collection) {
        if (collection != null && !collection.isEmpty()) {
            HashSet hashSet = new HashSet();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                BleFilter bleFilter = (BleFilter) it.next();
                if (ccos.m131055b()) {
                    if (nfa.m26073c().mo17291a(bleFilter) || nfa.m26072b().mo17291a(bleFilter)) {
                        hashSet.add(bleFilter);
                    }
                } else if (nfa.m26073c().equals(bleFilter) || nfa.m26074d().equals(bleFilter) || nfa.m26075e().equals(bleFilter) || nfa.m26076f().equals(bleFilter) || nfa.m26072b().equals(bleFilter)) {
                    hashSet.add(bleFilter);
                }
            }
            return hashSet;
        }
        nfa nfa = new nfa();
        nfa.mo20562g();
        nfa.mo20563h();
        return nfa.mo20561a();
    }

    /* renamed from: k */
    private final List m26216k() {
        ArrayList arrayList = new ArrayList(this.f35546b.mo20631b());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            mo20620a(((ngr) arrayList.get(i)).f35540d);
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, java.util.Collection], assign insn: 0x0003: INVOKE  (r0v2 ? I:java.util.Collection) = (r0v1 ngw) type: VIRTUAL call: ngw.b():java.util.Collection */
    /* renamed from: b */
    public final synchronized boolean mo20621b() {
        ? b = this.f35546b.mo20631b();
        int size = b.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (((ngr) b.get(i)).f35541e.f29265a != 3) {
                return true;
            }
            i = i2;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List, java.util.Collection], assign insn: 0x0017: INVOKE  (r5v1 ? I:java.util.Collection) = (r5v0 ngw) type: VIRTUAL call: ngw.b():java.util.Collection */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00ab, code lost:
        return r4;
     */
    /* renamed from: c */
    public final synchronized Set mo20622c() {
        boolean z;
        boolean z2;
        int d = mo20623d();
        if (d == 3 || d == 2) {
            z = true;
        } else {
            z = false;
        }
        HashSet hashSet = new HashSet();
        ? b = this.f35546b.mo20631b();
        int size = b.size();
        for (int i = 0; i < size; i++) {
            ngr ngr = (ngr) b.get(i);
            if (z || ngr.f35541e.f29265a != 3) {
                if (this.f35545a.mo20604b()) {
                    hashSet.addAll(m26215a(ngr.f35539c));
                } else {
                    List list = ngr.f35539c;
                    if (list == null || list.isEmpty()) {
                        return f35543e;
                    }
                    hashSet.addAll(ngr.f35539c);
                }
            }
        }
        if (ccos.m131055b() && hashSet.size() > 1) {
            HashSet hashSet2 = new HashSet();
            BleFilter[] bleFilterArr = (BleFilter[]) hashSet.toArray(new BleFilter[0]);
            int i2 = 0;
            while (i2 < bleFilterArr.length) {
                BleFilter bleFilter = bleFilterArr[i2];
                int i3 = i2 + 1;
                int i4 = i3;
                while (true) {
                    if (i4 < bleFilterArr.length) {
                        if (bleFilterArr[i4].mo17291a(bleFilter)) {
                            z2 = true;
                            break;
                        }
                        i4++;
                    } else {
                        z2 = false;
                        break;
                    }
                }
                int i5 = 0;
                while (true) {
                    if (i5 < i2) {
                        if (z2 || bleFilterArr[i5].mo17291a(bleFilter)) {
                            break;
                        }
                        i5++;
                    } else if (!z2) {
                        hashSet2.add(bleFilterArr[i2]);
                    }
                }
                i2 = i3;
            }
            hashSet = hashSet2;
        }
    }

    /* renamed from: d */
    public final synchronized int mo20623d() {
        return this.f35546b.mo20632c();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, java.util.Collection], assign insn: 0x000f: INVOKE  (r0v2 ? I:java.util.Collection) = (r0v1 ngw) type: VIRTUAL call: ngw.b():java.util.Collection */
    /* renamed from: e */
    public final synchronized WorkSource mo20624e() {
        WorkSource workSource;
        WorkSource workSource2;
        ngw ngw = this.f35546b;
        workSource = new WorkSource();
        int c = ngw.mo20632c();
        if (c != -1) {
            ? b = ngw.mo20631b();
            int size = b.size();
            for (int i = 0; i < size; i++) {
                BleSettings bleSettings = ((ngr) b.get(i)).f35541e;
                if (bleSettings.f29265a == c && (workSource2 = bleSettings.f29269e) != null) {
                    workSource.add(workSource2);
                }
            }
        }
        return workSource;
    }

    /* renamed from: f */
    public final void mo20625f() {
        this.f35549f = (int) ccos.m131057d();
        this.f35545a.mo20606d();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006b, code lost:
        return 0;
     */
    /* renamed from: g */
    public final synchronized long mo20626g() {
        List e = this.f35546b.mo20634e();
        if (this.f35546b.mo20633d().isEmpty() && !e.isEmpty()) {
            int i = 0;
            if (e.size() == 1) {
                return ((ngp) e.get(0)).f35541e.f29267c;
            }
            BigInteger valueOf = BigInteger.valueOf(((ngp) e.get(0)).f35541e.f29267c);
            int size = e.size();
            while (i < size) {
                valueOf = valueOf.gcd(BigInteger.valueOf(((ngp) e.get(i)).f35541e.f29267c));
                i++;
                if (valueOf.longValue() == 1) {
                    return 0;
                }
            }
            return valueOf.longValue();
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List, java.util.Collection], assign insn: 0x0009: INVOKE  (r2v1 ? I:java.util.Collection) = (r2v0 ngw) type: VIRTUAL call: ngw.b():java.util.Collection */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
        if (r5 == 0) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
        return 1;
     */
    /* renamed from: h */
    public final synchronized int mo20627h() {
        boolean z = !mo20621b();
        ? b = this.f35546b.mo20631b();
        int size = b.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            ngr ngr = (ngr) b.get(i2);
            if (z || ngr.f35541e.f29265a != 3) {
                int i3 = ngr.f35541e.f29266b;
                if (i3 == 1) {
                    return 1;
                }
                i |= i3;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List, java.util.Collection], assign insn: 0x0007: INVOKE  (r1v1 ? I:java.util.Collection) = (r1v0 ngw) type: VIRTUAL call: ngw.b():java.util.Collection */
    /* renamed from: i */
    public final Set mo20628i() {
        HashSet hashSet = new HashSet();
        ? b = this.f35546b.mo20631b();
        int size = b.size();
        for (int i = 0; i < size; i++) {
            hashSet.addAll(((ngr) b.get(i)).f35539c);
        }
        return hashSet;
    }

    /* renamed from: j */
    public final void mo20629j() {
        if (this.f35546b.mo20630a()) {
            int size = this.f35546b.mo20633d().size();
            int size2 = this.f35546b.mo20634e().size();
            StringBuilder sb = new StringBuilder(69);
            sb.append("Cleaning up dangling clients: serial: ");
            sb.append(size);
            sb.append(", batch: ");
            sb.append(size2);
            nha.m26243a(sb.toString());
            m26216k();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ae, code lost:
        return r1;
     */
    /* renamed from: a */
    public final synchronized ngr mo20615a(BleSettings bleSettings, nej nej) {
        ngr ngr;
        Set set;
        if (!this.f35545a.mo20603a()) {
            nej.mo13773a(5);
            return null;
        }
        if (this.f35545a.mo20604b()) {
            if (m26215a(bleSettings.f29268d).isEmpty()) {
                nej.mo13773a(6);
                return null;
            }
        }
        if (!this.f35546b.mo20630a()) {
            ngn ngn = this.f35545a;
            ngn.f35521a.registerReceiver(ngn.f35527g, ngn.f35522b);
            ngn.f35525e = true;
            if (ngn.f35523c != null) {
                if (ngn.mo20607e()) {
                    boolean enableBLE = ngn.f35523c.enableBLE();
                    ngn.f35526f = enableBLE;
                    StringBuilder sb = new StringBuilder(26);
                    sb.append("enableBLE() returned ");
                    sb.append(enableBLE);
                    sb.toString();
                }
            }
        }
        if (bleSettings.f29267c == 0) {
            ngq ngq = (ngq) this.f35546b.f35553a.get(nej);
            if (ngq == null) {
                set = new HashSet();
            } else {
                set = ngq.f35538a;
            }
            ngr = new ngq(bleSettings, nej, set);
            ngw ngw = this.f35546b;
            ngw.f35554b.remove(nej);
            ngw.f35553a.put(nej, ngr);
        } else {
            ngp ngp = new ngp(bleSettings, nej, SystemClock.elapsedRealtime() + bleSettings.f29267c);
            ngw ngw2 = this.f35546b;
            ngw2.f35553a.remove(nej);
            ngw2.f35554b.put(nej, ngp);
            ngr = ngp;
        }
    }

    /* renamed from: a */
    public final synchronized void mo20616a() {
        int i;
        Iterator it = this.f35546b.f35555c.entrySet().iterator();
        HashSet hashSet = new HashSet();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            ngv ngv = (ngv) entry.getValue();
            double a = this.f35550h.f35563a.mo20638a(ngv.f35551a);
            double d = ngv.f35552b;
            int i2 = this.f35549f;
            if (i2 > 0) {
                if (d <= a) {
                    double d2 = (double) i2;
                    Double.isNaN(d2);
                    if (d > a - d2) {
                        continue;
                    }
                }
                hashSet.add(str);
                it.remove();
            }
        }
        Iterator it2 = hashSet.iterator();
        while (true) {
            i = 0;
            if (!it2.hasNext()) {
                break;
            }
            String str2 = (String) it2.next();
            List d3 = this.f35546b.mo20633d();
            int size = d3.size();
            while (i < size) {
                ngq ngq = (ngq) d3.get(i);
                if (ngq.f35538a.contains(str2)) {
                    int i3 = ngq.f35541e.f29266b;
                    int i4 = i3 & 1;
                    int i5 = i3 & 4;
                    if (ngq.f35538a.remove(str2) && (i5 | i4) != 0) {
                        ngq.mo20611a(str2);
                    }
                }
                i++;
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ArrayList arrayList = new ArrayList(this.f35546b.mo20634e());
        int size2 = arrayList.size();
        while (i < size2) {
            ngp ngp = (ngp) arrayList.get(i);
            if (ngp.f35537b <= elapsedRealtime) {
                ArrayList arrayList2 = new ArrayList(ngp.f35536a);
                Collections.sort(arrayList2, f35544g);
                if (ngp.f35541e.f29265a != 3 || !arrayList2.isEmpty()) {
                    ngp.f35536a.clear();
                    try {
                        ngp.f35540d.mo20524a(arrayList2);
                    } catch (Exception e) {
                        nha.m26244a("Failure delivering batch scan results", e);
                    }
                }
                ngp.f35537b = SystemClock.elapsedRealtime() + ngp.f35541e.f29267c;
            }
            i++;
        }
    }

    /* renamed from: a */
    public final void mo20617a(int i) {
        List k = m26216k();
        int size = k.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((ngr) k.get(i2)).f35540d.mo13773a(i);
        }
    }

    /* renamed from: a */
    public final synchronized void mo20618a(BleSighting bleSighting) {
        mo20619a(bleSighting, 1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0044 A[SYNTHETIC] */
    /* renamed from: a */
    public final synchronized void mo20619a(BleSighting bleSighting, int i) {
        String str;
        int size;
        int i2;
        int i3;
        int size2;
        ngw ngw = this.f35546b;
        double a = this.f35550h.f35563a.mo20638a(bleSighting);
        BluetoothDevice bluetoothDevice = bleSighting.f29271a;
        if (bluetoothDevice != null) {
            ngw.f35555c.put(bluetoothDevice.getAddress(), new ngv(bleSighting, a));
        }
        BluetoothDevice bluetoothDevice2 = bleSighting.f29271a;
        if (bluetoothDevice2 != null) {
            if (bluetoothDevice2.getAddress() != null) {
                str = bleSighting.f29271a.getAddress();
                ArrayList arrayList = new ArrayList(this.f35546b.mo20633d());
                size = arrayList.size();
                i3 = 0;
                while (true) {
                    if (i3 < size) {
                        break;
                    }
                    ngq ngq = (ngq) arrayList.get(i3);
                    if (ngq.mo20613a(bleSighting)) {
                        int i4 = ngq.f35541e.f29266b;
                        if (this.f35548d) {
                            int i5 = Build.VERSION.SDK_INT;
                            if (i4 == 2 || i4 == 4 || i4 == 6) {
                                if (i == 2) {
                                    ngq.mo20612a(true, bleSighting);
                                } else if (i != 4) {
                                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 58);
                                    sb.append("hardware event not relevant, callback=");
                                    sb.append(i);
                                    sb.append(", device=");
                                    sb.append(str);
                                    sb.toString();
                                } else {
                                    ngq.mo20611a(str);
                                }
                            }
                        }
                        boolean contains = ngq.f35538a.contains(str);
                        int i6 = i4 & 2;
                        int i7 = i4 & 1;
                        if (!contains) {
                            ngq.f35538a.add(str);
                        }
                        if (i6 == 0 || contains) {
                            if (i7 == 0) {
                            }
                        }
                        ngq.mo20612a(!contains, bleSighting);
                    }
                    i3++;
                }
                if (i == 2) {
                }
                List e = this.f35546b.mo20634e();
                size2 = e.size();
                for (i2 = 0; i2 < size2; i2++) {
                    ngp ngp = (ngp) e.get(i2);
                    if (ngp.mo20613a(bleSighting)) {
                        ngp.f35536a.add(bleSighting);
                    }
                }
            }
        }
        str = "null";
        ArrayList arrayList2 = new ArrayList(this.f35546b.mo20633d());
        size = arrayList2.size();
        i3 = 0;
        while (true) {
            if (i3 < size) {
            }
            i3++;
        }
        if (i == 2) {
        }
        List e2 = this.f35546b.mo20634e();
        size2 = e2.size();
        while (i2 < size2) {
        }
    }

    /* renamed from: a */
    public final synchronized void mo20620a(nej nej) {
        ngw ngw = this.f35546b;
        ngw.f35554b.remove(nej);
        ngw.f35553a.remove(nej);
        if (!this.f35546b.mo20630a()) {
            this.f35545a.mo20605c();
        }
        nhc nhc = this.f35550h.f35563a;
        Set i = mo20628i();
        nhc.f35561a.writeLock().lock();
        Iterator it = nhc.f35562b.keySet().iterator();
        while (it.hasNext()) {
            if (!i.contains((BleFilter) it.next())) {
                it.remove();
            }
        }
        nhc.f35561a.writeLock().unlock();
    }
}
