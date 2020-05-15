package p000;

import com.google.android.gms.plus.service.v1whitelisted.models.ClientLoggedRhsComponentEntity;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: aogh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aogh {

    /* renamed from: a */
    private List f78301a;

    /* renamed from: b */
    private final Set f78302b = new HashSet();

    /* renamed from: a */
    public final aogi mo42707a() {
        return new ClientLoggedRhsComponentEntity(this.f78302b, this.f78301a);
    }

    /* renamed from: a */
    public final void mo42708a(List list) {
        this.f78301a = list;
        this.f78302b.add(5);
    }
}
