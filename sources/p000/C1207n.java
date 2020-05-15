package p000;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: n */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class C1207n implements Iterable {

    /* renamed from: b */
    public C1097j f26711b;

    /* renamed from: c */
    public C1097j f26712c;

    /* renamed from: d */
    public final WeakHashMap f26713d = new WeakHashMap();

    /* renamed from: e */
    public int f26714e = 0;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C1097j mo11575a(Object obj) {
        C1097j jVar = this.f26711b;
        while (jVar != null && !jVar.f22014a.equals(obj)) {
            jVar = jVar.f22016c;
        }
        return jVar;
    }

    /* renamed from: b */
    public final C1097j mo15483b(Object obj, Object obj2) {
        C1097j jVar = new C1097j(obj, obj2);
        this.f26714e++;
        C1097j jVar2 = this.f26712c;
        if (jVar2 == null) {
            this.f26711b = jVar;
        } else {
            jVar2.f22016c = jVar;
            jVar.f22017d = jVar2;
        }
        this.f26712c = jVar;
        return jVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1207n) {
            C1207n nVar = (C1207n) obj;
            if (this.f26714e == nVar.f26714e) {
                Iterator it = iterator();
                Iterator it2 = nVar.iterator();
                while (it.hasNext() && it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Object next = it2.next();
                    if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                        return false;
                    }
                }
                return !it.hasNext() && !it2.hasNext();
            }
        }
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((Map.Entry) it.next()).hashCode();
        }
        return i;
    }

    public final Iterator iterator() {
        C1039h hVar = new C1039h(this.f26711b, this.f26712c);
        this.f26713d.put(hVar, false);
        return hVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: b */
    public Object mo11576b(Object obj) {
        C1097j a = mo11575a(obj);
        if (a == null) {
            return null;
        }
        this.f26714e--;
        if (!this.f26713d.isEmpty()) {
            for (C1180m mVar : this.f26713d.keySet()) {
                mVar.mo14269c(a);
            }
        }
        C1097j jVar = a.f22017d;
        C1097j jVar2 = a.f22016c;
        if (jVar != null) {
            jVar.f22016c = jVar2;
        } else {
            this.f26711b = jVar2;
        }
        C1097j jVar3 = a.f22016c;
        if (jVar3 != null) {
            jVar3.f22017d = jVar;
        } else {
            this.f26712c = jVar;
        }
        a.f22016c = null;
        a.f22017d = null;
        return a.f22015b;
    }

    /* renamed from: a */
    public final Object mo15481a(Object obj, Object obj2) {
        C1097j a = mo11575a(obj);
        if (a != null) {
            return a.f22015b;
        }
        mo15483b(obj, obj2);
        return null;
    }

    /* renamed from: a */
    public final C1124k mo15482a() {
        C1124k kVar = new C1124k(this);
        this.f26713d.put(kVar, false);
        return kVar;
    }
}
