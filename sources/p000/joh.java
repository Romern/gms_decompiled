package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: joh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class joh {

    /* renamed from: a */
    public final Map f22936a = new HashMap();

    /* renamed from: a */
    public final Set mo13937a(String str, int i) {
        HashSet hashSet = new HashSet();
        for (jog jog : this.f22936a.keySet()) {
            if (str.hashCode() == jog.f22933a && i == jog.f22935c) {
                hashSet.addAll((Collection) this.f22936a.get(jog));
            }
        }
        return hashSet;
    }

    /* renamed from: b */
    public final jrd mo13939b(String str, int i) {
        for (jsm jsm : mo13937a(str, i)) {
            if (jsm instanceof jrd) {
                return (jrd) jsm;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo13938a(jsm jsm) {
        for (Set set : this.f22936a.values()) {
            set.remove(jsm);
        }
        ArrayList arrayList = new ArrayList();
        for (jog jog : this.f22936a.keySet()) {
            if (((Set) this.f22936a.get(jog)).isEmpty()) {
                arrayList.add(jog);
            }
        }
        this.f22936a.keySet().removeAll(arrayList);
    }
}
