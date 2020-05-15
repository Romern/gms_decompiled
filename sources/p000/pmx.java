package p000;

import android.content.IntentFilter;
import com.google.android.gms.cast.CastDevice;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* renamed from: pmx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pmx {

    /* renamed from: a */
    final Map f39758a = new HashMap();

    /* renamed from: b */
    private final qav f39759b = new qav("PublishedDeviceManager");

    /* renamed from: c */
    private final Map f39760c = new HashMap();

    /* renamed from: d */
    private final Map f39761d = new HashMap();

    /* renamed from: e */
    private final poj f39762e;

    /* renamed from: f */
    private final Set f39763f = new HashSet();

    /* renamed from: g */
    private final Map f39764g = new HashMap();

    public pmx(poj poj) {
        this.f39762e = poj;
    }

    /* renamed from: a */
    private final synchronized void m30864a(String str, CastDevice castDevice, String str2, boolean z) {
        String str3 = str;
        String str4 = str2;
        synchronized (this) {
            if (pie.f39206b && !pwc.f40435a.contains(str4) && !qay.m31791c(str2) && !cczf.f180296a.mo6606a().mo77097c().f165797a.contains(str4)) {
                Object obj = this.f39758a.get(str3);
                pnt pnt = (pnt) mo23460b().get(castDevice.mo17494a());
                pnu pnu = null;
                if (pnt != null) {
                    String uuid = UUID.randomUUID().toString();
                    if (obj != null) {
                        uuid = ((pnu) this.f39758a.get(str3)).f39878a.mo17494a();
                    }
                    pet pet = new pet(castDevice);
                    pet.f38993a = uuid;
                    CastDevice a = pet.mo22985a();
                    List list = pnt.f39882e;
                    ArrayList arrayList = new ArrayList();
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        IntentFilter intentFilter = new IntentFilter();
                        Iterator<String> categoriesIterator = ((IntentFilter) list.get(i)).categoriesIterator();
                        while (categoriesIterator.hasNext()) {
                            String next = categoriesIterator.next();
                            if (pwc.m31502d(next) != null) {
                                intentFilter.addCategory(pwc.m31502d(next));
                            }
                        }
                        if (intentFilter.countCategories() > 0) {
                            arrayList.add(intentFilter);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        pnu = new pnu(a, pnt.f39880c, pnt.f39881d, arrayList, pnt.f39879b, pnt.f39886i, pnt.f39884g, pnt.f39885h, pnt.f39883f, str2, str);
                    }
                }
                if (pnu != null) {
                    this.f39758a.put(str3, pnu);
                    this.f39761d.put(str3, castDevice.mo17494a());
                    if (z) {
                        m30865c();
                    }
                }
            }
        }
    }

    /* renamed from: c */
    private final synchronized void m30865c() {
        m30866d();
        m30867e();
    }

    /* renamed from: d */
    private final synchronized boolean m30866d() {
        int size;
        size = this.f39758a.size();
        Iterator it = this.f39758a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            String str2 = (String) this.f39761d.get(str);
            if (!((pnu) entry.getValue()).f39889l && mo23451a(str2) == null) {
                it.remove();
                this.f39761d.remove(str);
            }
        }
        return this.f39758a.size() != size;
    }

    /* renamed from: e */
    private final void m30867e() {
        ArrayList arrayList = new ArrayList(this.f39763f);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((pmw) arrayList.get(i)).mo23283a(this.f39760c.values(), this.f39758a.values());
        }
    }

    /* renamed from: b */
    public final synchronized Map mo23460b() {
        return this.f39760c;
    }

    /* renamed from: b */
    public final synchronized pnu mo23461b(String str) {
        return (pnu) this.f39758a.get(str);
    }

    /* renamed from: c */
    public final synchronized pnu mo23464c(String str) {
        for (pnu pnu : this.f39758a.values()) {
            if (pnu.f39878a.mo17494a().equals(str)) {
                return pnu;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final synchronized void mo23462b(String str, int i) {
        pnt pnt = (pnt) this.f39760c.get(str);
        if (!(pnt == null || pnt.f39886i == i)) {
            pnt.f39886i = i;
            m30867e();
        }
    }

    /* renamed from: e */
    private final synchronized void m30868e(String str) {
        if (pie.f39206b) {
            this.f39758a.remove(str);
            this.f39761d.remove(str);
            this.f39764g.remove(str);
            m30865c();
        }
    }

    /* renamed from: b */
    public final synchronized void mo23463b(pmw pmw) {
        this.f39763f.remove(pmw);
    }

    /* renamed from: d */
    public final synchronized pnt mo23465d(String str) {
        String str2;
        str2 = (String) this.f39761d.get(str);
        return str2 != null ? (pnt) this.f39760c.get(str2) : null;
    }

    /* renamed from: a */
    public final synchronized CastDevice mo23451a(String str) {
        pnt pnt;
        pnt = (pnt) this.f39760c.get(str);
        return pnt != null ? pnt.f39878a : null;
    }

    /* renamed from: a */
    public final synchronized Map mo23452a() {
        HashMap hashMap;
        hashMap = new HashMap();
        for (Map.Entry entry : this.f39760c.entrySet()) {
            if (((pnt) entry.getValue()).mo23510a()) {
                hashMap.put((String) entry.getKey(), (pnt) entry.getValue());
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public final synchronized void mo23453a(String str, double d) {
        pnt pnt = (pnt) this.f39760c.get(str);
        if (pnt != null && !ptk.m31234a(pnt.f39885h, d)) {
            pnt.f39885h = d;
            m30867e();
        }
    }

    /* renamed from: a */
    public final synchronized void mo23454a(String str, int i) {
        pnt pnt = (pnt) this.f39760c.get(str);
        if (!(pnt == null || pnt.f39884g == i)) {
            pnt.f39884g = i;
            poj poj = this.f39762e;
            new C1588pos(poj.f39918b, poj.f39919c).mo23522a();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo23455a(String str, String str2) {
        if (this.f39761d.containsKey(str)) {
            this.f39761d.put(str, str2);
            pnt pnt = (pnt) this.f39760c.get(str2);
            pnu pnu = (pnu) this.f39758a.get(str);
            if (pnt != null) {
                m30864a(str, pnt.f39878a, pnu.f39888k, true);
                return;
            }
            pnu.mo23511b();
        }
    }

    /* renamed from: a */
    public final synchronized void mo23456a(String str, pil pil) {
        if (str != null) {
            Set set = (Set) this.f39764g.get(str);
            if (set != null) {
                this.f39759b.mo23858a("Removing reference from session %s on %s by controller %s", str, pil.f39230a.f29716d, pil);
                set.remove(pil);
                if (set.isEmpty()) {
                    m30868e(str);
                }
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo23457a(String str, pil pil, String str2) {
        this.f39759b.mo23858a("Adding reference to session %s on %s by controller %s", str, pil.f39230a.f29716d, pil);
        if (this.f39764g.containsKey(str)) {
            ((Set) this.f39764g.get(str)).add(pil);
        } else {
            HashSet hashSet = new HashSet();
            hashSet.add(pil);
            this.f39764g.put(str, hashSet);
        }
        m30864a(str, pil.f39230a, str2, true);
    }

    /* renamed from: a */
    public final synchronized void mo23458a(Map map, boolean z) {
        boolean z2 = map.size() != this.f39760c.size();
        for (Map.Entry entry : map.entrySet()) {
            pnt pnt = (pnt) this.f39760c.get(entry.getKey());
            if (pnt != null) {
                pnt pnt2 = (pnt) entry.getValue();
                if (pnt2 != null) {
                    if (pnt.f39878a.equals(pnt2.f39878a)) {
                        if (pnt.f39884g == pnt2.f39884g && ptk.m31236a(pnt.f39879b, pnt2.f39879b) && pnt.f39886i == pnt2.f39886i && pnt.f39882e.size() == pnt2.f39882e.size() && ptk.m31234a(pnt.f39885h, pnt2.f39885h) && pnt.f39880c.equals(pnt2.f39880c) && pnt.f39883f.equals(pnt2.f39883f)) {
                            List list = pnt2.f39882e;
                            int size = list.size();
                            int i = 0;
                            while (true) {
                                if (i >= size) {
                                    break;
                                }
                                i++;
                                if (!qay.m31784a(pnt.f39882e, (IntentFilter) list.get(i))) {
                                    break;
                                }
                            }
                        }
                    }
                }
                pnt pnt3 = (pnt) entry.getValue();
                for (Map.Entry entry2 : new HashMap(this.f39758a).entrySet()) {
                    String str = (String) this.f39761d.get(entry2.getKey());
                    if (str != null && str.equals(pnt3.f39878a.mo17494a())) {
                        m30864a((String) entry2.getKey(), pnt3.f39878a, ((pnu) entry2.getValue()).f39888k, false);
                    }
                }
                z2 = true;
            } else {
                z2 = true;
            }
        }
        this.f39760c.clear();
        this.f39760c.putAll(map);
        boolean d = m30866d();
        if (z2 || d || z) {
            m30867e();
        }
    }

    /* renamed from: a */
    public final synchronized void mo23459a(pmw pmw) {
        this.f39763f.add(pmw);
    }
}
