package p000;

import com.google.android.gms.common.data.DataHolder;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: uyu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uyu {

    /* renamed from: a */
    private static final Map f48721a = new HashMap();

    /* renamed from: b */
    private static final Map f48722b = new HashMap();

    static {
        m39799a(uzm.f48742a);
        m39799a(uzm.f48741Q);
        m39799a(uzm.f48738N);
        m39799a(uzm.f48740P);
        m39799a(uzm.f48726B);
        m39799a(uzm.f48754m);
        m39799a(uzm.f48753l);
        m39799a(uzm.f48755n);
        m39799a(uzm.f48737M);
        m39799a(uzm.f48756o);
        m39799a(uzm.f48751j);
        m39799a(uzm.f48758q);
        m39799a(uzm.f48759r);
        m39799a(uzm.f48760s);
        m39799a(uzm.f48767z);
        m39799a(uzm.f48743b);
        m39799a(uzm.f48764w);
        m39799a(uzm.f48744c);
        m39799a(uzm.f48752k);
        m39799a(uzm.f48745d);
        m39799a(uzm.f48746e);
        m39799a(uzm.f48747f);
        m39799a(uzm.f48748g);
        m39799a(uzm.f48762u);
        m39799a(uzm.f48757p);
        m39799a(uzm.f48763v);
        m39799a(uzm.f48765x);
        m39799a(uzm.f48766y);
        m39799a(uzm.f48739O);
        m39799a(uzm.f48727C);
        m39799a(uzm.f48728D);
        m39799a(uzm.f48750i);
        m39799a(uzm.f48749h);
        m39799a(uzm.f48725A);
        m39799a(uzm.f48761t);
        m39799a(uzm.f48736L);
        m39799a(uzm.f48729E);
        m39799a(uzm.f48730F);
        m39799a(uzm.f48731G);
        m39799a(uzm.f48732H);
        m39799a(uzm.f48733I);
        m39799a(uzm.f48734J);
        m39799a(uzm.f48735K);
        m39799a(uzp.f48769a);
        m39799a(uzp.f48771c);
        m39799a(uzp.f48772d);
        m39799a(uzp.f48773e);
        m39799a(uzp.f48770b);
        m39799a(uzp.f48774f);
        m39799a(uzr.f48776a);
        m39799a(uzr.f48777b);
        m39800a(uzd.f48724c);
        m39800a(uzo.f48768c);
    }

    /* renamed from: a */
    public static Collection m39795a() {
        return Collections.unmodifiableCollection(f48721a.values());
    }

    /* renamed from: a */
    public static uvy m39796a(String str) {
        return (uvy) f48721a.get(str);
    }

    /* renamed from: a */
    public static void m39797a(DataHolder dataHolder) {
        for (uyt uyt : f48722b.values()) {
            uyt.mo28121a(dataHolder);
        }
    }

    /* renamed from: a */
    public static void m39798a(DataHolder dataHolder, int i) {
        HashSet hashSet = new HashSet();
        for (uvy uvy : m39795a()) {
            if (uvy.mo28094d() <= i) {
                hashSet.addAll(uvy.mo28093c());
            }
        }
        Iterator it = new HashSet(dataHolder.f30166f.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!hashSet.contains(str)) {
                uyt uyt = (uyt) f48722b.get(str);
                if (uyt == null) {
                    dataHolder.f30166f.remove(str);
                } else {
                    uyt.mo28121a(dataHolder);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m39799a(uvy uvy) {
        if (f48721a.containsKey(uvy.mo28084a())) {
            String valueOf = String.valueOf(uvy.mo28084a());
            throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Duplicate field name registered: ") : "Duplicate field name registered: ".concat(valueOf));
        } else {
            f48721a.put(uvy.mo28084a(), uvy);
        }
    }

    /* renamed from: a */
    private static void m39800a(uyt uyt) {
        if (f48722b.put(uyt.mo28120a(), uyt) != null) {
            String a = uyt.mo28120a();
            StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 46);
            sb.append("A cleaner for key ");
            sb.append(a);
            sb.append(" has already been registered");
            throw new IllegalStateException(sb.toString());
        }
    }
}
