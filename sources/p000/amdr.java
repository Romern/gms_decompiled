package p000;

import com.google.android.gms.plus.service.v2whitelisted.models.Mergedpeoplemetadata;
import com.google.android.gms.plus.service.v2whitelisted.models.Person;
import java.util.Map;

/* renamed from: amdr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class amdr {

    /* renamed from: a */
    private final Person f74762a;

    /* renamed from: b */
    private final amdq f74763b;

    /* renamed from: c */
    private final Map f74764c;

    /* renamed from: d */
    private final boolean f74765d;

    /* renamed from: a */
    public final void mo41130a() {
        String str;
        for (Object obj : amdx.m62691a((Iterable) this.f74763b.mo41129a(this.f74762a))) {
            Mergedpeoplemetadata a = this.f74763b.mo41128a(obj);
            int b = amdx.m62696b(a);
            int b2 = amdx.m62696b(a);
            if (b2 == 0) {
                str = "@profile@";
            } else if (b2 != 1) {
                str = b2 != 2 ? null : "@circle@";
            } else {
                str = a.f83120e;
            }
            if ((b == 0 || b == 1 || b == 2) && (!this.f74765d || b == 1)) {
                Object obj2 = this.f74764c.get(str);
                if (obj2 != null) {
                    mo41131a(obj, b, obj2);
                } else if (b == 1) {
                    amdk.m62659b("PeopleSync", "Unknown container=%s", str);
                }
            }
        }
    }

    /* renamed from: a */
    public abstract void mo41131a(Object obj, int i, Object obj2);

    public amdr(amdq amdq, Person person, Map map, boolean z) {
        this.f74762a = person;
        this.f74763b = amdq;
        this.f74764c = map;
        this.f74765d = z;
    }
}
