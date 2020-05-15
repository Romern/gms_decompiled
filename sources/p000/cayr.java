package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: cayr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cayr implements cayp {

    /* renamed from: a */
    private final Map f176432a;

    public cayr(Map map, Map map2) {
        if (!map.isEmpty()) {
            LinkedHashMap b = cayv.m127575b(((bnoj) map).f131914d + ((bnoj) map2).f131914d);
            b.putAll(map2);
            for (Map.Entry entry : ((bnhe) map).entrySet()) {
                b.put(((Class) entry.getKey()).getName(), entry.getValue());
            }
            map2 = Collections.unmodifiableMap(b);
        }
        this.f176432a = map2;
    }

    /* renamed from: a */
    public final void mo75183a(Object obj) {
        String str;
        cijl cijl = (cijl) this.f176432a.get(obj.getClass().getName());
        if (cijl != null) {
            aadv aadv = (aadv) cijl.mo6445a();
            try {
                cazf.m127594a(obj);
                aadv.getClass();
            } catch (ClassCastException e) {
                throw new cayq(String.format("%s does not implement AndroidInjector.Factory<%s>", aadv.getClass().getCanonicalName(), obj.getClass().getCanonicalName()), e);
            }
        } else {
            ArrayList arrayList = new ArrayList();
            for (Class cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
                if (this.f176432a.containsKey(cls.getCanonicalName())) {
                    arrayList.add(cls.getCanonicalName());
                }
            }
            if (arrayList.isEmpty()) {
                str = String.format("No injector factory bound for Class<%s>", obj.getClass().getCanonicalName());
            } else {
                str = String.format("No injector factory bound for Class<%1$s>. Injector factories were bound for supertypes of %1$s: %2$s. Did you mean to bind an injector factory for the subtype?", obj.getClass().getCanonicalName(), arrayList);
            }
            throw new IllegalArgumentException(str);
        }
    }
}
