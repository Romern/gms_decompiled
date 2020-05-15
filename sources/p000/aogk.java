package p000;

import com.google.android.gms.plus.service.v1whitelisted.models.ClientLoggedRhsComponentItemEntity;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: aogk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aogk {

    /* renamed from: a */
    public List f78303a;

    /* renamed from: b */
    public final Set f78304b = new HashSet();

    /* renamed from: c */
    private List f78305c;

    /* renamed from: a */
    public final aogl mo42711a() {
        return new ClientLoggedRhsComponentItemEntity(this.f78304b, this.f78303a, this.f78305c);
    }

    /* renamed from: a */
    public final void mo42712a(List list) {
        this.f78305c = list;
        this.f78304b.add(9);
    }
}
