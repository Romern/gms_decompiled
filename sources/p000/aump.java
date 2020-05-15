package p000;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aump */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aump {

    /* renamed from: a */
    private static final Map f92087a = new HashMap();

    /* renamed from: b */
    private static final Map f92088b = new HashMap();

    static {
        m77319a(aumk.class, aumk.f92083b);
        m77319a(aumt.class, aumt.f92096b);
        m77319a(aumv.class, aumv.f92107b);
        if (!rfy.m33543a()) {
            m77319a(auns.class, auns.f92168b);
            m77319a(aunq.class, aunq.f92162b);
        }
    }

    /* renamed from: a */
    public static aumm m77317a(Class cls) {
        aumm aumm = (aumm) f92087a.get(cls);
        if (aumm != null) {
            return aumm;
        }
        String valueOf = String.valueOf(cls);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
        sb.append("Could not find Model ");
        sb.append(valueOf);
        throw new aumn(sb.toString());
    }

    /* renamed from: a */
    public static aumm m77318a(String str) {
        aumm aumm = (aumm) f92088b.get(str);
        if (aumm != null) {
            return aumm;
        }
        String valueOf = String.valueOf(str);
        throw new aumn(valueOf.length() == 0 ? new String("Could not find Model ") : "Could not find Model ".concat(valueOf));
    }

    /* renamed from: a */
    public static void m77319a(Class cls, aumm aumm) {
        f92087a.put(cls, aumm);
        f92088b.put(aumm.mo50668a(), aumm);
    }
}
