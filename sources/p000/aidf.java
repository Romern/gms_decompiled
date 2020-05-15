package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: aidf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aidf {

    /* renamed from: a */
    private static final Map f68793a = new C1223np();

    /* renamed from: b */
    private final Map f68794b = new C1223np();

    /* renamed from: c */
    private final Set f68795c = new C1225nr();

    /* renamed from: d */
    private final Map f68796d = new C1223np();

    private aidf() {
    }

    /* renamed from: a */
    public static synchronized aidf m57029a(rjx rjx) {
        aidf a;
        synchronized (aidf.class) {
            a = m57030a(rjx, (rjk) null);
        }
        return a;
    }

    /* renamed from: a */
    public static synchronized aidf m57030a(rjx rjx, rjk rjk) {
        aidf aidf;
        synchronized (aidf.class) {
            aide aide = new aide(rjx, rjk);
            if (!f68793a.containsKey(aide)) {
                f68793a.put(aide, new aidf());
            }
            aidf = (aidf) f68793a.get(aide);
        }
        return aidf;
    }

    /* renamed from: a */
    private final Object m57031a(String str) {
        if (!this.f68796d.containsKey(str)) {
            this.f68796d.put(str, new Object());
        }
        return this.f68796d.get(str);
    }

    /* renamed from: a */
    public final synchronized aucb mo37435a(rjx rjx, String str) {
        C1225nr nrVar = new C1225nr();
        Set set = (Set) this.f68794b.get(str);
        if (set == null) {
            return aucu.m76779a((Collection) nrVar);
        }
        Iterator it = new C1225nr(set).iterator();
        while (it.hasNext()) {
            rob rob = (rob) it.next();
            if (this.f68795c.contains(rob)) {
                nrVar.add(mo37436a(rjx, rob));
            }
        }
        this.f68794b.remove(str);
        return aucu.m76779a((Collection) nrVar);
    }

    /* renamed from: a */
    public final synchronized aucb mo37436a(rjx rjx, rob rob) {
        String str;
        this.f68795c.remove(rob);
        Iterator it = this.f68794b.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                str = null;
                break;
            }
            str = (String) it.next();
            Set set = (Set) this.f68794b.get(str);
            if (set.contains(rob)) {
                set.remove(rob);
                break;
            }
        }
        if (str != null) {
            Iterator it2 = this.f68796d.entrySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it2.next();
                if (roe.m34171a(entry.getValue(), str).equals(rob)) {
                    this.f68796d.remove(entry.getKey());
                    break;
                }
            }
        }
        return rjx.mo24698a(rob);
    }

    /* renamed from: a */
    public final synchronized aucb mo37437a(rjx rjx, roh roh, rpf rpf) {
        aucb a;
        rob a2 = roh.mo24969a();
        sdo.m34966a(a2, "Key must not be null");
        this.f68795c.add(a2);
        a = rjx.mo24699a(roh, rpf);
        a.mo50372a(new aidd(this, rjx, a2));
        return a;
    }

    /* renamed from: a */
    public final synchronized rob mo37438a(Object obj, String str) {
        return roe.m34171a(obj, str);
    }

    /* renamed from: a */
    public final synchronized rob mo37439a(String str, String str2) {
        return roe.m34171a(m57031a(str), str2);
    }

    /* renamed from: a */
    public final synchronized rod mo37440a(rjx rjx, Object obj, String str) {
        rod a;
        a = rjx.mo24714a(obj, str);
        rob rob = a.f43429b;
        sdo.m34966a(rob, "Key must not be null");
        Set set = (Set) this.f68794b.get(str);
        if (set == null) {
            set = new C1225nr();
            this.f68794b.put(str, set);
        }
        set.add(rob);
        return a;
    }

    /* renamed from: a */
    public final synchronized rod mo37441a(rjx rjx, String str, String str2) {
        return mo37440a(rjx, m57031a(str), str2);
    }
}
