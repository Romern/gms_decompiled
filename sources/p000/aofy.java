package p000;

import com.google.android.gms.plus.service.v1whitelisted.models.ClientAclDetailsEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.ClientActionDataEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.ClientLoggedRhsComponentEntity;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: aofy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aofy {

    /* renamed from: a */
    public List f78291a;

    /* renamed from: b */
    public final Set f78292b = new HashSet();

    /* renamed from: c */
    private ClientAclDetailsEntity f78293c;

    /* renamed from: d */
    private List f78294d;

    /* renamed from: e */
    private ClientLoggedRhsComponentEntity f78295e;

    /* renamed from: a */
    public final aofz mo42692a() {
        return new ClientActionDataEntity(this.f78292b, this.f78293c, this.f78294d, this.f78291a, this.f78295e);
    }

    /* renamed from: a */
    public final void mo42693a(aofw aofw) {
        this.f78293c = (ClientAclDetailsEntity) aofw;
        this.f78292b.add(2);
    }

    /* renamed from: a */
    public final void mo42694a(aogi aogi) {
        this.f78295e = (ClientLoggedRhsComponentEntity) aogi;
        this.f78292b.add(20);
    }

    /* renamed from: a */
    public final void mo42695a(List list) {
        this.f78294d = list;
        this.f78292b.add(7);
    }
}
