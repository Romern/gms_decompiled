package p000;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: qnb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qnb {

    /* renamed from: a */
    public final dky f41751a;

    /* renamed from: b */
    public final List f41752b;

    /* renamed from: c */
    public final List f41753c;

    /* renamed from: d */
    public final List f41754d;

    /* renamed from: e */
    public final dky f41755e;

    /* renamed from: f */
    public final Map f41756f;

    /* renamed from: g */
    public final Set f41757g;

    /* renamed from: h */
    public final bnic f41758h;

    public qnb(dky dky, dky dky2, List list, List list2, List list3, Map map, Set set, bnic bnic) {
        this.f41751a = dky;
        this.f41752b = Collections.unmodifiableList(list);
        this.f41753c = Collections.unmodifiableList(list2);
        this.f41754d = Collections.unmodifiableList(list3);
        this.f41755e = dky2;
        this.f41756f = Collections.unmodifiableMap(map);
        this.f41757g = Collections.unmodifiableSet(set);
        this.f41758h = bnic;
    }

    /* renamed from: a */
    public static qnb m32466a(List list) {
        return new qnb(dhz.f13199c, dgk.f13061c, Collections.emptyList(), list, Collections.emptyList(), Collections.emptyMap(), Collections.emptySet(), bnon.f131923a);
    }
}
